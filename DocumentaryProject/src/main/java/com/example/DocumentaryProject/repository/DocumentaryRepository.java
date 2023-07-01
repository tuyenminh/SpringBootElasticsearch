package com.example.DocumentaryProject.repository;

import com.example.DocumentaryProject.model.Documentary;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface DocumentaryRepository extends ElasticsearchRepository <Documentary, String> {
}
