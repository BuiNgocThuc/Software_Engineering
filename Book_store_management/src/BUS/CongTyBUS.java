/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CongTyDAO;
import DTO.CongTyDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NGOC THUC
 */
public class CongTyBUS {

    CongTyDAO ctyDao = new CongTyDAO();

    public ArrayList<CongTyDTO> selectAll() {
        return ctyDao.selectAll();
    }

    public boolean insertCongTy(CongTyDTO cty) {
        int check = ctyDao.addCongTy(cty);
        if (check != -1) {
            JOptionPane.showMessageDialog(null, "Thêm Công ty thành công");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Thêm Công ty thất bại");
            return false;
        }
    }
}
