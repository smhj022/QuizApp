package com.telusko.service;

import com.telusko.model.Question;
import com.telusko.model.QuestionLevel;

public class QuizService {

    private QuestionLevel qLevel;

    public QuizService(QuestionLevel qLevel) {
        this.qLevel = qLevel;
    }
    public void playQuiz(String playerName){
        Question[] questionList = qLevel.constructQuestions();
        int score = qLevel.askQuestionAndValidate(questionList);
        System.out.println(playerName + ", Your Total Score : " + score);
    }
}
