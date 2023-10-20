/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TheLoaiDAO;
import DTO.TheLoaiDTO;

import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class TheLoaiBUS {

    private final TheLoaiDAO theLoaiDAO;

    public TheLoaiBUS() {
        theLoaiDAO = new TheLoaiDAO(); // Khởi tạo lớp DAO
    }
    // Hàm load dữ liệu từ DAO và trả về một danh sách các thể loại

    public ArrayList<TheLoaiDTO> getAll() {
        return theLoaiDAO.selectAll();
    }

    // 
    public String getMaTheLoaiMax() {
        return theLoaiDAO.getMaTheLoaiMax();
    }

    public TheLoaiDTO findTheLoaiByMaTL(String maTL) {
        return theLoaiDAO.findTheLoaiByMaTL(maTL);
    }

    public ArrayList<TheLoaiDTO> findTheLoaiByTenTL(String tenTL) {
        return theLoaiDAO.findTheLoaiByTenTL(tenTL);
    }

    public boolean deleteTheLoaiByMaTL(int maTL) {
        return theLoaiDAO.deleteTheLoaiByMaTL(maTL);
    }

    public boolean addTheLoai(TheLoaiDTO tl) {
        return theLoaiDAO.addTheLoai(tl);
    }

    public boolean updateTheLoai(TheLoaiDTO tl) {
        return theLoaiDAO.Update(tl);
    }
}
