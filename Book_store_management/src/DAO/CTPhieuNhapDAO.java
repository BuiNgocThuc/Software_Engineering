/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.CTPhieuNhapDTO;
import DTO.SanPhamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTPhieuNhapDAO {

    public boolean Them(CTPhieuNhapDTO ctpn) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO ChiTietPhieuNhap(MaPN, MaSP, DonGiaNhap, SoLuong) VALUES ( ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, Integer.parseInt(ctpn.getMaPN()));
            pst.setInt(2, Integer.parseInt(ctpn.getMaSP()));
            pst.setDouble(3, ctpn.getDonGia());
            pst.setInt(4, Integer.parseInt(ctpn.getMaSP()));

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
            if (ketQua != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateSP(String MaSP, int SoLuong, double DonGia) {
        boolean rowUpdate = false;
        int currentQuantity = getCurrentQuantity(MaSP);
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE SanPham SET SoLuong=?, DonGia=? WHERE MaSP=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            int newQuantity = currentQuantity += SoLuong;
            double giaBan = (double) DonGia * 120 / 100;
            pst.setInt(1, newQuantity);
            pst.setDouble(2, giaBan);
            pst.setInt(3, Integer.parseInt(MaSP));
            rowUpdate = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public int getCurrentQuantity(String MaSP) {
        int SoLuong = 0;
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT SoLuong FROM SanPham where MaSP = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(MaSP));
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                SoLuong = rs.getInt("SoLuong");
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return SoLuong;
    }
}
