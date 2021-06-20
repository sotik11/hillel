package com.company.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        for (int i = 0; i < 5; i++) {
//            int value = scanner.nextInt();
//            sum += value;
//        }
//
//        System.out.println(sum);

//        recursion(0);

//        int arrSize = 5;
//        int[] arr = new int[arrSize];
//        arr[2] = 1;
//
//        String arrString = toString(arr, arrSize);//Arrays.toString(arr);
//
//        System.out.println(arrString);
//        System.out.println(Arrays.toString(arr));

//        int a = 10;
//        changeInt(a);
//        System.out.println(a);

//        double[] arr = new double[] { -1.0, 3.33, 1 / 0.0};
//        System.out.println( Arrays.toString(arr) );

//        System.out.println(Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY);
//        System.out.println(Double.NaN);
//
//
//        double a1 = scanner.nextDouble();
//        double a2 = scanner.nextDouble();
//
//        int precision = 1000000;
//        if ((int) (a1 / a2 * precision) == (int) (2.2 * precision)) {
//            System.out.println("Yes");
//        }

//        if (5 > Double.NaN) {
//            System.out.println("Yes");
//        } else if (5 < Double.NaN) {
//            System.out.println("Yes");
//        } else if (5 == Double.NaN) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        int[][] arr = new int[5][6];// {
//                {0, 3, 4},
//                {3, 4, 0},
//                {4, 0}
//        };

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.deepToString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//        String[] names = new String[] {"Dima", "Vova", "Nadia"};
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        boolean isFound = false;
//        for (String pretended : names) {
//            if (name.equals(pretended)) {
//                isFound = true;
//            }
//        }
//
//        if ( ! isFound) {
//            names = Arrays.copyOf(names, names.length + 1);
//            names[names.length - 1] = name;
//        }

//        if ( ! isFound) {
//            String[] tempArr = new String[names.length + 1];
//            for (int i = 0; i < names.length; i++) {
//                tempArr[i] = names[i];
//            }
//            int lastElement = names.length; // names.length = tempArr.length - 1
//            tempArr[lastElement] = name;
//            names = tempArr;
//        }

//        int[] arr = new int[5];

//        for (int value : arr){
//            // we don't have an index of element
//        }

//        for (int i = 0; i < arr.length; i++) {
//            value = arr[i]
//        }

        int a = 10;
        int b = 20;

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }

//    private static void changeInt(int a) {
//        a += 10;
//    }
//
//    private static String toString(int[] a, int arrSize) {
//        StringBuilder builder = new StringBuilder();
//
//        a[arrSize - 1] = 9;
//
//        for (int i = 0; i < arrSize; i++) {
//            toString(a[i], builder);
//        }
//
//        return builder.toString();
//    }
//
//    private static void toString(int a, StringBuilder builder) {
//        builder.append("{").append(a).append("}");
//    }

//    private static void recursion(int x) {
//        if (x > 10)
//            return;
//
//        System.out.println(x);
//        recursion(x + 1);
//    }
}
