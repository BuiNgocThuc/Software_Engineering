/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TaiKhoanDTO;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectDB;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NGOC THUC
 */
public class TaiKhoanDAO {

    public ArrayList<TaiKhoanDTO> selectAll() {
        ArrayList<TaiKhoanDTO> ketQua = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM TaiKhoan";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String MaTK = rs.getString("MaTK");
                String TenTK = rs.getNString("TenTK");
                String MatKhau = rs.getNString("MatKhau");
                String MaQuyen = rs.getString("MaQuyen");
                Date NgayTao = rs.getDate("NgayTao");
                String TrangThai = rs.getString("TinhTrang");

                TaiKhoanDTO tk = new TaiKhoanDTO(MaTK, TenTK, MatKhau, MaQuyen, TrangThai, NgayTao);
                ketQua.add(tk);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Them(TaiKhoanDTO taiKhoan) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO TaiKhoan(TenTK, MatKhau, MaQuyen, NgayTao, TinhTrang) VALUES ( ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, taiKhoan.getTenTK());
            pst.setString(2, taiKhoan.getMatKhau());
            pst.setString(3, taiKhoan.getMaQuyen());
            pst.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(taiKhoan.getNgayTao()));
            pst.setBoolean(5, Boolean.parseBoolean(taiKhoan.getTinhTrang()));

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Sua(TaiKhoanDTO taiKhoan) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE TaiKhoan SET TenTK=?, MatKhau=?, MaQuyen=?, NgayTao=?, TinhTrang=? WHERE MaTK=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, taiKhoan.getTenTK());
            pst.setString(2, taiKhoan.getMatKhau());
            pst.setString(3, taiKhoan.getMaQuyen());
            pst.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(taiKhoan.getNgayTao()));
            pst.setBoolean(5, Boolean.parseBoolean(taiKhoan.getTinhTrang()));
            pst.setString(6, taiKhoan.getMaTK());

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Xoa(String maTK) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "DELETE FROM TaiKhoan WHERE MaTK=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, maTK);

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public static void main(String[] args) throws ParseException {
        TaiKhoanDAO a = new TaiKhoanDAO();
        // ArrayList<TaiKhoanDTO> dstk = a.selectAll();
//        for(TaiKhoanDTO tk : dstk)
//        {
//            System.out.println(tk.getTinhTrang());
//        }
        
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
        // String userInput = "2023-10-13";
        // Date ngayTao = dateFormat.parse(userInput)
        // TaiKhoanDTO tk = new TaiKhoanDTO("nhanvien11", "123456", "1", "1", ngayTao);

//        int ketqua = a.Xoa("15");
//        if (ketqua > 0) {
//            System.out.println("Xoa thanh cong");
//        } else {
//            System.out.println("That bai");
//        }
// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng
//        String userInput = "2023-10-13";
//        Date ngayTao = dateFormat.parse(userInput);
//  TaiKhoanDTO tk = new TaiKhoanDTO("9","nhanvien11", "123456", "1", "1", ngayTao);
//    a.Sua(tk);
    }
}
