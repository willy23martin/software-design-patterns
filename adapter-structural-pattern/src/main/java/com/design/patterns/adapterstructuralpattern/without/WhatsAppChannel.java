package com.design.patterns.adapterstructuralpattern.without;

public class WhatsAppChannel {

    private boolean viewed;

    public WhatsAppChannel(boolean viewed) {
        this.viewed = viewed;
    }

    public void publish(WhatsAppPost message) {
        if(viewed) {
            System.out.println("WhatsApp message has been published: " + message.getContent() + " to be viewed (double checked)");
        } else {
            System.out.println("WhatsApp message has been published: " + message.getContent() + ". It could not be confirmed.");
        }
    }

}
