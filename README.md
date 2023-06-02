**Spring Boot Elasticsearch**

**1. Giới thiệu**

Spring Data Elasticsearch là một mô-đun của Spring Data, cung cấp tích hợp và hỗ trợ tương tác với Elasticsearch trong ứng dụng Java. Giúp đơn giản hóa việc làm việc với Elasticsearch bằng cách cung cấp các phương thức và chức năng tiện ích để thực hiện các hoạt động CRUD (Create, Read, Update, Delete) và truy vấn dữ liệu.

Dự án Spring Data Elaticsearch cung cấp khả năng tích hợp với công cụ tìm kiếm Elaticsearch. Các khu vực chức năng chính của Spring Data Elaticsearch là một mô hình trung tâm POJO để tương tác với Tài liệu Elaticsearch và dễ dàng viết lớp truy cập dữ liệu kiểu Kho lưu trữ.

Mục tiêu chính của dự án Spring Data là giúp dễ dàng xây dựng các ứng dụng hỗ trợ Spring sử dụng các công nghệ truy cập dữ liệu mới như cơ sở dữ liệu không liên quan, khung thu nhỏ bản đồ và dịch vụ dữ liệu dựa trên đám mây.

**2. Tính năng**

Hỗ trợ cấu hình spring bằng cách sử dụng các lớp @Configuration dựa trên Java hoặc một XML cho một phiên bản máy khách ES.

Lớp ElaticsearchOperations và các triển khai giúp tăng năng suất khi thực hiện các hoạt động ES phổ biến. Bao gồm ánh xạ đối tượng tích hợp giữa các tài liệu và POJO.

Tự động triển khai các giao diện Kho lưu trữ bao gồm hỗ trợ cho các phương pháp tìm kiếm tùy chỉnh.

**3. Tạo dự án Spring Boot**
- [ ] Bước 1: Chuẩn bị môi trường
- Tải xuống và cài đặt IntelliJ IDEA: https://www.jetbrains.com/idea/download/#section=windows
- [ ] Bước 2: Tạo dự án Spring Initializr
- Truy cập: https://start.spring.io/

![image](uploads/f5ee71274df7e0b3aa8808c03160c3f5/image.png)
- Chọn "Dependencies".
![image](uploads/20ac25a5321ef4dabb088099c5498e93/image.png)
- Chọn "GENERATE" để tải dự án về máy.
- Mở dự án trên IntelliJ IDEA.
- [ ] Bước 3: Kết nối Elasticsearch

Cấu trúc thư mục dự án: 
![image](uploads/4079734a342fd0dc3d01008753f23c10/image.png)
- Tạo file config.java
![image](uploads/d8f9d94bf99f9b8adb138b4d9c9a5b46/image.png)
- Tạo file Course.java
![image](uploads/c4405620cae3d1106aa569104144afd9/image.png)
- Tạo file ElasticRep.java
![image](uploads/b47eba1b1cf1dbef1ed467423f8fc3dd/image.png)
- Tạo file CourseService.java
![image](uploads/52d27f6ea0d5438adaf4c6d47686e879/image.png)
- Tạo file CourseController.java
![image](uploads/f718ed2af8985b68c29facdd58a5b3a1/image.png)
- [ ] Bước 4: Run dự án
Run dự án và dùng các phương thức trên Postman:
- GET http://localhost:9200/ kiểm tra hoạt động Elasticsearch
- POST http://localhost:9200/course/ thêm dữ liệu
- GET http://localhost:9200/course/_search/ tìm kiếm dữ liệu
