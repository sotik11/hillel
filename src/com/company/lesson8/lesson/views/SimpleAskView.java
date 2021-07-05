package com.company.lesson8.lesson.views;

import java.io.IOException;
import java.util.Scanner;

    public class SimpleAskView {

        String question;
        Scanner scan = new Scanner(System.in);

        public SimpleAskView(String question) {
            this.question = question;
        }

        public boolean run() throws IOException {
            System.out.println(question);
            String answer = scan.nextLine();

            if (answer.equals("y") || answer.equals("Y") || answer.equals("YES")
                    || answer.equals("yes") || answer.equals("1") || answer.equals("+")) {
                return true;
            }
            if (answer.equals("n") || answer.equals("N") || answer.equals("NO")
                    || answer.equals("no") || answer.equals("0") || answer.equals("-")) {
                return false;
            } else {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Cant read your answer, try again");
                    answer = scan.nextLine();
                    if (answer.equals("y") || answer.equals("Y") || answer.equals("YES")
                            || answer.equals("yes") || answer.equals("1")) {
                        return true;
                    }
                    if (answer.equals("n") || answer.equals("N") || answer.equals("NO")
                            || answer.equals("no") || answer.equals("0")) {
                        return false;
                    }
                }
                throw new IOException ("Cant read your answer more then 3 times, program close");

            }
        }
    }











