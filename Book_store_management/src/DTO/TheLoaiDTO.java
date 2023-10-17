/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGOC THUC
 */
public class TheLoaiDTO {
    private String MaTL, TenTL, TinhTrang;

    public TheLoaiDTO(String TenTL, String TinhTrang) {
        this.TenTL = TenTL;
        this.TinhTrang = TinhTrang;
    }

    public TheLoaiDTO(String MaTL, String TenTL, String TinhTrang) {
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.TinhTrang = TinhTrang;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
