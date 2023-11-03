/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.CTHoaDonBUS;
import BUS.HoaDonBUS;
import DTO.CTHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.SanPhamDTO;
import Util.sharedFunction;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author NGOC THUC
 */
public final class HoaDonGUI extends javax.swing.JPanel {

    /**
     * Creates new form HoaDonGUI
     */
    private JTable tableHoaDon;
    private JTable tableChiTietHoaDon;
    private DefaultTableModel modelHoaDon;
    private DefaultTableModel modelChiTietHoaDon;
    HoaDonBUS hoaDonBUS = new HoaDonBUS();

    public HoaDonGUI() {

        initComponents();
        createTable();
        selectRow();
        sharedFunction.addPlaceholder(tfTimkiem, "Tìm kiếm theo mã hóa đơn");
    }

    private void createTable() {
        tableHoaDon = createTableHoaDon();
        ArrayList<HoaDonDTO> listHoaDon = hoaDonBUS.getAll();
        loadDataTableHoaDon(listHoaDon, modelHoaDon);
        tableHoaDon.setPreferredScrollableViewportSize(PanelTable1.getPreferredSize());
        JScrollPane scrollPaneSanPham = new JScrollPane(tableHoaDon);
        MatteBorder matteBorder = new MatteBorder(0, 1, 1, 1, new Color(164, 191, 226));
        scrollPaneSanPham.setBorder(matteBorder);
        PanelTable1.setLayout(new BorderLayout());
        PanelTable1.add(scrollPaneSanPham);
        tableChiTietHoaDon = createTableChiTietHoaDon();
        tableChiTietHoaDon.setPreferredScrollableViewportSize(PanelTable2.getPreferredSize());
        JScrollPane scrollPaneChitiet = new JScrollPane(tableChiTietHoaDon);
        scrollPaneChitiet.setBorder(matteBorder);
        PanelTable2.setLayout(new BorderLayout());
        PanelTable2.add(scrollPaneChitiet);
    }

    public void loadDataTableHoaDon(ArrayList<HoaDonDTO> listHoaDon, DefaultTableModel modelHoaDon) {
        modelHoaDon.setRowCount(0);
        int STT = 1;
        for (HoaDonDTO hd : listHoaDon) {
            int maHD = hd.getMaHD();
            String maHDtext = sharedFunction.FormatID("HD", maHD);
            String maNV = hd.getTenTK();
            Date ngayLap = hd.getNgayTao();
            Double TongTien = hd.getTongTien();
            Object[] row = {STT++, maHDtext, maNV, ngayLap, TongTien};
            modelHoaDon.addRow(row);
        }
    }

