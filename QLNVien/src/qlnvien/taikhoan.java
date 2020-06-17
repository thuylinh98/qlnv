/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvien;

/**
 *
 * @author Admin
 */
public class taikhoan {
    int id_TK;
    String ten_DN, mat_khau;

    public taikhoan(int id_TK, String ten_DN, String mat_khau) {
        this.id_TK = id_TK;
        this.ten_DN = ten_DN;
        this.mat_khau = mat_khau;
    }

    public int getId_TK() {
        return id_TK;
    }

    public void setId_TK(int id_TK) {
        this.id_TK = id_TK;
    }

    public String getTen_DN() {
        return ten_DN;
    }

    public void setTen_DN(String ten_DN) {
        this.ten_DN = ten_DN;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }
    
    
}
