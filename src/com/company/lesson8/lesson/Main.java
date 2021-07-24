package com.company.lesson8.lesson;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.repositories.SerializedRepository;
import com.company.lesson8.lesson.views.StartMenu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NotFoundException {
        StartMenu.run();
    }
}
