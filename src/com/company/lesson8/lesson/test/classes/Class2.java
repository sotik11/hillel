package com.company.lesson8.lesson.test.classes;

public class Class2 {
    int a = 0;

    public void test() {
        Printer printer = new Printer();
        printer.print("test");
    }

    public void testClass() {
        class Point {
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            final int x;
            final int y;
        }

        Point point = new Point(10, 5);
        System.out.println(point.x);
        System.out.println(point.y);
    }

    class Printer {
        public void print(String text) {
            a = 10;
            System.out.println(text);
        }
    }

    static class TestContainer<T> {
        private T content;

        void put(T content) {
//            a = 10;
            this.content = content;
        }

        T take() {
            return content;
        }
    }
}
