package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum AssessmentMethod {
    OBSERVATION("Observation"),
    INTERVIEW("Interview"),
    STANDARDIZEDTEST("Standardized Test");
    private final String name;
    AssessmentMethod(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
