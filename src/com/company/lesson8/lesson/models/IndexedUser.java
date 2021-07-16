package com.company.lesson8.lesson.models;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class IndexedUser extends User implements Indexed {

    private final int index;
    static int previndex;

    static {
        try {
            previndex = getLastIndexX();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public IndexedUser(String login, String pass, int index) {
        super(login, pass);
        this.index = previndex + 1;
        previndex++;
        }

    public static int getLastIndexX() throws IOException, ClassNotFoundException {
        final FileInputStream fis1 = new FileInputStream("users.ser");
        final ObjectInputStream ois1 = new ObjectInputStream(fis1);

        List<IndexedUser> users1 = (List<IndexedUser>) ois1.readObject();

        fis1.close();
        ois1.close();

        int b = users1.get(users1.size() - 1).getIndex();
        return b;
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
//        return "Index " + index + " " + super.toString();
        return String.format("%-22s%-22s%-10s", "login | " + login, "pass | " + pass, "index | " + index);
    }
}
