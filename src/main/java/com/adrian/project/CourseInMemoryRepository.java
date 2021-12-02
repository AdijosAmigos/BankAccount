package com.adrian.project;

import java.util.Map;

public class CourseInMemoryRepository implements CourseRepository{
    Map<Integer, Course> idToCourse;

    @Override
    public Course getById(int id) {
        return idToCourse.get(id);
    }

    @Override
    public Course update(Course course) {
        //TODO: how to apdate in hashmap +testy do repozytorium
        //TODO: zaimplementowac pozostalem metody repo analogicznie do userinmemory
        return null;
    }


}
