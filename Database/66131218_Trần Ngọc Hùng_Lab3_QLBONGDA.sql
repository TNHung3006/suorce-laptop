--Câu a
--1. Cho biết thông tin (mã cầu thủ, họ tên, số áo, vị trí, ngày sinh, địa chỉ) của tất cả các
--cầu thủ’. 
SELECT MACT, HOTEN, VITRI, NGAYSINH, DIACHI, SO
FROM dbo.CAUTHU
--2. Hiển thị thông tin tất cả các cầu thủ có số áo là 7 chơi ở vị trí Tiền vệ. 
SELECT MACT, HOTEN, VITRI, NGAYSINH, DIACHI, SO
FROM dbo.CAUTHU
WHERE SO = 7 AND VITRI = N'Tiền vệ';
--3. Cho biết tên, ngày sinh, địa chỉ, điện thoại của tất cả các huấn luyện viên. 
SELECT TENHLV, NGAYSINH, DIACHI, DIENTHOAI
FROM dbo.HUANLUYENVIEN
--4. Cho biết mã số, họ tên, ngày sinh, địa chỉ và vị trí của các cầu thủ thuộc đội bóng ‘SHB
--Đà Nẵng’ có quốc tịch Bra-xin. 
SELECT MACT, HOTEN, NGAYSINH, DIACHI, VITRI
FROM dbo.CAUTHU a, dbo.CAULACBO b, dbo.QUOCGIA c
WHERE a.MACLB = b.MACLB AND a.MAQG = c.MAQG AND TENCLB = N'SHB Đà Nẵng' AND TENQG = 'Bra-xin'
--5.  Hiển thi thông tin tất cả các cầu thủ có quốc tịch Việt Nam thuộc câu lạc bộ Becamex Bình Dương. 
SELECT *
FROM dbo.CAUTHU a, dbo.CAULACBO b, dbo.QUOCGIA c
WHERE a.MACLB = b.MACLB AND a.MAQG = c.MAQG AND TENCLB = N'Becamex Bình Dương' AND TENQG = N'Việt Nam'
--6. Hiển thị thông tin tất cả các cầu thủ đang thi đấu trong câu lạc bộ là
--“Hoàng Anh Gia Lai”. 
SELECT *
FROM dbo.CAUTHU a, dbo.CAULACBO b
WHERE a.MACLB = b.MACLB AND TENCLB = N'HOÀNG ANH GIA LAI'
--7. Cho biết kết quả (MATRAN, NGAYTD, TENSAN, TENCLB1, TENCLB2, KETQUA) các
--trận đấu vòng 2 của mùa bóng năm 2009. 
SELECT MATRAN, NGAYTD, TENSAN, MACLB1, MACLB2, KETQUA
FROM dbo.TRANDAU a, dbo.SANVD b
WHERE a.MASAN = b.MASAN AND VONG = 2 AND NAM = 2009
--8. Cho biết mã huấn luyện viên, tên, ngày sinh, địa chỉ, vai trò và tên CLB
--đang làm việc của các huấn luyện viên có quốc tịch “ViệtNam”. 
SELECT a.MAHLV, TENHLV, NGAYSINH, DIACHI, VAITRO, TENCLB
FROM dbo.HUANLUYENVIEN a, dbo.CAULACBO b, dbo.HLV_CLB c, dbo.QUOCGIA d
WHERE a.MAHLV = c.MAHLV AND b.MACLB = c.MACLB AND a.MAQG = d.MAQG AND TENQG = N'Việt Nam'
--9. Lấy tên 3 câu lạc bộ có điểm cao nhất sau vòng 3 năm 2009. 
SELECT TOP 3 TENCLB
FROM dbo.CAULACBO a, dbo.BANGXH b
WHERE a.MACLB = b.MACLB
ORDER BY HANG
--10. Cho biết mã huấn luyện viên, họ tên, ngày sinh, địa chỉ, vai trò và tên CLB đang làm việc
--mà câu lạc bộ đó đóng ở tỉnh Binh Dương. 
SELECT a.MAHLV, TENHLV, NGAYSINH, DIACHI, VAITRO, TENCLB, TENTINH
FROM dbo.HUANLUYENVIEN a, dbo.CAULACBO b, dbo.HLV_CLB c, dbo.TINH d
WHERE a.MAHLV = c.MAHLV AND b.MACLB = c.MACLB AND d.MATINH = b.MATINH AND TENTINH = N'Bình Dương'
--b. Các phép toán trên nhóm
--1. Thống kê số lượng cầu thủ của mỗi câu lạc bộ. 
SELECT	COUNT(MACT) AS [Số lượng cầu thủ], TENCLB
FROM dbo.CAULACBO a, dbo.CAUTHU b
WHERE b.MACLB = a.MACLB
GROUP BY TENCLB
--2. Thống kê số lượng cầu thủ nước ngoài (có quốc tịch khác Việt Nam) của mỗi câu lạc bộ
SELECT	COUNT(MACT) AS [Số lượng cầu thủ nước ngoài], TENCLB
FROM dbo.CAULACBO a, dbo.CAUTHU b, dbo.QUOCGIA c
WHERE b.MACLB = a.MACLB AND c.MAQG = b.MAQG AND TENQG != N'Việt Nam'
GROUP BY TENCLB
--3. Cho biết mã câu lạc bộ, tên câu lạc bộ, tên sân vận động, địa chỉ và số lượng cầu
--thủ nước ngoài (có quốc tịch khác Việt Nam) tương ứng của các câu lạc bộ có nhiều
--hơn 2 cầu thủ nước ngoài.
SELECT	COUNT(MACT) AS [Số lượng cầu thủ nước ngoài],a.MACLB, TENCLB, b.DIACHI, TENSAN
FROM dbo.CAULACBO a, dbo.CAUTHU b, dbo.QUOCGIA c, dbo.SANVD d
WHERE b.MACLB = a.MACLB AND c.MAQG = b.MAQG AND d.MASAN = a.MASAN AND TENQG != N'Việt Nam'
GROUP BY a.MACLB, TENCLB, b.DIACHI, TENSAN
HAVING COUNT(MACT) > 2;
--4. Cho biết tên tỉnh, số lượng cầu thủ đang thi đấu ở vị trí tiền đạo trong các câu lạc
--bộ thuộc địa bàn tỉnh đó quản lý.
SELECT	COUNT(MACT) AS [Số lượng cầu thủ], TENTINH
FROM dbo.CAULACBO a, dbo.CAUTHU b, dbo.TINH c
WHERE b.MACLB = a.MACLB AND c.MATINH = a.MATINH AND VITRI = N'Tiền đạo'
GROUP BY TENTINH;
--5. Cho biết tên câu lạc bộ, tên tỉnh mà CLB đang đóng nằm ở vị trí cao nhất của bảng
--xếp hạng vòng 3, năm 2009. 
SELECT TOP 1 TENTINH, TENCLB
FROM dbo.CAULACBO a, dbo.TINH b, dbo.BANGXH c
WHERE b.MATINH = a.MATINH AND VONG = 3 AND NAM = 2009
ORDER BY HANG ASC;

