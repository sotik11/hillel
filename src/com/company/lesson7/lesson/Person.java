package com.company.lesson7.lesson;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }

//    Person(PersonConfig config) {
//        name = config.getPersonName();
//        age = config.isAgePresent() ? config.getPersonAge() : PersonConfig.DEFAULT_AGE;
//    }

//    static void renamePerson(Person person, String newName) {
//        person.name = newName;
//    }
}
