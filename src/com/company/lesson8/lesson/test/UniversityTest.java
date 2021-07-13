package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.models.university.KpiUniversity;
import com.company.lesson8.lesson.utils.Logger;

public class UniversityTest {
    public static void main(String[] args) {
        Logger.disable();

        User user = new User("Vadim", "vadim");
        KpiUniversity university = new KpiUniversity();

        university.apply(user);
    }
}
