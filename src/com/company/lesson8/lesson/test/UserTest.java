package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.models.IndexedUser;
import com.company.lesson8.lesson.models.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserTest {
    public static void main(String[] args) throws NotFoundException {
//        StartMenu.run();
//        LoginController loginTest = new LoginController();
//        loginTest.logIn();
        test();
    }

    public static void test() {
        List<IndexedUser> users = Arrays.asList(
                new IndexedUser("a", "", 5),
                new IndexedUser("ab", "", 2),
                new IndexedUser("abc", "", 3),
                new IndexedUser("cba", "", 4),
                new IndexedUser("fff", "", 5),
                new IndexedUser("test", "", 1),
                new IndexedUser("nagibator3000", "", 7)
        );

        Comparator<IndexedUser> indexedUserComparator = IndexedUser::compareTo;
        Collections.sort(users, indexedUserComparator);

        System.out.println(users.toString().replace(",", ",\n"));

//        User user1 = new User("user1", "");
//        User user2 = new User("user2", "");
//
//        //int result = "abc".compareTo("abd");
//
//        // 0 - equals
//        // -1 - this < other
//        // 1 - this > other
////        System.out.println(result);
//
////        if (user1.getLogin().length() > user2.getLogin().length()) {
//        if (user1.compareTo(user2) > 0) {
//            System.out.println(user1.getLogin());
//        } else {
//            System.out.println(user2.getLogin());
//        }


    }
}
