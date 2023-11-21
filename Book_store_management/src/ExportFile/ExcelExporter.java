package ExportFile;

import DTO.ThongKe.ThongKeDoanhThuDTO;
import Util.sharedFunction;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExcelExporter {

    private static CellStyle createCenterCellStyle(Workbook workbook) {
        CellStyle centerStyle = workbook.createCellStyle();
        centerStyle.setAlignment(HorizontalAlignment.CENTER);
        return centerStyle;
    }

    private static CellStyle createTitleCellStyle(Workbook workbook, int fontSize) {
        CellStyle titleStyle = workbook.createCellStyle();

        // Kết hợp các thuộc tính từ createBoldCellStyle và createCenterCellStyle
        Font titleFont = workbook.createFont();
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) fontSize);

        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleStyle.setWrapText(true);
        return titleStyle;
    }

    private static CellStyle createBoldCenterCellStyle(Workbook workbook, int fontSize) {
        // Tạo CellStyle cho tiêu đề cột in đậm và căn giữa
        CellStyle boldCenterStyle = workbook.createCellStyle();

        Font boldFont = workbook.createFont();
        boldFont.setBold(true);
        boldFont.setFontHeightInPoints((short) fontSize); // Đặt cỡ chữ

        boldCenterStyle.setFont(boldFont);
        boldCenterStyle.setAlignment(HorizontalAlignment.CENTER);

        return boldCenterStyle;
    }

    public static void exportToExcel(JTable dataTable, String filePath, String namBatDau, String namKetThuc, String nguoiTao, String reportType) {
        Workbook workbook = new XSSFWorkbook();

        try {
            File file = new File(filePath);
            if (file.exists()) {
                // File đã tồn tại
                sharedFunction.displayErrorMessage("File đã tồn tại");
                return;
            }
            String titleText = PdfExporter.generateTitle(namBatDau, namKetThuc, reportType);;

            Sheet sheet = workbook.createSheet(titleText);

            // Tạo CellStyle cho tiêu đề
            CellStyle titleStyle = createTitleCellStyle(workbook, 16);

            // Thêm tiêu đề và ngày tạo vào sheet
            Row titleRow = sheet.createRow(0);
            Cell titleCell = titleRow.createCell(0);
            int numberOfColumns = dataTable.getColumnCount();
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, numberOfColumns +3));
            titleCell.setCellStyle(titleStyle);
            titleCell.setCellValue(titleText);

            Row dateRow = sheet.createRow(1);
            Cell dateCell = dateRow.createCell(0);
            dateCell.setCellValue("Ngày Tạo: " + sharedFunction.getCurrentDateTime());
            sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, numberOfColumns - 1));
            Row employeeRow = sheet.createRow(2);
            Cell employeeCell = employeeRow.createCell(0);
            employeeCell.setCellValue("Nhân Viên: " + nguoiTao);
            sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, numberOfColumns - 1));
            // Thêm khoảng trắng giữa ngày tạo và người tạo
            sheet.createRow(3);

            // Thêm bảng vào sheet
            createTable(sheet, dataTable, workbook);

            // Ghi workbook xuống file
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }

            JOptionPane.showMessageDialog(null, "Xuất file thành công");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Sheet sheet, JTable dataTable, Workbook workbook) {
        Row headerRow = sheet.createRow(4);

        CellStyle boldCenterStyle = createBoldCenterCellStyle(workbook, 14);

        // Thêm tiêu đề cột
        for (int col = 0; col < dataTable.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(dataTable.getColumnName(col));
            cell.setCellStyle(boldCenterStyle);
        }

        // Thêm dữ liệu từ JTable
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        int rowNum = 5;
        for (int row = 0; row < rowCount; row++) {
            Row dataRow = sheet.createRow(rowNum++);
            for (int col = 0; col < colCount; col++) {
                Cell cell = dataRow.createCell(col);
                cell.setCellValue(String.valueOf(model.getValueAt(row, col)));
                cell.setCellStyle(createCenterCellStyle(workbook));
            }
        }

        // Tự động đặt độ rộng cột dựa trên nội dung
        for (int i = 0; i < colCount; i++) {
            sheet.autoSizeColumn(i);
        }
    }
}
