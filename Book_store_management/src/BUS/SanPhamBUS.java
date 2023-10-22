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
public class SanPhamBUS {

    private final SanPhamDAO sanPhamDAO;

    public SanPhamBUS() {
        sanPhamDAO = new SanPhamDAO();
    }

    public ArrayList<SanPhamDTO> getAllSanPham() {
        return sanPhamDAO.selectAll();
    }

    public String getMaSPMax() {
        return sanPhamDAO.getMaSPMax();
    }

    public SanPhamDTO getHinhAnhandNamXB(String maSP) {
        return sanPhamDAO.getHinhAnhandNamXB(maSP);
    }

    public boolean deleteSanPhamByMaSP(int maSP) {
        return sanPhamDAO.deleteSPByMaSP(maSP);
    }

    public boolean addSanPham(SanPhamDTO sp) {
        return sanPhamDAO.addSanPham(sp);
    }

    public boolean updateSanPham(SanPhamDTO sp) {
        return sanPhamDAO.Update(sp);
    }

    public ArrayList<SanPhamDTO> findSPByTenSP(String temp) {
        return sanPhamDAO.findSPByTenSP(temp);
    }
}
