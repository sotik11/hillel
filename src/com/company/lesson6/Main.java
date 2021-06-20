package com.company.lesson6;

import com.company.lesson6.exceptions.MyException;
import com.company.lesson6.exceptions.UncheckedMyException;

public class Main {
    public static void main(String[] args) {
        /*
                    Throwable
                      /     \
                   Error    Exception_________
                               /              \
                        Checked(Exception)   Unchecked(RuntimeException)
         */

//        int n1 = 10;
//        int n2 = 0;
//
//        try {
//            validate(n2);
//
//        } catch (MyException | UncheckedMyException e) {
//            System.out.println(e.getMessage());
////            return;
//
//        } finally {
//
//        }
//
//        System.out.println(n1 / n2);
    }

    public static void validate(int n) throws MyException {
        if (n == 0) {
            throw new MyException("/ by 0");
        }
    }
}
