/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGOC THUC
 */
public class SanPhamDTO {

    private String MaSP, MaTL, TenSP, TacGia;
    private boolean TinhTrang;
    private double DonGia;
    private int SoLuong, NamXB;
    private byte[] HinhAnh;

    public SanPhamDTO(String MaSP, String MaTL, String TenSP,  byte[] HinhAnh, String TacGia, boolean TinhTrang, double DonGia, int SoLuong, int NamXB) {
        this.MaSP = MaSP;
        this.MaTL = MaTL;
        this.TenSP = TenSP;
        this.HinhAnh = HinhAnh;
        this.TacGia = TacGia;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.NamXB = NamXB;
    }

    public SanPhamDTO( byte[] HinhAnh, int NamXB) {
        this.HinhAnh = HinhAnh;
        this.NamXB = NamXB;
    }

    public SanPhamDTO(String MaTL, String TenSP, String TacGia, boolean TinhTrang, double DonGia, int SoLuong, int NamXB, byte[] HinhAnh) {
        this.MaTL = MaTL;
        this.TenSP = TenSP;
        this.TacGia = TacGia;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.NamXB = NamXB;
        this.HinhAnh = HinhAnh;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public byte[]  getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public boolean getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }

}
