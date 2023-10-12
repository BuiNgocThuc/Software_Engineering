/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.HoaDonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NGOC THUC
 */
public class HoaDonDAO {
    public ArrayList<HoaDonDTO> selectAll(){
        ArrayList<HoaDonDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String MaHD = rs.getString("MaHD");
                String TenTK = rs.getNString("TenTK");
                Date NgayTao = rs.getDate("NgayTao");
                double TongTien = rs.getFloat("TongTien");

                HoaDonDTO pn = new HoaDonDTO(MaHD, TenTK, TongTien, NgayTao);
                ketQua.add(pn);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
