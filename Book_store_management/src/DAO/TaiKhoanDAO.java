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
                String TenTK = rs.getString("TenTK");
                String MatKhau = rs.getString("MatKhau");
                String MaQuyen = rs.getString("MaQuyen");
                Date NgayTao = rs.getDate("NgayTao");
                String TrangThai = rs.getString("TinhTrang");

                TaiKhoanDTO a = new TaiKhoanDTO(MaTK, TenTK, MatKhau, MaQuyen, TrangThai, NgayTao);
                ketQua.add(a);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public static void main(String[] args) {
        TaiKhoanDAO a = new TaiKhoanDAO();
        a.selectAll();
    }
}
