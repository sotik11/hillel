package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.exceptions.CreateException;
import com.company.lesson8.lesson.exceptions.NotFoundException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> REPOSITORY = new ArrayList<>();
//    private static final UserRepository USER_REPOSITORY = new UserRepository();
//
//    private UserRepository() {}
//
//    public static UserRepository instance() {
//        return USER_REPOSITORY;
//    }

    public void createUser(User user) throws CreateException {
        if (REPOSITORY.contains(user)) {
            throw new CreateException("User already created");
        }
        REPOSITORY.add(user);
    }

    public User getUserByLogin(String login) throws NotFoundException {
        for (User user : REPOSITORY) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        throw new NotFoundException("User with login:" + login + " not found");
    }

    // FIXME: This method duplicates logic of getUserByLogin method. You shouldn't duplicate code. This method is unnecessary.
    public String isLoginExists(String login) throws NotFoundException {
        for (User user : REPOSITORY) {
            if (login.equals(user.getLogin())) {
                return user.getLogin();
            }
        }
        throw new NotFoundException("User with login: '" + login + "' not found");
    }

    // FIXME: it seems weird, we shouldn't allow empty password for our users. So this method looks unnecessary.
    public String isPassExists(String login) throws NotFoundException {
        for (User user : REPOSITORY) {
            if (login.equals(user.getPass())) {
                return user.getPass();
            }
        }
        throw new NotFoundException("incorrect pass for user '" + login + "'");
    }
}
