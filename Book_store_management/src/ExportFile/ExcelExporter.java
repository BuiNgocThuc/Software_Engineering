package ExportFile;

import DTO.ThongKe.ThongKeDoanhThuDTO;
import Util.sharedFunction;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExcelExporter {

    public static void exportToExcel(ArrayList<ThongKeDoanhThuDTO> invoiceItems, String filePath, String namBatDau, String namKetThuc, String nguoiTao) {
        Workbook workbook = new XSSFWorkbook();

        try {
            File file = new File(filePath);
            if (file.exists()) {
                // File đã tồn tại
                sharedFunction.displayErrorMessage("File đã tồn tại");
                return;
            }
            String titleText = "Báo Cáo Doanh Thu ";
            if (namBatDau.equals(namKetThuc)) {
                titleText += namBatDau;
            } else {
                titleText += "Từ " + namBatDau + " Đến " + namKetThuc;
            }
            Sheet sheet = workbook.createSheet(titleText);

            // Tạo CellStyle cho tiêu đề
            CellStyle titleStyle = createTitleCellStyle(workbook, 18);

            // Thêm tiêu đề và ngày tạo vào sheet
            Row titleRow = sheet.createRow(0);
            Cell titleCell = titleRow.createCell(0);
            titleCell.setCellStyle(titleStyle);
            titleCell.setCellValue(titleText);

            int numberOfColumns = 5;
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, numberOfColumns - 1));

            Row dateRow = sheet.createRow(1);
            Cell dateCell = dateRow.createCell(0);
            dateCell.setCellValue("Ngày Tạo: " + getCurrentDateTime());
            sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, numberOfColumns - 1));
            Row employeeRow = sheet.createRow(2);
            Cell employeeCell = employeeRow.createCell(0);
            employeeCell.setCellValue("Nhân Viên: " + nguoiTao);
            sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, numberOfColumns - 1));
            // Thêm khoảng trắng giữa ngày tạo và người tạo
            sheet.createRow(3);

            // Thêm bảng vào sheet
            createTable(sheet, invoiceItems, workbook);

            // Ghi workbook xuống file
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }

            JOptionPane.showMessageDialog(null, "Xuất file thành công");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Sheet sheet, ArrayList<ThongKeDoanhThuDTO> invoiceItems, Workbook workbook) {
        Row headerRow = sheet.createRow(4);

        CellStyle boldCenterStyle = createBoldCenterCellStyle(workbook, 14);
       

        Cell cellYear = headerRow.createCell(1);
        cellYear.setCellValue("Năm");
        cellYear.setCellStyle(boldCenterStyle);
   

        Cell cellCapital = headerRow.createCell(2);
        cellCapital.setCellValue("Vốn");
        cellCapital.setCellStyle(boldCenterStyle);
        

        Cell cellRevenue = headerRow.createCell(3);
        cellRevenue.setCellValue("Doanh Thu");
        cellRevenue.setCellStyle(boldCenterStyle);
  

        Cell cellProfit = headerRow.createCell(4);
        cellProfit.setCellValue("Lợi nhuận");
        cellProfit.setCellStyle(boldCenterStyle);

        // Thêm dữ liệu từ danh sách
        int rowNum = 5;
        for (ThongKeDoanhThuDTO item : invoiceItems) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(1).setCellValue(item.getThoiGian());
            row.createCell(2).setCellValue(sharedFunction.formatVND(item.getVon()));
            row.createCell(3).setCellValue(sharedFunction.formatVND(item.getDoanhThu()));
            row.createCell(4).setCellValue(sharedFunction.formatVND(item.getLoiNhuan()));
        }

        // Tự động đặt độ rộng cột dựa trên nội dung
        for (int i = 1; i < 5; i++) {
            sheet.autoSizeColumn(i);
        }

        // Căn giữa nội dung của bảng
        for (int i = 1; i < 5; i++) {
            sheet.setDefaultColumnStyle(i, createCenterCellStyle(workbook));
        }
    }

    public static String chooseFilePath() {
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            return filePath;
        } else {
            return null;
        }
    }

    private static String getCurrentDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }


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

}
