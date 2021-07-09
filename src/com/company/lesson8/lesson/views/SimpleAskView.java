package com.company.lesson8.lesson.views;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleAskView {
    Scanner scan = new Scanner(System.in);
    String question;

    String[] trueAnswer = {"y", "Y", "yes", "YES", "1", "+"};
    String[] falseAnswer = {"n", "N", "no", "NO", "0", "-"};

    public SimpleAskView(String question) {
        this.question = question;
    }

    public static boolean checkAnswer(String[] expectedAnswer, String userAnswer) {
        return Arrays.asList(expectedAnswer).contains(userAnswer);
    }

    public boolean run() {
        System.out.println(question);
        String answer = scan.nextLine();
        if (checkAnswer(trueAnswer, answer)) {
            return true;
        }
        if (checkAnswer(falseAnswer, answer)) {
            return false;
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Cant read your answer, try again");
                answer = scan.nextLine();
                if (checkAnswer(trueAnswer, answer)) {
                    return true;
                }
                if (checkAnswer(falseAnswer, answer)) {
                    return false;
                }
            }
        }
        throw new UncheckedIOException(
                    new IOException("Cant read your answer more then 3 times, programm close"));
    }
}





        // FIXME: this solution isn't so good. If you need to add new yes value, you have to add one more if statement.
        //  your statements will grow and grow to unreadable mess.
        //  Your current version isn't readable now.
        //  Better solution will be create array or collection of all possible Yes values and No values.
        //  And then check is this array contains your answer.


//        if (answer.equals("y") || answer.equals("Y") || answer.equals("YES")
//                || answer.equals("yes") || answer.equals("1") || answer.equals("+")) {
//            return true;
//        }

//        if (answer.equals("n") || answer.equals("N") || answer.equals("NO")
//                || answer.equals("no") || answer.equals("0") || answer.equals("-")) {
//            return false;
//        } else {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Cant read your answer, try again");
//                answer = scan.nextLine();
//                if (answer.equals("y") || answer.equals("Y") || answer.equals("YES")
//                        || answer.equals("yes") || answer.equals("1")) {
//                    return true;
//                }
//                if (answer.equals("n") || answer.equals("N") || answer.equals("NO")
//                        || answer.equals("no") || answer.equals("0")) {
//                    return false;
//                }
//            }
            // FIXME: If you want to close your program you should use unchecked exception.
            //  Classes that will use your method shouldn't handle the exception.
//            throw new UncheckedIOException(
//                    new IOException("Cant read your answer more then 3 times, program close"));
//
//        }
//    }
//}
