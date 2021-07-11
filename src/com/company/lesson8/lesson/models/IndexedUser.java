package com.company.lesson8.lesson.models;

public class IndexedUser extends User implements Indexed {

    private final int index;

    public IndexedUser(String login, String pass, int index) {
        super(login, pass);
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
