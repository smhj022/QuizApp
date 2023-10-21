package com.telusko.levels;

import com.telusko.model.Question;
import com.telusko.model.QuestionLevel;

import java.util.Objects;
import java.util.Scanner;

public class Hard implements QuestionLevel {

    private int noOfQuestion = 5;
    Question[] questionList= new Question[noOfQuestion];

    @Override
    public Question[] constructQuestions() {

        System.out.println("IN constructQuestions");

        questionList[0] = new Question(
                1,
                "What is the purpose of the `volatile` keyword in Java?",
                new String[]{
                        "It is used to indicate that a variable may be modified asynchronously.",
                        "It is used to make a variable immutable.",
                        "It is used to specify that a variable is only accessible within a synchronized block.",
                        "It is used to declare a variable as a constant."
                },
                "It is used to indicate that a variable may be modified asynchronously."
        );

        questionList[1] = new Question(
                2,
                "What is the Java Virtual Machine (JVM)?",
                new String[]{
                        "It is a physical machine that executes Java bytecode.",
                        "It is a software implementation that simulates a physical machine.",
                        "It is a tool used for debugging Java code.",
                        "It is a tool used for profiling Java applications."
                },
                "It is a software implementation that simulates a physical machine."
        );

        questionList[2] = new Question(
                3,
                "Explain the concept of garbage collection in Java.",
                new String[]{
                        "Garbage collection is a process of cleaning up unused objects and reclaiming memory automatically.",
                        "Garbage collection is a process of manually deleting objects to free up memory.",
                        "Garbage collection is a process of compressing memory to reduce fragmentation.",
                        "Garbage collection is a process of optimizing the performance of Java applications."
                },
                "Garbage collection is a process of cleaning up unused objects and reclaiming memory automatically."
        );

        questionList[3] = new Question(
                4,
                "What is the difference between checked and unchecked exceptions in Java?",
                new String[]{
                        "Checked exceptions are checked at compile time, while unchecked exceptions are checked at runtime.",
                        "Checked exceptions occur during runtime, while unchecked exceptions occur during compile time.",
                        "Checked exceptions are subclasses of RuntimeException, while unchecked exceptions are subclasses of Exception.",
                        "Checked exceptions can be caught using a try-catch block, while unchecked exceptions cannot be caught."
                },
                "Checked exceptions are checked at compile time, while unchecked exceptions are checked at runtime."
        );

        questionList[4] = new Question(
                5,
                "Explain the purpose of the `transient` keyword in Java.",
                new String[]{
                        "It is used to indicate that a variable should not be serialized during object serialization.",
                        "It is used to specify that a variable is thread-safe.",
                        "It is used to declare a variable as a constant.",
                        "It is used to indicate that a variable is accessible from multiple threads."
                },
                "It is used to indicate that a variable should not be serialized during object serialization."
        );

        return questionList;
    }

}

