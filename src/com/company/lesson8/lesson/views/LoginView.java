package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.contorllers.LoginController;
import com.company.lesson8.lesson.exceptions.LoginException;
import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.User;

import java.io.IOException;
import java.util.Scanner;

public class LoginView {

    public static void run() {
        while (true) {
            Scanner SCANNER = new Scanner(System.in);
            View view = new RegisterView();
            System.out.println("Login started");
            String login = view.inputAnswer("Login");
            String password = view.inputAnswer("Password");

            LoginController loginController = new LoginController();

            try {
                IndexedUser user = loginController.login2(login, password);
                if (login.equals("admin") && password.equals("admin")){
                    AdminMenuView.run();
                    return;
                }
                else
                MainMenuView.run(user);
                return;
            } catch (IOException | ClassNotFoundException | LoginException | NotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Do you want to try again?");
                System.out.println("1 - yes");
                System.out.println("2 - no");
                System.out.println("3 - registration");
                int answer = SCANNER.nextInt();

                if (answer == 1) {
                    // do nothing
                    System.out.println("Ok,then let's try again");
                    LoginView.run();
                    break;
                } else if (answer == 2) {
                    break;
                } else if (answer == 3) {
                    RegisterView.run();
                    break;
                } else {
                    throw new IllegalArgumentException("Unsupported operation: " + answer);
                }
            }
        }
    }
}