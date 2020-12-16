package com.ashwin.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Action {
    private String label;
    private String url;

    @JsonProperty("action_type")
    private String actionType;

    public Action() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Override
    public String toString() {
        return "Action{" +
                "label='" + label + '\'' +
                ", url='" + url + '\'' +
                ", actionType='" + actionType + '\'' +
                '}';
    }
}
