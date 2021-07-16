package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.exceptions.CreateException;
import com.company.lesson8.lesson.exceptions.NotFoundException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    SerializedRepository s = new SerializedRepository();
    private static final List<User> REPOSITORY = new ArrayList<>();
    private static final UserRepository USER_REPOSITORY = new UserRepository();


    public UserRepository() {}

    public static UserRepository instance() {
        return USER_REPOSITORY;
    }

    public void createUser(User user) throws CreateException {
        if (REPOSITORY.contains(user)) {
            throw new CreateException("User already created");
        }
        REPOSITORY.add(user);
    }

    public User getUserByLogin(String login) throws NotFoundException, IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<User> users2 = (List<User>) ois1.readObject();

        fis1.close();
        ois1.close();
        for (User user : users2) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        throw new NotFoundException("User with login:" + login + " not found");
    }

    public void delete(User user) {
        // TODO:
    }
}