    public void selectRow() {
        tableHoaDon.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                loadDataTableThongTinChiTiet();

            }
        });
    }

    public void loadDataTableThongTinChiTiet() {
        modelChiTietHoaDon.setRowCount(0);
        int selectRow = tableHoaDon.getSelectedRow();
        if (selectRow >= 0) {
            String maHD = (String) tableHoaDon.getValueAt(selectRow, 1);
            int MaHD = sharedFunction.convertToInteger(maHD, "HD");
            CTHoaDonBUS cthd = new CTHoaDonBUS();
            ArrayList<CTHoaDonDTO> listCTHD = cthd.findHoaDonByMaHD(MaHD);
            int STT = 1;
            for (CTHoaDonDTO ct : listCTHD) {
                String tenSP = ct.getTenSP();
                int sl = ct.getSoLuong();
                double donGia = ct.getDonGia();
                Object[] row = {STT++, tenSP, sl, donGia};
                modelChiTietHoaDon.addRow(row);
            }
            String IdHoaDon = (String) tableHoaDon.getValueAt(selectRow, 1);
            String IdNhanVien = (String) tableHoaDon.getValueAt(selectRow, 2);
            Date NgayLap = (Date) tableHoaDon.getValueAt(selectRow, 3);
            Double TongTien = (Double) tableHoaDon.getValueAt(selectRow, 4);
            tfIDHoadon.setText(IdHoaDon);
            tfIDNhanvien.setText(IdNhanVien);
            tfNgaytao.setText(String.valueOf(NgayLap));
            tfTongtien.setText(String.valueOf(TongTien));
        }
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
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfIDHoadon = new javax.swing.JTextField();
        tfIDNhanvien = new javax.swing.JTextField();
        tfNgaytao = new javax.swing.JTextField();
        PanelTable2 = new javax.swing.JPanel();
        btnInHoaDon = new Components.ButtonRadius();
        tfTongtien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PanelTable1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfTimkiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnTimkiem = new Components.ButtonRadius();
        btnLamMoi = new Components.ButtonRadius();

        setPreferredSize(new java.awt.Dimension(1020, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 183, 58));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/order_1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 183, 58));
        jLabel6.setText("Quản lý hóa đơn");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(480, 620));

        jPanel5.setBackground(new java.awt.Color(135, 172, 217));
        jPanel5.setMaximumSize(new java.awt.Dimension(476, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(476, 40));
        jPanel5.setPreferredSize(new java.awt.Dimension(476, 40));

        jLabel2.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin chi tiết");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tfIDHoadon.setEditable(false);
        tfIDHoadon.setBackground(new java.awt.Color(255, 255, 255));
        tfIDHoadon.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfIDHoadon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "ID. Hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        tfIDHoadon.setEnabled(false);
        tfIDHoadon.setOpaque(true);

        tfIDNhanvien.setEditable(false);
        tfIDNhanvien.setBackground(new java.awt.Color(255, 255, 255));
        tfIDNhanvien.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfIDNhanvien.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "ID. Nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        tfIDNhanvien.setEnabled(false);

        tfNgaytao.setEditable(false);
        tfNgaytao.setBackground(new java.awt.Color(255, 255, 255));
        tfNgaytao.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfNgaytao.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Ngày lập hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        tfNgaytao.setEnabled(false);

        PanelTable2.setBackground(new java.awt.Color(255, 255, 255));
        PanelTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(135, 172, 217)));
        PanelTable2.setPreferredSize(new java.awt.Dimension(438, 320));

        javax.swing.GroupLayout PanelTable2Layout = new javax.swing.GroupLayout(PanelTable2);
        PanelTable2.setLayout(PanelTable2Layout);
        PanelTable2Layout.setHorizontalGroup(
            PanelTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        PanelTable2Layout.setVerticalGroup(
            PanelTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        btnInHoaDon.setForeground(new java.awt.Color(135, 172, 217));
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/print.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.setFocusPainted(false);
        btnInHoaDon.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        btnInHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInHoaDon.setIconTextGap(0);
        btnInHoaDon.setMargin(new java.awt.Insets(2, -10, 3, 0));
        btnInHoaDon.setPreferredSize(new java.awt.Dimension(140, 40));
        btnInHoaDon.setRadius(40);
        btnInHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInHoaDonMouseExited(evt);
            }
        });
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        tfTongtien.setEditable(false);
        tfTongtien.setBackground(new java.awt.Color(255, 255, 255));
        tfTongtien.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 14)); // NOI18N
        tfTongtien.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Tổng tiền", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        tfTongtien.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(135, 172, 217));
        jLabel3.setText("Chi tiết hóa đơn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTongtien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfIDNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfNgaytao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelTable2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIDHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIDNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(tfTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        PanelTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 1, true));
        PanelTable1.setMinimumSize(new java.awt.Dimension(480, 620));
        PanelTable1.setPreferredSize(new java.awt.Dimension(480, 630));

        javax.swing.GroupLayout PanelTable1Layout = new javax.swing.GroupLayout(PanelTable1);
        PanelTable1.setLayout(PanelTable1Layout);
        PanelTable1Layout.setHorizontalGroup(
            PanelTable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelTable1Layout.setVerticalGroup(
            PanelTable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(243, 243, 244));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true));
        jPanel4.setMaximumSize(new java.awt.Dimension(660, 34));
        jPanel4.setPreferredSize(new java.awt.Dimension(660, 34));

        tfTimkiem.setBackground(new java.awt.Color(243, 243, 244));
        tfTimkiem.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 18)); // NOI18N
        tfTimkiem.setForeground(new java.awt.Color(135, 172, 217));
        tfTimkiem.setBorder(null);
        tfTimkiem.setHighlighter(null);
        tfTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTimkiemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfTimkiemMouseExited(evt);
            }
        });
        tfTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimkiemActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(243, 243, 244));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        btnTimkiem.setBorder(null);
        btnTimkiem.setForeground(new java.awt.Color(135, 172, 217));
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/search.png"))); // NOI18N
        btnTimkiem.setText("Tìm");
        btnTimkiem.setFocusPainted(false);
        btnTimkiem.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 17)); // NOI18N
        btnTimkiem.setMaximumSize(new java.awt.Dimension(100, 40));
        btnTimkiem.setPreferredSize(new java.awt.Dimension(100, 40));
        btnTimkiem.setRadius(40);
        btnTimkiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseExited(evt);
            }
        });
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });
        btnTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimkiemKeyPressed(evt);
            }
        });

        btnLamMoi.setBorder(null);
        btnLamMoi.setForeground(new java.awt.Color(135, 172, 217));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/back.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setFocusPainted(false);
        btnLamMoi.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 17)); // NOI18N
        btnLamMoi.setIconTextGap(0);
        btnLamMoi.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLamMoi.setMaximumSize(new java.awt.Dimension(100, 40));
        btnLamMoi.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLamMoi.setRadius(40);
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseExited(evt);
            }
        });
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PanelTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(PanelTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInHoaDonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInHoaDonMouseClicked

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void tfTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimkiemActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        String searchKeyword = tfTimkiem.getText().trim();
        if (searchKeyword.isEmpty()) {
            sharedFunction.addPlaceholder(tfTimkiem, "Tìm kiếm theo mã hóa đơn");
        }
        findHoaDonByMaHD(tfTimkiem.getText(), modelHoaDon);
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        modelChiTietHoaDon.setRowCount(0);
        modelHoaDon.setRowCount(0);
        ArrayList<HoaDonDTO> listHoaDon = hoaDonBUS.getAll();
        loadDataTableHoaDon(listHoaDon, modelHoaDon);
//        tfTimkiem.setText("Tìm kiếm theo mã hóa đơn");
        tfIDHoadon.setText("");
        tfIDNhanvien.setText("");
        tfNgaytao.setText("");
        tfTongtien.setText("");

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnLamMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseEntered
        // TODO add your handling code here:
        btnLamMoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLamMoiMouseEntered

    private void btnLamMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseExited
        // TODO add your handling code here:
        btnLamMoi.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLamMoiMouseExited

    private void btnInHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInHoaDonMouseEntered
        // TODO add your handling code here:
        btnInHoaDon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnInHoaDonMouseEntered

    private void btnInHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInHoaDonMouseExited
        // TODO add your handling code here:
        btnInHoaDon.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnInHoaDonMouseExited

    private void btnTimkiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseEntered
        // TODO add your handling code here:
        btnTimkiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnTimkiemMouseEntered

    private void btnTimkiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseExited
        // TODO add your handling code here:
        btnTimkiem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTimkiemMouseExited

    private void tfTimkiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTimkiemMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimkiemMouseExited

    private void tfTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTimkiemMouseClicked
        // TODO add your handling code here:
        tfTimkiem.setFocusable(true);
    }//GEN-LAST:event_tfTimkiemMouseClicked

    private void btnTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimkiemKeyPressed
        // TODO add your handling code here:
        // Kiểm tra xem phím bấm có phải là Enter không
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Lấy dữ liệu tìm kiếm và xử lý nếu là Enter
        String searchKeyword = tfTimkiem.getText().trim();
        if (searchKeyword.isEmpty()) {
            sharedFunction.addPlaceholder(tfTimkiem, "Tìm kiếm theo mã hóa đơn");
        } else {
            findHoaDonByMaHD(searchKeyword, modelHoaDon);
        }
    }
           
    }//GEN-LAST:event_btnTimkiemKeyPressed

    public JTable createTableChiTietHoaDon() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "Tên sản phẩm", "Số lượng", "Thành tiền"};
        modelChiTietHoaDon = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0 || columnIndex == 2) { // Cột STT và Số lượng
                    return Integer.class; // Kiểu dữ liệu Integer

                } else if (columnIndex == 3) { // Cột Đơn giá
                    return Double.class; // Kiểu dữ liệu Float

                }
                return String.class; // Các cột khác có kiểu dữ liệu String
            }
        };
        modelChiTietHoaDon.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(modelChiTietHoaDon);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(250); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(150); // Độ rộng cột 2
        columnModel.getColumn(3).setPreferredWidth(150); // Độ rộng cột 3

        NhapHangGUI.EditHeaderTable2(table);
        sharedFunction.EditTableContent(table);
        table.setBorder(null);
        return table;
    }

    public JTable createTableHoaDon() {
        // Tiêu đề của các cột
        String[] columnNames = {"STT", "ID Hóa đơn", "ID Nhân viên", "Ngày lập", "Tổng tiền"};
        modelHoaDon = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) { // Cột STT và Số lượng
                    return Integer.class; // Kiểu dữ liệu Integer

                } else if (columnIndex == 4) { // Cột Đơn giá
                    return Double.class; // Kiểu dữ liệu Float

                }
                return String.class; // Các cột khác có kiểu dữ liệu String
            }
        };
        modelHoaDon.setColumnIdentifiers(columnNames);
        // Tạo JTable với DefaultTableModel
        JTable table = new JTable(modelHoaDon);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60); // Độ rộng cột 0
        columnModel.getColumn(1).setPreferredWidth(200); // Độ rộng cột 1
        columnModel.getColumn(2).setPreferredWidth(200); // Độ rộng cột 2
        columnModel.getColumn(3).setPreferredWidth(200); // Độ rộng cột 3
        columnModel.getColumn(4).setPreferredWidth(200); // Độ rộng cột 6

        sharedFunction.EditHeaderTable(table);
        sharedFunction.EditTableContent(table);
        return table;
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

    public void findHoaDonByMaHD(String maHD, DefaultTableModel model) {
        if (maHD.isEmpty() || maHD.trim().equals("Tìm kiếm theo mã hóa đơn")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int maHDnumber = sharedFunction.convertToInteger(maHD, "HD");
            if (maHDnumber == -1) {
                // Nếu maSP không hợp lệ hoặc không thể chuyển thành số nguyên, thông báo 
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // MaSP có thể chuyển thành số nguyên, tiến hành gọi phương thức từ lớp BUS để tìm kiếm
                ArrayList<HoaDonDTO> listHoaDon = hoaDonBUS.findHoaDonByMaHD(maHDnumber);
                if (!listHoaDon.isEmpty()) {
                    loadDataTableHoaDon(listHoaDon, model);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTable1;
    private javax.swing.JPanel PanelTable2;
    private Components.ButtonRadius btnInHoaDon;
    private Components.ButtonRadius btnLamMoi;
    private Components.ButtonRadius btnTimkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField tfIDHoadon;
    private javax.swing.JTextField tfIDNhanvien;
    private javax.swing.JTextField tfNgaytao;
    private javax.swing.JTextField tfTimkiem;
    private javax.swing.JTextField tfTongtien;
    // End of variables declaration//GEN-END:variables
}
