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
    private String MaTL, TenTL;
    private Boolean TinhTrang;

    public TheLoaiDTO(String TenTL, Boolean TinhTrang) {
        this.TenTL = TenTL;
        this.TinhTrang = TinhTrang;
    }

    public TheLoaiDTO(String MaTL, String TenTL, Boolean TinhTrang) {
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

    public Boolean getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(Boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
