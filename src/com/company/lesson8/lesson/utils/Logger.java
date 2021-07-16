package com.company.lesson8.lesson.utils;

public class Logger {
    private static final String LOG_MESSAGE_TEMPLATE = "%-10s | %s%n";
    private static boolean isEnabled = true;

    public static void info(String message) {
        if (isEnabled) {
            System.out.printf(LOG_MESSAGE_TEMPLATE, "INFO", message);
        }
    }

    public static void disable() {
        isEnabled = false;
    }

    public static void enable() {
        isEnabled = true;
    }
}
