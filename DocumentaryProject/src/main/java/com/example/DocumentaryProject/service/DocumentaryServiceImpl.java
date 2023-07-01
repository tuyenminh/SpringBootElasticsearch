package com.example.DocumentaryProject.service;

import com.example.DocumentaryProject.exception.NotFoundException;
import com.example.DocumentaryProject.model.Documentary;
import com.example.DocumentaryProject.repository.DocumentaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Component
public class DocumentaryServiceImpl implements DocumentaryService{
    private final DocumentaryRepository documentaryRepository;
    private static ArrayList<Documentary> documentaries = new ArrayList<>();

    static {
        documentaries.add(new Documentary(
                "VB0001",
                "SỞ THÔNG TIN VÀ TRUYỀN THÔNG",
                "Số: 686 /STTT-CNTT&BCVT",
                "V/v rà soát Hệ thống thông tin giải quyết thủ tục hành chính của tỉnh theo Thông tư số 01/2023/TT-VPCP ngày 05/4/2023 của Văn Phòng Chình Phủ",
                "Tiền Giang, ngày 05 tháng 5 năm 2023",
                "Nguyễn Văn Đậm",
                "Để đảm bảo ký thuật Hệ thống thông tin giải quyết thủ tục hành chính"));
        documentaries.add(new Documentary(
                "VB0002",
                "SỞ THÔNG TIN VÀ TRUYỀN THÔNG",
                "Số: 686 /STTT-CNTT&BCVT",
                "V/v rà soát Hệ thống thông tin giải quyết thủ tục hành chính của tỉnh theo Thông tư số 01/2023/TT-VPCP ngày 05/4/2023 của Văn Phòng Chình Phủ",
                "Tiền Giang, ngày 05 tháng 5 năm 2023",
                "Nguyễn Văn Đậm",
                "Để đảm bảo ký thuật Hệ thống thông tin giải quyết thủ tục hành chính"));
        documentaries.add(new Documentary(
                "VB0003",
                "SỞ THÔNG TIN VÀ TRUYỀN THÔNG",
                "Số: 686 /STTT-CNTT&BCVT",
                "V/v rà soát Hệ thống thông tin giải quyết thủ tục hành chính của tỉnh theo Thông tư số 01/2023/TT-VPCP ngày 05/4/2023 của Văn Phòng Chình Phủ",
                "Tiền Giang, ngày 05 tháng 5 năm 2023",
                "Nguyễn Văn Đậm",
                "Để đảm bảo kỹ thuật Hệ thống thông tin giải quyết thủ tục hành chính"));
    }
    @Autowired
    public DocumentaryServiceImpl(DocumentaryRepository documentaryRepository) {
        this.documentaryRepository = documentaryRepository;
    }
//    public void importDataFromCSV(String csvFilePath) throws IOException {
//        List<Documentary> documents = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//
//                String[] fields = line.split(",");
//                String id = fields[0];
//                String adress = fields[1];
//                String number = fields[2];
//                String abs = fields[3];
//                String time = fields[4];
//                String user = fields[5];
//                String content = fields[6];
//
//                Documentary documentary = new Documentary();
//                documentary.setId(id);
//                documentary.setAdress(adress);
//                documentary.setNumber(number);
//                documentary.setAbs(abs);
//                documentary.setTime(time);
//                documentary.setUser(user);
//                documentary.setContent(content);
//                documents.add(documentary);
//            }
//        }
//
//        documentaryRepository.saveAll(documents);
//    }
    @Override
    public List<Documentary> getListDoc() {
        List<Documentary> documentaryList = new ArrayList<>();
        for(Documentary documentary : documentaries) {
            documentaryList.add(documentary);
        }
        return documentaries;
    }
    @Override
    public Documentary getDocById(String id) {
        for (Documentary documentary : documentaries) {
            if (documentary.getId().equals(id)) {
                return documentary;
            }
        }
        throw new NotFoundException("Văn bản không tồn tại");
    }
    @Override
    public Documentary createDocs(Documentary documentary) {
        documentaries.add(documentary);
        return documentary;
    }
    @Override
    public List<Documentary> searchDocs(String keyword) {
        List<Documentary> documentaryList = new ArrayList<>();
        for(Documentary documentary : documentaries){
            if(documentary.getContent().contains(keyword)
                    || documentary.getAdress().contains(keyword)
                    || documentary.getContent().contains(keyword)
                    || documentary.getNumber().contains(keyword)
                    || documentary.getAbs().contains(keyword)
                    || documentary.getTime().contains(keyword)
                    || documentary.getUser().contains(keyword)
                    || documentary.getNumber().contains(keyword)) {
                documentaryList.add(documentary);
                return documentaryList;
            }
        }
        throw new NotFoundException("Văn bản không tồn tại");
    }

    @Override
    public boolean deleteDocs(String id) {
        for (Documentary documentary : documentaries) {
            if (documentary.getId().equals(id)) {
                documentaries.remove(documentary);
                return true;
            }
        }
        throw new NotFoundException("Văn bản không tồn tại");
    }
    @Override
    public Documentary updateDoc(String id, Documentary updatedDocumentary) {
        for (Documentary documentary : documentaries) {
            if (documentary.getId().equals(id)) {
                documentary.setAbs(updatedDocumentary.getAbs());
                documentary.setNumber(updatedDocumentary.getNumber());
                documentary.setContent(updatedDocumentary.getContent());
                documentary.setTime(updatedDocumentary.getTime());
                documentary.setAdress(updatedDocumentary.getAdress());
                documentary.setUser(updatedDocumentary.getUser());
                return documentary;
            }
        }
        throw new NotFoundException("Văn bản không tồn tại");
    }


}
