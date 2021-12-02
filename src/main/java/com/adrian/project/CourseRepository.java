package com.adrian.project;

import java.util.List;

public interface CourseRepository {
    Course getById(int id);
    Course update(Course course);

    //TODO: napisac analogicznie do UserRepository
    //TODO: courseInMemoryRepository analogicznie do user + testy
}
