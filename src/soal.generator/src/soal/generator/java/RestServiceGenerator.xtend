package soal.generator.java

import java.util.List
import soal.generator.GeneratedFile
import soal.model.Interface
import soal.model.Operation
import soal.model.RootSoalModel
import soal.model.Service

class RestServiceGenerator extends RestGeneratorBase {

    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def List<GeneratedFile> generateAll() {
        val result = newArrayList
        result.add(new GeneratedFile(parentName+"/rest", "Application.java", generateApplication(), true))
        for (service : services) {
            result.add(new GeneratedFile(parentName+"/rest/service", service.name+"Controller.java", generateController(service), true))
            result.add(new GeneratedFile(parentName+"/rest/service", service.name+"Service.java", generateService(service), true))
        }
        return result
    }

    def generateApplication() {
        '''
        package «parentName».rest;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        @SpringBootApplication
        public class Application {

            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }

        }

        '''
    }

    def generateService(Service service) {
        '''
        package «parentName».rest.service;

        import org.springframework.stereotype.Service;

        import «parentName».common.«service.interface.name»;
        «FOR type: typeAnalysis.getUsedTypes(service.interface)»
        import «parentName».common.«generateTypeRef(type, false)»;
        «ENDFOR»

        import «parentName».service.«service.name»ServiceFactory;

        @Service
        public class «service.name»Service implements «service.interface.name» {
            private «service.interface.name» _service;

            private synchronized «service.interface.name» getService() {
                if (_service == null) {
                    _service = new «service.name»ServiceFactory().create();
                }
                return _service;
            }

            «FOR op: typeAnalysis.getOperations(service.interface)»
            @Override
            public «generateOperationSignature(service.interface, op)» {
                «IF op.hasResponseParameters»
                return getService().«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
                «ELSE»
                getService().«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
                «ENDIF»
            }

            «ENDFOR»

        }
        '''
    }

    def generateController(Service service) {
        '''
        package «parentName».rest.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        «FOR op: typeAnalysis.getOperations(service.interface)»
        import «parentName».rest.common.«op.name»Request;
        import «parentName».rest.common.«op.name»Response;
        «ENDFOR»
        «FOR type: typeAnalysis.getUsedTypes(service.interface)»
        import «parentName».rest.common.«generateTypeRef(type, false)»;
        «ENDFOR»

        @RestController
        @RequestMapping(path = "/«service.name»")
        public class «service.name»Controller {
            @Autowired
            private «service.name»Service _service;

            «FOR op: typeAnalysis.getOperations(service.interface)»
            @PostMapping(path = "/«op.name»", consumes = "application/json", produces = "application/json")
            public «op.name»Response «op.name.toCamelCase»(@RequestBody «op.name»Request __request) {
                «IF op.hasRequestParameters»
                    «FOR param: op.requestParameters.parameters»
                    «generateTypeRef(param.type, false)» «param.name.toCamelCase» = __request.«param.name.toGetterName»();
                    «ENDFOR»
                «ENDIF»
                «IF !op.hasResponseParameters»
                    _service.«op.name.toCamelCase»(«generateArguments(service.interface, op)»);
                «ELSEIF op.hasSingleResponseParameter»
                    «IF op.singleReturnType.isCustomType»«parentName».common.«ENDIF»«generateTypeRef(op.singleReturnType, false)» __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
                    «op.name»Response __response = new «op.name»Response();
                    «IF op.singleReturnType.isCustomType»
                        __response.setResult(«generateTypeRef(op.singleReturnType, false)».fromCommon(__result));
                    «ELSE»
                        __response.setResult(__result);
                    «ENDIF»
                    return __response;
                «ELSE»
                    «op.name»Return __result = _service.«op.name.toCamelCase»(«generateToCommonArguments(service.interface, op)»);
                    «op.name»Response __response = new «op.name»Response();
                    «FOR param: op.responseParameters.parameters»
                    __response.«param.name.toSetterName»(__result.«param.name.toGetterName»());
                    «ENDFOR»
                    return __response;
                «ENDIF»
            }

            «ENDFOR»

        }

        '''
    }

    def generateToCommonArguments(Interface type, Operation op) {
        if (!op.hasRequestParameters) return ''''''
        else return '''«FOR param: op.requestParameters.parameters SEPARATOR ", "»«param.name.toCamelCase»«IF param.type.isCustomType».toCommon()«ENDIF»«ENDFOR»'''
    }

}