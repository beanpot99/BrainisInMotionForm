package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum ActivitiesOfDailyLiving {
    OPTION1("option 1"),
    OPTION2("option 2"),
    OPTION3("option 3"),
    OPTION4("option 4"),
    OPTION5("option 4"),
    OPTION6("option 4"),
    OPTION7("option 4"),
    OPTION8("option 4"),
    OPTION9("option 4");
    private final String name;
    ActivitiesOfDailyLiving(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
