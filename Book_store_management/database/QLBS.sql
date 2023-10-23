Create Database QLBS
USE QLBS

CREATE TABLE [TaiKhoan] (
  [MaTK] int IDENTITY(1,1) PRIMARY KEY,
  [TenTK] nvarchar(20) UNIQUE NOT NULL,
  [MatKhau] nvarchar(20) DEFAULT (NULL),
  [MaQuyen] int NOT NULL,
  [NgayTao] date DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE TheLoai (
  [MaTL] int IDENTITY(1,1) Primary key,
  [TenTL] nvarchar(50) DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE [HoaDon] (
  [MaHD] int IDENTITY(1,1) Primary key,
  [TenTK] nvarchar(20) DEFAULT (NULL),
  [NgayTao] date DEFAULT (NULL),
  [TongTien] float DEFAULT (NULL),
  [TinhTrang] BIT
)
GO



CREATE TABLE [ChiTietHoaDon] (
  [MaHD] int ,
  [MaSP] int ,
  [DonGia] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  Primary key([MaSP],[MaHD])
)
GO

CREATE TABLE [PhieuNhap] (
  [MaPN] int IDENTITY(1,1) Primary key,
  [MaNCC] int DEFAULT (NULL),
  [TenTK] nvarchar(20) DEFAULT (NULL),
  [NgayTao] date DEFAULT (NULL),
  [TongTien] float DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE [ChiTietPhieuNhap] (
  [MaPN]  int,
  [MaSP] int,
  [DonGiaNhap] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  Primary key([MaSP],[MaPN])
)
GO

CREATE TABLE [ChucNang] (
  [MaCN] int IDENTITY(1,1) Primary key,
  [TenCN] nvarchar(50) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL)
)
GO

CREATE TABLE [SanPham] (
  [MaSP] int IDENTITY(1,1) Primary key,
  [MaTL] int  DEFAULT (NULL),
  [TenSP] nvarchar(50) DEFAULT (NULL),
  [HinhAnh] VARBINARY(MAX) DEFAULT (NULL),
  [DonGia] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  [TacGia] nvarchar(255),
  [NamXB] int,
  [TinhTrang] BIT DEFAULT (NULL)
)
GO

CREATE TABLE [NhomQuyen] (
  [MaNQ] int IDENTITY(1,1) Primary key,
  [TenNQ] nvarchar(50) DEFAULT (NULL),
  [MoTa] nvarchar(255) DEFAULT (NULL),
  [TinhTrang] BIT NOT NULL
)
GO

CREATE TABLE [ChiTietQuyen] (
  [MaCTQ] int IDENTITY(1,1) Primary key,
  [MaQuyen] int,
  [MaCN] int,
  [HanhDong] nvarchar(100) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL) 
)
GO

CREATE TABLE [NhanVien] (
  [MaNV] nvarchar(20) PRIMARY KEY NOT NULL,
  [TenNV] nvarchar(50) DEFAULT (NULL),
  [SDT] nvarchar(11) DEFAULT (NULL),
  [GioiTinh] nvarchar(10) DEFAULT (NULL),
  [DiaChi] nvarchar(255) DEFAULT (NULL),
  [Email] nvarchar(100) DEFAULT (NULL),  
  [TinhTrang] nvarchar(30)
)
GO

CREATE TABLE [NhaCungCap] (
  [MaNCC] int IDENTITY(1,1) Primary key,
  [TenNCC] nvarchar(255) DEFAULT (NULL),
  [SDT] nvarchar(11) DEFAULT (NULL),
  [DiaChi] nvarchar(355) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL)
)

ALTER TABLE [SanPham] ADD FOREIGN KEY ([MaTL]) REFERENCES [TheLoai] ([MaTL])
GO


ALTER TABLE [PhieuNhap] ADD FOREIGN KEY ([MaNCC]) REFERENCES [NhaCungCap] ([MaNCC])
GO

ALTER TABLE [PhieuNhap] ADD FOREIGN KEY ([TenTK]) REFERENCES [TaiKhoan] ([TenTK])
GO

