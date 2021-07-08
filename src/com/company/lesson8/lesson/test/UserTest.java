package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.contorllers.LoginController;
import com.company.lesson8.lesson.exceptions.NotFoundException;
import com.company.lesson8.lesson.views.StartMenu;

public class UserTest {
    public static void main(String[] args) throws NotFoundException {
        StartMenu.run();
        LoginController loginTest = new LoginController();
        loginTest.logIn();
    }
}
