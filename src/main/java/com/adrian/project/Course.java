package com.adrian.project;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final int id;
    private final String name;
    private List<User> students;

    //TODO: dopisac walidacje id oraz name (zaimplementowac + testy)

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    //alt+f6 poprawianie wielu nini jednoczensnie
    //ctr alt l foirmatowanie

    //TODO: dopisac testy
    void addStudent(User user) {
        if (!(user.getType() == (UserType.STUDENT))) {
            throw new IllegalArgumentException();
        }
        students.add(user);
    }


}
