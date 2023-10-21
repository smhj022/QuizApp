package com.quiz.levels;

import com.quiz.model.Question;
import com.quiz.model.QuestionLevel;

public class Easy implements QuestionLevel {

    Question[] questionList = new Question[5];
    @Override
    public Question[] constructQuestions() {

        questionList[0] = new Question(
                1,
                "What is the purpose of the public static void main(String[] args) method in a Java program?",
                new String[]{
                        "It is the entry point of the program",
                        "It is used for printing output",
                        "It is a user-defined method",
                        "It is a constructor"
                },
                "It is the entry point of the program"
        );
        questionList[1] = new Question(
                2,
                "Which keyword is used to create a subclass in Java?",
                new String[]{"parent", "super", "extends", "subclass"},
                "extends"
        );
        questionList[2] = new Question(
                3,
                "What is the output of System.out.println(5 == 5.0) in Java?",
                new String[]{
                        "true",
                        "false",
                        "compilation error",
                        "runtime error"
                },
                "true"
        );

        questionList[3] = new Question(
                4,
                "Which data type is used to store whole numbers in Java?",
                new String[]{
                        "float",
                        "int",
                        "double",
                        "char",
                },
                "int"
        );

        questionList[4] = new Question(
                5,
                "What is the result of 10 % 3 in Java?",
                new String[]{
                        "1",
                        "2",
                        "3",
                        "0",
                },
                "1"

        );

        return questionList;
    }

}



