package com.company.lesson8.lesson.models.forms;

public class Field<VALUE_TYPE> {
    private final String name;
    private VALUE_TYPE value;

    public Field(String name) {
        this.name = name;
    }

    public VALUE_TYPE get() {
        return value;
    }

    public void set(VALUE_TYPE value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }
}
