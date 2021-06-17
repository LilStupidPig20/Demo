package com.example.demo;

public class Questions {
    private String question;
    private String[] answers;

    public Questions(String question, String[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public String correctAnswer() {
        return this.answers[this.answers.length - 1];
    }

    public String getQuestion() {
        return this.question;
    }

    public String[] getAnswers() {
        return this.answers;
    }
}
