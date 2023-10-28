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
import java.sql.Statement;
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
            String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL where sp.TinhTrang = 1";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int MaSP = rs.getInt("MaSP");
                String TenTL = rs.getString("TenTL");
                String TenSP = rs.getNString("TenSP");
                String TacGia = rs.getNString("TacGia");
                String HinhAnh = rs.getString("HinhAnh");
                double DonGia = rs.getFloat("DonGia");
                int SoLuong = rs.getInt("SoLuong");
                int NamXB = rs.getInt("NamXB");
                boolean TinhTrang = rs.getBoolean("TinhTrang");

                SanPhamDTO sp = new SanPhamDTO(MaSP, TenTL, TenSP, HinhAnh, TacGia, TinhTrang, DonGia, SoLuong, NamXB);
                ketQua.add(sp);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int getMaSPMax() {
        int maSP = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT Max(MaSP) as MaxMaSP FROM SanPham";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                maSP = rs.getInt("MaxMaSP");
            }
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maSP;
    }

    public boolean deleteSPByMaSP(int maSP) {
        boolean rowDelete = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE SanPham SET TinhTrang=? WHERE MaSP=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setBoolean(1, false);
            pst.setInt(2, maSP);
            rowDelete = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public boolean addSanPham(SanPhamDTO sp) {
        boolean rowInsert = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO SanPham( TenSP,TacGia,MaTL,HinhAnh,SoLuong,NamXB,DonGia,TinhTrang) VALUES ( ?, ?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sp.getTenSP());
            pst.setString(2, sp.getTacGia());
            pst.setInt(3, sp.getMaTL());
            pst.setString(4, sp.getHinhAnh());
            pst.setInt(5, sp.getSoLuong());
            pst.setInt(6, sp.getNamXB());
            pst.setDouble(7, sp.getDonGia());
            pst.setBoolean(8, sp.getTinhTrang());
            rowInsert = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }

    public ArrayList<SanPhamDTO> findSPByTenSP(String temp) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE (TenSP LIKE ? or MaSP LIKE ?) and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + temp + "%");
            stmt.setString(2, "%" + temp + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String tacGia = resultSet.getString("TacGia");
                int namXB = resultSet.getInt("NamXB");
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, tacGia, tinhTrang, donGia, soLuong, namXB));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    public SanPhamDTO getHinhAnhandNamXB(int maSP) {
        SanPhamDTO sp = null;
        String sql = "SELECT HinhAnh, NamXB FROM SanPham WHERE MaSP = ?";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, maSP);

            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                String hinhAnh = resultSet.getString("HinhAnh");
                int namXB = resultSet.getInt("NamXB");
                sp = new SanPhamDTO(hinhAnh, namXB);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }

  public boolean Update(SanPhamDTO sp) {
    boolean rowUpdate = false;
    try {
        Connection conn = ConnectDB.getConnection();
        String sql = "UPDATE SanPham SET TenSP=?, TacGia=?, NamXB=?, MaTL=?, SoLuong=?, DonGia=?, TinhTrang=?, HinhAnh=? WHERE MaSP=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, sp.getTenSP());
        pst.setString(2, sp.getTacGia());
        pst.setInt(3, sp.getNamXB());
        pst.setInt(4, sp.getMaTL());
        pst.setInt(5, sp.getSoLuong());
        pst.setDouble(6, sp.getDonGia());
        pst.setBoolean(7, sp.getTinhTrang());
        pst.setString(8, sp.getHinhAnh());
        pst.setInt(9, sp.getMaSP());
        rowUpdate = pst.executeUpdate() > 0;
        ConnectDB.closeConnection(conn);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rowUpdate;
}


}
