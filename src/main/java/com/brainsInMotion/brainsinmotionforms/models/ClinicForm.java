package com.brainsInMotion.brainsinmotionforms.models;

import javax.validation.constraints.NotNull;
import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.Size;



@Entity
public class ClinicForm {



    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String dateOfEval;
    @NotNull
    @Size(max=30, message="Max characters in field 30")
    private String patientName;
    @NotNull
    @Size(max=50, message="Max characters in field 50")
    private String address;
    @NotNull
    @Size(max=30, message="Max characters in field 30")
    private String parentName;
    @NotNull
    @Size(max=50, message="Max characters in field 50")
    private String diagnosis;
    @NotNull
    private String therapistChoice;
    @NotNull
    private String DOB;
    @NotNull
    @Size(max=11)
    private String clientPhone;
    @NotNull
    @Size(max=30, message="Max characters in field 30")
    private String physicianName;
    @NotNull
    private String payer;
    @NotNull
    @Size(max=100, message="Max characters in field 100")
    private String referral;
    @NotNull
    @Size(max=150, message="Max characters in field 150")
    private String medicalHistory;
    @NotNull
    private String assessmentMethod;
    @NotNull
    private String behaviorObservations;
    @NotNull
    private String fineMotor;
    @NotNull
    private String communicationLevel;
    @NotNull
    private String educationLevel;
    @NotNull
    private String strengthAndRangeOfMotion;
    @NotNull
    private String activitiesOfDailyLiving;

    private Boolean fearParalysisPresent;

    private Boolean fearParalysisIntegrated;

    private Boolean moroPresent;
    private Boolean moroIntegrated;
    private Boolean atnrPresent;
    private Boolean atnrIntegrated;
    private Boolean stnrPresent;
    private Boolean stnrIntegrated;
    private Boolean tlrPresent;
    private Boolean tlrIntegrated;
    private Boolean spinalGalantPresent;
    private Boolean spinalGalantIntegrated;
    private Boolean palmarPresent;
    private Boolean palmarIntegrated;
    @NotNull
    @Size(max=50)
    private String visualTracking;
    @NotNull
    @Size(max=50)
    private String visualSaccades;
    @NotNull
    @Size(max=50)
    private String convergenceDivergence;
    @NotNull
    private String frequencyOfOT;
    @NotNull
    @Size(max=50)
    private String goalOne;
    @NotNull
    @Size(max=50)
    private String goalTwo;
    @NotNull
    @Size(max=50)
    private String goalThree;
    @NotNull
    @Size(max=50)
    private String goalFour;
    @NotNull
    private String durationOfOT;
    @NotNull
    private String therapist;

