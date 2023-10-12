/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author NGOC THUC
 */
public class PhieuNhapDTO {
    private String MaPN, MaNCC, TenTK, TinhTrang;
    private double TongTien;
    private Date NgayTao;

    public PhieuNhapDTO(String MaPN, String MaNCC, String TenTK, double TongTien, Date NgayTao, String TinhTrang) {
        this.MaPN = MaPN;
        this.MaNCC = MaNCC;
        this.TenTK = TenTK;
        this.TongTien = TongTien;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }
    
    
}
