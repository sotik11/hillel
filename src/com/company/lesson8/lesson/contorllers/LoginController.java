package com.company.lesson8.lesson.contorllers;

import com.company.lesson8.lesson.exceptions.LoginException;
import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.repositories.UserRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LoginController {

    private final UserRepository repository = UserRepository.instance();
//
//    public User login(String login) {
//        // if repo contains user with login
//    }

    private boolean isLoginValid(String login) {
        try {
            repository.getUserByLogin(login);
            return false;
        } catch (NotFoundException | IOException | ClassNotFoundException e) {
            return true;
        }
    }

    private boolean isPasswordValid(String login, String password) {
        try {
            String pass = repository.getUserByLogin(login).getPass();
            return pass.equals(password);
        } catch (NotFoundException | IOException | ClassNotFoundException e) {
            return true;
        }
    }

    public User login(String login, String password) throws LoginException {
        if (isLoginValid(login)) {
            if (isPasswordValid(login, password)) {
                try {
                    return repository.getUserByLogin(login);
                } catch (NotFoundException | IOException | ClassNotFoundException exception) {
                    throw new RuntimeException(exception);
//                    throw new NotFoundException("User with login:" + login + " not found");
                }
            } else {
                throw new LoginException(LoginException.MESSAGE_INVALID_PASS);
            }
        } else {
            throw new LoginException(LoginException.MESSAGE_INVALID_LOGIN);
        }
    }

    public IndexedUser login2(String login, String pass) throws IOException, ClassNotFoundException, NotFoundException, LoginException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();

        fis1.close();
        ois1.close();

        for (IndexedUser user : users2) {
            if (user.getLogin().equals(login)) {
                if (user.getPass().equals(pass)) {
                    UserRepository u = new UserRepository();
                    return (IndexedUser) u.getUserByLogin(login);
                }
                else {
                    throw new LoginException(LoginException.MESSAGE_INVALID_PASS);
                }
            }
        }
//        System.out.println("Login does not exists");
        throw new LoginException(LoginException.MESSAGE_INVALID_LOGIN);
    }
}


