/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.TheLoaiDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class TheLoaiDAO {
     public ArrayList<TheLoaiDTO> selectAll() {
        ArrayList<TheLoaiDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT * FROM TheLoai";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String MaTL = rs.getString("MaTL");
                String TenTL = rs.getNString("TenTL");
                String TinhTrang = rs.getString("TinhTrang");

                TheLoaiDTO tl = new TheLoaiDTO(MaTL, TenTL, TinhTrang);
                ketQua.add(tl);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
