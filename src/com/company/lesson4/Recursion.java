package com.company.lesson4;

import java.util.List;

public class Recursion {

    public static void main(String[] args) {
        printNumbersBefore1(10);

        String[] arr;
        List<String> list;

        Integer a = 10;

        int[] intArr;
        List<Integer> intList;
    }

    public void printNumbersBefore(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
    }

    public static void printNumbersBefore1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbersBefore1(n - 1);
    }
}
