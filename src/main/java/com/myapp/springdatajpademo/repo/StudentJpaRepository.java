package com.myapp.springdatajpademo.repo;

import com.myapp.springdatajpademo.model.Student;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long> {

}
