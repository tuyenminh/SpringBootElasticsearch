package com.example.DocumentaryProject.service;

import com.example.DocumentaryProject.exception.NotFoundException;
import com.example.DocumentaryProject.model.Documentary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DocumentaryServiceImpl implements DocumentaryService{
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
                "VB0003",
                "SỞ THÔNG TIN VÀ TRUYỀN THÔNG",
                "Số: 686 /STTT-CNTT&BCVT",
                "V/v rà soát Hệ thống thông tin giải quyết thủ tục hành chính của tỉnh theo Thông tư số 01/2023/TT-VPCP ngày 05/4/2023 của Văn Phòng Chình Phủ",
                "Tiền Giang, ngày 05 tháng 5 năm 2023",
                "Nguyễn Văn Đậm",
                "Để đảm bảo ký thuật Hệ thống thông tin giải quyết thủ tục hành chính"));
        documentaries.add(new Documentary(
                "MT0001",
                "SỞ THÔNG TIN VÀ TRUYỀN THÔNG",
                "Số: 686 /STTT-CNTT&BCVT",
                "V/v rà soát Hệ thống thông tin giải quyết thủ tục hành chính của tỉnh theo Thông tư số 01/2023/TT-VPCP ngày 05/4/2023 của Văn Phòng Chình Phủ",
                "Tiền Giang, ngày 05 tháng 5 năm 2023",
                "Nguyễn Văn Đậm",
                "Để đảm bảo ký thuật Hệ thống thông tin giải quyết thủ tục hành chính"));
    }
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
    public Documentary createDocumentary(Documentary documentary) {
        return null;
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
        throw new NotFoundException("Không tìm thấy văn bản");
    }

}
