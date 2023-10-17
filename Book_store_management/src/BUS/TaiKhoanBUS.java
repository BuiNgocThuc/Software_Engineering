/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class TaiKhoanBUS {
    TaiKhoanDAO tkDAO = new TaiKhoanDAO();
    
    public ArrayList<TaiKhoanDTO> selectAll() {
        return tkDAO.selectAll();
    }
}
