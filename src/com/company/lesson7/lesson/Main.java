package com.company.lesson7.lesson;

import com.company.lesson7.lesson.test.TestPrivate;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        run((Ferrari) ferrari);
    }

    static void run(Car car) {
        car.run();
    }

    static void run(Ferrari car) {
        System.out.println("Wzhyyyyy... Ferrari is running!!!");
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }

    double max(double a, double b) {
        return a > b ? a : b;
    }

    int max(int a, int b, int a1, int b1) {
        return max(max(a, b), max(a1, b1));
    }

//    public static void main(String[] args) {
//        Person vasia = new Person("Vasia", 18);
//
//        TestPrivate testPrivate = new TestPrivate();
//        System.out.println(testPrivate.publicField);
//
//        ExtendedTestPrivate testPrivate1 = new ExtendedTestPrivate();
//        testPrivate.doSomething();
//
//        vasia.sayName();
//        vasia.sayAge();
//    }

//    private static void test() {
//
//        int a = 0;
//
//        {
//            int b = 10;
//        }
//
//
////        int c = a + b;
//    }

//    public static void main(String[] args) {
//        boolean statement = false;
//
//        String name;
//        if (statement) {
//            name = "Vasia";
//        } else {
//            name = "Petia";
//        }
//
//        String name2 = statement ? "Vasia" : "Petia";
//    }
}
