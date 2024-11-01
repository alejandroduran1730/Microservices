package com.microservice.student.service;

import com.microservice.student.entities.Student;

import java.math.BigDecimal;
import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(BigDecimal id);
    void save(Student student);
    List<Student> findByIdCourse(BigDecimal courseId);
}
