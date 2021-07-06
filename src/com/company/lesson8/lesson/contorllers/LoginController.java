package com.company.lesson8.lesson.contorllers;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.repositories.UserRepository;

import java.util.Scanner;

public class LoginController {

    private final UserRepository repository = new UserRepository();
    Scanner scan = new Scanner(System.in);

    public User logIn() throws NotFoundException {
        System.out.println("Enter login");
        String login = scan.nextLine();
        if (login.equals(repository.loginExists(login))) {
            System.out.println("Enter pass");
            String pass = scan.nextLine();
            if (pass.equals(repository.passExists(pass))) {
                return repository.getUserByLogin(login);
            }
        }
        throw new NotFoundException();
    }
}


