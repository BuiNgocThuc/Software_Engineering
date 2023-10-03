/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoConnectDB;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOC THUC
 */
public class testBUS {

    testDAO testDAO = new testDAO();
    private ArrayList<testDTO> arrTH;

    public ArrayList<testDTO> selectALL() {
        System.out.println(testDAO.selectAll());
        return testDAO.selectAll();
    }

    public static void main(String[] args) {

    }
}
