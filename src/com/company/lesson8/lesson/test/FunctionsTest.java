package com.company.lesson8.lesson.test;

import java.util.function.*;

public class FunctionsTest {
    public static void main(String[] args) {
        Function<String, String> format = value -> value.toUpperCase(); // In: 1 (String) | Out: 1 (String)
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b; // In: 2 (Integer, Integer) | Out: 1 (Integer)
        Consumer<Integer> consumer = value -> System.out.println(value); // In: 1 (Integer) | Out: 0
        Supplier<String> supplier = () -> "Test string"; // In: 0 | Out: 1 (String)
        Predicate<String> predicate = value -> value.isEmpty(); // In: 1 (String) | Out: 1 [Boolean]
        Runnable runnable = () -> System.out.println("test"); // In: 0 | Out: 0

        /*
                    Interface
                    |
                    * Class1
                    * Class2
                    * Class3
         */

        Object obj = supplier.get();

        Function<String, String> function = value -> {
            System.out.println(value);
            return value;
        };
//
//        String testString = "test";
//
//        System.out.println(format.apply(testString));
//        System.out.println(formatString(testString));

        IntegerPairController controller = new IntegerPairController(10);
        System.out.println(controller.getValue());
        controller.run(value -> value + 10);
        System.out.println(controller.getValue());



        String testString = "test";
        formatString(testString);

        formatString("test");


    }

    public static String formatString(String value) {
        return value.toUpperCase();
    }

    public static class IntegerPairController {
        private int value;

        public IntegerPairController(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void run(Function<Integer, Integer> function) {
            value = function.apply(value);
            System.out.println("Value was changed to: " + value);
        }
    }
}
