package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.models.forms.Field;

public class FormTest {
    public static void main(String[] args) {
        Field<String> name = new Field<>("name");
        Field<Integer> phone = new Field<>("phone-number");
        Field<Object> object = new Field("test");

        name.set("vasia");
        phone.set(994457678);

        object.set("vasia");
        object.set(234);
    }
}
