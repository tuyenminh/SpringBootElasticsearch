package com.example.DocumentaryProject.controller;

import com.example.DocumentaryProject.model.Documentary;
import com.example.DocumentaryProject.service.DocumentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/docs")
public class DocumentaryController {
    @Autowired
    private DocumentaryService documentaryService;
    @GetMapping("")
    public ResponseEntity<?> getListDoc(){
        List<Documentary> documentaryList = documentaryService.getListDoc();
        return ResponseEntity.status(HttpStatus.OK).body(documentaryList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getDocById(@PathVariable String id) {
        Documentary documentary = documentaryService.getDocById(id);
        return ResponseEntity.ok(documentary);
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchDocs(@RequestParam(name = "keyword") String name){
        List<Documentary> documentaryList = documentaryService.searchDocs(name);
        return ResponseEntity.ok(documentaryList);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDocs(@PathVariable String id) {
        documentaryService.deleteDocs(id);
        return ResponseEntity.ok("Xóa thành công");
    }
}
