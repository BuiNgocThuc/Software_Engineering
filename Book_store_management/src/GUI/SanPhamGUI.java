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
public class SanPhamGUI extends javax.swing.JPanel {

    /**
     * Creates new form PhanQuyenGUInew
     */
    public SanPhamGUI() {
        initComponents();
        addPlaceholderStyle(txtTimKiem, "Tìm kiếm");
//        jPanel2.setPreferredSize(new Dimension(928, 506));
        JTable tableSanPham = createTableSanPham();
        tableSanPham.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        JScrollPane scrollPaneSanPham = new JScrollPane(tableSanPham);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneSanPham.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPaneSanPham);
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
        lblTheLoai = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
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

        lblTheLoai.setBackground(new java.awt.Color(255, 255, 255));
        lblTheLoai.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTheLoai.setForeground(new java.awt.Color(254, 201, 116));
        lblTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/product_1.png"))); // NOI18N
        lblTheLoai.setText("Thể loại");
        lblTheLoai.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 0, 2, new java.awt.Color(118, 161, 213)));
        lblTheLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTheLoai.setOpaque(true);
        lblTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTheLoaiMouseClicked(evt);
            }
        });

        lblSanPham.setBackground(new java.awt.Color(255, 255, 255));
        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(254, 201, 116));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/product_1.png"))); // NOI18N
        lblSanPham.setText("Sản phẩm");
        lblSanPham.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 1, new java.awt.Color(118, 161, 213)));
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSanPham.setOpaque(true);
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
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
                        .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.setPreferredSize(new Dimension(1003, 506));
        JTable tableSanPham = createTableSanPham();
        tableSanPham.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        tableSanPham.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPaneSanPham = new JScrollPane(tableSanPham);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneSanPham.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPaneSanPham);
        jPanel2.revalidate();
        jPanel2.repaint();

    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTheLoaiMouseClicked
        // TODO add your handling code here:
        jPanel2.removeAll();
        //        jPanel2.setPreferredSize(new Dimension(928, 506));
        JTable tableTheLoai = createTableTheLoai();
        tableTheLoai.setPreferredScrollableViewportSize(jPanel2.getPreferredSize());
        tableTheLoai.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPaneTheLoai = new JScrollPane(tableTheLoai);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneTheLoai.setBorder(matteBorder);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(scrollPaneTheLoai);
        jPanel2.revalidate();
        jPanel2.repaint();

    }//GEN-LAST:event_lblTheLoaiMouseClicked

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

    public JTable createTableSanPham() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Sản phẩm", "Tên sản phẩm", "Tên tác giả", "Thể loại", "Số lượng", "Đơn giá"};
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0 || columnIndex == 5) { // Cột STT và Số lượng
                    return Integer.class; // Kiểu dữ liệu Integer
                } else if (columnIndex == 6) { // Cột Đơn giá
                    return Float.class; // Kiểu dữ liệu Float
                }
                return String.class; // Các cột khác có kiểu dữ liệu String
            }
        };
        model.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(model);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(120); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(250); // Độ rộng cột 2
        columnModel.getColumn(3).setPreferredWidth(209); // Độ rộng cột 3
        columnModel.getColumn(4).setPreferredWidth(120); // Độ rộng cột 4
        columnModel.getColumn(5).setPreferredWidth(120); // Độ rộng cột 5
        columnModel.getColumn(6).setPreferredWidth(120); // Độ rộng cột 6

        EditHeaderTable(table);
        editTableContent(table);
        return table;
    }

    public void loadTable() {

    }

    public JTable createTableTheLoai() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Thể loại", "Tên thể loại"};
        // Tạo DefaultTableModel với dữ liệu và tiêu đề cột
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) { // Cột STT 
                    return Integer.class; // Kiểu dữ liệu Integer
                }
                return String.class; // Các cột khác có kiểu dữ liệu String
            }
        };
        model.setColumnIdentifiers(columnNames);

        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(model);
        EditHeaderTable(table);
        editTableContent(table);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(200); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(729); // Độ rộng cột 2
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
        int column4 = 1003 - fixedColumnsWidth;

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnSua;
    private Components.ButtonRadius btnThêm;
    private Components.ButtonRadius btnTimKiem;
    private Components.ButtonRadius btnXoa1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTimKiem;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
