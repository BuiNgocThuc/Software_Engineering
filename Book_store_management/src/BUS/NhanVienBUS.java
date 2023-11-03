/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NGOC THUC
 */
public class NhanVienBUS {

    public NhanVienBUS() {
    }
    
    NhanVienDAO nvDao=new NhanVienDAO();
    public ArrayList<NhanVienDTO> selectAll(){
        return nvDao.selectAll();
    }
    public boolean deleteNhanVien(String idnv){
        int check = nvDao.deleteNhanVien(idnv);
        if (check != -1) {
            JOptionPane.showMessageDialog(null, "Xoá Công ty thành công");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Xoá Công ty thất bại");
            return false;
        }
    }
}
