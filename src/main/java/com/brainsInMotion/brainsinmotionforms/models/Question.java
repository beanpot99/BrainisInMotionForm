package com.brainsInMotion.brainsinmotionforms.models;

import java.util.Objects;

public class Question {
    private int id;
    private static int nextId = 1;
    private String question;
    private int points;
    private String quadrant;
    private String section;
    public Question(){
        id = nextId;
        nextId++;
    }
    public Question(String question, int points, String quadrant, String section){
    this();
    this.question=question;
    this.points=points;
    this.quadrant=quadrant;
    this.section=section;
    }
    public String getQuestion() {
        return question;
    }

    public int getPoints() {
        return points;
    }

    public String getQuadrant() {
        return quadrant;
    }

    public String getSection() {
        return section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }

    @Override
    public String toString() {
        return question;
    }
}