    public ClinicForm(String dateOfEval, String patientName, String address, String parentName, String diagnosis, String therapistChoice, String DOB, String clientPhone, String physicianName, String payer, String referral, String medicalHistory, String assessmentMethod, String behaviorObservations, String fineMotor, String communicationLevel, String educationLevel, String strengthAndRangeOfMotion, String activitiesOfDailyLiving, Boolean fearParalysisPresent, Boolean fearParalysisIntegrated, Boolean moroPresent, Boolean moroIntegrated, Boolean atnrPresent, Boolean atnrIntegrated, Boolean stnrPresent, Boolean stnrIntegrated, Boolean tlrPresent, Boolean tlrIntegrated, Boolean spinalGalantPresent, Boolean spinalGalantIntegrated, Boolean palmarPresent, Boolean palmarIntegrated, String visualTracking, String visualSaccades, String convergenceDivergence, String frequencyOfOT, String goalOne, String goalTwo, String goalThree, String goalFour, String durationOfOT, String therapist) {
        this.dateOfEval = dateOfEval;
        this.patientName = patientName;
        this.address = address;
        this.parentName = parentName;
        this.diagnosis = diagnosis;
        this.therapistChoice = therapistChoice;
        this.DOB = DOB;
        this.clientPhone = clientPhone;
        this.physicianName = physicianName;
        this.payer = payer;
        this.referral = referral;
        this.medicalHistory = medicalHistory;
        this.assessmentMethod = assessmentMethod;
        this.behaviorObservations = behaviorObservations;
        this.fineMotor = fineMotor;
        this.communicationLevel = communicationLevel;
        this.educationLevel = educationLevel;
        this.strengthAndRangeOfMotion = strengthAndRangeOfMotion;
        this.activitiesOfDailyLiving = activitiesOfDailyLiving;
        this.fearParalysisPresent = fearParalysisPresent;
        this.fearParalysisIntegrated = fearParalysisIntegrated;
        this.moroPresent = moroPresent;
        this.moroIntegrated = moroIntegrated;
        this.atnrPresent = atnrPresent;
        this.atnrIntegrated = atnrIntegrated;
        this.stnrPresent = stnrPresent;
        this.stnrIntegrated = stnrIntegrated;
        this.tlrPresent = tlrPresent;
        this.tlrIntegrated = tlrIntegrated;
        this.spinalGalantPresent = spinalGalantPresent;
        this.spinalGalantIntegrated = spinalGalantIntegrated;
        this.palmarPresent = palmarPresent;
        this.palmarIntegrated = palmarIntegrated;
        this.visualTracking = visualTracking;
        this.visualSaccades = visualSaccades;
        this.convergenceDivergence = convergenceDivergence;
        this.frequencyOfOT = frequencyOfOT;
        this.durationOfOT= durationOfOT;
        this.goalOne=goalOne;
        this.goalTwo=goalTwo;
        this.goalThree=goalThree;
        this.goalFour=goalFour;
        this.therapist=therapist;
    }
    public ClinicForm(){}
    public String getDurationOfOT() {
        return durationOfOT;
    }
    public void setDurationOfOT(String durationOfOT) {
        this.durationOfOT = durationOfOT;
    }
    public int getId() {
        return id;
    }
    public String getDateOfEval() {
        return dateOfEval;
    }

