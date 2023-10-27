/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ASUS
 */
public class sharedFunction {

    private static  int mouseX, mouseY;

    public static  void moveLayout(JFrame jframe, JPanel panel ){
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                jframe.setLocation(x - mouseX, y - mouseY);
            }
        });
    }

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

    public static void EditTableContent(JTable table) {
        // Đặt độ cao cho từng dòng (trừ header)
        int rowHeight = 30;
        table.setRowHeight(rowHeight);
        table.setGridColor(new Color(153, 184, 224));
        table.setShowGrid(true);
        table.setBackground(Color.WHITE);
        table.setSelectionBackground(Color.WHITE);
        table.setSelectionForeground(new Color(253, 191, 84));
        table.setFocusable(false);
        table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Font font = new Font("Segoe UI", Font.PLAIN, 16);
        table.setFont(font);
        // Căn giữa nội dung trong các ô chữ
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        // Vô hiệu hóa sắp xếp cột tự động
        // table.setAutoCreateRowSorter(false);
        // Vô hiệu hóa kéo cột
        table.getTableHeader().setReorderingAllowed(false);
        // Vô hiệu hóa kéo dãng cột
        table.getTableHeader().setResizingAllowed(false);
    }


}
