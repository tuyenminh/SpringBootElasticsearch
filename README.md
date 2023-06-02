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
- Chọn "Dependencies": Spring Web and Spring Data Elasticsearch 
- Chọn "GENERATE" để tải dự án về máy.
- Mở dự án trên IntelliJ IDEA.
- [ ] Bước 3: Kết nối Elasticsearch
Cấu trúc thư mục dự án: 
![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/81bf0559-aaaf-470a-bbff-53af759db58b)
- Tạo file config.java
![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/e037930c-a24a-4d93-bd45-77a05c7cc423)
- Tạo file Course.java
![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/acbc3d5b-ef7a-4e58-8fb1-9e6366366125)
- Tạo file ElasticRep.java
- ![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/0256e21a-fbfa-4309-a430-2c65c3ee8a80)
- Tạo file CourseService.java
![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/19260127-a1d0-4be2-b21d-6d9171635b7e)

- Tạo file CourseController.java
![image](https://github.com/tuyenminh/SpringBootElasticsearch/assets/101682264/7cca3292-4940-4d00-bce2-ac97cfe4114a)
- [ ] Bước 4: Run dự án
Run dự án và dùng các phương thức trên Postman:
- GET http://localhost:9200/ kiểm tra hoạt động Elasticsearch
- POST http://localhost:9200/course/ thêm dữ liệu
- GET http://localhost:9200/course/_search/ tìm kiếm dữ liệu
