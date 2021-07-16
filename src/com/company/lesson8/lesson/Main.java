package com.company.lesson8.lesson;

import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.views.StartMenu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StartMenu.run();

//        List<IndexedUser> inusers = new ArrayList<>();
//
//
//        IndexedUser inUser = new IndexedUser("zzz", "aaa", 1);
//        IndexedUser inUser1 = new IndexedUser("zzzz", "aaa", 2);
//        IndexedUser inUser2 = new IndexedUser("zzzzz", "aaa", 3);
//        inusers.add(inUser);
//        inusers.add(inUser1);
//        inusers.add(inUser2);
//
//
//        FileOutputStream fis = new FileOutputStream("users.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fis);
//
//        oos.writeObject(inusers);
    }
}
