/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author tnpqu
 */
public class XacnhanHoaDonGUI extends javax.swing.JPanel {

    /**
     * Creates new form XacnhanHoaDonGUI
     */
    public XacnhanHoaDonGUI() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        btnInHoadon = new Components.ButtonRadius();
        btnQuaylai = new Components.ButtonRadius();
        jSeparator1 = new javax.swing.JSeparator();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnInHoadon.setForeground(new java.awt.Color(135, 172, 217));
        btnInHoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/print.png"))); // NOI18N
        btnInHoadon.setText("In hóa đơn");
        btnInHoadon.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        btnInHoadon.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnInHoadon.setPreferredSize(new java.awt.Dimension(130, 40));
        btnInHoadon.setRadius(40);
        btnInHoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnQuaylai.setForeground(new java.awt.Color(135, 172, 217));
        btnQuaylai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/back.png"))); // NOI18N
        btnQuaylai.setText("Quay lại");
        btnQuaylai.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
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

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(135, 172, 217));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnInHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuaylai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo/bill_logo.png"))); // NOI18N

        tfIDHoadon.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfIDHoadon.setText("Hóa đơn số: ");
        tfIDHoadon.setBorder(null);
        tfIDHoadon.setFocusable(false);
        tfIDHoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDHoadonActionPerformed(evt);
            }
        });

        tfNgaytao.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfNgaytao.setText("Ngày:");
        tfNgaytao.setBorder(null);
        tfNgaytao.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Hóa đơn mua hàng");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tbHoadon.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        tbHoadon.setForeground(new java.awt.Color(135, 172, 217));
        tbHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
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
        tbHoadon.setGridColor(new java.awt.Color(135, 172, 217));
        tbHoadon.setRowHeight(30);
        tbHoadon.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbHoadon.setSelectionForeground(new java.awt.Color(253, 183, 58));
        tbHoadon.setShowGrid(true);
        jScrollPane1.setViewportView(tbHoadon);
        if (tbHoadon.getColumnModel().getColumnCount() > 0) {
            tbHoadon.getColumnModel().getColumn(0).setResizable(false);
            tbHoadon.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbHoadon.getColumnModel().getColumn(1).setResizable(false);
            tbHoadon.getColumnModel().getColumn(2).setResizable(false);
            tbHoadon.getColumnModel().getColumn(3).setResizable(false);
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

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(135, 172, 217));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabel3.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Cảm ơn quý khách đã mua hàng tại");

        jLabel4.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("BOOKSTORE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(16, 16, 16))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTienthoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTienkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfTienkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfTienthoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, new Color(0x87ACD9)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDHoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDHoadonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDHoadonActionPerformed

    private void tfTienkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTienkhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTienkhachActionPerformed

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    private void btnQuaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnQuaylaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnInHoadon;
    private Components.ButtonRadius btnQuaylai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbHoadon;
    private javax.swing.JTextField tfIDHoadon;
    private javax.swing.JTextField tfNgaytao;
    private javax.swing.JTextField tfTienkhach;
    private javax.swing.JTextField tfTienthoi;
    private javax.swing.JTextField tfTongtien;
    // End of variables declaration//GEN-END:variables
}
