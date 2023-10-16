/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;




import java.awt.Color;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public final class ChiTietQuyen extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietQuyen
     */
    public ChiTietQuyen() {
        initComponents();
        editTable(tableChiTietQuyen);
        setValueTable(tableChiTietQuyen);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChiTietQuyen = new javax.swing.JTable();
        txtMoTa = new javax.swing.JTextField();
        lblChiTietQuyen = new javax.swing.JLabel();
        lblTenNhomQuyen = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTenNhomQuyen = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        btnLuu = new Components.ButtonRadius();
        btnHuy = new Components.ButtonRadius();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelOverview.setBackground(new java.awt.Color(255, 255, 255));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(148, 181, 222));
        lblID.setText("ID Quyền");

        lblThongTinChiTiet.setBackground(new java.awt.Color(134, 172, 218));
        lblThongTinChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongTinChiTiet.setForeground(new java.awt.Color(238, 242, 250));
        lblThongTinChiTiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setText("Thông tin chi tiết");
        lblThongTinChiTiet.setAutoscrolls(true);
        lblThongTinChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblThongTinChiTiet.setOpaque(true);

        tableChiTietQuyen.setAutoCreateRowSorter(true);
        tableChiTietQuyen.setBackground(new java.awt.Color(255, 255, 255));
        tableChiTietQuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(136, 173, 219)));
        tableChiTietQuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "ID.CNăng", "Tên CNăng", "Hành Động", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChiTietQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableChiTietQuyen.setDoubleBuffered(true);
        tableChiTietQuyen.setDragEnabled(true);
        tableChiTietQuyen.setFillsViewportHeight(true);
        tableChiTietQuyen.setFocusCycleRoot(true);
        tableChiTietQuyen.setFocusTraversalPolicyProvider(true);
        tableChiTietQuyen.setInheritsPopupMenu(true);
        tableChiTietQuyen.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableChiTietQuyen.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableChiTietQuyen.setShowGrid(true);
        tableChiTietQuyen.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tableChiTietQuyen);
        if (tableChiTietQuyen.getColumnModel().getColumnCount() > 0) {
            tableChiTietQuyen.getColumnModel().getColumn(0).setMinWidth(100);
            tableChiTietQuyen.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableChiTietQuyen.getColumnModel().getColumn(0).setMaxWidth(100);
            tableChiTietQuyen.getColumnModel().getColumn(1).setResizable(false);
            tableChiTietQuyen.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableChiTietQuyen.getColumnModel().getColumn(2).setResizable(false);
            tableChiTietQuyen.getColumnModel().getColumn(3).setMinWidth(50);
            tableChiTietQuyen.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableChiTietQuyen.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        txtMoTa.setBackground(new java.awt.Color(255, 255, 255));
        txtMoTa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));

        lblChiTietQuyen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblChiTietQuyen.setForeground(new java.awt.Color(148, 181, 222));
        lblChiTietQuyen.setText("Chi tiết quyền");

        lblTenNhomQuyen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTenNhomQuyen.setForeground(new java.awt.Color(148, 181, 222));
        lblTenNhomQuyen.setText("Tên nhóm quyền");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtTenNhomQuyen.setBackground(new java.awt.Color(255, 255, 255));
        txtTenNhomQuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 210, 235), 2));

        lblMoTa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMoTa.setForeground(new java.awt.Color(148, 181, 222));
        lblMoTa.setText("Mô tả");

        btnLuu.setBorder(null);
        btnLuu.setForeground(new java.awt.Color(134, 172, 218));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        btnLuu.setText("Hủy");
        btnLuu.setFocusPainted(false);
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setRadius(40);
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLuuMouseExited(evt);
            }
        });

        btnHuy.setBorder(null);
        btnHuy.setForeground(new java.awt.Color(134, 172, 218));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/fix.png"))); // NOI18N
        btnHuy.setText("Lưu");
        btnHuy.setFocusPainted(false);
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuy.setRadius(40);
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

        javax.swing.GroupLayout PanelOverviewLayout = new javax.swing.GroupLayout(PanelOverview);
        PanelOverview.setLayout(PanelOverviewLayout);
        PanelOverviewLayout.setHorizontalGroup(
            PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelOverviewLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOverviewLayout.createSequentialGroup()
                        .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(PanelOverviewLayout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(268, 268, 268)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelOverviewLayout.createSequentialGroup()
                                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelOverviewLayout.createSequentialGroup()
                                        .addComponent(lblTenNhomQuyen)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtTenNhomQuyen)))
                            .addComponent(txtMoTa))
                        .addGap(26, 26, 26))
                    .addGroup(PanelOverviewLayout.createSequentialGroup()
                        .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChiTietQuyen))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelOverviewLayout.setVerticalGroup(
            PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOverviewLayout.createSequentialGroup()
                .addComponent(lblThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenNhomQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNhomQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblChiTietQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietQuyen().setVisible(true);
            }
        });
    }

    public void editTable(JTable table) {
        JTableHeader header = table.getTableHeader();

        header.setBackground(Color.WHITE);
        header.setPreferredSize(new java.awt.Dimension(0, 30)); // Điều chỉnh  độ cao    
        header.setForeground(new Color(253, 186, 68));
        header.setFont(new Font("Segoe UI", Font.BOLD, 16));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        // Đặt độ cao cho từng dòng (trừ header) (nếu cần)
        int rowHeight = 25;
        table.setRowHeight(rowHeight);
        table.setGridColor(new Color(139, 175, 219));//      border mỗi ô
        table.setBackground(Color.WHITE);
    }

    public void setValueTable(JTable table) {
        // Tạo một biểu tượng ImageIcon từ tệp ảnh của bạn
      

// Tạo một TableCellRenderer cho header
         DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setIcon(new javax.swing.ImageIcon(getClass().getResource("./../Assets/icon_24px/tickbox.png"))); // Đặt hình ảnh ô vuông có dấu tích

        // Đặt renderer cho cột "Hình ảnh"
        table.getColumnModel().getColumn(3).setHeaderRenderer(renderer);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOverview;
    private Components.ButtonRadius btnHuy;
    private Components.ButtonRadius btnLuu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiTietQuyen;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTenNhomQuyen;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JTable tableChiTietQuyen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenNhomQuyen;
    // End of variables declaration//GEN-END:variables

}
