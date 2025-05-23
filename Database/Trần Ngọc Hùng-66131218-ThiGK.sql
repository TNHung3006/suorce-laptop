CREATE DATABASE QLPHANMEM;
GO
USE QLPHANMEM;
GO

--Câu 1: Tạo cơ sở dữ liệu và các liên kết giữa các bảng 
-- Tạo bảng NhanVien
CREATE TABLE NhanVien (
    MaNV VARCHAR(10) PRIMARY KEY,
    TenNV NVARCHAR(50) NOT NULL,
    Email VARCHAR(50) UNIQUE,
    SoDT VARCHAR(15) UNIQUE
);

-- Tạo bảng DuAn
CREATE TABLE DuAn (
    MaDA VARCHAR(10) PRIMARY KEY,
    TenDA NVARCHAR(100) NOT NULL,
    KinhPhi DECIMAL(15, 2),
    NgayBD DATE,
    NgayKT DATE
);

-- Tạo bảng CongViec
CREATE TABLE CongViec (
    MaCV VARCHAR(10) PRIMARY KEY,
    TenCV NVARCHAR(100) NOT NULL,
    TrangThai NVARCHAR(50),
    MaDA VARCHAR(10),
    FOREIGN KEY (MaDA) REFERENCES DuAn(MaDA)
);

-- Tạo bảng PhanCong
CREATE TABLE PhanCong (
    MaNV VARCHAR(10),
    MaCV VARCHAR(10),
    NgayTG DATE,
    SoGioThamGia DECIMAL(5, 2),
    VaiTro NVARCHAR(50),
    PRIMARY KEY (MaNV, MaCV, NgayTG),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV),
    FOREIGN KEY (MaCV) REFERENCES CongViec(MaCV)
);

INSERT INTO NhanVien (MaNV, TenNV, Email, SoDT) VALUES
('NV001', N'Nguyễn Văn A', 'anv@example.com', '0901234567'),
('NV002', N'Trần Thị B', 'btt@example.com', '0987654321'),
('NV003', N'Lê Minh C', 'clm@example.com', '0911223344'),
('NV004', N'Phạm Thu D', 'dpth@example.com', '0977889900'),
('NV005', N'Hoàng Ngọc E', 'ehn@example.com', '0933445566');

INSERT INTO DuAn (MaDA, TenDA, KinhPhi, NgayBD, NgayKT) VALUES
('DA001', N'Phát triển Website mới', 50000.00, '2024-01-15', '2024-06-30'),
('DA002', N'Nâng cấp Ứng dụng Mobile', 75000.50, '2024-03-01', '2024-09-30'),
('DA003', N'Xây dựng Hệ thống Quản lý', 120000.75, '2024-05-10', '2025-01-31'),
('DA004', N'Marketing Sản phẩm Mới', 30000.25, '2024-07-01', '2024-10-31'),
('DA005', N'Nghiên cứu Công nghệ AI', 90000.00, '2024-09-01', '2025-03-31');

INSERT INTO CongViec (MaCV, TenCV, TrangThai, MaDA) VALUES
('CV001', N'Thiết kế giao diện', N'Hoàn thành', 'DA001'),
('CV002', N'Lập trình Backend', N'Đang thực hiện', 'DA001'),
('CV003', N'Kiểm thử Website', N'Chưa bắt đầu', 'DA001'),
('CV004', N'Phân tích yêu cầu', N'Hoàn thành', 'DA002'),
('CV005', N'Phát triển tính năng A', N'Đang thực hiện', 'DA002');

INSERT INTO PhanCong (MaNV, MaCV, NgayTG, SoGioThamGia, VaiTro) VALUES
('NV001', 'CV001', '2024-01-15', 40.0, N'Trưởng nhóm Thiết kế'),
('NV002', 'CV002', '2024-01-20', 80.5, N'Lập trình viên Backend'),
('NV001', 'CV002', '2024-01-20', 20.0, N'Giám sát'),
('NV003', 'CV004', '2024-03-01', 30.0, N'Chuyên viên Phân tích'),
('NV002', 'CV005', '2024-03-05', 60.0, N'Lập trình viên Mobile');

