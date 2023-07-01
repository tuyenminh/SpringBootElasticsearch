package com.example.DocumentaryProject.controller;

import com.example.DocumentaryProject.model.Documentary;
import com.example.DocumentaryProject.service.DocumentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    @PostMapping("")
    public ResponseEntity<?> createDocs(@RequestBody Documentary documentary) {
        Documentary createdDocumentary = documentaryService.createDocs(documentary);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDocumentary);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateDoc(@PathVariable String id, @RequestBody Documentary updatedDocumentary) {
        Documentary updatedDoc = documentaryService.updateDoc(id, updatedDocumentary);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(updatedDoc).ok("Cập nhật thành công");
    }
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Yêu cầu chọn file");
        }
        return ResponseEntity.ok("File được upload thành công!");
    }
//    @PostMapping("/import")
//    public ResponseEntity<String> importData(@RequestParam("csvFilePath") String csvFilePath) {
//        try {
//            documentaryService.importDataFromCSV(csvFilePath);
//            return ResponseEntity.ok("Import thành công");
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi import dữ liệu");
//        }
//    }

}
