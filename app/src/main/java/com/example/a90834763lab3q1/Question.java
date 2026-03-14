package com.example.a90834763lab3q1;

public class Question {
    String questionText;
    int imageResId;
    String[] options;
    int correctAnswerIndex;

    public Question(String questionText, int imageResId, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.imageResId = imageResId;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
