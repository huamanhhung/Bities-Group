/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.io.Serializable;

/**
 *
 * @author markhyun
 */
public class ClassHoaDon implements Serializable{

    private String maHD ;
    private String maNV ;
    private String ngayBan;
    private String maKH;
    private Double tongTien;

    public ClassHoaDon() {
    }

    public ClassHoaDon(String maHD, String maNV, String ngayBan, String maKH, Double tongTien) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.ngayBan = ngayBan;
        this.maKH = maKH;
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
