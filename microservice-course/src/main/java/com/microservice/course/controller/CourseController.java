package com.microservice.course.controller;

import com.microservice.course.entities.Course;
import com.microservice.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private ICourseService iCourseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course course) {
        iCourseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(iCourseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable BigDecimal id) {
        return ResponseEntity.ok(findById(id));
    }
}