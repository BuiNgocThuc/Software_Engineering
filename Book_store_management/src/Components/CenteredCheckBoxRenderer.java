///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Components;
//
///**
// *
// * @author ASUS
// */
//import javax.swing.*;
//import javax.swing.table.DefaultTableCellRenderer;
//import java.awt.*;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import javax.swing.table.JTableHeader;
//import javax.swing.table.TableColumn;
//
//public class CenteredCheckBoxRenderer extends DefaultTableCellRenderer {
//
//    private JCheckBox checkBox;
//    private boolean isHeaderCheckBoxSelected = false;
//
//    public CenteredCheckBoxRenderer(JTable table) {
//        checkBox = new JCheckBox();
//        checkBox.setHorizontalAlignment(JCheckBox.CENTER);
//        // Khai báo biến để lưu trạng thái checkbox
//
//// Thêm sự kiện cho checkbox trên header
//        checkBox.addItemListener(new ItemListener() {
//
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    isHeaderCheckBoxSelected = true;
//                } else {
//                    isHeaderCheckBoxSelected = false;
//                }
//
//                // Gọi hàm để thay đổi màu các ô trong cột
//                JTableHeader header = table.getTableHeader(); // Lấy đối tượng header từ bảng
//
//// Sử dụng đối tượng header để lấy cột đang được thay đổi màu
//                TableColumn resizingColumn = header.getResizingColumn();
//
//// Sử dụng resizingColumn để thay đổi màu các ô trong cột
//                changeColumnColor(resizingColumn,table);
//
//            }
//        }
//        );
//
//    }
//// Hàm để thay đổi màu các ô trong cột
//
//    private void changeColumnColor(TableColumn column,JTable table) {
//        if (isHeaderCheckBoxSelected) {
//            // Thay đổi màu các ô trong cột thành màu đỏ
//            int columnIndex = column.getModelIndex();
//            for (int row = 0; row < table.getRowCount(); row++) {
//                table.setValueAt(Color.RED, row, columnIndex);
//            }
//        } else {
//            // Thay đổi màu các ô trong cột về màu gốc (ví dụ: màu trắng)
//            int columnIndex = column.getModelIndex();
//            for (int row = 0; row < table.getRowCount(); row++) {
//                table.setValueAt(Color.WHITE, row, columnIndex);
//            }
//        }
//    }
//
//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        return checkBox;
//    }
//}
