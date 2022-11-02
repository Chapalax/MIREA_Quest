package com.company;

public class Answer {
    private String variant;
    private int score;

    public int getScore() {
        return score;
    }

    public Answer(String variant, int score) {
        this.variant = variant;
        this.score = score;
    }

    public String getVariant() {
        return variant;
    }
}
