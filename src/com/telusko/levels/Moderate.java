package com.telusko.levels;

import com.telusko.model.Question;
import com.telusko.model.QuestionLevel;

public class Moderate implements QuestionLevel {

    private int noOfQuestion = 5;
    Question[] questionList= new Question[noOfQuestion];

    // Moderate Level Questions

    @Override
    public Question[] constructQuestions() {

        questionList[0] = new Question(
                1,
                "What is the difference between an abstract class and an interface in Java?",
                new String[]{
                        "An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods.",
                        "An interface can have constructors, while an abstract class cannot.",
                        "An abstract class can have multiple inheritance, while an interface cannot.",
                        "An interface can have variables, while an abstract class cannot."
                },
                "An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods."
        );

        questionList[1] = new Question(
                2,
                "What is the purpose of the `super` keyword in Java?",
                new String[]{
                        "It is used to access the superclass of a class.",
                        "It is used to call a static method of the superclass.",
                        "It is used to create an instance of a subclass.",
                        "It is used to call a method of the current class."
                },
                "It is used to access the superclass of a class."
        );

        questionList[2] = new Question(
                3,
                "What is a static method in Java?",
                new String[]{
                        "A method that belongs to the class rather than any specific instance.",
                        "A method that is called using the 'super' keyword.",
                        "A method that is declared with the keyword 'static'.",
                        "A method that cannot be overridden."
                },
                "A method that belongs to the class rather than any specific instance."
        );

        questionList[3] = new Question(
                4,
                "What is the purpose of the `this` keyword in Java?",
                new String[]{
                        "It is used to refer to the current instance of the class.",
                        "It is used to access a static variable.",
                        "It is used to create a new instance of the class.",
                        "It is used to call a method of the superclass."
                },
                "It is used to refer to the current instance of the class."
        );

        questionList[4] = new Question(
                5,
                "What is the difference between `==` and `.equals()` in Java?",
                new String[]{
                        "`==` is used to compare the memory addresses of objects, while `.equals()` is used to compare the contents of objects.",
                        "`==` can only be used with primitive data types, while `.equals()` can be used with objects.",
                        "`==` is used to compare the contents of objects, while `.equals()` is used to compare memory addresses.",
                        "`==` and `.equals()` are interchangeable and can be used interchangeably."
                },
                "`==` is used to compare the memory addresses of objects, while `.equals()` is used to compare the contents of objects."
        );

        return questionList;
    }

}
