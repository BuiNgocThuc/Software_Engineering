/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import BUS.TheLoaiBUS;
import DTO.SanPhamDTO;
import DTO.TheLoaiDTO;
import Util.sharedFunction;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPham extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietChucNang
     */
    private int mouseX, mouseY;
    private int STT = -1, maSP = -1, soLuong = 0, namXB = 0;
    private String tenSP, tenTacGia, theLoai;
    private double donGia = 0;
    private byte[] hinhAnh = null;
    SanPhamBUS sanPhamBUS = new SanPhamBUS();
    TheLoaiBUS theLoaiBUS = new TheLoaiBUS();

    public ChiTietSanPham() {
        initComponents();
         sharedFunction.moveLayout(this, PannelOverview);
        AutoCompleteDecorator.decorate(listTheLoai);
    }

    public ChiTietSanPham(int STT, String maSP, String tenSP, String tacGia, String theloai, int soLuong, double donGia) { // sử dụng khi sửa sản phẩm
        initComponents();
        sharedFunction.moveLayout(this, PannelOverview);
        this.STT = STT;
        this.maSP =  Integer.parseInt(maSP.substring(2));
        this.tenSP = tenSP;
        this.tenTacGia = tacGia;
        this.theLoai = theloai;
        this.soLuong = soLuong;
        this.donGia = donGia;
        txtID.setText(maSP);
        txtTenSP.setText(tenSP);
        txtTacGia.setText(tacGia);
        txtSoLuong.setText(String.valueOf(soLuong));
        txtDonGia.setText(String.valueOf(donGia));
        // Gọi lớp BUS để lấy danh sách thể loại
        ArrayList<TheLoaiDTO> theLoaiList = theLoaiBUS.getAll();
        listTheLoai.addItem(theLoai);
        // Đổ dữ liệu từ danh sách thể loại vào JComboBox
        for (TheLoaiDTO tl : theLoaiList) {
            if (!tl.getTenTL().equals(theLoai)) {
                listTheLoai.addItem(tl.getTenTL());
            }
        }
        AutoCompleteDecorator.decorate(listTheLoai);
        // Lấy đối tượng SanPhamDTO từ SanPhamBUS
        SanPhamDTO sp = sanPhamBUS.getHinhAnhandNamXB(this.maSP);
        namXB = sp.getNamXB();
        txtNamXB.setText(String.valueOf(namXB));
        // Lấy hình ảnh từ SanPhamDTO
        hinhAnh = sp.getHinhAnh();
        if (hinhAnh != null) {
            ImageIcon imageIcon = new ImageIcon(hinhAnh);
            Image image = imageIcon.getImage();

            // Điều chỉnh kích thước hình ảnh để phù hợp với JLabel
            Image scaledImage = image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);

            // Tạo ImageIcon mới từ hình ảnh đã điều chỉnh kích thước
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

            // Đặt ImageIcon đã điều chỉnh kích thước vào JLabel
            lblImage.setIcon(scaledImageIcon);
        } else {
            lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("./../Assets/icon_24px/add.png")));

        }

    }

    public ChiTietSanPham(int STT, String maSP) { // Sử dụng khi thêm sản phẩm
        initComponents();
        moveFrame();
        this.STT = STT;
        txtID.setText(maSP); // gán mã sản phẩm tự động
        // Gọi lớp BUS để lấy danh sách thể loại
        ArrayList<TheLoaiDTO> theLoaiList = theLoaiBUS.getAll();
        // Đổ dữ liệu từ danh sách thể loại vào JComboBox
        for (TheLoaiDTO tl : theLoaiList) {
            listTheLoai.addItem(tl.getTenTL());  // gán danh sách thể loại tự động
        }
        AutoCompleteDecorator.decorate(listTheLoai);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        PannelOverview = new javax.swing.JPanel();
        btnHuy = new Components.ButtonRadius();
        btnLuu = new Components.ButtonRadius();
        lblImage = new javax.swing.JLabel();
        lblTheLoai1 = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblTacGia = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        lblTheLoai = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        lblNamXB = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        listTheLoai = new javax.swing.JComboBox<>();
        lblThongTinChiTiet = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PannelOverview.setBackground(new java.awt.Color(255, 255, 255));

        btnHuy.setBorder(null);
        btnHuy.setForeground(new java.awt.Color(134, 172, 218));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setFocusPainted(false);
        btnHuy.setFont(new java.awt.Font("Josefin Sans SemiBold", 1, 18)); // NOI18N
        btnHuy.setRadius(40);
        btnHuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHuyMouseExited(evt);
            }
        });
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnLuu.setBorder(null);
        btnLuu.setForeground(new java.awt.Color(134, 172, 218));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/fix.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setFocusPainted(false);
        btnLuu.setFont(new java.awt.Font("Josefin Sans SemiBold", 1, 18)); // NOI18N
        btnLuu.setRadius(40);
        btnLuu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLuuMouseExited(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/add.png"))); // NOI18N
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        lblTheLoai1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTheLoai1.setForeground(new java.awt.Color(148, 181, 222));
        lblTheLoai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTheLoai1.setText("Hình ảnh");

        panelContent.setBackground(new java.awt.Color(255, 255, 255));

        lblID.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(148, 181, 222));
        lblID.setText("ID Sản phẩm");

        lblTenSanPham.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblTenSanPham.setForeground(new java.awt.Color(148, 181, 222));
        lblTenSanPham.setText("Tên sản phẩm");

        txtTenSP.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        lblTacGia.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblTacGia.setForeground(new java.awt.Color(148, 181, 222));
        lblTacGia.setText("Tác giả");

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtTacGia.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTacGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTacGiaActionPerformed(evt);
            }
        });

        lblSoLuong.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(148, 181, 222));
        lblSoLuong.setText("Số lượng");

        lblTheLoai.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblTheLoai.setForeground(new java.awt.Color(148, 181, 222));
        lblTheLoai.setText("Thể loại");

        lblDonGia.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblDonGia.setForeground(new java.awt.Color(148, 181, 222));
        lblDonGia.setText("Đơn giá");

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        txtNamXB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNamXB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));

        lblNamXB.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblNamXB.setForeground(new java.awt.Color(148, 181, 222));
        lblNamXB.setText("Năm xuất bản");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtSoLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        listTheLoai.setBackground(new java.awt.Color(255, 255, 255));
        listTheLoai.setEditable(true);
        listTheLoai.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        listTheLoai.setForeground(new java.awt.Color(0, 0, 0));
        listTheLoai.setBorder(null);
        listTheLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listTheLoai.setOpaque(true);
        listTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTheLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listTheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTacGia)
                    .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PannelOverviewLayout = new javax.swing.GroupLayout(PannelOverview);
        PannelOverview.setLayout(PannelOverviewLayout);
        PannelOverviewLayout.setHorizontalGroup(
            PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelOverviewLayout.createSequentialGroup()
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelOverviewLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PannelOverviewLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblTheLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PannelOverviewLayout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PannelOverviewLayout.setVerticalGroup(
            PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelOverviewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTheLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        lblThongTinChiTiet.setBackground(new java.awt.Color(134, 172, 218));
        lblThongTinChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblThongTinChiTiet.setForeground(new java.awt.Color(255, 255, 255));
        lblThongTinChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setText("Thông tin chi tiết");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PannelOverview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(PannelOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnHuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseEntered
        // TODO add your handling code here:
        // Đặt con trỏ thành biểu tượng bàn tay khi di vào
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnHuyMouseEntered

    private void btnHuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseExited
        // TODO add your handling code here:
        // Đặt lại con trỏ thành con trỏ mặc định khi di ra
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnHuyMouseExited

    private void btnLuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseEntered
        // TODO add your handling code here:
        // Đặt con trỏ thành biểu tượng bàn tay khi di vào
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLuuMouseEntered

    private void btnLuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseExited
        // TODO add your handling code here:
        // Đặt lại con trỏ thành con trỏ mặc định khi di ra
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLuuMouseExited

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if (maSP==-1) {
            ThemSanPham();
        } else {
            SuaSanPham();
        }

    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacGiaActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        dispose(); // Đóng frame
    }//GEN-LAST:event_btnHuyActionPerformed

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();

            // Hiển thị hình ảnh trên JLabel với kích thước của JLabel
            ImageIcon imageIcon = scaleImage(imagePath, lblImage.getWidth(), lblImage.getHeight());
            lblImage.setIcon(imageIcon);

            try {
                try (FileInputStream fileInputStream = new FileInputStream(selectedFile)) {
                    hinhAnh = new byte[(int) selectedFile.length()];
                    fileInputStream.read(hinhAnh);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblImageMouseClicked

    private void listTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listTheLoaiActionPerformed

    // Hàm thay đổi kích thước hình ảnh sao cho vừa với JLabel
    private static ImageIcon scaleImage(String imageData, int width, int height) {
        if (imageData == null) {
//          lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("./../Assets/icon_24px/add.png")));
            return null;
        }

        Image image = new ImageIcon(imageData).getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        return new ImageIcon(scaledImage);
    }

    private void ThemSanPham() {
        String MaSP = txtID.getText();
        tenSP = txtTenSP.getText();
        // Lấy giá trị được chọn từ JComboBox
        Object selectedItem = listTheLoai.getSelectedItem();
        // Ép kiểu và gán giá trị vào một chuỗi
        String tenTL = (String) selectedItem;
        tenTacGia = txtTacGia.getText();
        namXB = Integer.parseInt(txtNamXB.getText());
        soLuong = Integer.parseInt(txtSoLuong.getText());
        donGia = Double.parseDouble(txtDonGia.getText());
        int maTL = theLoaiBUS.getMaTLbyTenTL(tenTL);

        if (!tenSP.isEmpty()) {
            SanPhamDTO sp = new SanPhamDTO(maTL, tenSP, tenTacGia, rootPaneCheckingEnabled, donGia, soLuong, namXB, hinhAnh);
            boolean result = sanPhamBUS.addSanPham(sp);
            if (result) {
                // Thêm thể loại vào bảng
                // Gửi thông tin thể loại mới về frame gốc
                SanPhamGUI.addSanPhamTable(sp, STT, tenTL,MaSP);
                dispose();
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm sản phẩm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void SuaSanPham() {
        tenSP = txtTenSP.getText();
        // Lấy giá trị được chọn từ JComboBox
        Object selectedItem = listTheLoai.getSelectedItem();
        // Ép kiểu và gán giá trị vào một chuỗi
        theLoai = (String) selectedItem;
        tenTacGia = txtTacGia.getText();
        namXB = Integer.parseInt(txtNamXB.getText());
        soLuong = Integer.parseInt(txtSoLuong.getText());
        donGia = Double.parseDouble(txtDonGia.getText());
        int maTL = theLoaiBUS.getMaTLbyTenTL(theLoai);
        if (!tenSP.isEmpty()) {
            System.out.println(maSP);
            SanPhamDTO sp = new SanPhamDTO(maSP, maTL, tenSP, tenTacGia, rootPaneCheckingEnabled, donGia, soLuong, namXB);
            boolean result = sanPhamBUS.updateSanPham(sp);
            if (result) {
                // Thêm sản phẩm vào bảng
                // Gửi thông tin thể loại mới về frame gốc
                SanPhamGUI.updateSanPhamTable(sp, STT, theLoai);
                dispose();
                JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi sửa sản phẩm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void moveFrame() {

        PannelOverview.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        PannelOverview.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });
        lblThongTinChiTiet.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getXOnScreen() - getLocation().x;
                mouseY = e.getYOnScreen() - getLocation().y;
            }
        });

        lblThongTinChiTiet.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - mouseX;
                int y = e.getYOnScreen() - mouseY;
                setLocation(x, y);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelOverview;
    private Components.ButtonRadius btnHuy;
    private Components.ButtonRadius btnLuu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNamXB;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JLabel lblTheLoai1;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JComboBox<String> listTheLoai;
    private javax.swing.JPanel panelContent;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
