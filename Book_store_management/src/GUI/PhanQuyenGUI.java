/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import static DemoConnectDB.NewJFrame.createTablePhanQuyen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ASUS
 */
public class PhanQuyenGUI extends javax.swing.JPanel {

    /**
     * Creates new form PhanQuyenGUInew
     */
    public PhanQuyenGUI() {
        initComponents();
        addPlaceholderStyle(txtTimKiem, "Tìm kiếm");
//        jPanel2.setPreferredSize(new Dimension(928, 506));
        JTable tablePhanQuyen = createTablePhanQuyen();
        tablePhanQuyen.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        JScrollPane scrollPanePhanQuyen = new JScrollPane(tablePhanQuyen);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPanePhanQuyen.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPanePhanQuyen);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTimKiem = new Components.ButtonRadius();
        jPanelTimKiem = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        lblChucNang = new javax.swing.JLabel();
        lblPhanQuyen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnThêm = new Components.ButtonRadius();
        btnSua = new Components.ButtonRadius();
        btnXoa1 = new Components.ButtonRadius();

        setBackground(new java.awt.Color(255, 255, 255));

        btnTimKiem.setBorder(null);
        btnTimKiem.setForeground(new java.awt.Color(134, 172, 218));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm");
        btnTimKiem.setFocusPainted(false);
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setPreferredSize(new java.awt.Dimension(50, 25));
        btnTimKiem.setRadius(40);
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseExited(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jPanelTimKiem.setBackground(new java.awt.Color(243, 243, 244));
        jPanelTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 198, 231), 2));

        txtTimKiem.setBackground(new java.awt.Color(243, 243, 244));
        txtTimKiem.setBorder(null);
        txtTimKiem.setOpaque(true);
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseExited(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTimKiemLayout = new javax.swing.GroupLayout(jPanelTimKiem);
        jPanelTimKiem.setLayout(jPanelTimKiemLayout);
        jPanelTimKiemLayout.setHorizontalGroup(
            jPanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTimKiemLayout.setVerticalGroup(
            jPanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTimKiem)
        );

        jPanelBody.setBackground(new java.awt.Color(255, 51, 51));
        jPanelBody.setOpaque(false);

        lblChucNang.setBackground(new java.awt.Color(255, 255, 255));
        lblChucNang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblChucNang.setForeground(new java.awt.Color(254, 201, 116));
        lblChucNang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChucNang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/division_1.png"))); // NOI18N
        lblChucNang.setText("Chức năng");
        lblChucNang.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 0, 2, new java.awt.Color(118, 161, 213)));
        lblChucNang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChucNang.setOpaque(true);
        lblChucNang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChucNangMouseClicked(evt);
            }
        });

        lblPhanQuyen.setBackground(new java.awt.Color(255, 255, 255));
        lblPhanQuyen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPhanQuyen.setForeground(new java.awt.Color(254, 201, 116));
        lblPhanQuyen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhanQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/division_1.png"))); // NOI18N
        lblPhanQuyen.setText("Phân quyền ");
        lblPhanQuyen.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 1, new java.awt.Color(118, 161, 213)));
        lblPhanQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPhanQuyen.setOpaque(true);
        lblPhanQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPhanQuyenMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        btnThêm.setBorder(null);
        btnThêm.setForeground(new java.awt.Color(134, 172, 218));
        btnThêm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/add.png"))); // NOI18N
        btnThêm.setText("Thêm");
        btnThêm.setFocusPainted(false);
        btnThêm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThêm.setPreferredSize(new java.awt.Dimension(50, 25));
        btnThêm.setRadius(40);
        btnThêm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThêmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThêmMouseExited(evt);
            }
        });
        btnThêm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThêmActionPerformed(evt);
            }
        });

        btnSua.setBorder(null);
        btnSua.setForeground(new java.awt.Color(134, 172, 218));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setFocusPainted(false);
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(50, 25));
        btnSua.setRadius(40);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuaMouseExited(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa1.setBorder(null);
        btnXoa1.setForeground(new java.awt.Color(134, 172, 218));
        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        btnXoa1.setText("Xóa");
        btnXoa1.setFocusPainted(false);
        btnXoa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa1.setPreferredSize(new java.awt.Dimension(50, 25));
        btnXoa1.setRadius(40);
        btnXoa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoa1MouseExited(evt);
            }
        });
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(lblPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)
                        .addComponent(btnThêm, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhanQuyen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChucNang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThêm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jPanelTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPhanQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhanQuyenMouseClicked
        // TODO add your handling code here:
        jPanel2.removeAll();
//        jPanel2.setPreferredSize(new Dimension(928, 506));
        JTable tablePhanQuyen = createTablePhanQuyen();
        tablePhanQuyen.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        tablePhanQuyen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPanePhanQuyen = new JScrollPane(tablePhanQuyen);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPanePhanQuyen.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPanePhanQuyen);
        jPanel2.revalidate();
        jPanel2.repaint();

    }//GEN-LAST:event_lblPhanQuyenMouseClicked

    private void lblChucNangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChucNangMouseClicked
        // TODO add your handling code here:
        jPanel2.removeAll();
