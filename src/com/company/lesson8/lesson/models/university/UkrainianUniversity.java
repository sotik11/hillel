package com.company.lesson8.lesson.models.university;

import com.company.lesson8.lesson.models.Country;
import com.company.lesson8.lesson.models.User;
import java.util.ArrayList;
import java.util.List;

public abstract class UkrainianUniversity implements University {

    private static final MinistryOfEducation MINISTRY = new MinistryOfEducation(Country.UKRAINE);
    private static final List<User> STUDENTS = new ArrayList<>();

    @Override
    public void apply(User user) {
        try {
            MINISTRY.validate(user, this);
            STUDENTS.add(user);
            System.out.println(user + " was applied successful!");
        } catch (Exception exception) {
            System.out.println("Sorry! Ministry of Education rejected your request.");
        }
    }
}