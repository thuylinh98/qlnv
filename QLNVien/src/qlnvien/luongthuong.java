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
public class luongthuong {
    int id_LT, lương, thương, phat;

    public luongthuong(int id_LT, int lương, int thương, int phat) {
        this.id_LT = id_LT;
        this.lương = lương;
        this.thương = thương;
        this.phat = phat;
    }

    public int getId_LT() {
        return id_LT;
    }

    public void setId_LT(int id_LT) {
        this.id_LT = id_LT;
    }

    public int getLương() {
        return lương;
    }

    public void setLương(int lương) {
        this.lương = lương;
    }

    public int getThương() {
        return thương;
    }

    public void setThương(int thương) {
        this.thương = thương;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }
    
}
