/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;

/**
 *
 * @author CHIEN
 */
public class ClassBanHang implements Serializable{
    private String masp;
    private String tensp;
    private String makh;
    private String tenkh;
    private int soluong;
    private double dongia;
    private double thanhtien;
    //

    public ClassBanHang() {
    }

    public ClassBanHang(String masp, String tensp, String makh, String tenkh, int soluong) {
        this.masp = masp;
        this.tensp = tensp;
        this.makh = makh;
        this.tenkh = tenkh;
        this.soluong = soluong;
    }
    //

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
