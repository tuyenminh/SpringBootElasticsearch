package com.example.demoSpringBootElasticsearch.reponsitory;

import com.example.demoSpringBootElasticsearch.model.Course;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRep extends ElasticsearchRepository<Course, String> {

}
