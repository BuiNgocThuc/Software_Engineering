/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhanQuyenDAO;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTPhanQuyenBUS {
    CTPhanQuyenDAO ctpqDAO = new CTPhanQuyenDAO();
    
    public ArrayList<String> getPerByRole(String MaQuyen) {
        return ctpqDAO.getPerByRole(MaQuyen);
    }
}
