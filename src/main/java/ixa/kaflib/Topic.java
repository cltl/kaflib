package ixa.kaflib;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import ixa.kaflib.KAFDocument.Layer;


public class Topic extends Annotation {

    private String source;
    private String method;
    private Float confidence;
    private String URI; 
    private String value;
    

    Topic(String value) {
	this.value = value;
    }

    public String getSource(){
	return this.source;
    }
    
    public void setSource(String val) {
	source = val;
    }

    public boolean hasSource() {
	return this.source != null;
    }

    public String getMethod() {
	return this.method;
    }

    public void setMethod(String val) {
	method = val;
    }

    public boolean hasMethod() {
	return this.method != null;
    }

    public Float getConfidence() {
	return this.confidence;
    }

    public void setConfidence(Float val) {
	confidence = val;
    }

    public boolean hasConfidence() {
	return this.confidence != null;
    }

    public String getURI() {
	return this.URI;
    }

    public void setURI(String val) {
	URI = val;
    }

    public boolean hasURI() {
	return this.URI != null;
    }

    public String getTopicValue() {
	return this.value;
    }

    public void setTopicValue(String val) {
	value = val;
    }

    public Map<Layer, List<Annotation>> getReferencedAnnotations() {
	return new HashMap<Layer, List<Annotation>>();
    }

}
