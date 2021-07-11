package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.contorllers.LoginController;
import com.company.lesson8.lesson.exceptions.LoginException;
import com.company.lesson8.lesson.models.User;

import java.util.Scanner;

public class LoginView implements View {
    public static void run() {

        while (true) {
            View view = new RegisterView();
            System.out.println("Login started");
            String login = view.inputAnswer("Login");
            String password = view.inputAnswer("Password");

            LoginController loginController = new LoginController();

            try {
                User user = loginController.login(login, password);
                MainMenuView.run(user);
                return;
            } catch (LoginException e) {
                Scanner SCANNER = new Scanner(System.in);
                System.out.println("Error: " + e.getMessage());
                System.out.println("Do you want to try again?");
                System.out.println("1 - yes");
                System.out.println("2 - no");
                System.out.println("3 - registration");
                int answer = SCANNER.nextInt();

                switch (answer) {
                    case 1:
                        System.out.println("Ok,then let's try again");
                        LoginView.run();
                        break;
                    case 2:
                        break;
                    case 3:
                        RegisterView.run();
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operation: " + answer);
                }
            }
        }
    }
}
