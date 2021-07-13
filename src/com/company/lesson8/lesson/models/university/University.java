package com.company.lesson8.lesson.models.university;

import com.company.lesson8.lesson.models.User;

public interface University {
    void apply(User user);
    String getUniversityName();
    String getAddress();
    String[] getFaculties();
}
