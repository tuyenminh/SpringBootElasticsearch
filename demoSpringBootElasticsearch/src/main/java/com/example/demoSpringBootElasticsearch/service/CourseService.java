package com.example.demoSpringBootElasticsearch.service;

import com.example.demoSpringBootElasticsearch.model.Course;
import com.example.demoSpringBootElasticsearch.reponsitory.ElasticRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private ElasticRep elasticRep;
    public Course getCourse(String id){
        return elasticRep.findById(id).orElse(null);
    }
    public List<Course> addCourse(List<Course> list){
        return (List<Course>) elasticRep.saveAll(list);
    }
}