ALTER TABLE [ChiTietPhieuNhap] ADD FOREIGN KEY ([MaSP]) REFERENCES [SanPham] ([MaSP])
GO

ALTER TABLE [ChiTietHoaDon] ADD FOREIGN KEY ([MaSP]) REFERENCES [SanPham] ([MaSP])
GO

ALTER TABLE [ChiTietPhieuNhap] ADD FOREIGN KEY ([MaPN]) REFERENCES [PhieuNhap] ([MaPN])
GO

ALTER TABLE [ChiTietHoaDon] ADD FOREIGN KEY ([MaHD]) REFERENCES [HoaDon] ([MaHD])
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([TenTK]) REFERENCES [TaiKhoan] ([TenTK])
GO

ALTER TABLE [TaiKhoan] ADD FOREIGN KEY ([TenTK]) REFERENCES [NhanVien] ([MaNV])
GO

ALTER TABLE [TaiKhoan] ADD FOREIGN KEY ([MaQuyen]) REFERENCES [NhomQuyen] ([MaNQ])
GO

ALTER TABLE [ChiTietQuyen] ADD FOREIGN KEY ([MaQuyen]) REFERENCES [NhomQuyen] ([MaNQ])
GO

ALTER TABLE [ChiTietQuyen] ADD FOREIGN KEY ([MaCN]) REFERENCES [ChucNang] ([MaCN])
GO

INSERT INTO TaiKhoan(TenTK, MatKhau, MaQuyen, NgayTao, TinhTrang)
VALUES
('NV001', 'Mk@VN1234', 1, '2021-09-22', 1), --admin
('NV002', 'SecuR!ty20', 2, '2021-09-22', 1), --Quản lý
('NV003', 'P@ssw0rd!', 2, '2021-09-22', 1),
('NV004', 'Str0ngP@55', 3, '2021-09-22', 1), --Bán hàng
('NV005', 'ChAnG3Me!', 3, '2021-09-26', 1),
('NV006', 'S3cuR1t!X', 3, '2023-01-27', 0),
('NV007', 'V13tn@mPwd', 4, '2023-03-28', 1), --Thủ kho
('NV008', '#P@ssw0rd', 4, '2023-03-29', 1),
('NV009', 'Qu3sTi0n?', 4, '2021-09-22', 1),
('NV010', 'L0ngP@ssw', 4, '2021-09-22', 0);

INSERT INTO TheLoai(TenTL, TinhTrang)
VALUES
(N'Tiểu thuyết', 1),
(N'Khoa học viễn tưởng', 1),
(N'Huyền bí', 1),
(N'Lịch sử', 1),
(N'Trinh thám', 1),
(N'Khoa học', 1),
(N'Tôn giáo và tâm linh', 1),
(N'Self-help', 1),
(N'Ngôn tình', 1);

INSERT INTO HoaDon(TenTK, NgayTao, TongTien)
VALUES
('NV004', '2023-03-30', 140.00),
('NV002', '2022-09-23', 340.00),
('NV004', '2022-09-24', 130.00),
('NV004', '2022-09-25', 310.00),
('NV004', '2022-09-26', 230.00),
('NV004', '2022-09-27', 180.00),
('NV004', '2022-09-28', 480.00),
('NV004', '2022-09-29', 210.00),
('NV004', '2022-09-30', 500.00);


INSERT INTO ChiTietHoaDon(MaHD, MaSP, DonGia, SoLuong)
VALUES
(2, 1, 140.00, 1),
(3, 2, 340.00, 1),
(4, 3, 130.00, 1),
(5, 4, 310.00, 1),
(6, 5, 230.00, 1),
(7, 6, 180.00, 1),
(8, 7, 480.00, 1),
(9, 8, 210.00, 1);


INSERT INTO PhieuNhap(MaNCC, TenTK, NgayTao, TongTien, TinhTrang)
VALUES
(1, 'NV007', '2022-09-22', 2500.00, 1),
(2, 'NV009', '2022-09-23', 1800.00, 1),
(3, 'NV008', '2022-09-24', 3600.00, 1),
(4, 'NV007', '2022-09-25', 2000.00, 1),
(5, 'NV009', '2022-09-26', 3500.00, 1),
(6, 'NV008', '2022-09-27', 4800.00, 1),
(3, 'NV007', '2022-09-28', 2800.00, 1),
(4, 'NV009', '2022-09-29', 1800.00, 1),
(5, 'NV008', '2022-09-30', 3200.00, 1);



