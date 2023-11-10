/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.CTQuyenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTPhanQuyenDAO {
    PreparedStatement pstm = null;
    
    public ArrayList<CTQuyenDTO> selectByID(int MaNQ) {
        ArrayList<CTQuyenDTO> listCTQ = new ArrayList<>();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "select * from ChiTietQuyen where MaQuyen = ? and TinhTrang <> 0";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, MaNQ);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                int maCN = rs.getInt("MaCN");
                String HanhDong = rs.getString("HanhDong");
                
                CTQuyenDTO ctq = new CTQuyenDTO(1, MaNQ, maCN, HanhDong, 1);
                listCTQ.add(ctq);
            }
            
            
        } catch (Exception e) {
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return listCTQ;
    }

    public ArrayList<String> getPerByRole(String MaQuyen) {
        ArrayList<String> listRole = new ArrayList<>();
        Connection conn = ConnectDB.getConnection();
        try {
            String sql = "select MaCN from ChiTietQuyen where MaQuyen = ? and TinhTrang <> 0";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, MaQuyen);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                String maCN = rs.getString("MaCN");
                listRole.add(maCN);
            }
            
            
        } catch (Exception e) {
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return listRole;
    }
    
    public boolean Them(CTQuyenDTO ctq) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO ChiTietQuyen(MaQuyen, MaCN, HanhDong, TinhTrang) VALUES ( ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, ctq.getMaQuyen());
            pst.setInt(2, ctq.getMaCN());
            pst.setString(3, ctq.getHanhDong());
            pst.setInt(4, ctq.getTinhTrang());

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
    
    public boolean Xoa(int MaNQ) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "DELETE FROM ChiTietQuyen WHERE MaQuyen = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, MaNQ);

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
}
