//package com.company.lesson8.lesson.test.lombockTest;
//
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        UserRepository userRepository = new UserDbRepository() {
//            @Override
//            public User getUser(int id) {
//                return null;
//            }
//
//            @Override
//            public User getUserByLogin(String login) {
//                return null;
//            }
//        };
//
//        CommonViewAndController commonView = CommonViewAndController.getInstance();
//        commonView.showLoginWindow();
//        String login = commonView.askLogin();
//        User user = userRepository.getUserByLogin(login);
//
//
//    }
//
//    static class User {
////        final int id;
//        String login;
//        String pass;
//        List<Permission> permissions;
//    }
//
//    interface Permission {}
//
//    interface UserRepository {
//        User getUser(int id);
//        User getUserByLogin(String login);
//    }
//
//    abstract static class UserDbRepository implements UserRepository {
//        final String link;
//        final String schema;
//        final String rootPass;
//
//        UserDbRepository(DbConfig config) {
//            link = config.getLink();
//            // ...
//        }
//    }
//
//    interface DbConfig {
//        String getLink();
//        String getSchema();
//        String getRootPass();
//    }
//
//    interface CommonViewAndController {
//        static CommonViewAndController getInstance() {
//            return null;
//        }
//
//        void showLoginWindow();
//        String askLogin();
//    }
//}
