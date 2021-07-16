package com.company.lesson8.lesson.views;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleAskView {
    Scanner scan = new Scanner(System.in);
    String question;

    String[] trueAnswer = {"y", "Y", "yes", "YES", "1", "+"};
    String[] falseAnswer = {"n", "N", "no", "NO", "0", "-"};

    public SimpleAskView(String question) {
        this.question = question;
    }

    public static boolean checkAnswer(String[] expectedAnswer, String userAnswer) {
        return Arrays.asList(expectedAnswer).contains(userAnswer);
    }

    public boolean run() {
        System.out.println(question);
        String answer = scan.nextLine();
        if (checkAnswer(trueAnswer, answer)) {
            return true;
        }
        if (checkAnswer(falseAnswer, answer)) {
            return false;
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Cant read your answer, try again");
                answer = scan.nextLine();
                if (checkAnswer(trueAnswer, answer)) {
                    return true;
                }
                if (checkAnswer(falseAnswer, answer)) {
                    return false;
                }
            }
        }
        throw new UncheckedIOException(
                    new IOException("Cant read your answer more then 3 times, program close"));
    }
}