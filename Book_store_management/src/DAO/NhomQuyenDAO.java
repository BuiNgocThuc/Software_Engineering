/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.NhomQuyenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class NhomQuyenDAO {
    public String selectNameByID(String ID) {
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT TenNQ FROM NhomQuyen WHERE MaNQ = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String TenNQ = rs.getNString("TenNQ");
                return TenNQ;
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<NhomQuyenDTO> selectAll() {
        ArrayList<NhomQuyenDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT * FROM NhomQuyen";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String MaNQ = rs.getString("MaNQ");
                String TenNQ = rs.getNString("TenNQ");
                String MoTa = rs.getNString("MoTa");
                String TinhTrang = rs.getString("TinhTrang");

                NhomQuyenDTO nq = new NhomQuyenDTO(MaNQ, TenNQ, MoTa, TinhTrang);
                ketQua.add(nq);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    
}
