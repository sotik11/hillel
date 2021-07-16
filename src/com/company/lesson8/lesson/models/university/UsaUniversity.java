package com.company.lesson8.lesson.models.university;

import com.company.lesson8.lesson.exceptions.MinistryException;
import com.company.lesson8.lesson.models.Country;
import com.company.lesson8.lesson.models.Fbi;
import com.company.lesson8.lesson.models.User;
import java.util.ArrayList;
import java.util.List;

public abstract class UsaUniversity implements University {
    private static final MinistryOfEducation MINISTRY = new MinistryOfEducation(Country.USA);
    private static final Fbi FBI = new Fbi();
    private static final List<User> STUDENTS = new ArrayList<>();

    @Override
    public void apply(User user) {
        try {
            MINISTRY.validate(user, this);
            FBI.informUserApplyToUniversity(user, this);
            STUDENTS.add(user);
            System.out.println(user + " was applied successful!");
        } catch (MinistryException exception) {
            System.out.println("Sorry! Ministry of Education rejected your request.");
        }
    }
}
