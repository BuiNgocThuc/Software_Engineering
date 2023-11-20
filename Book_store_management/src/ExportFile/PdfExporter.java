/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExportFile;

import DTO.ThongKe.ThongKeDoanhThuDTO;
import Util.sharedFunction;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PdfExporter {

    private static final String FONT_PATH = "Libraries/Font/TimesNewRoman/SVN-Times New Roman.ttf";

//    public static void exportToPdf(ArrayList<ThongKeDoanhThuDTO> invoiceItems, String filePath, String namBatDau, String namKetThuc, String nguoiTao) {
//        Document document = new Document();
//
//        try {
//            Font fontTitle = setFont(FONT_PATH, 14, Font.BOLD, BaseColor.BLACK);
//            Font fontNormal = setFont(FONT_PATH, 12, Font.NORMAL, BaseColor.BLACK);
//            File file = new File(filePath);
//            if (file.exists()) {
//                // File đã tồn tại
//                sharedFunction.displayErrorMessage("File đã tồn tại");
//                return;
//            }
//
//            PdfWriter.getInstance(document, new FileOutputStream(filePath));
//            document.open();
//
//            // Thêm tiêu đề và ngày tạo vào tài liệu
//            String titleText = "Báo Cáo Doanh Thu ";
//            if (namBatDau.equals(namKetThuc)) {
//                titleText += namBatDau;
//            } else {
//                titleText += "Từ Năm " + namBatDau + " Đến Năm " + namKetThuc;
//            }
//
//            Paragraph title = new Paragraph(titleText, fontTitle);
//            title.setAlignment(Element.ALIGN_CENTER);
//            document.add(title);
//            document.add(Chunk.NEWLINE);
//            // Thêm ngày tạo và người tạo cùng một hàng
//            Paragraph ngayTaoVaNguoiTao = new Paragraph( "Nhân Viên: " + nguoiTao+ "                                                                     Ngày Tạo: " + getCurrentDateTime() , fontNormal);
//            ngayTaoVaNguoiTao.setAlignment(Element.ALIGN_JUSTIFIED);
//            document.add(ngayTaoVaNguoiTao);
//
//            // Thêm khoảng trắng giữa ngày tạo và người tạo
//            document.add(new Paragraph(" "));
//
//            // Thêm bảng vào tài liệu
//            PdfPTable table = createTable(invoiceItems);
//            document.add(table);
//
//            JOptionPane.showMessageDialog(null, "Xuất file thành công");
//
//        } catch (DocumentException | IOException e) {
//            e.printStackTrace();
//        } finally {
//            document.close();
//        }
//    }
    public static void exportToPdf(ArrayList<ThongKeDoanhThuDTO> invoiceItems, String filePath, String namBatDau, String namKetThuc, String nguoiTao, String reportType) {
        Document document = new Document();

        try {
            Font fontTitle = setFont(FONT_PATH, 14, Font.BOLD, BaseColor.BLACK);
            Font fontNormal = setFont(FONT_PATH, 12, Font.NORMAL, BaseColor.BLACK);
            File file = new File(filePath);
            if (file.exists()) {
                // File đã tồn tại
                sharedFunction.displayErrorMessage("File đã tồn tại");
                return;
            }

            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Thêm tiêu đề và ngày tạo vào tài liệu
            String titleText = generateTitle(namBatDau, namKetThuc, reportType);
            Paragraph title = new Paragraph(titleText, fontTitle);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(Chunk.NEWLINE);

            // Thêm ngày tạo và người tạo cùng một hàng
            Paragraph ngayTaoVaNguoiTao = new Paragraph("Nhân Viên: " + nguoiTao + "                                                                     Ngày Tạo: " + getCurrentDateTime(), fontNormal);
            ngayTaoVaNguoiTao.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(ngayTaoVaNguoiTao);

            // Thêm khoảng trắng giữa ngày tạo và người tạo
            document.add(new Paragraph(" "));

            // Thêm bảng vào tài liệu
            PdfPTable table = createTable(invoiceItems,reportType);
            document.add(table);

            JOptionPane.showMessageDialog(null, "Xuất file thành công");

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }

    private static String generateTitle(String namBatDau, String namKetThuc, String reportType) {
        switch (reportType) {
            case "NamBatDauNamKetThuc" -> {
                if (namBatDau.equals(namKetThuc)) {
                    return "Báo Cáo Doanh Thu Năm " + namBatDau;
                } else {
                    return "Báo Cáo Doanh Thu Từ Năm " + namBatDau + " Đến Năm " + namKetThuc;
                }
            }
            case "Nam" -> {
                return "Báo Cáo Doanh Thu Năm " + namBatDau;
            }
            case "Thang" -> {
                return "Báo Cáo Doanh Thu Năm " + namBatDau + " của  " + namKetThuc;
            }
            case "NgayDenNgay" -> {
                return "Báo Cáo Doanh Thu Từ Ngày " + namBatDau + " Đến Ngày " + namKetThuc;
            }
            default -> {
                return "Báo Cáo Doanh Thu";
            }
        }
    }

//    private static PdfPTable createTable(ArrayList<ThongKeDoanhThuDTO> invoiceItems) throws DocumentException {
//        PdfPTable table = new PdfPTable(4);
//        table.setWidthPercentage(100);
//
//        Font fontTitle = setFont(FONT_PATH, 14, Font.BOLD, BaseColor.BLACK);
//        Font fontNormal = setFont(FONT_PATH, 12, Font.NORMAL, BaseColor.BLACK);
//
//        // Thêm tiêu đề cột
//        table.addCell(createCell("Năm", fontTitle));
//        table.addCell(createCell("Vốn", fontTitle));
//        table.addCell(createCell("Doanh Thu", fontTitle));
//        table.addCell(createCell("Lợi nhuận", fontTitle));
//
//        // Thêm dữ liệu từ danh sách
//        for (ThongKeDoanhThuDTO item : invoiceItems) {
//            table.addCell(createCell(String.valueOf(item.getThoiGian()), fontNormal));
//            table.addCell(createCell(sharedFunction.formatVND(item.getVon()) + " đ", fontNormal));
//            table.addCell(createCell(sharedFunction.formatVND(item.getDoanhThu()) + " đ", fontNormal));
//            table.addCell(createCell(sharedFunction.formatVND(item.getLoiNhuan()) + " đ", fontNormal));
//        }
//
//        return table;
//    }
    private static PdfPTable createTable(ArrayList<ThongKeDoanhThuDTO> invoiceItems, String reportType) throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);

        Font fontTitle = setFont(FONT_PATH, 14, Font.BOLD, BaseColor.BLACK);
        Font fontNormal = setFont(FONT_PATH, 12, Font.NORMAL, BaseColor.BLACK);

        // Thêm tiêu đề cột dựa vào loại báo cáo
        switch (reportType) {
            case "Nam" ->
                table.addCell(createCell("Tháng", fontTitle));
            case "Thang" ->
                table.addCell(createCell("Ngày", fontTitle));
            case "NgayDenNgay" ->
                table.addCell(createCell("Ngày", fontTitle));
            default ->
                table.addCell(createCell("Năm", fontTitle));
        }

        table.addCell(createCell("Vốn", fontTitle));
        table.addCell(createCell("Doanh Thu", fontTitle));
        table.addCell(createCell("Lợi nhuận", fontTitle));

        // Thêm dữ liệu từ danh sách
        for (ThongKeDoanhThuDTO item : invoiceItems) {
             table.addCell(createCell(String.valueOf(item.getThoiGian()), fontNormal));           
            table.addCell(createCell(sharedFunction.formatVND(item.getVon()) + " đ", fontNormal));
            table.addCell(createCell(sharedFunction.formatVND(item.getDoanhThu()) + " đ", fontNormal));
            table.addCell(createCell(sharedFunction.formatVND(item.getLoiNhuan()) + " đ", fontNormal));
        }

        return table;
    }

    private static PdfPCell createCell(String content, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(content, font));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        // Đặt giá trị cho padding
        cell.setPadding(5f);
        return cell;
    }

    public static String chooseFilePath() {
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            return filePath;
        } else {
            return null;
        }
    }

    private static Font setFont(String fontPath, int size, int style, BaseColor color) {
        try {
            BaseFont unicodeFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            return new Font(unicodeFont, size, style, color);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            return new Font(Font.FontFamily.TIMES_ROMAN, size, style, color);
        }
    }

    private static String getCurrentDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
