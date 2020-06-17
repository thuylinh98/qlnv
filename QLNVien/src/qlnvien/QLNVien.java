/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class QLNVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <nhanvien> nhanvienList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        //---------------------------------
        
        //---------------------------
        try {
            // lấy danh sách nv
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv", "linh", "12345678");
            // truy vấn
//            String sql = "select * from nhanvien";
//            statement = connection.createStatement();
//            
//            ResultSet resultSet = statement.executeQuery(sql);
//            
//            while (resultSet.next()) {                
//                nhanvien nv = new nhanvien(resultSet.getInt("id_NV"), 
//                        resultSet.getString("ten"), resultSet.getString("gioi_tinh"), 
//                        resultSet.getString("sdt"), resultSet.getString("ngay_sinh"), 
//                        resultSet.getString("dia_chi"));
//                nhanvienList.add(nv);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         
    }
    
}
