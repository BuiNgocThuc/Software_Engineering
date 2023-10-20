/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTPhanQuyenDAO {
    PreparedStatement pstm = null;

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
}
