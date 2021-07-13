package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.models.User;
import java.io.*;

public class SerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("login", "pass");
        Integer index = 0;
//
        File file = new File("user-repository" + "/" + "user-" + index + ".ser");
//        file.createNewFile();
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(user);
//
//        objectOutputStream.close();
//        fileOutputStream.close();


        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        user = (User) objectInputStream.readObject();

        objectInputStream.close();
        inputStream.close();

        System.out.println(user.getLogin());
        System.out.println(user.getPass());
    }
}
