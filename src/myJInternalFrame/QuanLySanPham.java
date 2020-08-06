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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import myClass.ClassSanPham;

/**
 *
 * @author markhyun
 */
public class QuanLySanPham extends javax.swing.JInternalFrame {

    List<ClassSanPham> listSanPham = new ArrayList<>();
    Connection cn;
    int index = 0;

    public QuanLySanPham() {
        initComponents();
        cn = connectionSQL.ketnoi("QLIPHONE");
        fillToTable();
        addsp();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        kGradientPanel4 = new keeptoo.KGradientPanel();
        txtTenSP = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lbSoLuongSP = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnTimkiemSP = new javax.swing.JButton();
        lbMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        cpQLSP = new javax.swing.JScrollPane();
        tbQLSP = new javax.swing.JTable();
        lbTenSP = new javax.swing.JLabel();
        cpCauHinh = new javax.swing.JScrollPane();
        txtCauHinh = new javax.swing.JTextArea();
        txtSoLuongSP = new javax.swing.JTextField();
        lbCauHinh = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        cbbTrangThai = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý sản phẩm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));

        txtTenSP.setEditable(false);
        txtTenSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbDonGia.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(252, 244, 252));
        lbDonGia.setText("     Đơn giá:");

        txtDonGia.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbSoLuongSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbSoLuongSP.setForeground(new java.awt.Color(252, 244, 252));
        lbSoLuongSP.setText(" Số lượng SP:");

        pnButton.setOpaque(false);
        pnButton.setLayout(new java.awt.GridBagLayout());

        btnThemSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThemSP.setForeground(new java.awt.Color(72, 61, 139));
        btnThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_32x32.png"))); // NOI18N
        btnThemSP.setText("Thêm sản phẩm");
        btnThemSP.setMaximumSize(new java.awt.Dimension(257, 41));
        btnThemSP.setMinimumSize(new java.awt.Dimension(257, 41));
        btnThemSP.setPreferredSize(new java.awt.Dimension(293, 41));
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnThemSP, gridBagConstraints);

        btnSuaSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnSuaSP.setForeground(new java.awt.Color(72, 61, 139));
        btnSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_32x32.png"))); // NOI18N
        btnSuaSP.setText("Sửa thông tin SP");
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnSuaSP, gridBagConstraints);

        btnThemMoi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(72, 61, 139));
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_1_Icon_32.png"))); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setPreferredSize(new java.awt.Dimension(293, 41));
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnThemMoi, gridBagConstraints);

        btnTimkiemSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnTimkiemSP.setForeground(new java.awt.Color(72, 61, 139));
        btnTimkiemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_Icon_32.png"))); // NOI18N
        btnTimkiemSP.setText("Tìm kiếm SP");
        btnTimkiemSP.setPreferredSize(new java.awt.Dimension(293, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        pnButton.add(btnTimkiemSP, gridBagConstraints);

        lbMaSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaSP.setForeground(new java.awt.Color(252, 244, 252));
        lbMaSP.setText(" Mã sản phẩm:");

        txtMaSP.setEditable(false);
        txtMaSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        tbQLSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbQLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng SP", "Đơn giá", "Cấu hình", "Trạng thái"
            }
        ));
        tbQLSP.setFillsViewportHeight(true);
        tbQLSP.setRowHeight(35);
        tbQLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLSPMouseClicked(evt);
            }
        });
        cpQLSP.setViewportView(tbQLSP);

        lbTenSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTenSP.setForeground(new java.awt.Color(252, 244, 252));
        lbTenSP.setText("Tên sản phẩm:");

        txtCauHinh.setEditable(false);
        txtCauHinh.setColumns(20);
        txtCauHinh.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtCauHinh.setRows(5);
        cpCauHinh.setViewportView(txtCauHinh);

        txtSoLuongSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbCauHinh.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbCauHinh.setForeground(new java.awt.Color(252, 244, 252));
        lbCauHinh.setText("    Cấu hình:");

        lbTrangThai.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(252, 244, 252));
        lbTrangThai.setText("  Trạng thái:");

        cbbTrangThai.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        cbbTrangThai.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpQLSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1305, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbSoLuongSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCauHinh))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTrangThai)
                        .addGap(66, 66, 66)))
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbTrangThai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpCauHinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(txtSoLuongSP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSP))
                .addGap(125, 125, 125)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpCauHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCauHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTrangThai)
                            .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(cpQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        if (this.batLoi()) {
            this.themSp();
            

        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void tbQLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLSPMouseClicked
        showDetail(); 
        elbfale();
    }//GEN-LAST:event_tbQLSPMouseClicked

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        this.suaSP();
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
       this.elb();
        this.clear();
    }//GEN-LAST:event_btnThemMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTimkiemSP;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JScrollPane cpCauHinh;
    private javax.swing.JScrollPane cpQLSP;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbCauHinh;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbMaSP;
    private javax.swing.JLabel lbSoLuongSP;
    private javax.swing.JLabel lbTenSP;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JPanel pnButton;
    private javax.swing.JTable tbQLSP;
    private javax.swing.JTextArea txtCauHinh;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuongSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
  private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tbQLSP.getModel();
        model.setRowCount(0);

        try {
            listSanPham.clear();
            Statement st = connectionSQL.ketnoi("QLIPHONE").createStatement();
            String sql = "SELECT * FROM SANPHAM";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maSP = rs.getString(1);
                String tenSP = rs.getString(2);
                int soLuong = rs.getInt(3);
                double donGia = rs.getDouble(4);
                String cauHinh = rs.getString(5);
                String trangThai = rs.getString(6);

                ClassSanPham sp = new ClassSanPham(maSP, tenSP, soLuong, donGia, cauHinh, trangThai);
                listSanPham.add(sp);
            }
            for (int i = 0; i < listSanPham.size(); i++) {
                Object[] sanPhamObject = new Object[]{
                    listSanPham.get(i).getMaSP(),
                    listSanPham.get(i).getTenSP(),
                    listSanPham.get(i).getSoLuong(),
                    listSanPham.get(i).getDonGia(),
                    listSanPham.get(i).getCauHinh(),
                    listSanPham.get(i).getTrangThai(),};
                model.addRow(sanPhamObject);
            }
        } catch (Exception e) {
        }
    }

    private void showDetail() {
        try {
            int selectRow = tbQLSP.getSelectedRow();

            ClassSanPham sp = listSanPham.get(selectRow);

            txtMaSP.setText(sp.getMaSP());
            txtTenSP.setText(sp.getTenSP());
            txtDonGia.setText(sp.getDonGia() + "");
            txtSoLuongSP.setText(sp.getSoLuong() + "");
            txtCauHinh.setText(sp.getCauHinh());
            cbbTrangThai.setSelectedItem(sp.getCauHinh());
        } catch (Exception e) {
        }

    }

    private void addsp() {
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT TRANGTHAI FROM SANPHAM";
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                cbbTrangThai.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }

    private boolean batLoi() {
        boolean tma = false, tten = false, tDonGia = false, tSL = false, tCH = false;

        //bắt lỗi mã
        if (txtMaSP.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã");
            tma = false;

        } else {
            tma = true;
            for (int i = 0; i < listSanPham.size(); i++) {
                ClassSanPham sp = listSanPham.get(i);
                if (txtMaSP.getText().equalsIgnoreCase(sp.getMaSP())) {
                    JOptionPane.showMessageDialog(this, "Trùng mã Sản phẩm");
                    tma = false;
                    break;
                }
            }
        }
        //bắt lỗi tên sản phẩm 
        if (tma) {
            if (txtTenSP.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không được để trống tên sản phẩm");
                tten = false;

            } else {
                tten = true;
            }
        }
        //bắt lỗi đơn giá
        if (tten) {
            if (txtDonGia.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không được để trống đơn giá");
                tDonGia = false;
            } else {
                try {
                    double donGia = Double.parseDouble(txtDonGia.getText());

                    if (donGia > 0) {
                        tDonGia = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Đơn giá phải lớn hơn 0");
                        tDonGia = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Đơn giá phải là kiểu số!");
                    tDonGia = false;
                }
            }
        }
        //Bắt lỗi số lượng
        if (tDonGia) {
            if (txtSoLuongSP.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không được để trống số lượng");
                tSL = false;
            } else {
                try {
                    int soLuong = Integer.parseInt(txtSoLuongSP.getText());

                    if (soLuong > 0) {
                        tSL = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
                        tSL = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải là kiểu số!");
                    tSL = false;
                }
            }
        }

        //bắt lỗi cấu hình
        if (tSL) {
            if (txtCauHinh.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống cấu hình");
                tCH = false;
            } else {
                tCH = true;
            }
        }
        if (tCH) {
            return true;
        } else {
            return false;
        }

    }

    private void themSp() {
        try {
            String sql = "INSERT INTO SANPHAM \n"
                    + "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, txtMaSP.getText());
            ps.setString(2, txtTenSP.getText());
            ps.setString(3, txtDonGia.getText());
            ps.setString(4, txtSoLuongSP.getText());
            ps.setString(5, txtCauHinh.getText());
            ps.setString(6, (String) cbbTrangThai.getSelectedItem());

            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
                index = listSanPham.size() - 1;
                showDetail();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi thêm nè");
            }
            ps.close();
            fillToTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi thêm");
            e.printStackTrace();
        }
    }

    private void suaSP() {
        try {
            String sql = "UPDATE SANPHAM\n"
                    + "SET TENSP =?, SOLUONG=?, DONGIA=?, CAUHINH=?, TRANGTHAI=?\n"
                    + "WHERE MASP=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(6, txtMaSP.getText());
            ps.setString(1, txtTenSP.getText());
            ps.setString(2, txtSoLuongSP.getText());
            ps.setString(3, txtDonGia.getText());
            ps.setString(4, txtCauHinh.getText());
            ps.setString(5, (String) cbbTrangThai.getSelectedItem());

            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công!");
                index = listSanPham.size() - 1;
                showDetail();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi sửa");
            }
            ps.close();
            fillToTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi sửa");
        }
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tbQLSP.getModel();
        model.setRowCount(0);

        for (int i = 0; i < listSanPham.size(); i++) {
            Object[] sanPhamObject = new Object[]{
                listSanPham.get(i).getMaSP(),
                listSanPham.get(i).getTenSP(),
                listSanPham.get(i).getDonGia(),
                listSanPham.get(i).getSoLuong(),
                listSanPham.get(i).getCauHinh(),
                listSanPham.get(i).getTrangThai()};

            model.addRow(sanPhamObject);

        }
    }

    private void clear() {
        txtDonGia.setText("");
        txtMaSP.setText("");
        txtSoLuongSP.setText("");
        txtTenSP.setText("");
        txtCauHinh.setText("");

    }
    private void elb(){
      txtMaSP.setEditable(true);
      txtTenSP.setEditable(true);
      txtCauHinh.setEditable(true);
      cbbTrangThai.enable(true);
    }
        private void elbfale(){
      txtMaSP.setEditable(false);
      txtTenSP.setEditable(false);
      txtCauHinh.setEditable(false); 
      cbbTrangThai.enable(false);
    }
}
