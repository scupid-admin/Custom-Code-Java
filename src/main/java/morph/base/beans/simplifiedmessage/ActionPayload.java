package morph.base.beans.simplifiedmessage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author aapa
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionPayload {

    @JsonProperty(PayloadFieldMapping.flowKey)
    private String flowKey;

    @JsonProperty(PayloadFieldMapping.flowId)
    private String flowId;

    @JsonProperty(PayloadFieldMapping.parameters)
    private Map<String, Object> parameters;

    @JsonProperty(PayloadFieldMapping.value)
    private String value;

    /**
     * This will be used to render this message properly in converse. As facebook only sends payload
     */
    @JsonProperty(PayloadFieldMapping.title)
    private String title;

    public String getFlowKey() {
        return flowKey;
    }

    public void setFlowKey(String flowKey) {
        this.flowKey = flowKey;
    }

    public ActionPayload flowKey(String flowKey) {
        this.setFlowKey(flowKey);
        return this;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public ActionPayload flowId(String flowId) {
        this.setFlowId(flowId);
        return this;
    }

    public Map<String, Object> getParameters() {
        if (parameters == null) {
            parameters = new HashMap<>();
        }
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public ActionPayload addParameter(String key, Object value) {
        this.getParameters().put(key, value);
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ActionPayload value(String value) {
        this.setValue(value);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ActionPayload title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "ActionPayload{" +
                "flowKey='" + flowKey + '\'' +
                ", flowId='" + flowId + '\'' +
                ", parameters=" + parameters +
                ", value='" + value + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static class PayloadFieldMapping {
        public static final String flowKey = "fK";
        public static final String flowId = "fId";
        public static final String parameters = "prms";
        public static final String value = "val";
        public static final String title = "ttl";
    }
}
