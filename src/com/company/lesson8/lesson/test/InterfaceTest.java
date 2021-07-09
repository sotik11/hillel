package com.company.lesson8.lesson.test;

public class InterfaceTest {

    private interface Namely {
        String getFullName();

        default String getName() {
            String fullName = getFullName();
            String[] fullNameParts = fullName.split(" "); // "Test test" -> ["Test", "test"]
            return fullNameParts[0];
        }
    }

    private static class Vasia implements Namely {

        private final String fullName = "Vasia Pupkin";

        @Override
        public String getFullName() {
            return fullName;
        }
    }

    public static void main(String[] args) {
        Vasia vasia = new Vasia();

//        Namely dima = new Namely() {
//
//            @Override
//            public String getFullName() {
//                return "Dima Dima";
//            }
//        };

//        Namely dima = () -> {
//                return "Dima Dima";
//        };

        Namely dima = () -> "Dima Dima";

        System.out.println(dima.getFullName());
        System.out.println(dima.getName());
    }
}
