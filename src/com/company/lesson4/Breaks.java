package com.company.lesson4;

public class Breaks {

    public static void main(String[] args) {
        test4();
    }

    static void test4() {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println(i + 1);
        }
        System.out.println("Finish");
    }

    static void test() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);

            if (i == 10) {
                return;
            }
        }
    }

    static void test1_1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    static void test1() {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                return;
            }
            System.out.println(i + 1);
        }
        System.out.println("Finish");
    }

    static void test2() {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i + 1);
        }
        System.out.println("Finish");
    }

    static void test3() {
        loop1: for (;;) {
            while (true) {
                break loop1;
            }
        }
    }
}
