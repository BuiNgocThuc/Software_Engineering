/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ExportFile.PdfExporter;
import Util.sharedFunction;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tnpqu
 */
public class BillFormGUI extends javax.swing.JFrame {


/**
     * Creates new form BillFormGUI
     */
        public BillFormGUI() {
            this.setUndecorated(true);
        initComponents();
    }

    public BillFormGUI(String IDhoaDon, String TenNV, String TienKhachDua, String TienThoi, String TongTien, String NgayTao, DefaultTableModel model) {
        this.setUndecorated(true);
        initComponents();
        for (int i = 0; i < model.getRowCount(); i++) {
            String tenSanPham = (String) model.getValueAt(i, 1);
            String soLuongStr = (String) model.getValueAt(i, 2);
            String ThanhTienStr = (String) model.getValueAt(i, 3);
            double ThanhTien = sharedFunction.parseMoneyString(ThanhTienStr);
            int soLuong = sharedFunction.stringToInteger(soLuongStr);
            double donGia = ThanhTien / soLuong;
            String donGiaText = sharedFunction.formatVND(donGia);
            Object[] rowData = {tenSanPham, donGiaText, soLuongStr, ThanhTienStr};
            DefaultTableModel model1 = (DefaultTableModel) tbHoadon.getModel();
            model1.addRow(rowData);
        }
        tfHD.setText(IDhoaDon);
        tfNgayTao.setText(NgayTao);
        tfKhachDua.setText(TienKhachDua);
        tfTienThoi.setText(TienThoi);
        tfTongTien.setText(TongTien);
        tfThuNgan1.setText("Nguyễn Minh Thuận");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfIDHoadon = new javax.swing.JTextField();
        tfNgaytao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoadon = new javax.swing.JTable();
        tfTongtien = new javax.swing.JTextField();
        tfTienkhach = new javax.swing.JTextField();
        tfTienthoi = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInHoadon = new Components.ButtonRadius();
        btnQuaylai = new Components.ButtonRadius();
        jSeparator3 = new javax.swing.JSeparator();
        tfHD = new javax.swing.JLabel();
        tfNgayTao = new javax.swing.JLabel();
        tfKhachDua = new javax.swing.JLabel();
        tfTienThoi = new javax.swing.JLabel();
        tfTongTien = new javax.swing.JLabel();
        tfThuNgan = new javax.swing.JLabel();
        tfThuNgan1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo/bill_logo.png"))); // NOI18N

        tfIDHoadon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfIDHoadon.setText("Hóa đơn số: ");
        tfIDHoadon.setBorder(null);
        tfIDHoadon.setFocusable(false);
        tfIDHoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDHoadonActionPerformed(evt);
            }
        });

        tfNgaytao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfNgaytao.setText("Ngày:");
        tfNgaytao.setBorder(null);
        tfNgaytao.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Hóa đơn thanh toán");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tbHoadon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHoadon.setForeground(new java.awt.Color(0, 0, 0));
        tbHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHoadon.setEnabled(false);
        tbHoadon.setFocusable(false);
        tbHoadon.setGridColor(new java.awt.Color(0, 0, 0));
        tbHoadon.setRowHeight(30);
        tbHoadon.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbHoadon.setSelectionForeground(new java.awt.Color(253, 183, 58));
        tbHoadon.setShowGrid(true);
        tbHoadon.getTableHeader().setResizingAllowed(false);
        tbHoadon.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbHoadon);
        if (tbHoadon.getColumnModel().getColumnCount() > 0) {
            tbHoadon.getColumnModel().getColumn(2).setMinWidth(60);
            tbHoadon.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbHoadon.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        tfTongtien.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfTongtien.setText("Tổng tiền:");
        tfTongtien.setBorder(null);
        tfTongtien.setFocusable(false);

        tfTienkhach.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfTienkhach.setText("Tiền khách đưa:");
        tfTienkhach.setBorder(null);
        tfTienkhach.setFocusable(false);
        tfTienkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTienkhachActionPerformed(evt);
            }
        });

        tfTienthoi.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfTienthoi.setText("Tiền thối:");
        tfTienthoi.setBorder(null);
        tfTienthoi.setFocusable(false);

        jSeparator2.setBackground(new java.awt.Color(135, 172, 217));
        jSeparator2.setForeground(new java.awt.Color(135, 172, 217));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabel3.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Cảm ơn quý khách đã mua hàng tại");

        jLabel4.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("BOOKSTORE");

        btnInHoadon.setForeground(new java.awt.Color(135, 172, 217));
        btnInHoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/print.png"))); // NOI18N
        btnInHoadon.setText("In hóa đơn");
        btnInHoadon.setFocusPainted(false);
        btnInHoadon.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        btnInHoadon.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnInHoadon.setPreferredSize(new java.awt.Dimension(130, 40));
        btnInHoadon.setRadius(40);
        btnInHoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInHoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoadonActionPerformed(evt);
            }
        });

        btnQuaylai.setForeground(new java.awt.Color(135, 172, 217));
        btnQuaylai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/back.png"))); // NOI18N
        btnQuaylai.setText("Quay lại");
        btnQuaylai.setFocusPainted(false);
        btnQuaylai.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 19)); // NOI18N
        btnQuaylai.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btnQuaylai.setPreferredSize(new java.awt.Dimension(130, 40));
        btnQuaylai.setRadius(40);
        btnQuaylai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuaylai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuaylaiMouseClicked(evt);
            }
        });
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(135, 172, 217));
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        tfHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfNgayTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfKhachDua.setBackground(new java.awt.Color(255, 255, 255));
        tfKhachDua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfKhachDua.setOpaque(true);

        tfTienThoi.setBackground(new java.awt.Color(255, 255, 255));
        tfTienThoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTienThoi.setOpaque(true);

        tfTongTien.setBackground(new java.awt.Color(255, 255, 255));
        tfTongTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTongTien.setOpaque(true);

        tfThuNgan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfThuNgan.setText("Thu ngân");

        tfThuNgan1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfTienthoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfTienkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(167, 167, 167))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfThuNgan1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(tfNgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfHD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(tfThuNgan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTienkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tfTienthoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfTienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDHoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDHoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDHoadonActionPerformed

    private void tfTienkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTienkhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTienkhachActionPerformed

    private void btnQuaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuaylaiMouseClicked

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    private void btnInHoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoadonActionPerformed
        // TODO add your handling code here:
 
    String MaHD = tfHD.getText();
    String ngayTao = tfNgayTao.getText();
    String thuNgan = tfThuNgan1.getText();
    String tongTien = tfTongTien.getText();
    String khachDua = tfKhachDua.getText();
    String tienThoi = tfTienThoi.getText();

  

      String filePath = sharedFunction.chooseFilePath("pdf");
        if (filePath != null) {
            PdfExporter.exportToPdfHoaDon(MaHD, ngayTao, thuNgan, tbHoadon, tongTien, khachDua, tienThoi, filePath);
        } 
    }//GEN-LAST:event_btnInHoadonActionPerformed

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
            java.util.logging.Logger.getLogger(BillFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnInHoadon;
    private Components.ButtonRadius btnQuaylai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbHoadon;
    private javax.swing.JLabel tfHD;
    private javax.swing.JTextField tfIDHoadon;
    private javax.swing.JLabel tfKhachDua;
    private javax.swing.JLabel tfNgayTao;
    private javax.swing.JTextField tfNgaytao;
    private javax.swing.JLabel tfThuNgan;
    private javax.swing.JLabel tfThuNgan1;
    private javax.swing.JLabel tfTienThoi;
    private javax.swing.JTextField tfTienkhach;
    private javax.swing.JTextField tfTienthoi;
    private javax.swing.JLabel tfTongTien;
    private javax.swing.JTextField tfTongtien;
    // End of variables declaration//GEN-END:variables
}
