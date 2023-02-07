package com.myapp.springdatajpademo.repo;

import com.myapp.springdatajpademo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Long> {

    @Query(name = "Course.getAllCourses")
    List<Course> getAllCourses();
}
