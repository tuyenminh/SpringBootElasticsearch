package com.example.DocumentaryProject.service;

import com.example.DocumentaryProject.model.Documentary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentaryService {
    public List<Documentary> getListDoc();
    public Documentary getDocById(String id);
    public Documentary createDocumentary(Documentary documentary);
    public List<Documentary> searchDocs(String keyword);
    public boolean deleteDocs(String id);
}