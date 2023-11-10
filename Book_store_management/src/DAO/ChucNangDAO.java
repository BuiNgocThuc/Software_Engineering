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

    public ArrayList<ChucNangDTO> selectStateRole() {
        ArrayList<ChucNangDTO> res = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM ChucNang WHERE TinhTrang <> 0";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int maCN = rs.getInt("MaCN");
                String tenCN = rs.getNString("TenCN");
                boolean them = rs.getBoolean("Them");
                boolean xoa = rs.getBoolean("Xoa");
                boolean sua = rs.getBoolean("Sua");
                boolean truyCap = rs.getBoolean("Doc");
                ChucNangDTO cn = new ChucNangDTO(tenCN, maCN, them,sua,xoa,truyCap);
                res.add(cn);
            }

            ConnectDB.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    
    public int getCurrentID() {
        int res = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT TOP 1 MaCN\n"
                    + "FROM ChucNang\n"
                    + "ORDER BY MaCN DESC";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int maCN = rs.getInt("MaCN");
                res = maCN;
            }

            ConnectDB.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public ArrayList<ChucNangDTO> selectAll() {
        ArrayList<ChucNangDTO> res = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM ChucNang WHERE TinhTrang <> 0";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int maCN = rs.getInt("MaCN");
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

    public int Them(ChucNangDTO cn) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO ChucNang(MaCN, TenCN, TinhTrang) "
                    + " VALUES(?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cn.getMaCN());
            pst.setString(2, cn.getTenCN());
            pst.setString(3, cn.getTinhTrang());

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Sua(ChucNangDTO cn) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE ChucNang "
                    + " SET TenCN=?"
                    + " WHERE MaCN=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cn.getTenCN());
            pst.setInt(2, cn.getMaCN());

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int Xoa(ChucNangDTO cn) {
        int ketQua = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "DELETE FROM ChucNang "
                    + " WHERE MaCN=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cn.getMaCN());

            ketQua = pst.executeUpdate();

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
}
