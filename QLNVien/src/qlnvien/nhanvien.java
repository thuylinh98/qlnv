/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvien;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Admin
 */
public class nhanvien {
    int id_NV;
    String ten, gioi_tinh, dia_chi, sdt,ngay_sinh;
    public nhanvien() {
    }

    public nhanvien(int id_NV, String ten, String gioi_tinh, String dia_chi, String sdt, String ngay_sinh) {
        this.id_NV = id_NV;
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.ngay_sinh = ngay_sinh;
    }

    public nhanvien(String ten, String gioi_tinh, String dia_chi, String sdt, String ngay_sinh) {
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.ngay_sinh = ngay_sinh;
    }

    public int getId_NV() {
        return id_NV;
    }

    public void setId_NV(int id_NV) {
        this.id_NV = id_NV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }
    
}