INSERT INTO ChiTietPhieuNhap(MaSP, MaPN, DonGiaNhap, SoLuong)
VALUES
(2, 1, 250.00, 10),
(6, 2, 180.00, 10),
(15, 3, 180.00, 20),
(8, 4, 200.00, 10),
(9, 5, 350.00, 10),
(13, 6, 180.00, 30),
(12, 7, 140.00, 20),
(11, 8, 180.00, 10),
(10, 9, 160.00, 20);

INSERT INTO SanPham(MaTL, TenSP, DonGia, SoLuong, TacGia, NamXB, TinhTrang)
VALUES
(1, N'To Kill a Mockingbird', 140.00, 50, N'Harper Lee', 1960, 1),
(1, N'1984',  340.00, 40, N'George Orwell', 1949, 1),
(1, N'Pride and Prejudice', 130.00, 60, N'Jane Austen', 1984, 1),
(1, N'The Great Gatsby', 310.00, 30, N'F. Scott Fitzgerald', 1999, 0),
(1, N'Harry Potter and the Philosophers Stone', 230.00, 70, N'J.K. Rowling', 1997, 1),
(2, N'Dune',  180.00, 45, N'Frank Herbert', 1965, 1),
(2, N'The Hitchhikers Guide to the Galaxy', 480.00, 55, N'Douglas Adams', 1980,0),
(2, N'Enders Game',  210.00, 38, N'Orson Scott Card', 1985, 1),
(2, N'Brave New World', 500.00, 48, N'Aldous Huxley', 1932, 1),
(2, N'Neuromancer', 310.00, 42, N'William Gibson', 1984, 0),
(3, N'The Da Vinci Code', 340.00, 50, N'Dan Brown', 2000, 1),
(3, N'Gone Girl', 340.00, 40, N'Gillian Flynn', 2012, 1),
(3, N'The Girl with the Dragon Tattoo',230.00, 60, N'Stieg Larsson', 2004, 1),
(3, N'The Hound of the Baskervilles',370.00, 30, N'Arthur Conan Doyle', 1939, 0),
(3, N'The Secret History',230.00, 70, N'Donna Tartt', 1992, 1),
(4, N'A Peoples History of the United States', 180.00, 45, N'Howard Zinn', 1980, 1),
(4, N'Guns, Germs, and Steel', 480.00, 55, N'Jared Diamond', 1997, 0),
(4, N'The Diary of a Young Girl', 210.00, 38, N'Anne Frank', 1947, 1),
(4, N'The Guns of August', 500.00, 48, N'Barbara W. Tuchman', 1962, 1),
(4, N'The Rise and Fall of the Third Reich', 310.00, 42, N'William L. Shirer', 1960, 1),
(5, N'The Poet', 230.00, 70, N'Michael Connelly', 1996, 0),
(5, N'The Cuckoos Calling', 180.00, 45, N'Robert Galbraith', 1988, 1),
(5, N'The Silence of the Lambs',480.00, 55, N'Thomas Harris', 1980, 0),
(5, N'In the Woods', 210.00, 38, N'Tana French', 2007, 1),
(5, N'The Secret History', 500.00, 48, N'Donna Tartt', 1992, 1),
(6, N'A Brief History of Time', 140.00, 50, N'Stephen Hawking', 1988, 1),
(6, N'The Selfish Gene',340.00, 40, N'Richard Dawkins', 1976, 1),
(6, N'Sapiens: A Brief History of Humankind', 130.00, 60, N'Yuval Noah Harari', 2011, 1),
(6, N'The Origin of Species',310.00, 30, N'Charles Darwin', 1859, 0),
(6, N'The Double Helix',230.00, 70, N'James D. Watson', 1968, 1),
(7, N'The Alchemist',180.00, 45, N'Paulo Coelho', 1988, 1),
(7, N'The Power of Now', 480.00, 55, N'Eckhart Tolle', 1997, 0),
(7, N'The Celestine Prophecy', 210.00, 38, N'James Redfield', 1993, 1),
(7, N'Mere Christianity',  500.00, 48, N'C.S. Lewis ', 1952, 1),
(7, N'The Tao of Pooh', 310.00, 42, N'Benjamin Hoff', 1982, 0),
(8, N'Daring Greatly', 340.00, 50, N'Brené Brown', 2012, 1),
(8, N'Girl, Wash Your Face',340.00, 40, N'Rachel Hollis', 2018, 1),
(8, N'The Power of Now', 230.00, 60, N'Eckhart Tolle', 1997, 1),
(8, N'The Four Agreements', 370.00, 30, N'Don Miguel Ruiz', 1997, 0),
(8, N'Start with Why',230.00, 70, N'Simon Sinek', 2009, 1),
(9, N'The Notebook',180.00, 45, N'Nicholas Sparks', 1996, 1),
(9, N'Outlander', 480.00, 55, N'Diana Gabaldon', 1991, 0),
(9, N'The Rosie Project', 210.00, 38, N'Graeme Simsion', 2013, 1),
(9, N'The Fault in Our Stars', 500.00, 48, N'John Green', 2012, 1),
(9, N'Me Before You', 310.00, 42, N'Jojo Moyes', 2012, 1);

