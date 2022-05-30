package com.brainsInMotion.brainsinmotionforms.models.EIEnums;

public enum Languages {
    ENGLISH("English"),
    SPANISH("Spanish"),
    CHINESE("Chinese"),
    TAGALOG("Tagalog"),
    VIETNAMESE("Vietnamese"),
    ARABIC("Arabic"),
    KOREAN("Korean"),
    FRENCH("French");
    private final String name;
    Languages(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
