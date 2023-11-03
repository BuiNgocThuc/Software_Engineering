/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.NhanVienDTO;
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
public class NhanVienDAO {
    public ArrayList<NhanVienDTO> selectAll() {
        ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM NhanVien where TinhTrang=N'Đang làm việc'";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String MaNV = rs.getNString("MaNV");
                String TenNV = rs.getNString("TenNV");
                String SDT = rs.getNString("SDT");
                String GioiTinh = rs.getNString("GioiTinh");
                String DiaChi = rs.getNString("DiaChi");
                String Email = rs.getNString("Email");
                String TinhTrang = rs.getNString("TinhTrang");

                NhanVienDTO nv = new NhanVienDTO(MaNV, TenNV, SDT, GioiTinh, DiaChi, Email, TinhTrang);
                ketQua.add(nv);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    public int deleteNhanVien(String idnv){
        int ketqua=-1;
        Connection conn=null;
        try {
            conn = ConnectDB.getConnection();
            String sql = "update NhanVien set TinhTrang=N'Không làm việc' where MaNV=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setNString(1, idnv);
            ketqua=st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return ketqua;
    }
}
