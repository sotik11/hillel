package com.company.lesson8.lesson.contorllers;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.repositories.UserRepository;
import com.company.lesson8.lesson.views.SimpleAskView;

import java.util.Scanner;

public class LoginController {

    private final UserRepository repository = new UserRepository();

    // FIXME: Why your method throws NotFoundException? Is this method search for something? No - so, it shouldn't throw the exception;
//    public User logIn() throws NotFoundException {
//        System.out.println("Enter login");
//        String login = scan.nextLine();
//        if (login.equals(repository.isLoginExists(login))) {
//            System.out.println("Enter pass");
//            String pass = scan.nextLine();
//            if (pass.equals(repository.isPassExists(pass))) {
//                return repository.getUserByLogin(login);
//            }
//        }
//        throw new NotFoundException();
//    }


    // TODO: Please chek what I changed. If you have any questions ask, please.
    public User logIn() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter login");
            String login = scan.nextLine();

            try {
                User user = repository.getUserByLogin(login);
                System.out.println("Enter pass");
                String pass = scan.nextLine();
                if (pass.equals(user.getPass())) {
                    System.out.println("Successful login!");
                    return user;
                } else {
                    System.out.println("Incorrect password");
                    boolean isRetry = new SimpleAskView("Do you want to retry?").run();
                    if(!isRetry) {
                        break;
                    }
                }

            } catch (NotFoundException e) {
                System.out.println("User with login: " + login + " not found.");
                boolean isRetry = new SimpleAskView("Do you want to retry?").run();
                if(!isRetry) {
                    break;
                }
            }
        }
        throw new RuntimeException("Login fail!");
    }
}


