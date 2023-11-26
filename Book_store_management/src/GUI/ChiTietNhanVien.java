/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.NhanVienBUS;
import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import Util.sharedFunction;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tnpqu
 */
public class ChiTietNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietNhanVien
     */
    NhanVienDAO nvDao = new NhanVienDAO();
    public static int Model;

    public ChiTietNhanVien() {
        initComponents();
    }
    NhanVienBUS nvBus = new NhanVienBUS();

    public void setData(String id) {

        NhanVienDTO nvDto = nvBus.selectNhanVienById(id);
        txtId.setText(nvDto.getMaNV());
        cboGioiTinh.setSelectedItem(nvDto.getGioiTinh());
        txtName.setText(nvDto.getTenNV());
        txtDiaChi.setText(nvDto.getDiaChi());
        txtEmail.setText(nvDto.getEmail());
        txtSdt.setText(nvDto.getSDT());
    }

    public void setID() {
        int id = Integer.parseInt(nvDao.selectLastID().substring(3)) + 1;
        txtId.setText(sharedFunction.FormatID("NV0", id));

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
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnLuu = new Components.ButtonRadius();
        btnHuy = new Components.ButtonRadius();
        jLabel3 = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        txtSdt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 150));
        setMaximumSize(new java.awt.Dimension(647, 2147483647));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel2.setBackground(new java.awt.Color(135, 172, 217));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 40));

        jLabel1.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin chi tiết");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtId.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "ID Nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtId.setFocusable(false);
        txtId.setMaximumSize(new java.awt.Dimension(480, 50));
        txtId.setMinimumSize(new java.awt.Dimension(480, 50));
        txtId.setPreferredSize(new java.awt.Dimension(480, 50));

        txtName.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Tên nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtName.setMaximumSize(new java.awt.Dimension(480, 50));
        txtName.setMinimumSize(new java.awt.Dimension(480, 50));
        txtName.setPreferredSize(new java.awt.Dimension(480, 50));

        txtEmail.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(480, 50));
        txtEmail.setMinimumSize(new java.awt.Dimension(480, 50));
        txtEmail.setPreferredSize(new java.awt.Dimension(480, 50));

        txtDiaChi.setColumns(20);
        txtDiaChi.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        txtDiaChi.setRows(5);
        txtDiaChi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 1, true));
        jScrollPane1.setViewportView(txtDiaChi);

        jLabel2.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(135, 172, 217));
        jLabel2.setText("Địa chỉ");

        btnLuu.setForeground(new java.awt.Color(135, 172, 217));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/fix.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setFocusPainted(false);
        btnLuu.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        btnLuu.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLuu.setRadius(40);
        btnLuu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setForeground(new java.awt.Color(135, 172, 217));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setFocusPainted(false);
        btnHuy.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        btnHuy.setPreferredSize(new java.awt.Dimension(100, 40));
        btnHuy.setRadius(40);
        btnHuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(135, 172, 217));
        jLabel3.setText("Giới tính");

        cboGioiTinh.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn giới tính", "Nam", "Nữ" }));
        cboGioiTinh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 1, true));

        txtSdt.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        txtSdt.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Số điện thoại", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtSdt.setMaximumSize(new java.awt.Dimension(480, 50));
        txtSdt.setMinimumSize(new java.awt.Dimension(480, 50));
        txtSdt.setPreferredSize(new java.awt.Dimension(480, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        NhanVienDTO nv = new NhanVienDTO();
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ID nhân viên không được để trống");
        } else if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống");
        } else if (txtSdt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
        } else if (txtSdt.getText().equals("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "SĐT phải có 10 số");
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
        } else if (txtEmail.getText().equals(".*@gmail\\.com")) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
        } else if (txtDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
        } else if (cboGioiTinh.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Giới tính chưa được chọn");
        } else {
            //String cv = cboChucVu.getSelectedItem().toString();
            //int chucvu = nvDao.getIdChucVu(cv);
            if (Model == 1) {
                if (checkExistId(txtId.getText())) {
                    nv.setMaNV(txtId.getText());
                    nv.setTenNV(txtName.getText());
                    nv.setGioiTinh(cboGioiTinh.getSelectedItem().toString());
                    nv.setSDT(txtSdt.getText());
                    nv.setEmail(txtEmail.getText());
                    nv.setDiaChi(txtDiaChi.getText());
                    nv.setTinhTrang("Đang làm việc");
                    if (nvBus.insertNhanVien(nv)) {
                        NhanVienGUI.update();
                        setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mã nhân viên này đã có");
                }

            } else {
                nv.setMaNV(txtId.getText());
                nv.setTenNV(txtName.getText());
                nv.setGioiTinh(cboGioiTinh.getSelectedItem().toString());
                nv.setSDT(txtSdt.getText());
                nv.setEmail(txtEmail.getText());
                nv.setDiaChi(txtDiaChi.getText());
                nv.setTinhTrang("Đang làm việc");
                if (nvBus.updateNhanVien(nv)) {
                    NhanVienGUI.update();
                    setVisible(false);
                }
            }
        }


    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    public boolean checkExistId(String id) {
        ArrayList<NhanVienDTO> listnv = nvBus.selectAll();
        for (int i = 0; i < listnv.size(); i++) {
            if (id.toLowerCase().equals(listnv.get(i).getMaNV().toLowerCase())) {
                System.out.println("false");
                return false;
            }
        }
        return true;
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
    private Components.ButtonRadius btnHuy;
    private Components.ButtonRadius btnLuu;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables
}
