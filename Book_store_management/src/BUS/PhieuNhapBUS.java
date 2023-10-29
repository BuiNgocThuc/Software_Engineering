/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class PhieuNhapBUS {
    SanPhamDAO spDAO = new SanPhamDAO();
    public ArrayList<SanPhamDTO>  loadSanPham() {
        return spDAO.selectAll();
    }
}
