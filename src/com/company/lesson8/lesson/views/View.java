package com.company.lesson8.lesson.views;

import java.util.Scanner;

public interface View {
    default String inputAnswer(String word){
        System.out.println("Enter your " + word);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        return answer;
    }
}