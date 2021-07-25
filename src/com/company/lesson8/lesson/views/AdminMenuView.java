package com.company.lesson8.lesson.views;

import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.repositories.SerializedRepository;

import java.io.IOException;
import java.util.Scanner;

public class AdminMenuView {
    public static void run() throws IOException, ClassNotFoundException {
        System.out.println("Hello Mister ADMIN!");
        System.out.println();

        while (true) {
            System.out.println("1 - Show all users list");
            System.out.println("2 - Delete User by index");
            System.out.println("3 - Show User by index");
            System.out.println("4 - Delete user by Login");
            System.out.println("5 - Reset repository (delete all users)");
            System.out.println("6 - Exit");
            System.out.println("7 - Log out");

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
                    s.loginForDelete();
                    break;
                case 5:
                    s.reset();
                    break;
                case 6:
                    return;
                case 7:
                    StartMenu.run();
                    return;
                default:
                    System.out.println("Unknown command: " + answer);
            }
        }
    }
}
