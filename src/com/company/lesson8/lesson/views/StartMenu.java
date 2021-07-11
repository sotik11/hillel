package com.company.lesson8.lesson.views;


public class StartMenu {

    public static void run() {
        System.out.println("Hello!");

        FunctionalAskView accountCreationAskView = new FunctionalAskView(
                "Do you have an account?",
                LoginView::run,
                RegisterView::run
        );

        accountCreationAskView.run();
    }
}
