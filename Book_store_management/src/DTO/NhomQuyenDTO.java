/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGOC THUC
 */
public class NhomQuyenDTO {
    private String MaNQ, TenNQ, MoTa, TinhTrang;

    public NhomQuyenDTO(String MaNQ, String TenNQ, String MoTa, String TinhTrang) {
        this.MaNQ = MaNQ;
        this.TenNQ = TenNQ;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
    }

    public String getMaNQ() {
        return MaNQ;
    }

    public void setMaNQ(String MaNQ) {
        this.MaNQ = MaNQ;
    }

    public String getTenNQ() {
        return TenNQ;
    }

    public void setTenNQ(String TenNQ) {
        this.TenNQ = TenNQ;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
