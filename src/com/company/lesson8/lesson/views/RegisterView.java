package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.contorllers.RegistrationController;
import com.company.lesson8.lesson.exceptions.RegistrationException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.User;

import java.io.IOException;
import java.util.Scanner;


public class RegisterView implements View {

    public static void run() {
        while (true) {
            Scanner SCANNER = new Scanner(System.in);
            View view = new RegisterView();
            System.out.println("Registration started");
            String login = view.inputAnswer("Login");
            String password = view.inputAnswer("Password");
            String password2 = view.inputAnswer("Password2");

            RegistrationController controller = new RegistrationController();

            try {
                IndexedUser user = controller.register(login, password, password2);
                MainMenuView.run(user);
                return;
            } catch (RegistrationException | IOException | ClassNotFoundException e) {
                FunctionalAskView wrongPassAskView = new FunctionalAskView(
                        "Mismatch password. Want to try again?",
                        RegisterView::run,
                        StartMenu::run
                );
                wrongPassAskView.run();
            }
        }
    }
}