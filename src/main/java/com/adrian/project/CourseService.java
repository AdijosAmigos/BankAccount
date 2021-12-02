package com.adrian.project;

public class CourseService {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public CourseService(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    void signUpStudentToCourse(int userId, int courseId){

        /*
        userrepo.getuser()
        courserepo.getcourse()
        courseRepoo.update()
         */

        Course course =  courseRepository.getById(courseId);
        User user = userRepository.getById(userId);

        course.addStudent(user);
        courseRepository.update(course);

        //TODO: zaimplementowac metode update
        //TODO: testy do course service

    }


}
