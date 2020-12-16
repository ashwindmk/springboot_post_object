package com.ashwin.domain.model;

import java.util.List;

public class Layout {
    private String type;
    private List<Integer> margin;
    private List<Integer> padding;
    private Integer fontSize;

    public Layout() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getMargin() {
        return margin;
    }

    public void setMargin(List<Integer> margin) {
        this.margin = margin;
    }

    public List<Integer> getPadding() {
        return padding;
    }

    public void setPadding(List<Integer> padding) {
        this.padding = padding;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Layout{" +
                "type='" + type + '\'' +
                ", margin=" + margin +
                ", padding=" + padding +
                ", fontSize=" + fontSize +
                '}';
    }
}
