package com.in28minutes.rest.webservices.restfulwebservices.db;

import com.in28minutes.rest.webservices.restfulwebservices.db.jpa.Course;
import com.in28minutes.rest.webservices.restfulwebservices.db.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository courseJpaRepository;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        /**
         * Using JPA
         */
        courseJpaRepository.insert(new Course(1, "AWS", "in28Minutes"));
        courseJpaRepository.insert(new Course(2, "Azure", "in28Minutes"));
        courseJpaRepository.insert(new Course(3, "Devops", "in28Minutes"));
        courseJpaRepository.deleteById(1);
        System.out.println("Using Jpa Finding course with id 2 : " + courseJpaRepository.findById(2));
        System.out.println("Using Jpa Finding course with id 3 : " + courseJpaRepository.findById(3));
    }
}
