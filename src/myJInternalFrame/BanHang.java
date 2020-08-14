/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

import connectionSQL.connectionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import myClass.ClassBanHang;

/**
 *
 * @author markhyun
 */
public class BanHang extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyKhachHnag
     */
    List<ClassBanHang> listBH = new ArrayList<>();
    int index;
    double tongtien = 0;
    String mahd;
    Connection con;
    String nhanVien;

    public BanHang(String nhanvien) {
        nhanVien = nhanvien;
        initComponents();
        con = connectionSQL.ketnoi("QLIPHONE");
        this.addCBX();
    }

    //định dạng tiền tệ
    public String dinhDangTien(double so) {
        NumberFormat fomatter = new DecimalFormat("###,###,###,###" + " VND");
        return fomatter.format(so);
    }

    //check loi
    public boolean batLoi() {
        boolean tma = false, ttenkh = false, tsl = false, ttensp = true;
        //lỗi mã kh
        if (txtMaKH1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã khách hàng");
            tma = false;
        } else {
            tma = true;
        }
        if (tma) {
            if (txtTenKH1.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                ttenkh = false;
            } else {
                ttenkh = true;
            }
        }
        //lỗi sl
        if (ttenkh) {
            if (txtSoLuong1.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng");
                tsl = false;
            } else {
                try {
                    int sl = Integer.parseInt(txtSoLuong1.getText());
                    tsl = true;
                    if (sl < 0) {
                        JOptionPane.showMessageDialog(this, "Số lượng phải trên 0");
                        tsl = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                    tsl = false;
                }
            }
        }
        //bắt lỗi cbx
        if (tsl) {
            String tenSP = (String) cbbSanPham1.getSelectedItem();
            if (tenSP.trim().equalsIgnoreCase("Mời bạn chọn")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm");
                ttensp = false;
            } else {
                for (ClassBanHang bh : listBH) {
                    if (bh.getTensp().trim().equals(tenSP.trim())) {
                        JOptionPane.showMessageDialog(this, "Sản phẩm đã chọn mới bạn chọn sản phẩm khác");
                        ttensp = false;
                        break;
                    }
                }
            }
        }
        if (tma == true && ttenkh == true && tsl == true && ttensp == true) {
            return true;
        } else {
            return false;
        }
    }

    // add sản phẩm vào list
//    private String masp;
//    private String tensp;
//    private String makh;
//    private String tenkh;
//    private int soluong;
    public void addSP() {
        ClassBanHang bn = new ClassBanHang();
        bn.setMakh(txtMaKH1.getText());
        bn.setTenkh(txtTenKH1.getText());
        bn.setSoluong(Integer.parseInt(txtSoLuong1.getText()));
        bn.setTensp((String) cbbSanPham1.getSelectedItem());
        //mã sp 
        Statement stm = null;
        ResultSet rs = null;
        String sql = "select MASP,TENSP,DONGIA,CAUHINH,TRANGTHAI from SANPHAM";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String so = rs.getString("TENSP") + " " + rs.getString("CAUHINH") + " " + rs.getString("TRANGTHAI");
                String tenSP = bn.getTensp();
                if (tenSP.trim().equals(so.trim())) {
                    //lấy sl từ list
                    int sol = bn.getSoluong();
                    //lấy đơn giá từ csdl
                    String dg = rs.getString("DONGIA");
                    double dg2 = Double.parseDouble(rs.getString("DONGIA"));
                    //set don gia và thành tiền vào list
                    bn.setDongia(dg2);
                    //bn.setThanhtien(dg);
                    //set don gia và thành tiền vào list
//                    bn.setDongia(Double.parseDouble(rs.getString(3)));
                    bn.setThanhtien((int) sol * dg2);
                    //set mã sp vào list
                    bn.setMasp(rs.getString("MASP"));
                }
            }
            stm.close();
            rs.close();
        } catch (Exception e) {
        }
        int SLton = 0;
        String sql2 = "select * from SANPHAM\n"
                + "where MASP = ?";
        try {

            PreparedStatement pstm2 = con.prepareStatement(sql2);
            pstm2.setString(1, bn.getMasp());
            ResultSet rs2 = pstm2.executeQuery();
            while (rs2.next()) {
                System.out.println(rs2.getInt("SOLUONG"));
                SLton = rs2.getInt("SOLUONG");
            }
        } catch (Exception e) {
        }
        if (bn.getSoluong() > SLton) {
            JOptionPane.showMessageDialog(this, bn.getTensp() + " Chỉ còn " + SLton + " chiếc");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            listBH.add(bn);
        }
    }

    //đưa dữ liệu vào bảng
    public void fillTotable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (ClassBanHang bh : listBH) {
            Object hang[] = {
                bh.getMasp(),
                bh.getTensp(),
                bh.getSoluong(),
                this.dinhDangTien(bh.getDongia()),
                this.dinhDangTien(bh.getThanhtien())
            };
            model.addRow(hang);
        }
    }

    //ADD Danh sách sản phẩm vào combobox
    public void addCBX() {
        lbNhanVienBanHang1.setText("Nhân viên bán hàng: " + nhanVien);
        Statement stm = null;
        ResultSet rs = null;
        String sql = "select MASP,TENSP,CAUHINH,TRANGTHAI,TrangThaiKinhDoanh from SANPHAM";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                String trangThai = rs.getString(5);
                if (trangThai.equals("1")) {
                    cbbSanPham1.addItem(rs.getString("TENSP") + " " + rs.getString("CAUHINH")
                            + " " + rs.getString("TRANGTHAI"));
                }
            }
            stm.close();
            rs.close();
        } catch (Exception e) {
        }

    }

    //tính tổng tiền trên toàn bộ hóa đơn
    public void tongTien() {
        tongtien = 0;
        for (ClassBanHang bh : listBH) {
            double tt = bh.getThanhtien();
            tongtien = tongtien + tt;
        }
        lbTongTien1.setText("Tổng tiền: " + this.dinhDangTien(tongtien));
    }

    //tìm đúng kh có mã vừa nhập
    public void timKH() {
        String hoten = "", trangthai = "";
        String sql = "select MAKH,HOVATEN,TrangThaiKH\n"
                + "from KHACHHANG\n"
                + "where MAKH=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, txtMaKH1.getText());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hoten = rs.getString(2);
                trangthai = rs.getString(3);
            }
            if (hoten.length() != 0) {
                if (trangthai.equals("1")) {
                    txtTenKH1.setText(hoten);
                } else {
                    JOptionPane.showMessageDialog(this, "Khách hàng " + hoten + " trong danh sách hạn chế");
                }
            }
        } catch (Exception e) {
        }

    }

    public String taoMaHoaDon() {
        //tạo mã hóa đơn và đẩy lên csdl
        //mã hóa đơn = HD + MaKH + (ListHD+1)
        //đếm só hóa đơn
        String sql0 = "select MAHD from HOADON";
        int sizeList = 0;
        boolean checkMa = false;
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql0);
            while (rs.next()) {
                sizeList = sizeList + 1;
            }
        } catch (Exception e) {
        }
        st = null;
        rs = null;
        int x = sizeList;
        String soHD;
        String maHD = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql0);
            while (rs.next()) {
                soHD = String.valueOf(sizeList);
                maHD = "HD0" + txtMaKH1.getText() + soHD;
                try {
                    if (maHD.trim().equalsIgnoreCase(rs.getString(1).trim())) {
                        checkMa = false;
                        sizeList = sizeList + 1;
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
        System.out.println(maHD);
        this.mahd = maHD;
        return maHD;
    }

    //tạo câu truy vấn để ghi dữ liệu vào csdl
    public void themHoaDon() {
        String sql = "insert into hoadon values(?,?,GETDATE(),?,?)";
        //
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, this.taoMaHoaDon());
            pstm.setString(2, nhanVien);
            pstm.setString(3, txtMaKH1.getText());
            pstm.setFloat(4, (float) tongtien);
            //pstm.setString(5, null);

            int row = pstm.executeUpdate();
            if (row > 0) {
                System.out.println("Thêm thành công vào hóa đơn");
            } else {
                System.out.println("Thêm thất bại");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "không thêm ");
        }
    }

    //thêm vào ct hóa đơn
    public void themCTHoaDon() {

        try {
            for (ClassBanHang bh : listBH) {
                String sql = "insert into CTHOADON values(?,?,?,?,?)";
                double dg = bh.getDongia();
                double tt = bh.getThanhtien();
                PreparedStatement pstm = con.prepareStatement(sql);

                pstm.setString(1, this.mahd);
                pstm.setString(2, bh.getMasp());
                pstm.setInt(3, bh.getSoluong());
                pstm.setDouble(4, dg);
                pstm.setDouble(5, tt);

                int row = pstm.executeUpdate();
                if (row > 0) {
                    System.out.println("thêm vào cthd");
                } else {
                    System.out.println("không thêm vào cthd");
                }
                pstm.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBanHang = new keeptoo.KGradientPanel();
        lbSoLuong1 = new javax.swing.JLabel();
        cbbSanPham1 = new javax.swing.JComboBox<>();
        lbTongTien1 = new javax.swing.JLabel();
        txtSoLuong1 = new javax.swing.JTextField();
        btnThemVaoGioHang1 = new javax.swing.JButton();
        lbNhanVienBanHang1 = new javax.swing.JLabel();
        lbTenKH1 = new javax.swing.JLabel();
        txtTenKH1 = new javax.swing.JTextField();
        lbMaKH1 = new javax.swing.JLabel();
        txtMaKH1 = new javax.swing.JTextField();
        cpThanhToan1 = new javax.swing.JScrollPane();
        tbThanhToan1 = new javax.swing.JTable();
        lbDSSP1 = new javax.swing.JLabel();
        btnXoaSP1 = new javax.swing.JButton();
        btnThanhToan1 = new javax.swing.JButton();
        pnXuatHoaDon = new keeptoo.KGradientPanel();
        lbMaHD = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNhanvienbanhang2 = new javax.swing.JTextField();
        lbMaNV = new javax.swing.JLabel();
        lbNgayMua = new javax.swing.JLabel();
        txtNgayMua = new javax.swing.JTextField();
        cpInHoaDon = new javax.swing.JScrollPane();
        tbInHoaDon = new javax.swing.JTable();
        lbTongTien2 = new javax.swing.JLabel();
        lbNgayMua1 = new javax.swing.JLabel();
        txtKH2 = new javax.swing.JTextField();
        lbNgayMua2 = new javax.swing.JLabel();
        txtTenKH2 = new javax.swing.JTextField();
        btnInHoaDon2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1333, 750));
        getContentPane().setLayout(new java.awt.CardLayout());

        pnBanHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bán hàng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        pnBanHang.setkEndColor(new java.awt.Color(229, 189, 240));
        pnBanHang.setkGradientFocus(1000);
        pnBanHang.setkStartColor(new java.awt.Color(168, 168, 233));

        lbSoLuong1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbSoLuong1.setForeground(new java.awt.Color(252, 244, 252));
        lbSoLuong1.setText("Số lượng");

        cbbSanPham1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        cbbSanPham1.setForeground(new java.awt.Color(124, 124, 124));
        cbbSanPham1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn" }));

        lbTongTien1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTongTien1.setForeground(new java.awt.Color(252, 244, 252));
        lbTongTien1.setText("Tổng tiền:................");

        txtSoLuong1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N

        btnThemVaoGioHang1.setBackground(new java.awt.Color(255, 255, 255));
        btnThemVaoGioHang1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThemVaoGioHang1.setForeground(new java.awt.Color(72, 61, 139));
        btnThemVaoGioHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping_basket_add_Icon_32.png"))); // NOI18N
        btnThemVaoGioHang1.setText("Thêm vào giỏ hàng");
        btnThemVaoGioHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioHang1ActionPerformed(evt);
            }
        });

        lbNhanVienBanHang1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNhanVienBanHang1.setForeground(new java.awt.Color(252, 244, 252));
        lbNhanVienBanHang1.setText("Nhân viên bán hàng:..............");

        lbTenKH1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTenKH1.setForeground(new java.awt.Color(252, 244, 252));
        lbTenKH1.setText("Tên khách hàng");

        txtTenKH1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtTenKH1.setEnabled(false);

        lbMaKH1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaKH1.setForeground(new java.awt.Color(252, 244, 252));
        lbMaKH1.setText("Mã khách hàng");

        txtMaKH1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtMaKH1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaKH1CaretUpdate(evt);
            }
        });

        tbThanhToan1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbThanhToan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SẢN PHẨM", "TÊN SẢN PHẨM", "SỐ LƯỢNG", "ĐƠN GIÁ", "THÀNH TIỀN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThanhToan1.setFillsViewportHeight(true);
        tbThanhToan1.setRowHeight(35);
        cpThanhToan1.setViewportView(tbThanhToan1);

        lbDSSP1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbDSSP1.setForeground(new java.awt.Color(252, 244, 252));
        lbDSSP1.setText("Danh sách sản phẩm");

        btnXoaSP1.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaSP1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnXoaSP1.setForeground(new java.awt.Color(72, 61, 139));
        btnXoaSP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping_basket_prohibit_Icon_32.png"))); // NOI18N
        btnXoaSP1.setText("Xóa sản phẩm");
        btnXoaSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSP1ActionPerformed(evt);
            }
        });

        btnThanhToan1.setBackground(new java.awt.Color(255, 255, 255));
        btnThanhToan1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThanhToan1.setForeground(new java.awt.Color(72, 61, 139));
        btnThanhToan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping_basket_accept_Icon_32.png"))); // NOI18N
        btnThanhToan1.setText("Thanh toán");
        btnThanhToan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBanHangLayout.createSequentialGroup()
                        .addComponent(lbTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaSP1)
                        .addGap(51, 51, 51)
                        .addComponent(btnThanhToan1)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBanHangLayout.createSequentialGroup()
                        .addComponent(lbNhanVienBanHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBanHangLayout.createSequentialGroup()
                        .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBanHangLayout.createSequentialGroup()
                                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBanHangLayout.createSequentialGroup()
                                        .addComponent(lbTenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnBanHangLayout.createSequentialGroup()
                                        .addComponent(txtTenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDSSP1)
                                    .addComponent(cbbSanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                                        .addComponent(lbSoLuong1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                                        .addComponent(txtSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)))))
                        .addComponent(btnThemVaoGioHang1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cpThanhToan1)
                .addContainerGap())
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSoLuong1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDSSP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemVaoGioHang1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(cbbSanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(lbNhanVienBanHang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addComponent(lbMaKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE))
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addComponent(lbTenKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpThanhToan1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBanHangLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbTongTien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThanhToan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        getContentPane().add(pnBanHang, "card2");

        pnXuatHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        pnXuatHoaDon.setkEndColor(new java.awt.Color(229, 189, 240));
        pnXuatHoaDon.setkGradientFocus(1000);
        pnXuatHoaDon.setkStartColor(new java.awt.Color(168, 168, 233));

        lbMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(252, 244, 252));
        lbMaHD.setText("Mã hóa đơn:");

        txtMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtMaHD.setEnabled(false);

        txtNhanvienbanhang2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNhanvienbanhang2.setEnabled(false);

        lbMaNV.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(252, 244, 252));
        lbMaNV.setText("Nhân viên:");

        lbNgayMua.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua.setText("Ngày mua:");

        txtNgayMua.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNgayMua.setEnabled(false);

        tbInHoaDon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbInHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tbInHoaDon.setFillsViewportHeight(true);
        tbInHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        tbInHoaDon.setRowHeight(25);
        tbInHoaDon.setSelectionBackground(new java.awt.Color(102, 102, 255));
        cpInHoaDon.setViewportView(tbInHoaDon);

        lbTongTien2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTongTien2.setForeground(new java.awt.Color(252, 244, 252));
        lbTongTien2.setText("Tổng tiền:...............");

        lbNgayMua1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua1.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua1.setText("Mã KH:");

        txtKH2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtKH2.setEnabled(false);

        lbNgayMua2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua2.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua2.setText("Tên KH:");

        txtTenKH2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtTenKH2.setEnabled(false);

        btnInHoaDon2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnInHoaDon2.setForeground(new java.awt.Color(72, 61, 139));
        btnInHoaDon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Print_Icon_32.png"))); // NOI18N
        btnInHoaDon2.setText("In hóa đơn");

        javax.swing.GroupLayout pnXuatHoaDonLayout = new javax.swing.GroupLayout(pnXuatHoaDon);
        pnXuatHoaDon.setLayout(pnXuatHoaDonLayout);
        pnXuatHoaDonLayout.setHorizontalGroup(
            pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXuatHoaDonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnXuatHoaDonLayout.createSequentialGroup()
                        .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNgayMua1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNgayMua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaNV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaHD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(73, 73, 73)
                        .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayMua)
                            .addComponent(txtNhanvienbanhang2)
                            .addComponent(txtMaHD)
                            .addComponent(txtKH2))
                        .addGap(132, 132, 132)
                        .addComponent(lbNgayMua2)
                        .addGap(73, 73, 73)
                        .addComponent(txtTenKH2)
                        .addGap(99, 99, 99))
                    .addGroup(pnXuatHoaDonLayout.createSequentialGroup()
                        .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnXuatHoaDonLayout.createSequentialGroup()
                                .addComponent(lbTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(636, 636, 636)
                                .addComponent(btnInHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cpInHoaDon))
                        .addGap(48, 48, 48))))
        );
        pnXuatHoaDonLayout.setVerticalGroup(
            pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXuatHoaDonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHD)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV)
                    .addComponent(txtNhanvienbanhang2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayMua)
                    .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayMua1)
                    .addComponent(txtKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayMua2)
                    .addComponent(txtTenKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cpInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(pnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTien2)
                    .addComponent(btnInHoaDon2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(pnXuatHoaDon, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaKH1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaKH1CaretUpdate
        // TODO add your handling code here:
        //txtTenKH1.setText(txtMaKH1.getText());
        this.timKH();
    }//GEN-LAST:event_txtMaKH1CaretUpdate

    private void btnThemVaoGioHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioHang1ActionPerformed
        // TODO add your handling code here:
        if (this.batLoi() == true) {
            this.addSP();
            this.fillTotable(tbThanhToan1);
            this.tongTien();
        }
    }//GEN-LAST:event_btnThemVaoGioHang1ActionPerformed

    private void btnXoaSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSP1ActionPerformed
        // TODO add your handling code here:
        index = tbThanhToan1.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            listBH.remove(index);
            this.fillTotable(tbThanhToan1);
            this.tongTien();
        } else {
            JOptionPane.showMessageDialog(this, "Hủy không xóa", "Thông báo", 1);
        }
    }//GEN-LAST:event_btnXoaSP1ActionPerformed
    //code phần in hóa đơn
    public void addDataFormInHD() {
        txtMaHD.setText(mahd);
        txtNhanvienbanhang2.setText("NV01");
        txtKH2.setText(txtMaKH1.getText());
        txtTenKH2.setText(txtTenKH1.getText());
        this.fillTotable(tbInHoaDon);
        lbTongTien2.setText("Tổng tiền: " + this.dinhDangTien(tongtien));
        //lấy ngày mua
        try {
            String sql = "select ngayban from hoadon\n"
                    + "where MAHD = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, this.mahd);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SimpleDateFormat fomat = new SimpleDateFormat("dd-MM-yyyy");
                String dateHD = fomat.format(rs.getDate(1));
                txtNgayMua.setText(dateHD);
            }
        } catch (Exception e) {
        }
    }

    //update lại sản phẩm ở form sản phẩm vào csdl
    public void updateSP() {
        for (ClassBanHang bh : listBH) {
            String sql = "update SANPHAM\n"
                    + "set SOLUONG = SOLUONG - ?\n"
                    + "where MASP = ?";
            try {
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setInt(1, bh.getSoluong());
                pstm.setString(2, bh.getMasp());
                int row = pstm.executeUpdate();
                if (row > 0) {
                    System.out.println("Update sản phẩm oke");
                } else {
                    System.out.println("update sản phẩm Không được");
                }
            } catch (Exception e) {
            }

        }
    }
    private void btnThanhToan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToan1ActionPerformed
        // TODO add your handling code here:
        if (listBH.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có sản phẩm nào để thanh toán", "Cánh báo", JOptionPane.WARNING_MESSAGE);

        } else {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thanh toán", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (chon == 0) {
                this.themHoaDon();
                this.themCTHoaDon();
                this.addDataFormInHD();
                this.updateSP();
                txtNhanvienbanhang2.setText(nhanVien);
                pnBanHang.setVisible(false);
                pnXuatHoaDon.setVisible(true);
            }
        }

    }//GEN-LAST:event_btnThanhToan1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon2;
    private javax.swing.JButton btnThanhToan1;
    private javax.swing.JButton btnThemVaoGioHang1;
    private javax.swing.JButton btnXoaSP1;
    private javax.swing.JComboBox<String> cbbSanPham1;
    private javax.swing.JScrollPane cpInHoaDon;
    private javax.swing.JScrollPane cpThanhToan1;
    private javax.swing.JLabel lbDSSP1;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbMaKH1;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgayMua;
    private javax.swing.JLabel lbNgayMua1;
    private javax.swing.JLabel lbNgayMua2;
    private javax.swing.JLabel lbNhanVienBanHang1;
    private javax.swing.JLabel lbSoLuong1;
    private javax.swing.JLabel lbTenKH1;
    private javax.swing.JLabel lbTongTien1;
    private javax.swing.JLabel lbTongTien2;
    private keeptoo.KGradientPanel pnBanHang;
    private keeptoo.KGradientPanel pnXuatHoaDon;
    private javax.swing.JTable tbInHoaDon;
    private javax.swing.JTable tbThanhToan1;
    private javax.swing.JTextField txtKH2;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH1;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtNhanvienbanhang2;
    private javax.swing.JTextField txtSoLuong1;
    private javax.swing.JTextField txtTenKH1;
    private javax.swing.JTextField txtTenKH2;
    // End of variables declaration//GEN-END:variables
}
