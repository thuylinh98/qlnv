/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class nhanvienModify {

    public static List<nhanvien> findAll() {
        List<nhanvien> nhanvienList = new ArrayList<>();
        Statement statement = null;
        //---------------------------------

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/qlnv?serverTimezone=UTC", "root", "")) {

            //...
            String sql = "select * from nhanvien";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                nhanvien nv = new nhanvien(resultSet.getInt("id_NV"),
                        resultSet.getString("ten"), resultSet.getString("gioi_tinh"),
                        resultSet.getString("sdt"), resultSet.getString("ngay_sinh"),
                        resultSet.getString("dia_chi"));
                nhanvienList.add(nv);
            }

        } catch (Exception e) {
            //Object ex = null;
            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return nhanvienList;
    }

//    public static void insert(nhanvien std) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv", "root", "");
//            
//            //query
//            String sql = "insert into nhanvien(ten, gioi_tinh, ngay_sinh, dia_chi, sdt) values(?, ?, ?, ?, ?)";
//            statement = connection.prepareCall(sql);
//            
//            statement.setString(1, std.getTen());
//            statement.setString(2, std.getGioi_tinh());
//            statement.setString(3, std.getNgay_sinh());
//            statement.setString(4, std.getDia_chi());
//            statement.setString(5, std.getSdt());
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//    }
//    
//    public static void update(nhanvien std) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/slnv", "root", "");
//            
//            //query
//            String sql = "update nhanvien set ten=?,gioi_tinh=?,ngay_sinh=?,dia_chi=?,sdt=? where id_NV = ?";
//            statement = connection.prepareCall(sql);
//            
//            statement.setString(1, std.getTen());
//            statement.setString(2, std.getGioi_tinh());
//            statement.setString(3, std.getNgay_sinh());
//            statement.setString(4, std.getDia_chi());
//            statement.setString(5, std.getSdt());
//            statement.setInt(6, std.getId_NV());
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//    }
//    
//    public static void delete(int id) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv", "root", "");
//            
//            //query
//            String sql = "delete from nhanvien where id_NV = ?";
//            statement = connection.prepareCall(sql);
//            
//            statement.setInt(1, id);
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//    }
//    
//    public static List<nhanvien> findByFullname(String fullname) {
//        List<nhanvien> nhanvienList = new ArrayList<>();
//        
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv", "root", "");
//            
//            //query
//            String sql = "select * from nhanvien where ten like ?";
//            statement = connection.prepareCall(sql);
//            statement.setString(1, "%"+fullname+"%");
//            
//            ResultSet resultSet = statement.executeQuery();
//            
//            while (resultSet.next()) {                
//                nhanvien std = new nhanvien(resultSet.getInt("id_NV"), 
//                        resultSet.getString("ten"), resultSet.getString("gioi_tinh"), 
//                        resultSet.getString("ngay)sinh"), resultSet.getString("dia_chi"), 
//                        resultSet.getString("sdt"));
//                nhanvienList.add(std);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(nhanvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//      return nhanvienList;
//    }
}
