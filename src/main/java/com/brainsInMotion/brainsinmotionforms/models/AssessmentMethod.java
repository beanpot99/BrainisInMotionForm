package com.brainsInMotion.brainsinmotionforms.models;

public enum AssessmentMethod {
    OPTION1("option 1"),
    OPTION2("option 2"),
    OPTION3("option 3"),
    OPTION4("option 4");
    private final String assessmentMethod;
    AssessmentMethod(String assessmentMethod){
        this.assessmentMethod=assessmentMethod;
    }

    public String getassessmentMethod() {
        return assessmentMethod;
    }
}
