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
  [HinhAnh] nvarchar(255) DEFAULT (NULL),
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
  [SDT] nvarchar(10) DEFAULT (NULL),
  [GioiTinh] nvarchar(10) DEFAULT (NULL),
  [DiaChi] nvarchar(255) DEFAULT (NULL),
  [Email] nvarchar(100) DEFAULT (NULL),  
  [TinhTrang] nvarchar(30)
)
GO

CREATE TABLE [NhaCungCap] (
  [MaNCC] int IDENTITY(1,1) Primary key,
  [TenNCC] nvarchar(50) DEFAULT (NULL),
  [SDT] nvarchar(10) DEFAULT (NULL),
  [DiaChi] nvarchar(255) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL)
)
GO

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
('NhanVien1', 'password1', 1, '2023-09-22', 1),
('NhanVien2', 'password2', 2, '2023-09-23', 1),
('NhanVien3', 'password3', 1, '2023-09-24', 0),
('NhanVien4', 'password4', 3, '2023-09-25', 1),
('NhanVien5', 'password5', 2, '2023-09-26', 0),
('NhanVien6', 'password6', 1, '2023-09-27', 1),
('NhanVien7', 'password7', 3, '2023-09-28', 1),
('NhanVien8', 'password8', 1, '2023-09-29', 0),
('NhanVien9', 'password9', 2, '2023-09-30', 1),
('NhanVien10', 'password10', 3, '2023-10-01', 1);

INSERT INTO TheLoai(TenTL, TinhTrang)
VALUES
(N'Hành động', 1),
(N'Phiêu lưu', 1),
(N'Khoa học viễn tưởng', 1),
(N'Hài hước', 1),
(N'Kịch tính', 1),
(N'Fantasy', 1),
(N'Kinh dị', 1),
(N'Bí ẩn', 1),
(N'Lãng mạn', 1),
(N'Kịch', 1);

DELETE FROM TheLoai

INSERT INTO HoaDon(TenTK, NgayTao, TongTien, TinhTrang)
VALUES
('nhanvien3', '2023-09-22', 100.00, 1),
('nhanvien3', '2023-09-23', 150.00, 0),
('nhanvien3', '2023-09-24', 200.00, 1),
('nhanvien3', '2023-09-25', 0, 0),
('nhanvien3', '2023-09-26', 120.00, 1),
('nhanvien3', '2023-09-27', 85.00, 1),
('nhanvien3', '2023-09-28', 95.00, 0),
('nhanvien3', '2023-09-29', 60.00, 1),
('nhanvien3', '2023-09-30', 110.00, 1),
('nhanvien3', '2023-10-01', 180.00, 0);

INSERT INTO ChiTietHoaDon(MaHD, MaSP, DonGia, SoLuong)
VALUES
(1, 1, 10.00, 5),
(2, 2, 12.50, 8),
(3, 3, 8.00, 10),
(4, 4, 15.00, 4),
(5, 5, 11.50, 7),
(6, 6, 9.00, 9),
(7, 7, 13.75, 6),
(8, 8, 7.50, 8),
(9, 9, 12.25, 7),
(10, 10, 14.00, 10);

INSERT INTO PhieuNhap(MaNCC, TenTK, NgayTao, TongTien, TinhTrang)
VALUES
(1, 'nhanvien1', '2023-09-22', 250.00, 1),
(2, 'nhanvien1', '2023-09-23', 180.00, 0),
(3, 'nhanvien2', '2023-09-24', 300.00, 1),
(4, 'nhanvien4', '2023-09-25', 200.00, 0),
(5, 'nhanvien5', '2023-09-26', 350.00, 1),
(6, 'nhanvien5', '2023-09-27', 210.00, 1),
(7, 'nhanvien2', '2023-09-28', 280.00, 0),
(8, 'nhanvien2', '2023-09-29', 180.00, 1),
(9, 'nhanvien2', '2023-09-30', 320.00, 1),
(10, 'nhanvien2', '2023-10-01', 250.00, 0);

INSERT INTO ChiTietPhieuNhap(MaSP, MaPN, DonGiaNhap, SoLuong)
VALUES
(1, 1, 9.00, 10),
(2, 2, 11.50, 8),
(3, 3, 7.50, 12),
(4, 4, 14.00, 6),
(5, 5, 10.25, 15),
(6, 6, 8.75, 9),
(7, 7, 12.50, 11),
(8, 8, 6.75, 14),
(9, 9, 10.00, 12),
(10, 10, 13.25, 8);

INSERT INTO ChucNang(TenCN, TinhTrang)
VALUES
(N'Tài khoản', 1),			--1
(N'Phân quyền', 1),			--2		
(N'Thể loại' , 1),			--3
(N'Sản phẩm' , 1),			--4
(N'Nhập hàng' , 1),			--5
(N'Bán hàng' , 1),			--6
(N'Phiếu nhập' , 1),		--7
(N'Hóa đơn', 1),			--8
(N'Nhân viên' , 1),			--9
(N'Nhà cung cấp' , 1),		--10
(N'Thống kê' , 1);			--11

