package com.company.lesson8.lesson.models;

import com.company.lesson8.lesson.exceptions.FbiException;
import com.company.lesson8.lesson.models.university.University;
import java.util.ArrayList;
import java.util.List;

public class Fbi {

    private List<User> blackList = new ArrayList<>();

    public void informUserApplyToUniversity(User user, University university) {
        if (blackList.contains(user)) {
            throw new FbiException();
        }
    }

}
