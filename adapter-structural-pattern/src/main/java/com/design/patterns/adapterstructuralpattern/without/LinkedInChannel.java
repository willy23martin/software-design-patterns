package com.design.patterns.adapterstructuralpattern.without;

import java.util.HashMap;
import java.util.Map;

public class LinkedInChannel {

    private final Map<String, Boolean> publications = new HashMap<String, Boolean>(10);

    public LinkedInChannel() {
    }

    public void publish(LinkedInPostMessage post) {
        if(publications.keySet().contains(post)) {
            System.out.println("Post has been already published: " + post);
        } else {
            System.out.println("Publishing post: " + post.getContent() + " and image: " + post.getImageUrl());
        }
    }
}
