/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChucNangDTO;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectDB;
import java.sql.Statement;

/**
 *
 * @author NGOC THUC
 */
public class ChucNangDAO {

    public ChucNangDAO() {

    }

    public ArrayList<ChucNangDTO> selectAll() {
        ArrayList<ChucNangDTO> res = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM ChucNang";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maCN = rs.getString("MaCN");
                String tenCN = rs.getNString("TenCN");
                String tinhTrang = rs.getString("TinhTrang");

                ChucNangDTO cn = new ChucNangDTO(maCN, tenCN, tinhTrang);
                res.add(cn);
            }

            ConnectDB.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
