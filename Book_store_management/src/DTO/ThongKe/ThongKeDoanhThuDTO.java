/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.ThongKe;

/**
 *
 * @author ASUS
 */
public class ThongKeDoanhThuDTO {
    private final  int thoiGian;
    private final long von;
    private final  long doanhThu;
    private final  long loiNhuan;

    public ThongKeDoanhThuDTO(int thoiGian,  long von, long doanhThu, long loiNhuan) {
        this.thoiGian = thoiGian;
        this.von = von;
        this.doanhThu = doanhThu;
        this.loiNhuan = loiNhuan;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public long getVon() {
        return von;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public long getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public String toString() {
        return "ThongKeDoanhThuDTO{" + "thoiGian=" + thoiGian + ", von=" + von + ", doanhThu=" + doanhThu + ", loiNhuan=" + loiNhuan + '}';
    }

  
    
}