INSERT INTO NhomQuyen(TenNQ, MoTa, TinhTrang)
VALUES
(N'Quản trị viên', N'Quản trị hệ thống', 1),
(N'Quản lý', N'Vai trò quản lý', 1),
(N'Nhân viên bán hàng', N'Vai trò bán hàng', 1),
(N'Nhân viên thủ kho', N'Vai trò quản lý kho', 1)

INSERT INTO ChucNang(TenCN, TinhTrang)
VALUES
(N'Tài khoản', 1),			--1
(N'Phân quyền', 1),			--2		
(N'Sản phẩm' , 1),			--3
(N'Nhập hàng' , 1),			--4
(N'Bán hàng' , 1),			--5
(N'Phiếu nhập' , 1),		--6
(N'Hóa đơn', 1),			--7
(N'Nhân viên' , 1),			--8
(N'Nhà cung cấp' , 1),		--9
(N'Thống kê' , 1);			--10

INSERT INTO ChiTietQuyen(MaQuyen, MaCN, HanhDong, TinhTrang)
VALUES
--Hành Động
--Đọc: 1
--Thêm: 2
--Xóa: 3
--Sửa: 4

--Quyền admin
(1,1, N'Đọc', 1), --Tài Khoản
(1,1, N'Thêm', 1),
(1,1, N'Xóa', 1),
(1,1, N'Sửa', 1),
(1,2, N'Đọc', 1), --Phân quyền
(1,2, N'Thêm', 1),
(1,2, N'Xóa', 1),
(1,2, N'Sửa', 1),

--Quyền thủ kho
(4,3,N'Đọc', 1), --Sản phẩm
(4,3,N'Thêm', 1),
(4,3,N'Xóa', 1),
(4,3,N'Sửa', 1),
(4,4,N'Đọc', 1), --Nhập hàng
(4,9, N'Đọc', 1), --nhà cung cấp
(4,9, N'Thêm', 1), 
(4,9, N'Xóa', 1), 
(4,9, N'Sửa', 1), 

--Quyền bán hàng
(3,3,N'Đọc  ', 1), --Sản phẩm
(3,5,N'Đọc ', 1), --bán hàng

--Quyền quản lý
(2,6,N'Đọc', 1), --Phiếu Nhập
(2,6,N'Sửa', 1),
(2,6,N'Xóa',1),
(2,7,N'Đọc',1),--Hóa đơn
(2,8,N'Đọc', 1),-- Nhân viên
(2,8,N'Thêm', 1),		
(2,8,N'Xóa', 1),					
(2,8,N'Sửa', 1),					
(2, 10, N'Đọc', 1); --Thống kê

