/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.SanPhamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class SanPhamDAO {
    public ArrayList<SanPhamDTO> selectAll() {
        ArrayList<SanPhamDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT * FROM SanPham";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String MaSP = rs.getString("MaTL");
                String MaTL = rs.getString("MaTL");
                String TenSP = rs.getNString("TenSP");
                String TacGia = rs.getNString("TacGia");
                String HinhAnh = rs.getNString("HinhAnh");
                double DonGia = rs.getFloat("DonGia");
                int SoLuong = rs.getInt("SoLuong");
                int NamXB = rs.getInt("NamXB");
                String TinhTrang = rs.getString("TinhTrang");

                SanPhamDTO sp = new SanPhamDTO(MaSP, MaTL, TenSP, HinhAnh, TacGia, TinhTrang, DonGia, SoLuong, NamXB);
                ketQua.add(sp);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
