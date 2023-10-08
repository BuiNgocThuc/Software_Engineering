/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChucNangDAO;
import DTO.ChucNangDTO;
import java.util.ArrayList;

/**
 *
 * @author NGOC THUC
 */
public class ChucNangBUS {
    ChucNangDAO cnDAO = new ChucNangDAO();
    public ArrayList<ChucNangDTO> selectAll() {
        return cnDAO.selectAll();
    } 
}
