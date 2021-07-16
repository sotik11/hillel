package com.company.lesson8.lesson.models.forms;

import com.company.lesson8.lesson.models.university.University;

public class UniversityField<V extends University> extends Field<V> {

    public UniversityField(V university) {
        super(university.getUniversityName());
    }
}
