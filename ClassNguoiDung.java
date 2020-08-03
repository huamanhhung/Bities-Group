
package myClass;

/**
 *
 * @author HungIT
 */
public class ClassNguoiDung {
    private String tendn,matkhau,xacnhan,manv;

    public ClassNguoiDung(String tendn, String matkhau, String xacnhan, String manv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getXacnhan() {
        return xacnhan;
    }

    public void setXacnhan(String xacnhan) {
        this.xacnhan = xacnhan;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    @Override
    public String toString() {
        return "ClassNguoiDung{" + "tendn=" + tendn + ", matkhau=" + matkhau + ", xacnhan=" + xacnhan + ", manv=" + manv + '}';
    }
    
}
