package com.design.patterns.adapterstructuralpattern.with;

public class LinkedInPostMessage implements IPost {

    private String content;
    private String imageURL;

    public LinkedInPostMessage(String content, String imageURL) {
        this.content = content;
        this.imageURL = imageURL;
    }

    public void setMessage(IPost message, String imageURL) {
        setContent(message.getContent());
        this.imageURL = imageURL;
    }

    public String getImageUrl() {
        return this.imageURL;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