    public void setDateOfEval(String dateOfEval) {
        this.dateOfEval = dateOfEval;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTherapistChoice() {
        return therapistChoice;
    }

    public void setTherapistChoice(String therapistChoice) {
        this.therapistChoice = therapistChoice;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getAssessmentMethod() {
        return assessmentMethod;
    }

    public void setAssessmentMethod(String assessmentMethod) {
        this.assessmentMethod = assessmentMethod;
    }

    public String getBehaviorObservations() {
        return behaviorObservations;
    }

    public void setBehaviorObservations(String behaviorObservations) {
        this.behaviorObservations = behaviorObservations;
    }

    public String getFineMotor() {
        return fineMotor;
    }

    public void setFineMotor(String fineMotor) {
        this.fineMotor = fineMotor;
    }

    public String getCommunicationLevel() {
        return communicationLevel;
    }

    public void setCommunicationLevel(String communicationLevel) {
        this.communicationLevel = communicationLevel;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getStrengthAndRangeOfMotion() {
        return strengthAndRangeOfMotion;
    }

    public void setStrengthAndRangeOfMotion(String strengthAndRangeOfMotion) {
        this.strengthAndRangeOfMotion = strengthAndRangeOfMotion;
    }

    public String getActivitiesOfDailyLiving() {
        return activitiesOfDailyLiving;
    }

    public void setActivitiesOfDailyLiving(String activitiesOfDailyLiving) {
        this.activitiesOfDailyLiving = activitiesOfDailyLiving;
    }

    public Boolean getFearParalysisPresent() {
        return fearParalysisPresent;
    }

    public void setFearParalysisPresent(Boolean fearParalysisPresent) {
        this.fearParalysisPresent = fearParalysisPresent;
    }

    public Boolean getFearParalysisIntegrated() {
        return fearParalysisIntegrated;
    }

    public void setFearParalysisIntegrated(Boolean fearParalysisIntegrated) {
        this.fearParalysisIntegrated = fearParalysisIntegrated;
    }

    public Boolean getMoroPresent() {
        return moroPresent;
    }

    public void setMoroPresent(Boolean moroPresent) {
        this.moroPresent = moroPresent;
    }

    public Boolean getMoroIntegrated() {
        return moroIntegrated;
    }

    public void setMoroIntegrated(Boolean moroIntegrated) {
        this.moroIntegrated = moroIntegrated;
    }

    public Boolean getAtnrPresent() {
        return atnrPresent;
    }

    public void setAtnrPresent(Boolean atnrPresent) {
        this.atnrPresent = atnrPresent;
    }

    public Boolean getAtnrIntegrated() {
        return atnrIntegrated;
    }

    public void setAtnrIntegrated(Boolean atnrIntegrated) {
        this.atnrIntegrated = atnrIntegrated;
    }

    public Boolean getStnrPresent() {
        return stnrPresent;
    }

    public void setStnrPresent(Boolean stnrPresent) {
        this.stnrPresent = stnrPresent;
    }

    public Boolean getStnrIntegrated() {
        return stnrIntegrated;
    }

    public void setStnrIntegrated(Boolean stnrIntegrated) {
        this.stnrIntegrated = stnrIntegrated;
    }

    public Boolean getTlrPresent() {
        return tlrPresent;
    }

    public void setTlrPresent(Boolean tlrPresent) {
        this.tlrPresent = tlrPresent;
    }

    public Boolean getTlrIntegrated() {
        return tlrIntegrated;
    }

    public void setTlrIntegrated(Boolean tlrIntegrated) {
        this.tlrIntegrated = tlrIntegrated;
    }

    public Boolean getSpinalGalantPresent() {
        return spinalGalantPresent;
    }

    public void setSpinalGalantPresent(Boolean spinalGalantPresent) {
        this.spinalGalantPresent = spinalGalantPresent;
    }

    public Boolean getSpinalGalantIntegrated() {
        return spinalGalantIntegrated;
    }

    public void setSpinalGalantIntegrated(Boolean spinalGalantIntegrated) {
        this.spinalGalantIntegrated = spinalGalantIntegrated;
    }

    public Boolean getPalmarPresent() {
        return palmarPresent;
    }

    public void setPalmarPresent(Boolean palmarPresent) {
        this.palmarPresent = palmarPresent;
    }

    public Boolean getPalmarIntegrated() {
        return palmarIntegrated;
    }

    public void setPalmarIntegrated(Boolean palmarIntegrated) {
        this.palmarIntegrated = palmarIntegrated;
    }

    public String getVisualTracking() {
        return visualTracking;
    }

    public void setVisualTracking(String visualTracking) {
        this.visualTracking = visualTracking;
    }

    public String getVisualSaccades() {
        return visualSaccades;
    }

    public void setVisualSaccades(String visualSaccades) {
        this.visualSaccades = visualSaccades;
    }

    public String getConvergenceDivergence() {
        return convergenceDivergence;
    }

    public void setConvergenceDivergence(String convergenceDivergence) {
        this.convergenceDivergence = convergenceDivergence;
    }

    public String getFrequencyOfOT() {
        return frequencyOfOT;
    }

    public void setFrequencyOfOT(String frequencyOfOT) {
        this.frequencyOfOT = frequencyOfOT;
    }

    public String getGoalOne() {
        return goalOne;
    }

    public void setGoalOne(String goalOne) {
        this.goalOne = goalOne;
    }

    public String getGoalTwo() {
        return goalTwo;
    }

    public void setGoalTwo(String goalTwo) {
        this.goalTwo = goalTwo;
    }

    public String getGoalThree() {
        return goalThree;
    }

    public void setGoalThree(String goalThree) {
        this.goalThree = goalThree;
    }

    public String getGoalFour() {
        return goalFour;
    }

    public void setGoalFour(String goalFour) {
        this.goalFour = goalFour;
    }

    public String getTherapist() {
        return therapist;
    }

    public void setTherapist(String therapist) {
        this.therapist = therapist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClinicForm that = (ClinicForm) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getPatientName() + " Clinic Form";
    }
}
