/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TheLoaiDAO;
import DTO.TheLoaiDTO;

import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class TheLoaiBUS {
    private TheLoaiDAO theLoaiDAO;

    public TheLoaiBUS() {
        theLoaiDAO = new TheLoaiDAO(); // Khởi tạo lớp DAO
    }

    public ArrayList <TheLoaiDTO> getAll(){
       return theLoaiDAO.selectAll();
    }
    // Hàm load dữ liệu từ DAO và trả về một danh sách các thể loại
 

    
}
