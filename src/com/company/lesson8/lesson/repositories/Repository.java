package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.Indexed;
import com.company.lesson8.lesson.models.PreIndexed;

import java.io.IOException;

public interface Repository {
    void save(PreIndexed obj) throws IOException, ClassNotFoundException;
    void delete(Indexed obj) throws IOException, ClassNotFoundException;
    Indexed load(int index) throws IOException, ClassNotFoundException, NotFoundException;

    default int getNextIndex() {
        return 0;
    }
}
