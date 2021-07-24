package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.Indexed;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.PreIndexed;
import com.company.lesson8.lesson.models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SerializedRepository implements Repository {

    @Override
    public void save(PreIndexed obj) throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<User> users2 = (List<User>) ois1.readObject();

        fis1.close();
        ois1.close();

        users2.add((User) obj);

        final FileOutputStream fos = new FileOutputStream("user-repository/users.ser");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(users2);
        fos.close();
        oos.close();
    }

    public void loadAllUsers() throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();

        fis1.close();
        ois1.close();

        System.out.println();
        System.out.println("List of all users in repository");
        System.out.println();
        for (int i = 0; i < users2.size(); i++) {
            System.out.println(users2.get(i));
        }
        System.out.println();
    }

    public void indexForDelete() throws IOException, ClassNotFoundException {
        System.out.println("Enter user index");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        deleteByIndex(a);
    }

    public void deleteByIndex(int index) throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();

        Iterator<IndexedUser> it = users2.iterator();
        while (it.hasNext()) {
            if (it.next().getIndex() == index)
                it.remove();
        }

        fis1.close();
        ois1.close();

        final FileOutputStream fos = new FileOutputStream("user-repository/users.ser");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(users2);
        oos.flush();
        fos.close();
        oos.close();

        System.out.println("User by index " + index + " deleted");
        System.out.println();
    }

    public void indexForLoad() throws IOException, ClassNotFoundException {
        System.out.println("Enter user index");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        loadByIndex(a);
    }

    public void loadByIndex(int index) throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();
        fis1.close();
        ois1.close();

        for (IndexedUser userX : users2) {
            if (userX.getIndex() == index) {
                System.out.println(userX);
            }
        }
        System.out.println();
    }

    public void reset() throws IOException {
        List<IndexedUser> users2 = new ArrayList<>();
        IndexedUser resetUser = new IndexedUser("reset", "reset", 1);
        users2.add(resetUser);
        final FileOutputStream fos = new FileOutputStream("user-repository/users.ser");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(users2);
        fos.close();
        oos.close();
    }

    @Override
    public void delete(Indexed obj) throws IOException, ClassNotFoundException {
        deleteByIndex(obj.getIndex());
    }

    @Override
    public Indexed load(int index) throws IOException, NotFoundException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("user-repository/users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users2 = (List<IndexedUser>) ois1.readObject();
        fis1.close();
        ois1.close();

        for (IndexedUser userX : users2) {
            if (userX.getIndex() == index) {
                return userX;
            }
        }throw new NotFoundException("Index not found");
    }
}




