/*
 * generated by Xtext 2.24.0
 */
package soal.dsl.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import soal.generator.InterfaceKind
import soal.generator.doc.HtmlGenerator
import soal.generator.rest.OpenApiGenerator
import soal.generator.rest.OpenApiVersion
import soal.generator.soap.WsdlGenerator
import soal.generator.soap.XsdGenerator
import soal.model.BindingKind
import soal.model.RootSoalModel
import soal.model.Service

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SoalDslGenerator extends GroupByFolderGenerator {

    override doGenerate(ResourceSet input, URI folderURI, RootSoalModel rootModel, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val fileName = folderURI.lastSegment
        val fileURI = folderURI

        //*/
        val openApi30 = fileURI.appendSegment(fileName+"-OpenApi-3.0").appendFileExtension("yaml")
        val openApi31 = fileURI.appendSegment(fileName+"-OpenApi-3.1").appendFileExtension("yaml")
        if (rootModel.declarations.filter(Service).exists[it.binding == BindingKind.REST]) {
            fsa.generateFile(openApi30.toPlatformString(false), new OpenApiGenerator(rootModel, InterfaceKind.GENERAL, OpenApiVersion.VERSION_3_0).generate());
            fsa.generateFile(openApi31.toPlatformString(false), new OpenApiGenerator(rootModel, InterfaceKind.GENERAL, OpenApiVersion.VERSION_3_1).generate());
        } else {
            fsa.deleteFile(openApi30.toPlatformString(false));
            fsa.deleteFile(openApi31.toPlatformString(false));
        }
        //*/

        //*/
        val xsdUri = fileURI.appendSegment(fileName).appendFileExtension("xsd")
        val wsdlUri = fileURI.appendSegment(fileName).appendFileExtension("wsdl")
        if (rootModel.declarations.filter(Service).exists[it.binding == BindingKind.SOAP]) {
            fsa.generateFile(xsdUri.toPlatformString(false), new XsdGenerator(rootModel, fileName, true).generate());
            fsa.generateFile(wsdlUri.toPlatformString(false), new WsdlGenerator(rootModel, fileName, false).generate());
        } else {
            fsa.deleteFile(xsdUri.toPlatformString(false));
            fsa.deleteFile(wsdlUri.toPlatformString(false));
        }
        //*/
        
        //*/
        val htmlUri = fileURI.appendSegment(fileName).appendFileExtension("html")
        fsa.generateFile(htmlUri.toPlatformString(false), new HtmlGenerator(rootModel, fileName).generate());
        //*/
       
    }
    
}
