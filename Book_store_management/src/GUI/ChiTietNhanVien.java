/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Admin
 */
public class ChiTietNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietNhanVien
     */
    public ChiTietNhanVien() {
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
        lblThongTinChiTiet = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        txtID3 = new javax.swing.JTextField();
        lblID5 = new javax.swing.JLabel();
        txtID4 = new javax.swing.JTextField();
        lblID6 = new javax.swing.JLabel();
        txtID5 = new javax.swing.JTextField();
        lblID7 = new javax.swing.JLabel();
        txtID6 = new javax.swing.JTextField();
        lblID8 = new javax.swing.JLabel();
        txtID7 = new javax.swing.JTextField();
        lblID9 = new javax.swing.JLabel();
        txtID8 = new javax.swing.JTextField();
        buttonRadius2 = new Components.ButtonRadius();
        buttonRadius1 = new Components.ButtonRadius();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblThongTinChiTiet.setBackground(new java.awt.Color(134, 172, 218));
        lblThongTinChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongTinChiTiet.setForeground(new java.awt.Color(238, 242, 250));
        lblThongTinChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setText("Thông tin chi tiết");
        lblThongTinChiTiet.setAutoscrolls(true);
        lblThongTinChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setOpaque(true);

        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblID1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID1.setForeground(new java.awt.Color(148, 181, 222));
        lblID1.setText("ID Nhân Viên");

        lblID2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID2.setForeground(new java.awt.Color(148, 181, 222));
        lblID2.setText("Tên Nhân Viên");

        txtID3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID3ActionPerformed(evt);
            }
        });

        lblID5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID5.setForeground(new java.awt.Color(148, 181, 222));
        lblID5.setText("Giới Tính");

        txtID4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));

        lblID6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID6.setForeground(new java.awt.Color(148, 181, 222));
        lblID6.setText("Chức Vụ");

        txtID5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));

        lblID7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID7.setForeground(new java.awt.Color(148, 181, 222));
        lblID7.setText("Số Điện Thoại");

        txtID6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID6ActionPerformed(evt);
            }
        });

        lblID8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID8.setForeground(new java.awt.Color(148, 181, 222));
        lblID8.setText("Địa chỉ");

        txtID7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID7ActionPerformed(evt);
            }
        });

        lblID9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID9.setForeground(new java.awt.Color(148, 181, 222));
        lblID9.setText("Email");

        txtID8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID8ActionPerformed(evt);
            }
        });

        buttonRadius2.setBackground(new java.awt.Color(250, 232, 189));
        buttonRadius2.setForeground(new java.awt.Color(38, 117, 191));
        buttonRadius2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/add.png"))); // NOI18N
        buttonRadius2.setText("Lưu");
        buttonRadius2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonRadius2.setPreferredSize(new java.awt.Dimension(100, 40));
        buttonRadius2.setRadius(40);

        buttonRadius1.setBackground(new java.awt.Color(250, 232, 189));
        buttonRadius1.setForeground(new java.awt.Color(38, 117, 191));
        buttonRadius1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        buttonRadius1.setText("Huỷ");
        buttonRadius1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonRadius1.setPreferredSize(new java.awt.Dimension(100, 40));
        buttonRadius1.setRadius(40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID6, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID7, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtID8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonRadius2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblID1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRadius2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID3ActionPerformed

    private void txtID6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID6ActionPerformed

    private void txtID7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID7ActionPerformed

    private void txtID8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID8ActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius buttonRadius1;
    private Components.ButtonRadius buttonRadius2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID5;
    private javax.swing.JLabel lblID6;
    private javax.swing.JLabel lblID7;
    private javax.swing.JLabel lblID8;
    private javax.swing.JLabel lblID9;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID3;
    private javax.swing.JTextField txtID4;
    private javax.swing.JTextField txtID5;
    private javax.swing.JTextField txtID6;
    private javax.swing.JTextField txtID7;
    private javax.swing.JTextField txtID8;
    // End of variables declaration//GEN-END:variables
}
