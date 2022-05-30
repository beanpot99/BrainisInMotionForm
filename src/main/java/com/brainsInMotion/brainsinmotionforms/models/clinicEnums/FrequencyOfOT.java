package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum FrequencyOfOT {
    TWICEAWEEK("Twice a week"),
    WEEKLY("Once a week"),
    EVERYOTHERWEEK("Every other week"),
    MONTHLY("Monthly"),
    ASNEEDED("As needed");
    private final String name;
    FrequencyOfOT(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
