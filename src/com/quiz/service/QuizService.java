package com.quiz.service;

import com.quiz.model.Question;
import com.quiz.model.QuestionLevel;

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
