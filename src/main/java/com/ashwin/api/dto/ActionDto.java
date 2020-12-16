package com.ashwin.api.dto;

import java.util.Map;

public class ActionDto {
    private String label;
    private String url;
    private Map<String, Object> layout;

    public ActionDto() {
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

    public Map<String, Object> getLayout() {
        return layout;
    }

    public void setLayout(Map<String, Object> layout) {
        this.layout = layout;
    }

    @Override
    public String toString() {
        return "ActionDto{" +
                "label='" + label + '\'' +
                ", url='" + url + '\'' +
                ", layout=" + layout +
                '}';
    }
}
