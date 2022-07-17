package com.brainsInMotion.brainsinmotionforms.models.clinicEnums;

public enum EducationLevel {
    LESSTHANELEMENTARY("<Elementary"),
    ELEMENTARY("Elementary"),
    MIDDLE("Middle"),
    SOMEHIGHSCHOOL("Some High School"),
    HIGHSCHOOLDIPLOMA("High School Diploma"),
    SOMECOLLEGE("Some College"),
    ASSOCIATES("Associates"),
    BACHELORS("Bachelors"),
    GRADUATEANDABOVE("Graduate or above");
    private final String name;
    EducationLevel(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
