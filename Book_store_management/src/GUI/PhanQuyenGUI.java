/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.CTPhanQuyenBUS;
import BUS.ChucNangBUS;
import BUS.NhomQuyenBUS;
import Components.ButtonRadius;
import DTO.CTQuyenDTO;
import DTO.ChucNangDTO;
import Util.sharedFunction;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private static JTable tableNhomQuyen;
    private static JTable tableChucNang;
    private static DefaultTableModel modelNhomQuyen;
    private static DefaultTableModel modelChucNang;
    private Color currentBackgroundColor;
    private final Color targetColor = new Color(255, 255, 255);

    NhomQuyenBUS nqBUS = new NhomQuyenBUS();
    ChucNangBUS cnBUS = new ChucNangBUS();
    CTPhanQuyenBUS ctqBUS = new CTPhanQuyenBUS();

    public PhanQuyenGUI() {
        initComponents();
        createTable();

    }

    public static JTable getTableNhomQuyen() {
        return tableNhomQuyen;
    }

    public static JTable getTableChucNang() {
        return tableChucNang;
    }

    public static DefaultTableModel getModelNhomQuyen() {
        return modelNhomQuyen;
    }

    public static DefaultTableModel getModelChucNang() {
        return modelChucNang;
    }

    public ButtonRadius getBtnSua() {
        return btnSua;
    }

    public ButtonRadius getBtnThem() {
        return btnThem;
    }

    public ButtonRadius getBtnXoa() {
        return btnXoa;
    }
    

    public void createTable() {
        tableNhomQuyen = createTablePhanQuyen();
        tableChucNang = createTableChucNang();

        tableNhomQuyen.setPreferredScrollableViewportSize(pnTable.getPreferredSize());
        JScrollPane scrollPanePhanQuyen = new JScrollPane(tableNhomQuyen);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPanePhanQuyen.setBorder(matteBorder);
        pnTable.setLayout(new BorderLayout());
        pnTable.add(scrollPanePhanQuyen);

        nqBUS.createTablePer(modelNhomQuyen);
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
        pnTable = new javax.swing.JPanel();
        btnThem = new Components.ButtonRadius();
        btnSua = new Components.ButtonRadius();
        btnXoa = new Components.ButtonRadius();
        btnLammoi = new Components.ButtonRadius();

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

        lblChucNang.setBackground(new java.awt.Color(229, 231, 230));
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

        pnTable.setBackground(new java.awt.Color(255, 255, 255));
        pnTable.setPreferredSize(new java.awt.Dimension(1009, 605));
        pnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        btnThem.setBorder(null);
        btnThem.setForeground(new java.awt.Color(134, 172, 218));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setFocusPainted(false);
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(50, 25));
        btnThem.setRadius(40);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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

        btnXoa.setBorder(null);
        btnXoa.setForeground(new java.awt.Color(134, 172, 218));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/cancel.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setFocusPainted(false);
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(50, 25));
        btnXoa.setRadius(40);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLammoi.setBorder(null);
        btnLammoi.setForeground(new java.awt.Color(135, 172, 217));
        btnLammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/back.png"))); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.setFocusPainted(false);
        btnLammoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLammoi.setIconTextGap(0);
        btnLammoi.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLammoi.setMaximumSize(new java.awt.Dimension(100, 40));
        btnLammoi.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLammoi.setRadius(40);
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jPanelTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPhanQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhanQuyenMouseClicked
        // TODO add your handling code here:
        pnTable.removeAll();

        tableNhomQuyen.setPreferredScrollableViewportSize(pnTable.getPreferredSize());
        JScrollPane scrollPanePhanQuyen = new JScrollPane(tableNhomQuyen);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPanePhanQuyen.setBorder(matteBorder);
        pnTable.setLayout(new BorderLayout());
        pnTable.add(scrollPanePhanQuyen);

        nqBUS.createTablePer(modelNhomQuyen);
        pnTable.revalidate();
        pnTable.repaint();
        lblChucNang.setBackground(new Color(229, 231, 230));
        lblPhanQuyen.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblPhanQuyenMouseClicked

    private void lblChucNangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChucNangMouseClicked
        // TODO add your handling code here:
        pnTable.removeAll();
        cnBUS.createTableRole(modelChucNang);
        tableChucNang.setPreferredScrollableViewportSize(pnTable.getPreferredSize());
        tableChucNang.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPaneSanPham = new JScrollPane(tableChucNang);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneSanPham.setBorder(matteBorder);
        pnTable.setLayout(new BorderLayout());
        pnTable.add(scrollPaneSanPham);
        pnTable.revalidate();
        pnTable.repaint();
        lblPhanQuyen.setBackground(new Color(229, 231, 230));
        lblChucNang.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblChucNangMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        currentBackgroundColor = lblChucNang.getBackground();
        // xử lý việc thêm sửa xóa cho bảng thể loại hay bảng sản phẩm
        if (currentBackgroundColor.equals(targetColor)) {
            ChiTietChucNang ctcn = new ChiTietChucNang(this);
            ctcn.setVisible(true);
            int MaCN = cnBUS.getCurrentID() + 1;
            ctcn.getTxtID().setText(String.format("CN%02d", MaCN));

        } else {
            ChiTietQuyen ctq = new ChiTietQuyen(this);
            ctq.setVisible(true);
            int MaNQ = nqBUS.getCurrentID() + 1;
            ctq.getTxtID().setText(String.format("NQ%02d", MaNQ));
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        currentBackgroundColor = lblChucNang.getBackground();
        // xử lý việc thêm sửa xóa cho bảng thể loại hay bảng sản phẩm
        if (currentBackgroundColor.equals(targetColor)) {
            int selectedRowCN = tableChucNang.getSelectedRow();
            if (selectedRowCN == -1) {
                sharedFunction.displayErrorMessage("Vui lòng chọn chức năng cần sửa");
                return;
            } else {
                ChiTietChucNang ctcn = new ChiTietChucNang(this);
                ctcn.setVisible(true);

                String MaCNStr = tableChucNang.getValueAt(selectedRowCN, 1).toString();
                String TenCN = tableChucNang.getValueAt(selectedRowCN, 2).toString();

                ctcn.getTxtID().setText(MaCNStr);
                ctcn.getTxtName().setText(TenCN);

                int MaCN = Integer.parseInt(MaCNStr.substring(2));
                ArrayList<String> listAction = cnBUS.getListAction(MaCN);
                for (String action : listAction) {
                    switch (action) {
                        case "Thêm":
                            ctcn.getTblAction().setValueAt(true, 0, 1);
                            break;
                        case "Sửa":
                            ctcn.getTblAction().setValueAt(true, 1, 1);
                            break;
                        case "Xóa":
                            ctcn.getTblAction().setValueAt(true, 2, 1);
                            break;
                        case "Truy Cập":
                            ctcn.getTblAction().setValueAt(true, 3, 1);
                            break;
                        default:
                            break;
                    }
                }
                
            }
        } else {
            int selectedRowNQ = tableNhomQuyen.getSelectedRow();
            if (selectedRowNQ == -1) {
                sharedFunction.displayErrorMessage("Vui lòng chọn quyền cần sửa");
                return;
            } else {
                ChiTietQuyen ctq = new ChiTietQuyen(this);
                ctq.setVisible(true);

                String MaNQStr = tableNhomQuyen.getValueAt(selectedRowNQ, 1).toString();
                String TenNQ = tableNhomQuyen.getValueAt(selectedRowNQ, 2).toString();
                String MoTa = tableNhomQuyen.getValueAt(selectedRowNQ, 3).toString();

                ctq.getTxtID().setText(MaNQStr);
                ctq.getTxtName().setText(TenNQ);
                ctq.getTxtDes().setText(MoTa);

                int MaNQ = Integer.parseInt(MaNQStr.substring(2));
                ArrayList<CTQuyenDTO> listCTQ = ctqBUS.getListCTQ(MaNQ);

                for (CTQuyenDTO ctqDTO : listCTQ) {
                    int MaCN = ctqDTO.getMaCN();
                    String MaCNStr = String.format("CN%02d", MaCN);
                    String HanhDong = ctqDTO.getHanhDong();
                    for (int i = 0; i < ctq.getTableCTQuyen().getRowCount(); ++i) {
                        String MaCNTbl = ctq.getTableCTQuyen().getValueAt(i, 0).toString();
                        String HanhDongTbl = ctq.getTableCTQuyen().getValueAt(i, 2).toString();
                        if (MaCNStr.equals(MaCNTbl) && HanhDong.equals(HanhDongTbl)) {
                            ctq.getTableCTQuyen().setValueAt(true, i, 3);
                        }
                    }
                }

            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        // TODO add your handling code here:
        btnTimKiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        // TODO add your handling code here:
        btnTimKiem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        // TODO add your handling code here:
        btnThem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        // TODO add your handling code here:
        btnThem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnThemMouseExited

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
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemFocusLost

    private void txtTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemMouseEntered

    private void txtTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        // TODO add your handling code here:
        btnXoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        // TODO add your handling code here:
        btnThem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        currentBackgroundColor = lblChucNang.getBackground();
        // xử lý việc thêm sửa xóa cho bảng thể loại hay bảng sản phẩm
        if (currentBackgroundColor.equals(targetColor)) {
            int selectedRowNQ = tableChucNang.getSelectedRow();
            if (selectedRowNQ == -1) {
                sharedFunction.displayErrorMessage("Vui lòng chọn chức năng cần xóa");
                return;
            } else {
                int ans = JOptionPane.showConfirmDialog(null, "Xác nhận xóa chức năng này", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (ans == JOptionPane.YES_OPTION) {
                    String MaCNStr = tableChucNang.getValueAt(selectedRowNQ, 1).toString();
                    int MaCN = Integer.parseInt(MaCNStr.substring(2));
                    boolean deleteCN = cnBUS.XoaChucNang(MaCN);
                    if (deleteCN) {
                        JOptionPane.showMessageDialog(null, "Xóa chức năng thành công!!");
                        cnBUS.createTableRole(modelChucNang);
                    }
                }
            }
        } else {
            int selectedRowNQ = tableNhomQuyen.getSelectedRow();
            if (selectedRowNQ == -1) {
                sharedFunction.displayErrorMessage("Vui lòng chọn quyền cần xóa");
                return;
            } else {
                int ans = JOptionPane.showConfirmDialog(null, "Xác nhận xóa nhóm quyền này", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (ans == JOptionPane.YES_OPTION) {
                    String MaNQStr = tableNhomQuyen.getValueAt(selectedRowNQ, 1).toString();
                    int MaNQ = Integer.parseInt(MaNQStr.substring(2));
                    boolean deleteNQ = nqBUS.xoaNhomQuyen(MaNQ);
                    if (deleteNQ) {
                        JOptionPane.showMessageDialog(null, "Xóa nhóm quyền thành công!!");
                        nqBUS.createTablePer(modelNhomQuyen);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void pnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnTableMouseClicked

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLammoiActionPerformed

    public JTable createTablePhanQuyen() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Nhóm quyền", "Tên nhóm quyền", "Mô tả"};
        // Tạo DefaultTableModel với dữ liệu và tiêu đề cột
        modelNhomQuyen = new DefaultTableModel();
        modelNhomQuyen.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(modelNhomQuyen);
        TableColumnModel columnModel = table.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(70); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(200); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(300); // Độ rộng cột 2
        columnModel.getColumn(3).setPreferredWidth(439); // Độ rộng cột 2
        sharedFunction.EditHeaderTable(table);
        sharedFunction.EditTableContent(table);
        return table;
    }

    public JTable createTableChucNang() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Chức Năng", "Tên chức năng"};
        // Tạo DefaultTableModel với dữ liệu và tiêu đề cột
        modelChucNang = new DefaultTableModel();
        modelChucNang.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(modelChucNang);
        TableColumnModel columnModel = table.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(70); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(200); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(739); // Độ rộng cột 2

        sharedFunction.EditHeaderTable(table);
        sharedFunction.EditTableContent(table);

        return table;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnLammoi;
    private Components.ButtonRadius btnSua;
    private Components.ButtonRadius btnThem;
    private Components.ButtonRadius btnTimKiem;
    private Components.ButtonRadius btnXoa;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelTimKiem;
    private javax.swing.JLabel lblChucNang;
    private javax.swing.JLabel lblPhanQuyen;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
