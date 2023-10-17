/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.CongTyDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CongTyDAO {

    public ArrayList<CongTyDTO> selectAll() {
        ArrayList<CongTyDTO> ketQua = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM NhaCungCap";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String MaNCC = rs.getNString("MaNCC");
                String TenNCC = rs.getNString("TenNCC");
                String SDT = rs.getNString("SDT");
                String DiaChi = rs.getNString("DiaChi");
                String TinhTrang = rs.getNString("TinhTrang");

                CongTyDTO nv = new CongTyDTO(MaNCC, TenNCC, SDT, DiaChi, TinhTrang);
                ketQua.add(nv);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
