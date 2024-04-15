package com.design.patterns.adapterstructuralpattern.with;

import com.design.patterns.adapterstructuralpattern.with.LinkedInChannel;
import com.design.patterns.adapterstructuralpattern.with.LinkedInPostMessage;
import com.design.patterns.adapterstructuralpattern.with.PDF;
import com.design.patterns.adapterstructuralpattern.with.WhatsAppChannel;
import com.design.patterns.adapterstructuralpattern.with.WhatsAppPost;

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
            IPDF pdf = new PDF("pdf content with images", List.of("imageUrlA", "imageUrlB"), false);
            whatsAppChannel.publish(new WhatsAppPostPDFAdapter(pdf));
            linkedInChannel.publish(new LinkedInPostPDFAdapter(pdf));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
