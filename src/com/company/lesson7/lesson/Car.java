package com.company.lesson7.lesson;

public class Car {
    protected final String model;

    protected Car(String model) {
        this.model = model;
    }

    private Car(String model, String name) {
        this(model);
    }

    public void run() {
        System.out.println(model + " is running");
    }
}
