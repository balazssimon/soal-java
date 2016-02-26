package metadslx.languages.soal;

@SuppressWarnings("unchecked")
class EndpointImpl extends metadslx.core.ModelObject implements metadslx.languages.soal.Endpoint {
    static {
        metadslx.languages.soal.SoalDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.languages.soal.SoalInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.languages.soal.SoalInstance.Endpoint; 
    }

    public EndpointImpl() {
        this.mSet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<Annotation>(this, metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty));
        metadslx.languages.soal.SoalImplementationProvider.implementation().Endpoint(this);
        this.mMakeDefault();
    }
    
    public metadslx.languages.soal.Interface getInterface() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Endpoint.InterfaceProperty); 
        if (result != null) return (metadslx.languages.soal.Interface)result;
        else return (metadslx.languages.soal.Interface)null;
    }
    
    public void setInterface(metadslx.languages.soal.Interface value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Endpoint.InterfaceProperty, value);
    }
    
    public metadslx.languages.soal.Binding getBinding() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Endpoint.BindingProperty); 
        if (result != null) return (metadslx.languages.soal.Binding)result;
        else return (metadslx.languages.soal.Binding)null;
    }
    
    public void setBinding(metadslx.languages.soal.Binding value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Endpoint.BindingProperty, value);
    }
    
    public String getAddress() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Endpoint.AddressProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setAddress(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Endpoint.AddressProperty, value);
    }
    
    public metadslx.languages.soal.Namespace getNamespace() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.Declaration.NamespaceProperty); 
        if (result != null) return (metadslx.languages.soal.Namespace)result;
        else return (metadslx.languages.soal.Namespace)null;
    }
    
    public void setNamespace(metadslx.languages.soal.Namespace value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.Declaration.NamespaceProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.languages.soal.SoalDescriptor.NamedElement.NameProperty, value);
    }
    
    public java.util.List<metadslx.languages.soal.Annotation> getAnnotations() {
        Object result = this.mGet(metadslx.languages.soal.SoalDescriptor.AnnotatedElement.AnnotationsProperty); 
        if (result != null) return (java.util.List<metadslx.languages.soal.Annotation>)result;
        else return (java.util.List<metadslx.languages.soal.Annotation>)null;
    }
    
    public metadslx.languages.soal.Annotation addAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_addAnnotation(this, name);
    }
    
    public boolean hasAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_hasAnnotation(this, name);
    }
    
    public metadslx.languages.soal.Annotation getAnnotation(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotation(this, name);
    }
    
    public java.util.List<metadslx.languages.soal.Annotation> getAnnotations(String name) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotations(this, name);
    }
    
    public boolean hasAnnotationProperty(String annotationName, String propertyName) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_hasAnnotationProperty(this, annotationName, propertyName);
    }
    
    public Object getAnnotationPropertyValue(String annotationName, String propertyName) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_getAnnotationPropertyValue(this, annotationName, propertyName);
    }
    
    public metadslx.languages.soal.AnnotationProperty setAnnotationPropertyValue(String annotationName, String propertyName, Object propertyValue) {
        return metadslx.languages.soal.SoalImplementationProvider.implementation().AnnotatedElement_setAnnotationPropertyValue(this, annotationName, propertyName, propertyValue);
    }
}