--Câu 2: Tạo Query trả lời các câu hỏi sau
--a. Tìm nhân viên có số giờ làm việc trung bình cao nhất
SELECT nv.MaNV, nv.TenNV, AVG(pc.SoGioThamGia) AS GioLamViecTrungBinh
FROM dbo.NhanVien nv
JOIN dbo.PhanCong pc ON nv.MaNV = pc.MaNV
GROUP BY nv.MaNV, nv.TenNV
ORDER BY GioLamViecTrungBinh DESC;

--b.Tìm dự án có ít nhất 5 công việc đang ở trạng thái 'Đang Thực hiện'.
SELECT da.MaDA, da.TenDA, COUNT(cv.MaCV) AS [So luong cong viec]
FROM dbo.DuAn da
JOIN CongViec cv ON da.MaDA = cv.MaDA
WHERE cv.TrangThai = 'Đang thực hiện'
GROUP BY da.MaDA, da.TenDA
HAVING COUNT(cv.MaCV) >= 5;
--c.Tính tổng kinh phí trung bình của các dự án có nhân viên tham gia nhiều hơn 5 người.
SELECT AVG(da.KinhPhi) AS TongKinhPhiTrungBinh
FROM dbo.DuAn da
WHERE da.MaDA IN (
        SELECT cv.MaDA
        FROM CongViec cv
        JOIN PhanCong pc ON cv.MaCV = pc.MaCV
        GROUP BY cv.MaDA
        HAVING COUNT(DISTINCT pc.MaNV) > 5
);
--d. Liệt kê các dự án đã hoàn thành trước hạn (NgayKT  thực tế sớm hơn NgayKT dự kiến).
ALTER TABLE dbo.DuAn
ADD COLUMN NgayKTThucTe DATE;
SELECT MaDA, TenDA, NgayKT, NgayKTThucTe
FROM dbo.DuAn
WHERE NgayKTThucTe IS NOT NULL AND NgayKTThucTe < NgayKT;
--e. Thống kê số giờ làm việc của mooxic ông việc trong các dự án trong các năm 2023, 2024, 2025. Kết quả được hiển thị dạng bảng, 
--hai cột đầu là MaCV và TenCV, các cột còn lại tương ứng với các năm 2023, 2024, 2025. Mỗi dòng trong kết quả cho viết số giờ làm việc trong mỗi năm.
SELECT cv.MaCV, cv.TenCV,
    SUM(CASE WHEN YEAR(pc.NgayTG) = 2023 THEN pc.SoGioThamGia ELSE 0 END) AS Nam2023,
    SUM(CASE WHEN YEAR(pc.NgayTG) = 2024 THEN pc.SoGioThamGia ELSE 0 END) AS Nam2024,
    SUM(CASE WHEN YEAR(pc.NgayTG) = 2025 THEN pc.SoGioThamGia ELSE 0 END) AS Nam2025
FROM dbo.CongViec cv
LEFT JOIN dbo.PhanCong pc ON cv.MaCV = pc.MaCV
GROUP BY cv.MaCV, cv.TenCV
ORDER BY cv.MaCV;

--Câu 3: Tạo thủ tục/ hàm/ trigger
--a. Viết hàm trả về table dự án có ít nhất x công việc đang trong trạng thái "Chưa Bắt đầu". Cho ví dụ sử dụng hàm
--(x là số thứ 8 trong mã sinh viên, nếu x=0 thì chọn số thứ 7, và nếu x vẫn = 0, thì chọn số thứ 6, ... cho đến khi x>0)
CREATE FUNCTION LayDuAnChuaBatDau (@x INT)
RETURNS @KetQua TABLE (
    MaDA VARCHAR(10),
    TenDA NVARCHAR(100)
)
AS
BEGIN
    INSERT INTO @KetQua (MaDA, TenDA)
    SELECT
        da.MaDA,
        da.TenDA
    FROM
        DuAn da
    JOIN
        CongViec cv ON da.MaDA = cv.MaDA
    WHERE
        cv.TrangThai = 'Chưa bắt đầu'
    GROUP BY
        da.MaDA, da.TenDA
    HAVING
        COUNT(cv.MaCV) >= @x;
    RETURN;
END;
GO

-- Ví dụ sử dụng hàm (giả sử x = 2)
SELECT * FROM dbo.LayDuAnChuaBatDau(2);

--b. Tạo store procedure có chức năng tính tổng số lượng giờ được thực hiện đối với tất cả các dự án đã hoàn thành. Cho ví dụ sử dụng thủ tục.

--c. Tạo trigger kiểm tra kinh phí dự án không vượt quá ngân sách ban đầu