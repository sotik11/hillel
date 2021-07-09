package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.models.Indexed;
import com.company.lesson8.lesson.models.PreIndexed;

public class SerializedRepository implements Repository {

    @Override
    public void save(PreIndexed obj) {

    }

    @Override
    public void delete(Indexed obj) {

    }

    @Override
    public Indexed load(int index) {
        return null;
    }
}
