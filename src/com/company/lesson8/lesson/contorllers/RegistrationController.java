package com.company.lesson8.lesson.contorllers;

import com.company.lesson8.lesson.exceptions.RegistrationException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.repositories.SerializedRepository;
import com.company.lesson8.lesson.repositories.UserRepository;
import com.company.lesson8.lesson.exceptions.NotFoundException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class RegistrationController {
    SerializedRepository s = new SerializedRepository();
    private final UserRepository repository = UserRepository.instance();

    private boolean isPasswordValid(String password1, String password2) {
        return password1.equals(password2);
    }

    private boolean isLoginValid(String login) throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();

        fis1.close();
        ois1.close();
        boolean loginExists = false;

        for (int i = 0; i < users2.size(); i++) {
            if (users2.get(i).getLogin().equals(login)) {
                loginExists = true;
            }
        }
        if (loginExists) {
            return false;
        }
        else return true;
    }


    public IndexedUser register(String login, String password, String repeatedPassword) throws RegistrationException, IOException, ClassNotFoundException {
        if (isLoginValid(login)) {
            if (isPasswordValid(password, repeatedPassword)) {
                IndexedUser user = new IndexedUser(login, password, IndexedUser.getLastIndexX());
                try {
//                    repository.createUser(user);
                    s.save(user);
                    return (IndexedUser) repository.getUserByLogin(login);


                } catch (NotFoundException | IOException | ClassNotFoundException exception) {
                    throw new RuntimeException(exception);
                }
            } else {
                throw new RegistrationException(RegistrationException.MESSAGE_INVALID_PASS);
            }
        } else {
            throw new RegistrationException(RegistrationException.MESSAGE_INVALID_LOGIN);
        }
    }
}