/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class CustomTabRenderer extends DefaultListCellRenderer {
    private Border border = BorderFactory.createLineBorder(Color.RED);

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        setBorder(border); // Đặt đường viền cho tiêu đề tab
        return this;
    }
}
