package com.brainsInMotion.brainsinmotionforms.models;

public enum CommunicationStatus {
    NONVERBAL("Non-verbal"),
    VERBAL("Verbal"),
    PARTIALLYVERBAL("Partially Verbal");
    private final String communicationLevel;
    CommunicationStatus(String communicationLevel){
        this.communicationLevel=communicationLevel;
    }

    public String getCommunicationLevel() {
        return communicationLevel;
    }
}
