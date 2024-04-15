package com.design.patterns.adapterstructuralpattern.with;

public class WhatsAppPost implements IPost {

    private String content;

    public WhatsAppPost(String content) {
        this.content = content;
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
