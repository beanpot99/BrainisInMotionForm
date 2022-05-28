package com.brainsInMotion.brainsinmotionforms.models;

import java.util.Objects;

public class Therapist {
    private String name;
    private String credentials;
    private String discipline;
    private String phoneNumber;
    private String signatureURL;
    private int id;
    private int nextId;
    public Therapist(){
        id=nextId;
        nextId++;
    }
    public Therapist(String name, String credentials, String discipline, String phoneNumber, String signatureURL){
        this();
        this.name=name;
        this.credentials=credentials;
        this.discipline=discipline;
        this.phoneNumber=phoneNumber;
        this.signatureURL=signatureURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignatureURL() {
        return signatureURL;
    }

    public void setSignatureURL(String signatureURL) {
        this.signatureURL = signatureURL;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Therapist event = (Therapist) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
