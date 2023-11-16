/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ThongKeDAO;
import DTO.ThongKe.ThongKeDoanhThuDTO;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author NGOC THUC
 */
public class ThongKeBUS {

    private final ThongKeDAO thongKeDAO;

    public ThongKeBUS() {
        thongKeDAO = new ThongKeDAO();
    }

    public ArrayList<ThongKeDoanhThuDTO> thongKeDoanhThuTuNamDenNam(int namBatDau, int namKetThuc) {
        return thongKeDAO.thongKeDoanhThuTuNamDenNam(namBatDau, namKetThuc);
    }

    public ArrayList<ThongKeDoanhThuDTO> thongKeDoanhThuTheoNam() {
        return thongKeDAO.thongKeDoanhThuTheoNam();
    }

    public ArrayList<ThongKeDoanhThuDTO> thongKeDoanhThuTheoThang(int nam) {
        return thongKeDAO.thongKeDoanhThuTheoThang(nam);
    }

    public ArrayList<ThongKeDoanhThuDTO> thongKeDoanhThuTungNgayTrongThang(int nam, int thang) {
        return thongKeDAO.thongKeDoanhThuTungNgayTrongThang(nam, thang);
    }

    public Set<Integer> getDistinctYears() {
        return thongKeDAO.getDistinctYears();
    }
}
