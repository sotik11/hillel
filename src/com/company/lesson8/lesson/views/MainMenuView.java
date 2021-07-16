package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.repositories.SerializedRepository;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuView {
    public static void run(IndexedUser user) throws IOException, ClassNotFoundException {
        System.out.println("Hello: " + user.getLogin());

        while (true) {
            System.out.println("1 - Show all users list");
            System.out.println("2 - Delete User by index");
            System.out.println("3 - Show User by index");
            System.out.println("4 - Reset repository (delete all users)");
            System.out.println("5 - Exit");
            System.out.println("6 - Log out");

            SerializedRepository s = new SerializedRepository();
            Scanner scanner = new Scanner(System.in);
            boolean isInt = scanner.hasNextInt();
            while (isInt == false) {
                scanner.nextLine();
                System.out.println("Answer must be a number");
                isInt = scanner.hasNextInt();
            }
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    s.loadAllUsers();
                    break;
                case 2:
                    s.indexForDelete();
                    break;
                case 3:
                    s.indexForLoad();
                    break;
                case 4:
                    s.reset();
                    break;
                case 5:
                    return;
                case 6:
                    StartMenu.run();
                    return;
                default:
                    System.out.println("Unknown command: " + answer);
            }

        }
    }
}
