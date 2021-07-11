package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.models.User;
import java.util.Scanner;

public class MainMenuView {
    public static void run(User user) {
        System.out.println("Hello: " + user.getLogin());

        System.out.println("1 - Exit");
        System.out.println("2 - Log out");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                return;

            case 2:
                StartMenu.run();
                return;

            default:
                System.out.println("Unknown command: " + answer);
        }

    }
}
