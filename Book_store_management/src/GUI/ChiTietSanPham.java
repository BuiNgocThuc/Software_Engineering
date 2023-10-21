/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Cursor;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPham extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietChucNang
     */
    private int STT = -1;
    private String maSP, tenSP,tenTacGia,theLoai,hinhAnh;
    private int soLuong;
    private double donGia;

    public ChiTietSanPham() {
        initComponents();
    }

    public ChiTietSanPham(int STT,String maSP, String tenSP, String tacGia, String theLoai,String hinhAnh, int soLuong, double donGia) {
         initComponents();
        this.STT = STT;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenTacGia = tacGia;
        this.theLoai = theLoai;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.donGia = donGia;
        txtID.setText(maSP);
        txtTenSP.setText(tenSP);
        txtTacGia.setText(tacGia);
        txtITheLoai.setText(theLoai);
        txtSoLuong.setText(String.valueOf(soLuong));
        txtDonGia.setText(String.valueOf(donGia));
    }

    public ChiTietSanPham(int STT,String maSP) {
         initComponents();
        this.STT = STT;
        this.maSP = maSP;
        txtID.setText(maSP);
        
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
        PannelOverview = new javax.swing.JPanel();
        btnHuy = new Components.ButtonRadius();
        btnLuu = new Components.ButtonRadius();
        lblImage = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblTacGia = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtITheLoai = new javax.swing.JTextField();
        lblTheLoai = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lblTheLoai1 = new javax.swing.JLabel();
        lblThongTinChiTiet = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

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

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtSoLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        txtITheLoai.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtITheLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtITheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtITheLoaiActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtITheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTacGia)
                    .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtITheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        lblTheLoai1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTheLoai1.setForeground(new java.awt.Color(148, 181, 222));
        lblTheLoai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTheLoai1.setText("Hình ảnh");

        javax.swing.GroupLayout PannelOverviewLayout = new javax.swing.GroupLayout(PannelOverview);
        PannelOverview.setLayout(PannelOverviewLayout);
        PannelOverviewLayout.setHorizontalGroup(
            PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelOverviewLayout.createSequentialGroup()
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PannelOverviewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PannelOverviewLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblTheLoai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PannelOverviewLayout.setVerticalGroup(
            PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelOverviewLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelOverviewLayout.createSequentialGroup()
                        .addComponent(lblTheLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(PannelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblThongTinChiTiet.setBackground(new java.awt.Color(134, 172, 218));
        lblThongTinChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongTinChiTiet.setForeground(new java.awt.Color(238, 242, 250));
        lblThongTinChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setText("Thông tin chi tiết");
        lblThongTinChiTiet.setAutoscrolls(true);
        lblThongTinChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PannelOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PannelOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacGiaActionPerformed

    private void txtITheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtITheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtITheLoaiActionPerformed

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
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JLabel lblTheLoai1;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JPanel panelContent;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtITheLoai;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
