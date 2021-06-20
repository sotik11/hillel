package com.company.lesson1;

public class Main {

    public static void main(String[] args) {

        // int          E: 5, 7, -10;
        // double       E: 5.56, -90.8
        // char         E: 'y', ':', '\''

        // byte < short
        // short < int
        // long > int
        // float < double

        // int < double

        // boolean      E: true, false

        // String       E: "abdf", "2345", "*&d"

        int fResult = f(10);
        fResult = 3;

//        System.out.println("Hello world!");
//        System.out.println( f(10) );
        System.out.println( fResult );

//        int a = 11;
//        int b = 5;

//        System.out.println(a + b); // 16
//        System.out.println(a - b); // 6
//        System.out.println(a * b); // 55
//        System.out.println(a * 1.0 / b); // 2.ddd
//        System.out.println(a % b); // 1

//        char char1 = 'A';
//        char char2 = 'C';
//
//        int a = 1;
//        int b = 3;
//
//        int intResult = a + b;
//        char charResult = (char) (char2 - char1);
//
//        System.out.println();

//        boolean bool = true;

//        System.out.println(bool);
    }

    static int f(int x) {
        return x * x + 1;
    }
}
