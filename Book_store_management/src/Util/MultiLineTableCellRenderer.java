/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author ASUS
 */

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

public class MultiLineTableCellRenderer extends DefaultTableCellRenderer {
    private final JTextArea textArea = new JTextArea();

    public MultiLineTableCellRenderer() {
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value != null) {
            textArea.setText("<html>" + value.toString().replace("\n", "<br/>") + "</html>");
        } else {
            textArea.setText("");
        }
        return textArea;
    }
}
