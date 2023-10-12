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

    public ArrayList<TheLoaiDTO> selectAll() {
        ArrayList<TheLoaiDTO> res = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM TheLoai";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maTL =String.valueOf(rs.getInt("MaTL")) ;
                String tenTL = rs.getString("TenTL");
                String tinhTrang = rs.getBoolean("TinhTrang") ? "1" : "0";

                TheLoaiDTO tl = new TheLoaiDTO(maTL, tenTL, tinhTrang);
                res.add(tl);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public int Them(TheLoaiDTO tl) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO TheLoai( TenTL, TinhTrang) VALUES ( ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
          
            pst.setString(1, tl.getTenTL());
           pst.setBoolean(2, Boolean.parseBoolean(tl.getTinhTrang()));
            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Sua(TheLoaiDTO tl) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE TheLoai SET TenTL=?, TinhTrang=? WHERE MaTL=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tl.getTenTL());
            pst.setString(2, tl.getTinhTrang());
            pst.setString(3, tl.getMaTL());

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Xoa(int maTL) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "DELETE FROM TheLoai WHERE MaTL=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, maTL);

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    public static void main(String[] args) {
        // Tạo một đối tượng TheLoaiDAO
        TheLoaiDAO theLoaiDAO = new TheLoaiDAO();

        // Đọc tất cả dữ liệu từ bảng TheLoai
        System.out.println("Danh sách TheLoai:");
        ArrayList<TheLoaiDTO> theLoais = theLoaiDAO.selectAll();
        for (TheLoaiDTO tl : theLoais) {
            System.out.println("Mã TL: " + tl.getMaTL() + ", Tên TL: " + tl.getTenTL() + ", Tình trạng: " + tl.getTinhTrang());
        }

         // Thêm một TheLoai mới
         TheLoaiDTO newTheLoai = new TheLoaiDTO("Thể Loại Mới","0");
         int themKetQua = theLoaiDAO.Them(newTheLoai);
         if (themKetQua > 0) {
             System.out.println("Đã thêm thành công TheLoai mới.");
         }

        // // Sửa một TheLoai
        // TheLoai updateTheLoai = new TheLoai(1, "Thể Loại Sửa", false);
        // int suaKetQua = theLoaiDAO.Sua(updateTheLoai);
        // if (suaKetQua > 0) {
        //     System.out.println("Đã sửa thành công TheLoai.");
        // }

        // Xóa một TheLoai (thay đổi maTL thành mã thể loại cần xóa)
        // int maTheLoaiCanXoa = 1;
        // int xoaKetQua = theLoaiDAO.Xoa(maTheLoaiCanXoa);
        // if (xoaKetQua > 0) {
        //     System.out.println("Đã xóa thành công TheLoai.");
        // }
    }
}

