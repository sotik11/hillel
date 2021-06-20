package com.company.lesson4;

import java.util.Scanner;

public class Main {
    static final String USER1_LOGIN = "user1";
    static final String USER2_LOGIN = "user2";
    static final String USER3_LOGIN = "user3";
    static final String USER1_PASS = "pass1";
    static final String USER2_PASS = "pass2";
    static final String USER3_PASS = "pass3";

    public static void main(String[] args) {
//        int n = 3;
//        String star = "*";
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("login:");
//        String login = scanner.nextLine();
//
//        switch (login) {
//            case USER1_LOGIN:
//                System.out.println("pass: ");
//                String pass = scanner.nextLine();
//                if (pass.equals(PA)) {
//                    System.out.println("Hello");
//                } else {
//                    System.out.println("Retry, please. Incorrect pass");
//                }
//                break;
//
//            case USER2_LOGIN:
//
//            case USER3_LOGIN:
//
//            default:
//                System.out.println("Incorrect login");
//        }

        login();

    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Login:");
            String login = scanner.nextLine();
            switch (login) {
                case USER1_LOGIN:
                    checkPass(USER1_PASS);
                    return;

                case USER2_LOGIN:
                    checkPass(USER2_PASS);
                    return;

                case USER3_LOGIN:
                    checkPass(USER3_PASS);
                    return;

                default:
                    System.out.println("Incorrect pass");
            }
        }
    }

    // checkPass(originalPass) = ... | originalPass - String
    public static void checkPass(String correctPass) {
        Scanner scanner = new Scanner(System.in);
        String pass;

        do {
            System.out.println("pass:");
            pass = scanner.nextLine();
        } while ( ! isPassCorrect(correctPass, pass));
    }

    public static boolean isPassCorrect(String correctPass, String yourPass) {
        boolean isCorrect = yourPass.equals(correctPass);
        if ( ! isCorrect) {
            System.out.println("Repeat, please");
        }
        return isCorrect;
    }

    public static void printHello() {
        System.out.println("Hello");
    }


    // f(x) = x^2 + 1; | x - int
    public int f(int x) {
        return x * x + 1;
    }
}
