package com.company.lesson8.lesson.repositories;

import com.company.lesson8.lesson.models.Indexed;
import com.company.lesson8.lesson.models.PreIndexed;

public interface Repository {
    void save(PreIndexed obj);
    void delete(Indexed obj);
    Indexed load(int index);

    default int getNextIndex() {
        return 0;
    }
}
