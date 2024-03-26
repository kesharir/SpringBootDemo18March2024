package com.in28minutes.rest.webservices.restfulwebservices.db.jdbc.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        repository.insert();
        Course course2 = new Course(2, "Python", "in28Minutes");
        Course course3 = new Course(3, "Java", "in28Minutes");
        Course course4 = new Course(4, "GoLang", "in28Minutes");
        repository.insert(course2);
        repository.insert(course3);
        repository.insert(course4);
        repository.deleteById(course3.getId());

        System.out.println(" Find Course with id 1 : " + repository.findById(1));
        System.out.println(" Find Course with id 2 : " + repository.findById(2));
//        System.out.println(" Find Course with id 3 : " + repository.findById(3));
    }
}
