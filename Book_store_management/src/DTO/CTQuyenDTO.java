/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGOC THUC
 */
public class CTQuyenDTO {
    private String MaCTQ, MaQuyen, MaCN, HanhDong, TinhTrang;

    public CTQuyenDTO(String MaCTQ, String MaQuyen, String MaCN, String HanhDong, String TinhTrang) {
        this.MaCTQ = MaCTQ;
        this.MaQuyen = MaQuyen;
        this.MaCN = MaCN;
        this.HanhDong = HanhDong;
        this.TinhTrang = TinhTrang;
    }

    public String getMaCTQ() {
        return MaCTQ;
    }

    public void setMaCTQ(String MaCTQ) {
        this.MaCTQ = MaCTQ;
    }

    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(String MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getMaCN() {
        return MaCN;
    }

    public void setMaCN(String MaCN) {
        this.MaCN = MaCN;
    }

    public String getHanhDong() {
        return HanhDong;
    }

    public void setHanhDong(String HanhDong) {
        this.HanhDong = HanhDong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
