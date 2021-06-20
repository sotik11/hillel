package com.company.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        int a = 10;
////
////        // -------------------------------
////        double b = a;
////        // -------------------------------
////        int c = (int) b;
////        // -------------------------------
//////        System.out.println( (int) 10.7 );
//////
//////        byte b1 = 127;
//////        byte b2 = 4;
//////        b1 = (byte) (b1 + b2);
//////        System.out.println(b1);
////
////        int a1 = 10;
////        int a2 = 5;
////
////        a1 = a1 + a2;
////        a1 += a2;
////        // -=
////        // *=
////        // /=
//
////        System.out.println("Enter something: ");
////        Scanner scanner = new Scanner(System.in);
////        String string = scanner.nextLine();
////        System.out.println("Entered: " + string);
//
////        String name = "Dima";
////        String name2 = new String("Dima2");
////        String fullName = name + " " + name2;
////        System.out.println(fullName);
//
////        System.out.println(2 + " (" + 9 + ")");
//
////        System.out.print("Test1" +" ");
////        System.out.print(" ");
////        System.out.print(" " + "Test2");
//
////        System.out.printf("%10s", " ");
//
////        String template = "%s in %s";
////        String s1 = "s1";
////        String s2 = "s2";
////
////        String result = String.format(template, s1, s2);
////        System.out.println(result);
//
////        boolean value = true;
////        System.out.println("If: ");
////        if (value) {
////            System.out.println("Yes");
////        } else {
////            System.out.println("No");
////        }
////        System.out.println("Finish");
////    }
//
//        Scanner scanner = new Scanner(System.in);
//        int n1 = 10;//scanner.nextInt();
//        int n2 = 10;//scanner.nextInt();
//
////        System.out.println(n1);
////        System.out.println(n2);
//
//
//        if (n1 > n2) {
//            System.out.println("Yes");
//        } else if (n1 < n2) {
//            System.out.println("No");
//        } else {
//            System.out.println("Equals");
//        }


        String type = "type2";

        switch (type) {
            case "type1":
                System.out.println("Type1");
                break;

            case "type2":
                System.out.println("Type2");
                break;

            default:
                System.out.println("Default");
        }


    }
}
