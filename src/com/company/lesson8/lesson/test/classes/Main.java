package com.company.lesson8.lesson.test.classes;

public class Main {

    public static void main(String[] args)
    {
        Class2 class2 = new Class2();

        Class2.TestContainer<String> testContainer = new Class2.TestContainer();
        Class2.Printer printer = class2.new Printer();
//        TestContainer<String> testContainer = new TestContainer<>();
//        testContainer.put("T");

//        System.out.println(testContainer.take());
    }


}
