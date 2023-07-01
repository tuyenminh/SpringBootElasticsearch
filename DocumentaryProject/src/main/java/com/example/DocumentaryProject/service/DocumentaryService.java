package com.example.DocumentaryProject.service;

import com.example.DocumentaryProject.model.Documentary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface DocumentaryService {
    public List<Documentary> getListDoc();
    public Documentary getDocById(String id);
    public Documentary createDocs(Documentary documentary);
    public List<Documentary> searchDocs(String keyword);
    public boolean deleteDocs(String id);
    public Documentary updateDoc(String id, Documentary updatedDocumentary);
//    public void importDataFromCSV(String csvFilePath) throws IOException ;


}