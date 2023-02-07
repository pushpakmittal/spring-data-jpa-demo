package com.myapp.springdatajpademo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.springdatajpademo.model.Passport;
import com.myapp.springdatajpademo.model.Student;

import jakarta.persistence.EntityManager;

@Transactional
@Repository
public class StudentRepository {

	@Autowired
	EntityManager em;

	public void saveStudentWithPassport() {
		Passport passport = Passport.builder().passportNo("DQWR2142DDFWQ").build();
		em.persist(passport);
		Student student = Student.builder().passport(passport).name("pushpak").build();
		em.persist(student);
	}

	public Passport getStudentPassportDetails(int studentId) {
		Student student = em.find(Student.class, studentId);
		Passport passport = student.getPassport();
		return passport;
	}
}
