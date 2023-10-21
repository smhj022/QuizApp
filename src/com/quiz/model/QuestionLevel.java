package com.quiz.model;

import java.util.Objects;
import java.util.Scanner;

public interface QuestionLevel {

    Question[] constructQuestions();

    default int askQuestionAndValidate(Question[] questionList) {
        int score = 0;
        Scanner scan = new Scanner(System.in);

        for(Question question: questionList){
            System.out.println(question.getQid() + ") " + question.getTitle());
            String[] options = question.getOptions();
            for(int opt=0 ; opt<options.length; opt++){
                System.out.println(opt + 1 + ". " + options[opt]);
            }
            String rightAnswer = question.getAnswer();
            System.out.println(0 + ". " + "Skip");

            System.out.println("Your Answer :" );

            int playerChoice = scan.nextInt() - 1;

            if(playerChoice != -1){
                String playerAnswer = question.getOptions()[playerChoice];
                if (Objects.equals(playerAnswer, rightAnswer)){
                    score += 2;
                } else {
                    score -= 1;
                }
            }
        }
        return score;
    }

}
