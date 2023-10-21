package com.quiz.model;

import java.util.Arrays;

public class Question {

    private int qid;
    private String title;

    public String[] getOptions() {
        return options;
    }

    private String[] options;
    private String answer;

    public Question(int qid, String title, String[] options, String answer) {
        this.qid = qid;
        this.title = title;
        this.options = options;
        this.answer = answer;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qid=" + qid +
                ", title='" + title + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }

}
