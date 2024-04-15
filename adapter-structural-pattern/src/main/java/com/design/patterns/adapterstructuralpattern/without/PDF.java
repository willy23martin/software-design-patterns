package com.design.patterns.adapterstructuralpattern.without;

import java.util.List;

public class PDF {

    private String content;

    private List<String> imagesUrls;

    private boolean color;

    public PDF(String content, List<String> imagesUrls, boolean color) {
        this.content = content;
        this.imagesUrls = imagesUrls;
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImagesUrls() {
        return imagesUrls;
    }

    public void setImagesUrls(List<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
