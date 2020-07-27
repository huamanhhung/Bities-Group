
package myClass;


public class ClassNhanVien {
    private String maNV;
    private String tenNV;
    private  String Sdt;
    private String diaChi;

    public ClassNhanVien() {
    }

    public ClassNhanVien(String maNV, String tenNV, String Sdt, String diaChi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.Sdt = Sdt;
        this.diaChi = diaChi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "ClassNhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", Sdt=" + Sdt + ", diaChi=" + diaChi + '}';
    }
    
    
}