INSERT INTO SanPham(MaTL, TenSP, HinhAnh, DonGia, SoLuong, TacGia, TinhTrang)
VALUES
(1, N'Sản phẩm 1', N'sanpham1.jpg', 15.00, 50, N'Tác giả 1', 1),
(2, N'Sản phẩm 2', N'sanpham2.jpg', 12.50, 40, N'Tác giả 2', 1),
(3, N'Sản phẩm 3', N'sanpham3.jpg', 18.00, 60, N'Tác giả 3', 1),
(4, N'Sản phẩm 4', N'sanpham4.jpg', 10.00, 30, N'Tác giả 4', 0),
(5, N'Sản phẩm 5', N'sanpham5.jpg', 20.00, 70, N'Tác giả 5', 1),
(6, N'Sản phẩm 6', N'sanpham6.jpg', 14.50, 45, N'Tác giả 6', 1),
(7, N'Sản phẩm 7', N'sanpham7.jpg', 9.75, 55, N'Tác giả 7', 0),
(8, N'Sản phẩm 8', N'sanpham8.jpg', 11.25, 38, N'Tác giả 8', 1),
(9, N'Sản phẩm 9', N'sanpham9.jpg', 16.80, 48, N'Tác giả 9', 1),
(10, N'Sản phẩm 10', N'sanpham10.jpg', 13.00, 42, N'Tác giả 10', 0);

INSERT INTO NhomQuyen(TenNQ, MoTa, TinhTrang)
VALUES
(N'Quản trị viên', N'Quản trị hệ thống', 1),
(N'Quản lý', N'Vai trò quản lý', 1),
(N'Nhân viên bán hàng', N'Vai trò bán hàng', 1),
(N'Nhân viên thủ kho', N'Vai trò quản lý kho', 1)

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
(4,3,N'Đọc', 1), --Thể loại
(4,3,N'Thêm', 1),
(4,3,N'Xóa', 1),
(4,3,N'Sửa', 1),
(4,4,N'Đọc', 1), --Sản phẩm
(4,4,N'Thêm', 1),
(4,4,N'Xóa', 1),
(4,4,N'Sửa', 1),
(4,5,N'Đọc', 1), --Nhập hàng
(4,10, N'Đọc', 1), --nhà cung cấp
(4,10, N'Thêm', 1), 
(4,10, N'Xóa', 1), 
(4,10, N'Sửa', 1), 

--Quyền bán hàng
(3,3,N'Đọc', 1), --Thể loại
(3,4,N'Đọc  ', 1), --Sản phẩm
(3,6,N'Đọc ', 1), --bán hàng

--Quyền quản lý
(2,7,N'Đọc', 1), --Phiếu Nhập
(2,7,N'Sửa', 1),
(2,7,N'Xóa',1),
(2,8,N'Đọc',1),--Hóa đơn
(2,9,N'Đọc', 1),-- Nhân viên
(2,9,N'Thêm', 1),		
(2,9,N'Xóa', 1),					
(2,9,N'Sửa', 1),					
(2,11,N'Đọc', 1); --Thống kê

INSERT INTO NhanVien(MaNV, TenNV, SDT, GioiTinh, DiaChi, Email, TinhTrang)
VALUES
('nhanvien1', N'John Doe', '1234567890', N'Nam', N'123 Đường Main', 'john@example.com', N'Đang làm việc'),
('nhanvien2', N'Jane Smith', '9876543210', N'Nữ', N'456 Đường Oak', 'jane@example.com', N'Đang làm việc'),
('nhanvien3', N'Bob Johnson', '5555555555', N'Nam', N'789 Đường Elm', 'bob@example.com', N'Đang làm việc'),
('nhanvien4', N'Alice Brown', '3333333333', N'Nữ', N'101 Đường Pine', 'alice@example.com', N'Đang làm việc'),
('nhanvien5', N'David Lee', '4444444444', N'Nam', N'202 Đường Maple', 'david@example.com', N'Đang làm việc'),
('nhanvien6', N'Emily Davis', '7777777777', N'Nữ', N'303 Đường Birch', 'emily@example.com', N'Đang làm việc'),
('nhanvien7', N'Michael Wilson', '1111111111', N'Nam', N'404 Đường Cedar', 'michael@example.com', N'Đang làm việc'),
('nhanvien8', N'Sara Garcia', '6666666666', N'Nữ', N'505 Đường Redwood', 'sara@example.com', N'Đang làm việc'),
('nhanvien9', N'Kevin Martinez', '2222222222', N'Nam', N'606 Đường Spruce', 'kevin@example.com', N'Đang làm việc'),
('nhanvien10', N'Laura Lopez', '9999999999', N'Nữ', N'707 Đường Sequoia', 'laura@example.com', N'Đang làm việc');

INSERT INTO NhaCungCap(TenNCC, SDT, DiaChi, TinhTrang)
VALUES
(N'Nhà cung cấp 1', '1111111111', N'Địa chỉ 1', 1),
(N'Nhà cung cấp 2', '2222222222', N'Địa chỉ 2', 1),
(N'Nhà cung cấp 3', '3333333333', N'Địa chỉ 3', 0),
(N'Nhà cung cấp 4', '4444444444', N'Địa chỉ 4', 1),
(N'Nhà cung cấp 5', '5555555555', N'Địa chỉ 5', 0),
(N'Nhà cung cấp 6', '6666666666', N'Địa chỉ 6', 1),
(N'Nhà cung cấp 7', '7777777777', N'Địa chỉ 7', 1),
(N'Nhà cung cấp 8', '8888888888', N'Địa chỉ 8', 0),
(N'Nhà cung cấp 9', '9999999999', N'Địa chỉ 9', 1),
(N'Nhà cung cấp 10', '1010101010', N'Địa chỉ 10', 1);
