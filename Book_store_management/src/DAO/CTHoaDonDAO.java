/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.CTHoaDonDTO;
import DTO.HoaDonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTHoaDonDAO {
  public ArrayList<CTHoaDonDTO> findHoaDonByMaHD(int MaHoaDon) {
        ArrayList<CTHoaDonDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT TenSP, cthd.SoLuong,Cthd.DonGia FROM SanPham sp join ChiTietHoaDon cthd on sp.MaSP = cthd.MaSP Where MaHD = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, MaHoaDon);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String TenSP = rs.getString("TenSP");
                int soLuong = rs.getInt("SoLuong");
                double DonGia = rs.getDouble("DonGia");

                CTHoaDonDTO cthd= new CTHoaDonDTO(DonGia, soLuong, TenSP);
                ketQua.add(cthd);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

}
