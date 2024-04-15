package com.design.patterns.adapterstructuralpattern.with;

public class WhatsAppChannel {

    protected boolean viewed;

    public WhatsAppChannel(boolean viewed) {
        this.viewed = viewed;
    }

    public void publish(IPost message) {
        if(viewed) {
            System.out.println("WhatsApp message has been published: " + message.getContent() + " to be viewed (double checked)");
        } else {
            System.out.println("WhatsApp message has been published: " + message.getContent() + ". It could not be confirmed.");
        }
    }

}
