package com.microservice.course.service;

import com.microservice.course.entities.Course;

import java.math.BigDecimal;
import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(BigDecimal id);
    void save(Course course);
}