//       jPanel2.setPreferredSize(new Dimension(928, 506));
        JTable tableChucNang = createTableChucNang();
        tableChucNang.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        tableChucNang.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPaneChucNang = new JScrollPane(tableChucNang);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneChucNang.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPaneChucNang);
        jPanel2.revalidate();
        jPanel2.repaint();

    }//GEN-LAST:event_lblChucNangMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThêmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThêmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThêmActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        // TODO add your handling code here:
        btnTimKiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        // TODO add your handling code here:
        btnTimKiem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnThêmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThêmMouseEntered
        // TODO add your handling code here:
        btnThêm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnThêmMouseEntered

    private void btnThêmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThêmMouseExited
        // TODO add your handling code here:
        btnThêm.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnThêmMouseExited

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        // TODO add your handling code here: 
        btnSua.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        // TODO add your handling code here:
        btnSua.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSuaMouseExited

    private void txtTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusGained
        // TODO add your handling code here:
        if (txtTimKiem.getText().equals("Tìm kiếm")) {
            txtTimKiem.setText("");

//            txtTimKiem.requestFocus();
            removePlaceholderStyle(txtTimKiem);
        }
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        // TODO add your handling code here:
        if (txtTimKiem.getText().equals("")) {
            addPlaceholderStyle(txtTimKiem, "Tìm kiếm");
            System.out.println("hi1" + txtTimKiem.getText());
        }
    }//GEN-LAST:event_txtTimKiemFocusLost

    private void txtTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemMouseEntered

    private void txtTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemMouseExited

    private void btnXoa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa1MouseEntered

    private void btnXoa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa1MouseExited

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed
    public static void EditHeaderTable(JTable table) {
        // Tăng độ cao của header
        table.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 40)); // Điều chỉnh 40 thành độ cao
        // Tạo một renderer tùy chỉnh cho header
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    setForeground(new Color(251, 252, 254)); // Đặt màu chữ
                    setBackground(new Color(134, 172, 218)); // Đặt màu nền
                    Font headerFont = new Font("Segoe UI", Font.BOLD, 16); // Điều chỉnh font và cỡ chữ
                    header.setFont(headerFont);
                    JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                            isSelected, hasFocus, row, column);
                    label.setHorizontalAlignment(SwingConstants.CENTER); // Căn giữa nội dung
                    label.setFont(headerFont);
                }
                setText((value == null) ? "" : value.toString());
                return this;
            }
        };
        // Đặt renderer tùy chỉnh cho header
        table.getTableHeader().setDefaultRenderer(headerRenderer);
    }

    public static void editTableContent(JTable table) {
        // Đặt độ cao cho từng dòng (trừ header)
        int rowHeight = 30;
        table.setRowHeight(rowHeight);
        table.setGridColor(new Color(153, 184, 224));
        table.setShowGrid(true);
        table.setBackground(Color.WHITE);
        // Vô hiệu hóa sắp xếp cột tự động
        // table.setAutoCreateRowSorter(false);
        // Vô hiệu hóa kéo cột
        table.getTableHeader().setReorderingAllowed(false);
        // Vô hiệu hóa kéo dãng cột
        table.getTableHeader().setResizingAllowed(false);
    }

    public JTable createTablePhanQuyen() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Nhóm quyền", "Tên nhóm quyền", "Mô tả"};
        // Tạo DefaultTableModel với dữ liệu và tiêu đề cột
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(model);
        CustomizeCcolumnWidth(table, 70, 200, 300);
        EditHeaderTable(table);
        editTableContent(table);
        return table;
    }

    public void loadTable() {

    }

    public JTable createTableChucNang() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Chức Năng", "Tên chức năng", "Tình trạng"};
        // Tạo DefaultTableModel với dữ liệu và tiêu đề cột
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(model);
        CustomizeCcolumnWidth(table, 70, 200, 300);
        EditHeaderTable(table);
        editTableContent(table);

        return table;
    }

    public void CustomizeCcolumnWidth(JTable table, int column1, int column2, int column3) {

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Tắt tự động điều chỉnh rộng cột
//       table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        TableColumnModel columnModel = table.getColumnModel();
        // Tính tổng độ rộng của các cột cố định
        int fixedColumnsWidth = column1 + column2 + column3;
//    
//    // Xác định độ rộng của cột cuối (cột 4) bằng phần còn lại của không gian
        int column4 = 999 - fixedColumnsWidth;
//        System.out.println(table.getPreferredSize().width);
        columnModel.getColumn(0).setPreferredWidth(column1); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(column2); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(column3); // Độ rộng cột 2
        columnModel.getColumn(3).setPreferredWidth(column4); // Độ rộng cột 3
    }

    private void addPlaceholderStyle(JTextField textField, String name) {
        Font customFont = new Font("Tahoma", Font.BOLD, 16);
        textField.setFont(customFont);
        textField.setForeground(new Color(157, 185, 223));
        textField.setText(name);

    }

    public void removePlaceholderStyle(JTextField textFiled) {
        textFiled.setForeground(Color.black);
    }

    public static void main(String[] args) {
        // Tạo và hiển thị JFrame (cửa sổ chứa JPanel của bạn)
        javax.swing.JFrame frame = new javax.swing.JFrame("PhanQuyenGUI");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        // Tạo một phiên bản của lớp PhanQuyenGUI
        PhanQuyenGUI phanQuyenGUI = new PhanQuyenGUI();

        // Thêm JPanel của bạn vào JFrame
        frame.getContentPane().add(phanQuyenGUI);

        // Thiết lập kích thước của JFrame
        // frame.setSize(1280, 720);
        frame.pack();
        // Hiển thị JFrame
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnSua;
    private Components.ButtonRadius btnThêm;
    private Components.ButtonRadius btnTimKiem;
    private Components.ButtonRadius btnXoa1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTimKiem;
    private javax.swing.JLabel lblChucNang;
    private javax.swing.JLabel lblPhanQuyen;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