INSERT INTO NhanVien(MaNV, TenNV, SDT, GioiTinh, DiaChi, Email, TinhTrang)
VALUES
('NV001', N'Nguyễn Huỳnh Hoa', '0987123456', N'Nữ', N'123 Đường Lê Lợi, Quận 1, TP.HCM', 'hoa_nguyen01@gmail.com', N'Đang làm việc'),
('NV002', N'Trần Tuấn Anh', '0903456789', N'Nam', N'456 Đường Nguyễn Huệ, Quận 1, TP.HCM', 'tuananh0304@gmail.com', N'Đang làm việc'),
('NV003', N'Lê Thanh Minh', '0912345678', N'Nam', N'789 Đường Võ Văn Tần, Quận 3, TP.HCM', 'le_minh99@gmail.com', N'Đang làm việc'),
('NV004', N'Võ Thị Nga', '0976987654', N'Nữ', N'321 Đường Lê Duẩn, Quận Tân Bình, TP.HCM', 'nga0nga1@gmail.com', N'Đang làm việc'),
('NV005', N'Phạm Hồng Đức', '0938123789', N'Nam', N'654 Đường Phan Xích Long, Quận Phú Nhuận, TP.HCM', 'duc_day111@gmail.com', N'Đang làm việc'),
('NV006', N'Nguyễn Hoàng Quyên', '0945678901', N'Nữ', N'987 Đường Nguyễn Thị Minh Khai, Quận 3, TP.HCM', 'hoangduyen1@gmail.com', N'Đang làm việc'),
('NV007', N'Bùi Thanh', '0963234567', N'Nam', N'234 Đường Nguyễn Đình Chính, Quận Bình Thạnh, TP.HCM', 'thanh.ai123@gmail.com', N'Đang làm việc'),
('NV008', N'Nguyễn Thanh Lân', '0914567890', N'Nam', N'567 Đường Cách Mạng Tháng Tám, Quận 10, TP.HCM', 'lanvaban123@gmail.com', N'Đang làm việc'),
('NV009', N'Nguyễn Trần Vĩnh Khoa', '0985123789', N'Nam', N'210 Đường Hùng Vương, Quận 5, TP.HCM', 'khoadep_trai9@gmail.com', N'Đang làm việc'),
('NV010', N'Đỗ Lê Viết Văn', '0909345678', N'Nam', N'543 Đường Bến Vân Đồn, Quận 4, TP.HCM', 'viet.van86@gmail.com', N'Đang làm việc');

INSERT INTO NhaCungCap(TenNCC, SDT, DiaChi, TinhTrang)
VALUES
(N'CÔNG TY CỔ PHẦN VĂN HÓA NHÂN VĂN', '0302229082', N'1 Trường Chinh, Phường 11, Quận Tân Bình, Thành phố Hồ Chí Minh, Việt Nam', 1),
(N'CÔNG TY TNHH THƯƠNG MẠI VÀ DỊCH VỤ VĂN HOÁ ĐINH TỊ', '0247309338', N'Tổ 9, tập thể Sân Bay, Phường Long Biên, Quận Long Biên, Thành phố Hà Nội, Việt Nam', 1),
(N'NHÀ XUẤT BẢN KIM ĐỒNG', '1900571595', N'55 Quang Trung - Phường Nguyễn Du - Quận Hai Bà Trưng - Hà Nội.', 1),
(N'CÔNG TY CỔ PHẦN VĂN HÓA HUY HOÀNG', '0903262626', N'Số 110D, phố Ngọc Hà - Phường Đội Cấn - Quận Ba Đình - Hà Nội.', 1),
(N'CÔNG TY TNHH VĂN HOÁ MINH TÂN - NHÀ SÁCH MINH THẮNG', '0283891074', N'Số nhà 200, B3 - Khu tập thể Tân Mai, Phường Tân Mai, Quận Hoàng Mai, Thành phố Hà Nội, Việt Nam', 0),
(N'CHI NHÁNH CÔNG TY CỔ PHẦN VĂN HÓA VÀ TRUYỀN THÔNG NHÃ NAM', '0903244248', N'185 Hoa Lan, Phường 02, Quận Phú Nhuận, Thành phố Hồ Chí Minh, Việt Nam', 1);