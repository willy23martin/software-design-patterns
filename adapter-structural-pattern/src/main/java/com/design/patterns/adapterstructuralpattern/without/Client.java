package com.design.patterns.adapterstructuralpattern.without;

import java.util.List;

public class Client {

    private static WhatsAppChannel whatsAppChannel;
    private static LinkedInChannel linkedInChannel;

    public static void main(String[] args) {
        whatsAppChannel = new WhatsAppChannel(true);
        linkedInChannel = new LinkedInChannel();
        whatsAppChannel.publish(new WhatsAppPost("WhatsApp Message saying hello"));
        linkedInChannel.publish(new LinkedInPostMessage("LinkedIn Message saying hello, showing image: ", "image url A"));

        try {
            PDF pdf = new PDF("pdf content with images", List.of("imageUrlA"), false);
            whatsAppChannel.publish(new WhatsAppPost(pdf.getContent()));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
