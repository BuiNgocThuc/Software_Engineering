/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhapDAO;
import DTO.CTPhieuNhapDTO;
import GUI.ChiTietPhieuNhap;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class CTPhieuNhapBUS {
    CTPhieuNhapDAO ctpnDAO = new CTPhieuNhapDAO();
    public boolean TaoCTPhieuNhap(CTPhieuNhapDTO ctpn) {
        return ctpnDAO.Them(ctpn);
    }
    
    public boolean CapNhatSoLuong(String MaSP, int SoLuong, double DonGia) {
        return ctpnDAO.updateSP(MaSP, SoLuong, DonGia);
    }
}
