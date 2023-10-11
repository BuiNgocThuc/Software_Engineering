package Components;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class HeaderRenderer extends DefaultTableCellRenderer {
    private int horizontalAlignment;
    private Font font;

    public HeaderRenderer(int horizontalAlignment, Font font) {
        this.horizontalAlignment = horizontalAlignment;
        this.font = font;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setHorizontalAlignment(horizontalAlignment);
        setFont(font);
        return this;
    }
}
