package com.company.lesson7.lesson.test;

public class TestMain {
    public static void main(String[] args) {
        TestPrivate testPrivate = new TestPrivate();
        System.out.println(testPrivate.defaultField);
        System.out.println(testPrivate.protectedField);
        System.out.println(testPrivate.publicField);
    }
}
