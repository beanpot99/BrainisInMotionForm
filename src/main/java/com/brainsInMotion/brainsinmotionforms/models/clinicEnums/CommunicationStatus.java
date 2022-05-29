package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum CommunicationStatus {
    OPTION1("option 1"),
    OPTION2("option 2"),
    OPTION3("option 3");
    private final String name;
    CommunicationStatus(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
