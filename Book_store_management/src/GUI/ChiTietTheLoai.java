/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.TheLoaiBUS;
import DTO.TheLoaiDTO;
import Util.sharedFunction;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ChiTietTheLoai extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietChucNang
     */
    private int mouseX, mouseY;
    private int STT = -1;
    private int MaTL = -1;
    private String TenTL;

    // dùng khi sửa thể loại
    public ChiTietTheLoai(int STT, String MaTL, String TenTL) {
        initComponents();
        sharedFunction.moveLayout(this, PanelOverview);
        this.STT = STT;
        this.MaTL = Integer.parseInt(MaTL.substring(2));
        this.TenTL = TenTL;
        txtID.setText(MaTL);
        txtName.setText(TenTL);
    }

    // dùng khi thêm thể loại
    public ChiTietTheLoai(int STT, String MaTL) {
        initComponents();
        sharedFunction.moveLayout(this, PanelOverview);
        this.STT = STT;
        txtID.setText(MaTL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelOverview = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblThongTinChiTiet = new javax.swing.JLabel();
        lblTenTheLoai = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnHuy = new Components.ButtonRadius();
        btnLuu = new Components.ButtonRadius();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelOverview.setBackground(new java.awt.Color(255, 255, 255));

        lblID.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(148, 181, 222));
        lblID.setText("ID Thể loại");

        lblThongTinChiTiet.setBackground(new java.awt.Color(134, 172, 218));
        lblThongTinChiTiet.setFont(new java.awt.Font("Josefin Sans SemiBold", 1, 18)); // NOI18N
        lblThongTinChiTiet.setForeground(new java.awt.Color(238, 242, 250));
        lblThongTinChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setText("Thông tin chi tiết");
        lblThongTinChiTiet.setAutoscrolls(true);
        lblThongTinChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setOpaque(true);

        lblTenTheLoai.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        lblTenTheLoai.setForeground(new java.awt.Color(148, 181, 222));
        lblTenTheLoai.setText("Tên thể loại");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        txtID.setEnabled(false);
        txtID.setOpaque(true);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout PanelOverviewLayout = new javax.swing.GroupLayout(PanelOverview);
        PanelOverview.setLayout(PanelOverviewLayout);
        PanelOverviewLayout.setHorizontalGroup(
            PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelOverviewLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOverviewLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOverviewLayout.createSequentialGroup()
                        .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PanelOverviewLayout.createSequentialGroup()
                                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        PanelOverviewLayout.setVerticalGroup(
            PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOverviewLayout.createSequentialGroup()
                .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (STT != -1 && MaTL != -1 && TenTL != null) {
            // Xử lý khi có cả ba tham số
            SuaTheLoai();
        } else {
            ThemTheLoai();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        dispose(); // Đóng frame
    }//GEN-LAST:event_btnHuyActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
    private void SuaTheLoai() {
        TenTL = txtName.getText();
        if (!TenTL.isEmpty()) {
            TheLoaiDTO tl = new TheLoaiDTO(MaTL, TenTL, true);
            TheLoaiBUS theLoaiBUS = new TheLoaiBUS();
            boolean result = theLoaiBUS.updateTheLoai(tl);

            if (result) {
                // Cập nhật tên thể loại tại chỉ mục selectedRow
                SanPhamGUI.updateTheLoaiTable(tl, STT);
                // Đóng frame ChiTietTheLoai
                dispose();
                JOptionPane.showMessageDialog(this, "Đã sửa thành công", "Lỗi", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thể loại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên thể loại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ThemTheLoai() {
        TenTL = txtName.getText();
        String maTL = txtID.getText();
        if (!TenTL.isEmpty()) {
            TheLoaiDTO tl = new TheLoaiDTO(TenTL, true);
            TheLoaiBUS theLoaiBUS = new TheLoaiBUS();
            boolean result = theLoaiBUS.addTheLoai(tl);
            if (result) {
                // Thêm thể loại vào bảng
                // Gửi thông tin thể loại mới về frame gốc
                SanPhamGUI.addTheLoaiTable(tl, STT, maTL);
                dispose();
                JOptionPane.showMessageDialog(this, "Thêm thể loại thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Nếu muốn làm gì đó sau khi thêm thành công, bạn có thể thực hiện ở đây
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm thể loại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên thể loại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(ChiTietTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOverview;
    private Components.ButtonRadius btnHuy;
    private Components.ButtonRadius btnLuu;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTenTheLoai;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
