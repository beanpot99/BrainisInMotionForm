package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum FineMotor {
    OPTION1("Raking"),
    OPTION2("Pincer"),
    OPTION3("Grasping"),
    OPTION4("Whole hand"),
    OPTION5("Uses a fisted grasp"),
    OPTION6("Grasps writing tool with all fingertips on tool");
    private final String name;
    FineMotor(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
