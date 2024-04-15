package com.design.patterns.adapterstructuralpattern.with;

import java.util.List;

public interface IPDF {

     String getContent();
     void setContent(String content);
     List<String> getImagesUrls();
     void setImagesUrls(List<String> imagesUrls);
     boolean isColor();
     void setColor(boolean color);

}
