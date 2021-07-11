package com.company.lesson8.lesson.test;

import com.company.lesson8.lesson.models.User;
import com.company.lesson8.lesson.repositories.UserRepository;
import com.company.lesson8.lesson.views.FunctionalAskView;

public class FunctionalAskViewTest {
    public static void main(String[] args) {
        // ...

        User user = null;
        UserRepository repository = UserRepository.instance();

        FunctionalAskView view = new FunctionalAskView(
                "Do you want to delete your profile?",
                () -> repository.delete(user),
                () -> System.out.println("Ok, we will be glad to see you soon!")
        );

        view.run();
    }
}
