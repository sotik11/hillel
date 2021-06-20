package com.company.lesson3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    enum Status {
        BODR,
        USTAL,
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        int n1 = a / 1000;
//        int n2 = a / 100 % 10;
//        int n3 = a / 10 % 10;
//        int n4 = a % 10;



//        Status status = Status.BODR;
//
//        while (status != Status.USTAL) {
//            System.out.println("Run...");
//            int i = scanner.nextInt();
//
//            status = i == 0 ?
//                    Status.USTAL
//                    :
//                    Status.BODR;
//
//            if (i == 0) {
//                status = Status.USTAL;
//            } else {
//                status = Status.BODR;
//            }
//        }

//        String correctPass = "qwerty";
//        String pass = null;
//
//        do {
//            System.out.println("Enter your pass: ");
//            pass = scanner.nextLine();
//        } while ( ! pass.equals(correctPass));
//
//        while (! pass.equals(correctPass)) {
//            System.out.println("Enter your pass: ");
//            pass = scanner.nextLine();
//        }
//
//        System.out.println("Finish");

        // i = i + 1 => i++ | ++i

//        for (int i = 0; i < 10; ++i) {
//            System.out.printf("Run... (%d)%n", i + 1);
//        }
//
//        int a = 10;
//        System.out.println(a++);
//        System.out.println(a);
//
//        int b = 10;
//        System.out.println(++b);

//        List<String> names = Arrays.asList("Dima", "Vasia", "Petia");
//        for(String name : names) {
//            System.out.println(name);
//        }

        Path path = Paths.get("/home/user/Desktop/test.txt");
        Files.writeString(path, "Hello World!");
        String note = Files.readString(path);
        System.out.println(note);
    }
}
