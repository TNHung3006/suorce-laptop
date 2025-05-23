CREATE DATABASE QLBANHANG;
GO
USE QLBANGHANG;
GO

-- Bảng Customers (Thông tin khách hàng)
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(255),
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(20),
    Address TEXT,
    City VARCHAR(100),
    Country VARCHAR(100)
);

-- Bảng Categories (Danh mục sản phẩm)
CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(255)
);

-- Bảng Products (Sản phẩm)
CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(255),
    CategoryID INT,
    Price DECIMAL(10, 2),
    Stock INT,
    Description TEXT,
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

-- Bảng Orders (Đơn hàng)
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    OrderDate DATETIME,
    TotalAmount DECIMAL(10, 2),
    Status ENUM('Pending', 'Shipped', 'Delivered', 'Cancelled'),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Bảng OrderDetails (Chi tiết đơn hàng)
CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    UnitPrice DECIMAL(10, 2),
    Subtotal DECIMAL(10, 2),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Bảng Payments (Thanh toán)
CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    PaymentDate DATETIME,
    Amount DECIMAL(10, 2),
    PaymentMethod ENUM('Credit Card', 'PayPal', 'Cash', 'Bank Transfer'),
    Status ENUM('Pending', 'Completed', 'Failed'),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

-- Thêm dữ liệu vào bảng Customers
INSERT INTO Customers (FullName, Email, Phone, Address, City, Country) VALUES
('Nguyễn Văn A', 'vana@example.com', '0901234567', '123 Đường ABC', 'Hà Nội', 'Việt Nam'),
('Trần Thị B', 'thib@example.com', '0987654321', '456 Đường XYZ', 'Hồ Chí Minh', 'Việt Nam'),
('Lê Văn C', 'vanc@example.com', '0911223344', '789 Đường MNO', 'Đà Nẵng', 'Việt Nam'),
('Phạm Thị D', 'thid@example.com', '0922334455', '101 Đường PQR', 'Hải Phòng', 'Việt Nam'),
('Hoàng Văn E', 'vane@example.com', '0933445566', '202 Đường STU', 'Cần Thơ', 'Việt Nam'),
('Vũ Thị F', 'thif@example.com', '0944556677', '303 Đường VWX', 'Huế', 'Việt Nam'),
('Đặng Văn G', 'vang@example.com', '0955667788', '404 Đường YZ', 'Nha Trang', 'Việt Nam');

-- Thêm dữ liệu vào bảng Categories
INSERT INTO Categories (CategoryName) VALUES
('Điện thoại'),
('Máy tính'),
('Thời trang'),
('Đồ gia dụng'),
('Sách'),
('Thể thao'),
('Âm nhạc');

-- Thêm dữ liệu vào bảng Products
INSERT INTO Products (ProductName, CategoryID, Price, Stock, Description) VALUES
('iPhone 15 Pro Max', 1, 35000000.00, 50, 'Điện thoại cao cấp nhất của Apple'),
('MacBook Air M2', 2, 28000000.00, 30, 'Laptop mỏng nhẹ, hiệu năng cao'),
('Áo thun cotton', 3, 250000.00, 100, 'Áo thunBasic, thoải mái'),
('Nồi cơm điện Sharp', 4, 1200000.00, 40, 'Nồi cơm điện dung tích 1.8L'),
('Đắc nhân tâm', 5, 150000.00, 80, 'SáchSelf-help nổi tiếng'),
('Giày chạy bộ Nike', 6, 1800000.00, 60, 'Giày chuyên dụng cho chạy bộ'),
('Album nhạc Trịnh', 7, 120000.00, 90, 'Tuyển tập các ca khúc hay nhất của Trịnh Công Sơn');

-- Thêm dữ liệu vào bảng Orders
INSERT INTO Orders (CustomerID, OrderDate, TotalAmount, Status) VALUES
(1, '2025-05-01 10:00:00', 35000000.00, 'Delivered'),
(2, '2025-05-01 11:30:00', 28250000.00, 'Delivered'),
(3, '2025-05-02 09:00:00', 250000.00, 'Pending'),
(1, '2025-05-02 14:00:00', 1200000.00, 'Shipped'),
(4, '2025-05-03 16:30:00', 150000.00, 'Delivered'),
(5, '2025-05-03 18:00:00', 1800000.00, 'Cancelled'),
(2, '2025-05-04 08:00:00', 120000.00, 'Delivered');

-- Thêm dữ liệu vào bảng OrderDetails
INSERT INTO OrderDetails (OrderID, ProductID, Quantity, UnitPrice, Subtotal) VALUES
(1, 1, 1, 35000000.00, 35000000.00),
(2, 2, 1, 28000000.00, 28000000.00),
(2, 3, 1, 250000.00, 250000.00),
(3, 3, 1, 250000.00, 250000.00),
(4, 4, 1, 1200000.00, 1200000.00),
(5, 5, 1, 150000.00, 150000.00),
(6, 6, 1, 1800000.00, 1800000.00);

-- Thêm dữ liệu vào bảng Payments
INSERT INTO Payments (OrderID, PaymentDate, Amount, PaymentMethod, Status) VALUES
(1, '2025-05-01 10:15:00', 35000000.00, 'Credit Card', 'Completed'),
(2, '2025-05-01 11:45:00', 28250000.00, 'PayPal', 'Completed'),
(3, '2025-05-02 09:10:00', 250000.00, 'Cash', 'Pending'),
(4, '2025-05-02 14:10:00', 1200000.00, 'Bank Transfer', 'Completed'),
(5, '2025-05-03 16:40:00', 150000.00, 'Credit Card', 'Completed'),
(6, '2025-05-03 18:10:00', 1800000.00, 'PayPal', 'Failed'),
(7, '2025-05-04 08:10:00', 120000.00, 'Cash', 'Completed');

--a. 3 câu hỏi và truy vấn đơn giản
--VD Viết câu lệnh SQL lấy ra tên hợp đồng(contract name) và SDT(phone) của Khách Hàng(customers).
SELECT ContactName, Phone
FROM dbo.Customers;
--VD Viết câu lệnh SQL lấy ra tên các quốc gia(Country) ""khác nhau"" từ bảng khách hàng(Customers)
SELECT DISTINCT Country
FROM dbo.Customers;
--VD Viết câu lenh SQL lấy ra các mã khách hàng(CustomerID) trong bảng đơn hàng(orders) với quy định là mã khách hàng
--không được trùng lặp, chỉ lấy 5 dòng dữ liệu đàu tiên.
SELECT DISTINCT TOP 5 CustomerID
FROM dbo.Orders;

--c.5 câu truy vấn mệnh đề having
--VD Hãy cho biết những khách hàng nào đã đặt nhiều hơn 20 đơn hàng, 
--sắp xếp theo thứ tự tổng số đơn hàng giảm dần.
SELECT [CustomerID], COUNT([OrderID]) AS "Total"
FROM dbo.Orders
GROUP BY [CustomerID]
HAVING COUNT([OrderID]) > 20
ORDER BY COUNT([OrderID]) DESC;