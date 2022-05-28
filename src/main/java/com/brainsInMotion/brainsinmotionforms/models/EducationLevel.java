package com.brainsInMotion.brainsinmotionforms.models;

public enum EducationLevel {
    LESSTHANELEMENTARY("<Elementary"),
    ELEMENTARY("Elementary"),
    MIDDLE("Midlle"),
    SOMEHIGHSCHOOL("Some High School"),
    HIGHSCHOOLDIPLOMA("High School Diploma"),
    SOMECOLLEGE("Some College"),
    ASSOCIATES("Associates"),
    BACHELORS("Bachelors"),
    GRADUATEANDABOVE("Graduate or above");
    private final String displayLevel;
    EducationLevel(String displayLevel){
        this.displayLevel=displayLevel;
    }

    public String getDisplayLevel() {
        return displayLevel;
    }
}
