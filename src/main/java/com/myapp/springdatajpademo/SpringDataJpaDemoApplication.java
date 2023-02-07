package com.myapp.springdatajpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myapp.springdatajpademo.repo.CourseJpaRepository;
import com.myapp.springdatajpademo.repo.CourseRepository;
import com.myapp.springdatajpademo.repo.StudentRepository;

@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CourseJpaRepository courseJpaRepository;

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//        courseRepository.saveCourse(
//                Course.builder()
//                        .name("Getting started with Docker")
//                        .build()
//        );
//
//        Course course = courseRepository.findCourseById(1L);
//        System.out.println(course);
		/*
		 * courseRepository.playWithEntityManager(Course.builder()
		 * .name("welcome to java") .build() );
		 */
//        List<Course> courses = courseRepository.getAllCourses();
//        System.out.println(courses);

//        List<Course> courses = courseRepository.getCoursesByLikeFilter();
//        System.out.println(courses);

//        List<Course> courses = courseJpaRepository.getAllCourses();
//        System.out.println(courses);

		studentRepository.saveStudentWithPassport();

	}
}
