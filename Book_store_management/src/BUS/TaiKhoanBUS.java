/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhomQuyenDAO;
import DAO.TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import GUI.DangNhapGUI;
import GUI.MainFrameGUI;
import GUI.MatKhauCu;
import GUI.MatKhauMoiGUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOC THUC
 */
public class TaiKhoanBUS {

    TaiKhoanDAO tkDAO = new TaiKhoanDAO();
    NhomQuyenDAO nqDAO = new NhomQuyenDAO();
    private String tenTK, matKhau;
    private static TaiKhoanDTO currentAcc;

    public ArrayList<TaiKhoanDTO> selectAll() {
        return tkDAO.selectAll();
    }

    public static TaiKhoanDTO getCurrentAcc() {
        return currentAcc;
    }

    public void createTableAccount(DefaultTableModel modelTaiKhoan) {
        ArrayList<TaiKhoanDTO> listAccount = selectAll();
        modelTaiKhoan.setRowCount(0);
        int STT = 1;
        for (TaiKhoanDTO acc : listAccount) {
            String MaTK = "TK" + acc.getMaTK();
            String TenTK = acc.getTenTK();
            String MatKhau = acc.getMatKhau();
            String TenNQ = nqDAO.selectNameByID(acc.getMaQuyen());
            String NgayTao = acc.getNgayTao().toString();
            Object[] row = {STT++, MaTK, TenTK, MatKhau, TenNQ, NgayTao};
            modelTaiKhoan.addRow(row);
        }
    }

    public TaiKhoanDTO selectByUsername(String username) {
        return tkDAO.selectByUsername(username);
    }

    boolean comparePassword(String currentPass, String inputPass) {
        return currentPass.equals(inputPass);
    }

    public void PhanQuyen(ArrayList<String> lisrPer, MainFrameGUI layout) {
        layout.getLblBanHang().setVisible(false);
        layout.getLblCongTy().setVisible(false);
        layout.getLblHoaDon().setVisible(false);
        layout.getLblNhanVien().setVisible(false);
        layout.getLblNhapHang().setVisible(false);
        layout.getLblPhanQuyen().setVisible(false);
        layout.getLblPhieuNhap().setVisible(false);
        layout.getLblSanPham().setVisible(false);
        layout.getLblTaiKhoan().setVisible(false);
        layout.getLblThongKe().setVisible(false);

        for (String per : lisrPer) {
            switch (per) {
                case "1" ->
                    layout.getLblTaiKhoan().setVisible(true);
                case "2" ->
                    layout.getLblPhanQuyen().setVisible(true);
                case "3" ->
                    layout.getLblSanPham().setVisible(true);
                case "4" ->
                    layout.getLblNhapHang().setVisible(true);
                case "5" ->
                    layout.getLblBanHang().setVisible(true);
                case "6" ->
                    layout.getLblPhieuNhap().setVisible(true);
                case "7" ->
                    layout.getLblHoaDon().setVisible(true);
                case "8" ->
                    layout.getLblNhanVien().setVisible(true);
                case "9" ->
                    layout.getLblCongTy().setVisible(true);
                case "10" ->
                    layout.getLblThongKe().setVisible(true);
            }
        }
    }
    public String selectNameStaff(String TenTK) {
        return tkDAO.selectStaffByID(TenTK);
    }

    public void displayName(TaiKhoanDTO staff, MainFrameGUI layout) {
        String tenNV = selectNameStaff(staff.getTenTK());
        String chucVu = tkDAO.selectRoleByID(staff.getMaQuyen());

        layout.getLblName().setText(tenNV);
        layout.getLblRole().setText(chucVu);
    }

    public void DangNhap(DangNhapGUI acc) {
        tenTK = acc.getTxtUsername().getText();
        matKhau = acc.getTxtPassword().getText();

        currentAcc = tkDAO.selectByUsername(tenTK);
        if (currentAcc == null) {
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập");
            return;
        } else {
            String trangThai = currentAcc.getTinhTrang();
            if (trangThai == "0") {
                JOptionPane.showMessageDialog(null, "Tài khoản bị vô hiệu hóa ");
                return;
            } else {
                String currentPass = currentAcc.getMatKhau();
                if (!comparePassword(currentPass, matKhau)) {
                    JOptionPane.showMessageDialog(null, "Sai mật khẩu");
                    return;
                } else {
                    String maQuyen = currentAcc.getMaQuyen();
                    ArrayList<String> lisrPer = new CTPhanQuyenBUS().getPerByRole(maQuyen);
                    MainFrameGUI layout = new MainFrameGUI();
                    layout.setVisible(true);
                    displayName(currentAcc, layout);
                    //PhanQuyen(lisrPer, layout);
                    acc.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                    System.out.println(currentAcc.getTenTK());
                }
            }
        }
    }

    public void checkOldPass(MatKhauCu oldPass) {
        String txtOldPass = oldPass.getTfMatkhaucu().getText();
        boolean checkPass = currentAcc.getMatKhau().equals(txtOldPass);
        if (checkPass) {
            MatKhauMoiGUI newPass = new MatKhauMoiGUI();
            newPass.setVisible(true);
            oldPass.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác!");
        }
    }

    public void DoiMatKhau(MatKhauMoiGUI newPass) {
        String txtNewPass = newPass.getTxtNewPass().getText();
        String txtConfirmPass = newPass.getTxtConfirmPass().getText();
        if (!txtNewPass.equals(txtConfirmPass)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu xác nhận không trùng!");
        } else {
            boolean changePass = tkDAO.changePassword(txtNewPass, currentAcc.getTenTK());
            if (!changePass) {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại!");
            } else {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
                newPass.dispose();
            }
        }
    }

    public boolean XoaTaiKhoan(int ID) {
        return tkDAO.Xoa(ID) != 0;
    }


    
}
