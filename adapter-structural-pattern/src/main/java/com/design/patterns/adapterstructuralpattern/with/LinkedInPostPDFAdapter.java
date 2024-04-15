package com.design.patterns.adapterstructuralpattern.with;

import java.util.List;

public class LinkedInPostPDFAdapter implements IPost, IPDF {

    private IPDF pdf;

    public LinkedInPostPDFAdapter(IPDF pdf) {
        this.pdf = pdf;
    }

    @Override
    public String getContent() {
        return pdf.getContent() + ", images: " + pdf.getImagesUrls() + ", color: " + pdf.isColor();
    }

    @Override
    public void setContent(String content) {
        this.pdf.setContent(content);
    }

    @Override
    public List<String> getImagesUrls() {
        return pdf.getImagesUrls();
    }

    @Override
    public void setImagesUrls(List<String> imagesUrls) {
        pdf.setImagesUrls(imagesUrls);
    }

    @Override
    public boolean isColor() {
        return pdf.isColor();
    }

    @Override
    public void setColor(boolean color) {
        pdf.setColor(color);
    }
}
