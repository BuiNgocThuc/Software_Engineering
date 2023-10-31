/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuNhapDAO;
import DAO.SanPhamDAO;
import DTO.CTPhieuNhapDTO;
import DTO.CongTyDTO;
import DTO.PhieuNhapDTO;
import DTO.SanPhamDTO;
import GUI.NhapHangGUI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author NGOC THUC
 */
public class PhieuNhapBUS {

    SanPhamDAO spDAO = new SanPhamDAO();
    PhieuNhapDAO pnDAO = new PhieuNhapDAO();
    TaiKhoanBUS tkBUS = new TaiKhoanBUS();
    CTPhieuNhapBUS ctpnBUS = new CTPhieuNhapBUS();

    public ArrayList<SanPhamDTO> loadSanPham() {
        return spDAO.selectAll();
    }

    public void NhapHang(NhapHangGUI cartImport) {
        String nameNCC = cartImport.getCbCongTy().getSelectedItem().toString();
        int IDNCC = pnDAO.queryByNameSupplier(nameNCC);
        String TenTK = tkBUS.getCurrentAcc().getTenTK();
        String NgayTao = cartImport.getTfNgaytao().getText();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = new java.util.Date();
        try {
            startDate = df.parse(NgayTao);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        double TongTien = Double.parseDouble(cartImport.getTfTongtien().getText());

        PhieuNhapDTO pn = new PhieuNhapDTO(TenTK, IDNCC + "", TenTK, TongTien, startDate, "1");
        boolean res = pnDAO.Them(pn);
           
        if (res) {
            // lấy chi tiết phiếu nhập
            ArrayList<CTPhieuNhapDTO> listSPNhap = getListCTPN(cartImport);
            boolean resCT, resSP = false;
            boolean success = false;
            for (CTPhieuNhapDTO ctpn : listSPNhap) {
                resCT = ctpnBUS.TaoCTPhieuNhap(ctpn);
                if (!resCT) {
                    cartImport.displayErrorMessage("lỗi nhập hàng " + ctpn.getMaSP());
                } else {
                    resSP = ctpnBUS.CapNhatSoLuong(ctpn.getMaSP(), ctpn.getSoLuong(), ctpn.getDonGia());
                    if(resSP) {
                        success = true;                       
                    }
                }
            }
            if(success) {
                JOptionPane.showMessageDialog(cartImport, "Nhập hàng thành công!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }

    public ArrayList<CTPhieuNhapDTO> getListCTPN(NhapHangGUI cartImport) {
        ArrayList<CTPhieuNhapDTO> listID = new ArrayList<>();
        String IDPN = cartImport.getTfIDHoadon().getText().substring(2);
        int rows = cartImport.getTableChitiet().getModel().getRowCount();
        for (int i = 0; i < rows; i++) {
            String ID = cartImport.getTableChitiet().getModel().getValueAt(i, 0).toString().substring(2);
            int quantity = Integer.parseInt(cartImport.getTableChitiet().getModel().getValueAt(i, 2).toString());
            int ThanhTien = Integer.parseInt(cartImport.getTableChitiet().getModel().getValueAt(i, 3).toString());
            int DonGia = ThanhTien / quantity;
            CTPhieuNhapDTO ctpn = new CTPhieuNhapDTO(IDPN, ID, DonGia, quantity);
            listID.add(ctpn);
        }
        return listID;
    }

    public void queryListSupplier(NhapHangGUI cartImport) {
        ArrayList<CongTyDTO> listCty = pnDAO.querySupplier();

        for (CongTyDTO cty : listCty) {
            cartImport.getCbCongTy().addItem(cty.getTenNCC());
        }

    }

    public void createCart(NhapHangGUI cartImport) {
//        String IDNV = tkBUS.getCurrentAcc().getTenTK();
        String IDPN = "PN00" + (pnDAO.selectLastID() + 1);

        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();

        // Định dạng ngày theo "dd/MM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);

        cartImport.getTfIDHoadon().setText(IDPN);
        String nameNV = tkBUS.selectNameStaff(tkBUS.getCurrentAcc().getTenTK());

        cartImport.getTfIDNhanvien().setText(nameNV); // sửa sau
        cartImport.getTfNgaytao().setText(formattedDate);

        cartImport.getTfIDHoadon().setFocusable(false);
        cartImport.getTfIDNhanvien().setFocusable(false);
        cartImport.getTfNgaytao().setFocusable(false);

        queryListSupplier(cartImport);
    }

    public void loadData(NhapHangGUI cartImport, int row_index) {
        cartImport.getTfIDSanPham().setText(cartImport.getTableSanPham().getValueAt(row_index, 1).toString());
        cartImport.getTfTenSanpham().setText(cartImport.getTableSanPham().getValueAt(row_index, 2).toString());
        cartImport.getTfTenTacgia().setText(cartImport.getTableSanPham().getValueAt(row_index, 3).toString());
        cartImport.getTfTheloai().setText(cartImport.getTableSanPham().getValueAt(row_index, 4).toString());
        cartImport.getTfDongia().setText(cartImport.getTableSanPham().getValueAt(row_index, 6).toString());
        cartImport.getTfSoluong().setText("");
        cartImport.getTfSoluong().requestFocus();
    }

    public void loadDataFromCart(NhapHangGUI cartImport, int row_index) {
        String idProduct = cartImport.getTableChitiet().getValueAt(row_index, 0).toString();
//        String nameProduct = cartImport.getTableChitiet().getValueAt(row_index, 1).toString();
        int newQuantity = Integer.parseInt(cartImport.getTableChitiet().getValueAt(row_index, 2).toString());
        int newPrice = Integer.parseInt(cartImport.getTableChitiet().getValueAt(row_index, 3).toString()) / newQuantity;

        int rowCount = cartImport.getTableSanPham().getModel().getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object value = cartImport.getTableSanPham().getModel().getValueAt(i, 1);

            if (idProduct.equals(value)) {
                cartImport.getTfIDSanPham().setText(cartImport.getTableSanPham().getValueAt(i, 1).toString());
                cartImport.getTfTenSanpham().setText(cartImport.getTableSanPham().getValueAt(i, 2).toString());
                cartImport.getTfTenTacgia().setText(cartImport.getTableSanPham().getValueAt(i, 3).toString());
                cartImport.getTfTheloai().setText(cartImport.getTableSanPham().getValueAt(i, 4).toString());
                cartImport.getTfDongia().setText(newPrice + "");
                cartImport.getTfSoluong().setText(newQuantity + "");
                cartImport.getTfSoluong().requestFocus();
                return;
            }
        }
    }

    public void createTableProduct(DefaultTableModel modelSanPham) {
        ArrayList<SanPhamDTO> listSanPham = loadSanPham();
        modelSanPham.setRowCount(0);
        int STT = 1;
        for (SanPhamDTO sanPham : listSanPham) {
            int maSP = sanPham.getMaSP();
            String maSPtext = String.format("SP%02d", maSP);
            String tenTL = sanPham.getTenTL();
            String tenSanPham = sanPham.getTenSP();
            String tenTacGia = sanPham.getTacGia();
            int soLuong = sanPham.getSoLuong();
            double donGia = sanPham.getDonGia();
            Object[] row = {STT++, maSPtext, tenSanPham, tenTacGia, tenTL, soLuong, donGia};
            modelSanPham.addRow(row);
        }
    }

    public void loadInfoProduct(NhapHangGUI cartImport) {

    }
}
