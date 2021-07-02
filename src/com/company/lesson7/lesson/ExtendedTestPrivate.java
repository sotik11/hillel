package com.company.lesson7.lesson;

import com.company.lesson7.lesson.test.TestPrivate;

public class ExtendedTestPrivate extends TestPrivate {
    public void test() {
        System.out.println(publicField);
        System.out.println(protectedField);
    }
}
