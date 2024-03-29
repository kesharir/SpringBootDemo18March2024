package com.in28minutes.rest.webservices.restfulwebservices.db;

import com.in28minutes.rest.webservices.restfulwebservices.db.springjpa.Course;
import com.in28minutes.rest.webservices.restfulwebservices.db.springjpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJpaRepository repository;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        /**
         * Using Spring Data JPA
         */
        repository.save(new Course(1, "AWS", "in28minutes"));
        repository.save(new Course(2, "Azure", "in28minutes"));
        repository.save(new Course(3, "GCP", "in28minutes"));

        repository.deleteById(1l);

        System.out.println("Finding courses using spring data jpa id 1 :" + repository.findById(1l));
        System.out.println("Finding courses using spring data jpa id 2 :" + repository.findById(2l));

        /**
         * Other features of Spring Data JPA
         */

        System.out.println("Finding all records using Spring data JPA : " + repository.findAll());
        System.out.println("Counting records using spring data JPA : " + repository.count());
        System.out.println("Finding records by author : " + repository.findByAuthor("in28minutes"));
        System.out.println("Finding records by author empty : " + repository.findByAuthor(""));
        System.out.println("Finding records by name : " + repository.findByName("Azure"));
        System.out.println("Finding record by name that does not exists : " + repository.findByName("AWS"));
    }
}
