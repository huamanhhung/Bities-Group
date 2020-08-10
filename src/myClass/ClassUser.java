/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;


public class ClassUser {
   private String taiKhoan,matKhau,quen;

    public ClassUser() {
    }

    public ClassUser(String taiKhoan, String matKhau, String quen) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.quen = quen;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getQuen() {
        return quen;
    }

    public void setQuen(String quen) {
        this.quen = quen;
    }

    @Override
    public String toString() {
        return "ClassUser{" + "taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", quen=" + quen + '}';
    }

   
   
   
}
