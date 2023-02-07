package com.myapp.springdatajpademo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.springdatajpademo.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;

	public Course findCourseById(Long id) {
		return em.find(Course.class, id);
	}

	public List<Course> getCoursesByLikeFilter() {
		TypedQuery<Course> query = em.createQuery("select c  from Course c where c.name like '%welcome%'",
				Course.class);
		return query.getResultList();
	}

	public List<Course> getAllCourses() {
		String query = "select c from Course c";
		List<Course> courses = em.createQuery(query, Course.class).getResultList();
		return courses;
	}

	public void saveCourse(Course course) {
		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		em.persist(course);
	}

	public void deleteCodeById(Long id) {
		em.remove(findCourseById(id));
	}

	public void playWithEntityManager(Course course) {
		em.persist(course);
		em.flush(); // persistence context will save to database till here.

		course.setName("updated course name");
		em.refresh(course); // will refresh the entity from the database.

		System.out.println(course);
	}
}
