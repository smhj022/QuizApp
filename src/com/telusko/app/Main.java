package com.telusko.app;

import com.telusko.levels.Easy;
import com.telusko.levels.Hard;
import com.telusko.levels.Moderate;
import com.telusko.model.QuestionLevel;
import com.telusko.service.QuizService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("####################################################");
        System.out.println("************Welcome to JAVA Quiz Challenge**********");
        System.out.println("####################################################");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String playerName = scan.nextLine();

        // Ask for quiz level form user
        System.out.println("Select Level of Quiz -> 1. Easy 2. Medium 3. Hard");
        int quizLevel = scan.nextInt();

        // initialize quizLevel class
        QuestionLevel ql;
        if (quizLevel ==  1){
            ql = new Easy();
        } else if (quizLevel == 2) {
            ql = new Moderate();
        } else if (quizLevel == 3) {
            ql = new Hard();
        } else {
            System.out.println("Invalid Selection!! Please try again...");
            return;
        }

        QuizService service = new QuizService(ql);
        service.playQuiz(playerName);
    }
}