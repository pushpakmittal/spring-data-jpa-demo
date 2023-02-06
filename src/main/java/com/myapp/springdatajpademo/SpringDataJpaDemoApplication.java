package com.myapp.springdatajpademo;

import com.myapp.springdatajpademo.model.Course;
import com.myapp.springdatajpademo.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        courseRepository.saveCourse(
                Course.builder()
                        .name("Getting started with Docker")
                        .build()
        );

        Course course = courseRepository.findCourseById(1L);
        System.out.println(course);
    }
}
