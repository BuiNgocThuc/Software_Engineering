/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TheLoaiDTO;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Connection.ConnectDB;

public class TheLoaiDAO {

    public TheLoaiDAO() {

    }
// Lấy tất cả 

    public ArrayList<TheLoaiDTO> selectAll() {
        ArrayList<TheLoaiDTO> res = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM TheLoai where TinhTrang = 1";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int maTL = rs.getInt("MaTL");
                String tenTL = rs.getString("TenTL");
                boolean tinhTrang = rs.getBoolean("TinhTrang");

                TheLoaiDTO tl = new TheLoaiDTO(maTL, tenTL, tinhTrang);
                res.add(tl);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
        }
        return res;
    }

    // Tìm thể loại dựa trên mã thể loại
    public TheLoaiDTO findTheLoaiByMaTL(String temp) {
        String sql = "SELECT * FROM TheLoai WHERE MaTL = ? ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, temp);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                int maTheLoai = resultSet.getInt("MaTL");
                String tenTheLoai = resultSet.getString("TenTL");
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                return new TheLoaiDTO(maTheLoai, tenTheLoai, tinhTrang);
            }
        } catch (SQLException e) {
        }
        return null;
    }

    // Tìm thể loại dựa trên tên thể loại
    public ArrayList<TheLoaiDTO> findTheLoaiByMaTL_or_TenTL(String tenTL) {
        ArrayList<TheLoaiDTO> theLoaiList = new ArrayList<>();
        String sql = "SELECT * FROM TheLoai WHERE (TenTL LIKE ? or MATL LIKE ?)and TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + tenTL + "%");
            stmt.setString(2, "%" + tenTL + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maTheLoai = resultSet.getInt("MaTL");
                String tenTheLoai = resultSet.getString("TenTL");
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                theLoaiList.add(new TheLoaiDTO(maTheLoai, tenTheLoai, tinhTrang));
            }
        } catch (SQLException e) {
        }
        return theLoaiList;
    }

    // Lấy mã thể loại lớn nhất 
    public int getMaTheLoaiMax() {
        int maTL = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT Max(MaTL) as MaxMaTL FROM TheLoai";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                maTL = rs.getInt("MaxMaTL");
            } 
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maTL;
    }

    public boolean addTheLoai(TheLoaiDTO tl) {
        boolean rowInsert = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO TheLoai( TenTL, TinhTrang) VALUES ( ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tl.getTenTL());
            pst.setBoolean(2, tl.getTinhTrang());
            rowInsert = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
        }
        return rowInsert;
    }

// Sửa thông tin thể loại
    public boolean Update(TheLoaiDTO tl) {
        boolean rowUpdate = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE TheLoai SET TenTL=?, TinhTrang=? WHERE MaTL=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tl.getTenTL());
            pst.setBoolean(2, tl.getTinhTrang());
            pst.setInt(3, tl.getMaTL());
            rowUpdate = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
        }
        return rowUpdate;
    }

    // Xóa thể loại dựa trên mã thể loại
    public boolean deleteTheLoaiByMaTL(int maTL) {
        boolean rowDelete = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE TheLoai SET TinhTrang=? WHERE MaTL=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setBoolean(1, false);
            pst.setInt(2, maTL);
            rowDelete = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public int getMaTLbyTenTL(String TenTL) {
        int maTL = -1; // Gán một giá trị mặc định nếu không tìm thấy

        try {
            System.out.println(TenTL);
            Connection conn = ConnectDB.getConnection();
            String sql = "SELECT MaTL FROM TheLoai WHERE TenTL = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, TenTL);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                maTL = rs.getInt("MaTL");
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maTL;
    }

//    public static void main(String[] args) {
//        // Tạo một đối tượng TheLoaiDAO
//        TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
//
//        // Đọc tất cả dữ liệu từ bảng TheLoai
//        System.out.println("Danh sách TheLoai:");
//        ArrayList<TheLoaiDTO> theLoais = theLoaiDAO.selectAll();
//        for (TheLoaiDTO tl : theLoais) {
//            System.out.println("Mã TL: " + tl.getMaTL() + ", Tên TL: " + tl.getTenTL() + ", Tình trạng: " + tl.getTinhTrang());
//        }
//
//        // Thêm một TheLoai mới
//        //  TheLoaiDTO newTheLoai = new TheLoaiDTO("Thể Loại Mới","0");
//        //  int themKetQua = theLoaiDAO.Them(newTheLoai);
//        //  if (themKetQua > 0) {
//        //      System.out.println("Đã thêm thành công TheLoai mới.");
//        //  }
//        // // Sửa một TheLoai
//        // TheLoai updateTheLoai = new TheLoai(1, "Thể Loại Sửa", false);
//        // int suaKetQua = theLoaiDAO.Sua(updateTheLoai);
//        // if (suaKetQua > 0) {
//        //     System.out.println("Đã sửa thành công TheLoai.");
//        // }
//        // Xóa một TheLoai (thay đổi maTL thành mã thể loại cần xóa)
//        String maTheLoaiCanXoa = "12";
//        int xoaKetQua = theLoaiDAO.Xoa(maTheLoaiCanXoa);
//        if (xoaKetQua > 0) {
//            System.out.println("Đã xóa thành công TheLoai.");
//        }
//        for (TheLoaiDTO tl : theLoais) {
//            System.out.println("Mã TL: " + tl.getMaTL() + ", Tên TL: " + tl.getTenTL() + ", Tình trạng: " + tl.getTinhTrang());
//        }
//
//    }
}
