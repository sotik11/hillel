package com.company.lesson8.lesson.views;

import java.util.Scanner;

public class StartMenu {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void run() {
        System.out.println("Hello!");

        FunctionalAskView accountCreationAskView = new FunctionalAskView(
                "Do you have an account?",
                LoginView::run, // () -> LoginView.run()
                RegisterView::run
        );

        accountCreationAskView.run();
    }
}
