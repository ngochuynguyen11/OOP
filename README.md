# 💿 Chương Trình Quản Lý CD Bằng Java

Dự án ứng dụng Java Console (Console Application) dùng để quản lý danh sách CD âm nhạc. Chương trình hỗ trợ đầy đủ các thao tác CRUD (Thêm, Xóa, Sửa, Xem), các thuật toán tìm kiếm chuỗi linh hoạt (tiền tố, hậu tố, gần giống), sắp xếp và thống kê dữ liệu.



### 1. Quản Lý Dữ Liệu Cơ Bản
* **Thêm CD:** Cho phép người dùng nhập thông tin mã CD, tựa CD, số bài hát và giá thành. Mảng lưu trữ có khả năng **tự động mở rộng** khi đã đầy.
* **Xóa CD:** Xóa bỏ CD khỏi danh sách dựa trên mã CD tương ứng.
* **Sửa / Cập nhật CD:** Cho phép cập nhật lại thông tin mới (tựa, số bài hát, giá) của một CD thông qua mã định danh.
* **Hiển thị danh sách:** Xuất toàn bộ danh sách CD hiện có ra màn hình dưới dạng bảng được căn chỉnh gọn gàng, trực quan.

### 2. Các Chức Năng Tìm Kiếm Nâng Cao
* **Tìm theo mã:** Tra cứu chính xác một CD thông qua mã CD.
* **Tìm theo tiền tố (Bên trái):** Tìm các CD có tựa đề bắt đầu bằng từ khóa nhập vào (Ví dụ: Nhập *"Nhạc"* sẽ khớp với *"Nhạc Trịnh", "Nhạc Vàng"*).
* **Tìm theo hậu tố (Bên phải):** Tìm các CD có tựa đề kết thúc bằng từ khóa.
* **Tìm gần giống (Chứa từ khóa):** Tìm kiếm diện rộng, tìm các CD chứa từ khóa ở bất kỳ vị trí nào trong tựa đề.

### 3. Sắp Xếp & Thống Kê
* **Sắp xếp:**
  * Sắp xếp danh sách giảm dần theo giá thành.
  * Sắp xếp danh sách tăng dần theo tựa CD (không phân biệt hoa thường).
* **Thống kê:**
  * Tính tổng số lượng CD hiện có.
  * Tính tổng giá thành và giá trung bình của toàn bộ CD trong danh sách.
  * Tìm và hiển thị CD có giá đắt nhất và rẻ nhất.

---

## Hướng Dẫn Chạy Chương Trình

1. Biên dịch các tệp nguồn Java trong package `NguyenNgocHuy_23731341`.
2. Chạy tệp `Main.java` để khởi động chương trình.
3. Sử dụng các phím số từ `0` đến `11` trên menu console để lựa chọn các chức năng tương ứng:
   * `1 - 3`: Thêm, Xóa, Sửa CD.
   * `4 - 7`: Các hình thức tìm kiếm CD.
   * `8`: Xem danh sách.
   * `9`: Thống kê thông tin.
   * `10 - 11`: Sắp xếp danh sách.
   * `0`: Thoát chương trình.
