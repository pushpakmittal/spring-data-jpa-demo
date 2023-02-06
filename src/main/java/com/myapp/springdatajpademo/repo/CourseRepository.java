package com.myapp.springdatajpademo.repo;

import com.myapp.springdatajpademo.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findCourseById(Long id) {
        return entityManager.find(Course.class, id);
    }

    public void saveCourse(Course course) {
        entityManager.persist(course);
    }

    public void deleteCodeById(Long id) {
        entityManager.remove(findCourseById(id));
    }
}
