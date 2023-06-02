package com.example.demoSpringBootElasticsearch.controller;


import com.example.demoSpringBootElasticsearch.model.Course;
import com.example.demoSpringBootElasticsearch.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable("id") String id){
        return courseService.getCourse(id);
    }
    @PostMapping("/course")
    public List<Course> addCourse(@RequestBody List<Course> list){
        return courseService.addCourse(list);
    }
}
