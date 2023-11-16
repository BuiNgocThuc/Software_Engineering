/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectDB;
import DTO.ThongKe.ThongKeDoanhThuDTO;
import java.beans.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class ThongKeDAO {

    public ArrayList< ThongKeDoanhThuDTO> thongKeDoanhThuTheoNam() {
        ArrayList< ThongKeDoanhThuDTO> danhSachDoanhThu = new ArrayList<>();
        String query = "SELECT YEAR(NgayTao) AS Nam, SUM(TongTien) AS DoanhThu FROM HoaDon GROUP BY YEAR(NgayTao)";

        try (
                java.sql.Connection conn = ConnectDB.getConnection(); PreparedStatement preparedStatement = conn.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int nam = resultSet.getInt("Nam");
                long doanhThu = resultSet.getLong("DoanhThu");
                long von = tinhVonTrongNam(nam, conn);
                long loiNhuan = doanhThu - von;

                ThongKeDoanhThuDTO doanhThuObj = new ThongKeDoanhThuDTO(nam, von, doanhThu, loiNhuan);
                danhSachDoanhThu.add(doanhThuObj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachDoanhThu;
    }

    public ArrayList< ThongKeDoanhThuDTO> thongKeDoanhThuTuNamDenNam(int namBatDau, int namKetThuc) {
        ArrayList< ThongKeDoanhThuDTO> danhSachDoanhThu = new ArrayList<>();
        String query = "SELECT YEAR(NgayTao) AS Nam, SUM(TongTien) AS DoanhThu FROM HoaDon WHERE YEAR(NgayTao) BETWEEN ? AND ? GROUP BY YEAR(NgayTao)";

        try (
                java.sql.Connection conn = ConnectDB.getConnection(); PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            preparedStatement.setInt(1, namBatDau);
            preparedStatement.setInt(2, namKetThuc);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int nam = resultSet.getInt("Nam");
                    long doanhThu = resultSet.getLong("DoanhThu");
                    long von = tinhVonTrongNam(nam, conn);
                    long loiNhuan = doanhThu - von;

                    ThongKeDoanhThuDTO doanhThuObj = new ThongKeDoanhThuDTO(nam, von, doanhThu, loiNhuan);
                    danhSachDoanhThu.add(doanhThuObj);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachDoanhThu;
    }

    private long tinhVonTrongNam(int nam, java.sql.Connection connection) {
        long von = 0;
        String query = "SELECT SUM(TongTien) AS Von FROM PhieuNhap WHERE YEAR(NgayTao) = ?";

        try (
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, nam);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    von = resultSet.getLong("Von");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return von;
    }

    
    public ArrayList<ThongKeDoanhThuDTO> thongKeDoanhThuTheoThang(int nam) {
    ArrayList<ThongKeDoanhThuDTO> danhSachDoanhThu = new ArrayList<>();

    // Tạo bảng tạm với tất cả các tháng trong năm
    String createTempTableQuery = "CREATE TABLE #AllMonths (Month INT);"
            + "INSERT INTO #AllMonths VALUES (1), (2), (3), (4), (5), (6), (7), (8), (9), (10), (11), (12);";

    // LEFT JOIN để lấy doanh thu của từng tháng
    String selectQuery = "SELECT M.Month AS Thang, ISNULL(SUM(HD.TongTien), 0) AS DoanhThu "
            + "FROM #AllMonths M "
            + "LEFT JOIN HoaDon HD ON M.Month = MONTH(HD.NgayTao) AND YEAR(HD.NgayTao) = ? "
            + "GROUP BY M.Month;";

    // Xóa bảng tạm sau khi sử dụng
    String dropTempTableQuery = "DROP TABLE #AllMonths;";

    try (java.sql.Connection conn = ConnectDB.getConnection();
         java.sql.Statement statement = conn.createStatement();
         PreparedStatement preparedStatement = conn.prepareStatement(selectQuery)) {

        // Tạo bảng tạm
        statement.executeUpdate(createTempTableQuery);

        // Thiết lập tham số cho câu truy vấn
        preparedStatement.setInt(1, nam);

        // Thực hiện truy vấn và xử lý kết quả
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int thang = resultSet.getInt("Thang");
                long doanhThu = resultSet.getLong("DoanhThu");
                long von = tinhVonTungThangTrongNam(nam, conn, thang);
                long loiNhuan = doanhThu - von;

                ThongKeDoanhThuDTO doanhThuObj = new ThongKeDoanhThuDTO(thang, von, doanhThu, loiNhuan);
                danhSachDoanhThu.add(doanhThuObj);
            }
        }

        // Xóa bảng tạm
        statement.executeUpdate(dropTempTableQuery);

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return danhSachDoanhThu;
}


    private long tinhVonTungThangTrongNam(int nam, java.sql.Connection connection, int thang) {
        long von = 0;
        String query = "SELECT SUM(TongTien) AS Von FROM PhieuNhap WHERE YEAR(NgayTao) = ? AND MONTH(NgayTao) = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, nam);
            preparedStatement.setInt(2, thang);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    von = resultSet.getLong("Von");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return von;
    }

    public Map<String, Integer> thongKeSoLuongSachTheoTheLoai() {
        Map<String, Integer> thongKe = new HashMap<>();

        try {
            java.sql.Connection conn = ConnectDB.getConnection();
            String sql = "SELECT TheLoai.TenTL, COUNT(Sach.MaSach) AS SoLuongSach "
                    + "FROM Sach "
                    + "JOIN TheLoai ON Sach.MaTL = TheLoai.MaTL "
                    + "GROUP BY TheLoai.TenTL";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String tenTL = rs.getString("TenTL");
                int soLuongSach = rs.getInt("SoLuongSach");
                thongKe.put(tenTL, soLuongSach);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thongKe;
    }

    public Set<Integer> getDistinctYears() {
        Set<Integer> years = new HashSet<>();

        try {
            java.sql.Connection conn = ConnectDB.getConnection();
            String query = "SELECT DISTINCT YEAR(NgayTao) AS Nam FROM HoaDon";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int year = resultSet.getInt("Nam");
                years.add(year);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return years;
    }
}
