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

    public int compareTo(IndexedUser other) {
        return Integer.compare(index, other.index);
    }

    @Override
    public String toString() {
        return index + " " + super.toString();
    }
}
