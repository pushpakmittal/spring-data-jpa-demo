package com.myapp.springdatajpademo;

import com.myapp.springdatajpademo.model.Passport;
import com.myapp.springdatajpademo.repo.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void retrieve_student_passport_details() {
        Passport passport = studentRepository.getStudentPassportDetails(1);
        Assertions.assertEquals("DQWR2142DDFWQ", passport.getPassportNo());
    }
}
