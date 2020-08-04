/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

import myClass.ClassCTHoaDon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import connectionSQL.connectionSQL;

/**
 *
 * @author markhyun
 */
public class ChiTietHoaDon extends javax.swing.JInternalFrame {

    /**
     * Creates new form HoaDonChiTiet
     */
    Connection cn;
    List<ClassCTHoaDon> listCTHD = new ArrayList<>();

    public ChiTietHoaDon() {
        initComponents();
        cn = connectionSQL.ketnoi("QLIPHONE");
        fillToTable();
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

        kGradientPanel2 = new keeptoo.KGradientPanel();
        txtMaHD = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        lbMaHD = new javax.swing.JLabel();
        lbMaSP = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btnTimKiemHoaDon = new javax.swing.JButton();
        btnHienThiAll = new javax.swing.JButton();
        cpHoaDon = new javax.swing.JScrollPane();
        tbHoaDonChiTiet = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel2.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(168, 168, 233));

        txtMaHD.setEditable(false);
        txtMaHD.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtMaSP.setEditable(false);
        txtMaSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(252, 244, 252));
        lbMaHD.setText("Mã hóa đơn:");

        lbMaSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaSP.setForeground(new java.awt.Color(252, 244, 252));
        lbMaSP.setText("Mã sản phẩm:");

        lbSoLuong.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbSoLuong.setForeground(new java.awt.Color(252, 244, 252));
        lbSoLuong.setText("Số lượng:");

        pnButton.setOpaque(false);
        pnButton.setLayout(new java.awt.GridBagLayout());

        btnTimKiemHoaDon.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnTimKiemHoaDon.setForeground(new java.awt.Color(72, 61, 139));
        btnTimKiemHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_Icon_32.png"))); // NOI18N
        btnTimKiemHoaDon.setText("Tìm hóa đơn");
        btnTimKiemHoaDon.setPreferredSize(new java.awt.Dimension(285, 41));
        btnTimKiemHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHoaDonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnTimKiemHoaDon, gridBagConstraints);

        btnHienThiAll.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnHienThiAll.setForeground(new java.awt.Color(72, 61, 139));
        btnHienThiAll.setText("Hiển thị tất cả HD");
        btnHienThiAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiAllActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnHienThiAll, gridBagConstraints);

        tbHoaDonChiTiet.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã SP", "Số lượng ", "Đơn giá", "Tổng tiền"
            }
        ));
        tbHoaDonChiTiet.setFillsViewportHeight(true);
        tbHoaDonChiTiet.setRowHeight(35);
        tbHoaDonChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonChiTietMouseClicked(evt);
            }
        });
        cpHoaDon.setViewportView(tbHoaDonChiTiet);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaHD)
                            .addComponent(lbSoLuong)
                            .addComponent(lbMaSP))
                        .addGap(49, 49, 49)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cpHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaHD)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaSP)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoLuong)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap(79, Short.MAX_VALUE)
                        .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addComponent(cpHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemHoaDonActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbHoaDonChiTiet.getModel();
        model.setRowCount(0);
        String option[] = {"Tìm bằng mã HD", "Tìm bằng mã SP", "Hủy"};
        ImageIcon iconFind = new ImageIcon("src//icons//Search_Icon_32.png");
        int result = JOptionPane.showOptionDialog(this, "Mời bạn chọn cách thức tìm kiếm!", "Tìm kiếm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, iconFind, option, null);
        if (result == 0) {
            String maHD = (String) JOptionPane.showInputDialog(this, "Mời bạn nhập mã hóa đơn!", "Tìm kiếm bằng mã hóa đơn", JOptionPane.INFORMATION_MESSAGE, iconFind, null, null);
            boolean resultInput = false;
            for (int i = 0; i < listCTHD.size(); i++) {
                if (maHD.equals(listCTHD.get(i).getMaHD())) {
                    resultInput = true;
                    txtMaHD.setText(listCTHD.get(i).getMaHD());
                    txtMaSP.setText(listCTHD.get(i).getMaSP());
                    txtSoLuong.setText(Integer.toString(listCTHD.get(i).getSoLuong()));

                    Object[] objectHD = new Object[]{
                        listCTHD.get(i).getMaHD(),
                        listCTHD.get(i).getMaSP(),
                        listCTHD.get(i).getSoLuong(),
                        listCTHD.get(i).getDonGia(),
                        listCTHD.get(i).getThanhTien()
                    };
                    model.addRow(objectHD);
                }
            }
            if (resultInput == false) {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã sản phẩm này!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            } else {
                JOptionPane.showMessageDialog(this, "Tìm thấy hóa đơn!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            }
        } else if (result == 1) {
            String maSP = (String) JOptionPane.showInputDialog(this, "Mời bạn nhập mã sản phẩm!", "Tìm kiếm bằng mã sản phẩm", JOptionPane.INFORMATION_MESSAGE, iconFind, null, null);
            boolean resultInput = false;
            for (int i = 0; i < listCTHD.size(); i++) {
                if (maSP.equals(listCTHD.get(i).getMaSP())) {
                    resultInput = true;
                    txtMaHD.setText(listCTHD.get(i).getMaHD());
                    txtMaSP.setText(listCTHD.get(i).getMaSP());
                    txtSoLuong.setText(Integer.toString(listCTHD.get(i).getSoLuong()));

                    Object[] objectHD = new Object[]{
                        listCTHD.get(i).getMaHD(),
                        listCTHD.get(i).getMaSP(),
                        listCTHD.get(i).getSoLuong(),
                        listCTHD.get(i).getDonGia(),
                        listCTHD.get(i).getThanhTien()
                    };
                    model.addRow(objectHD);
                }
            }
            if (resultInput == false) {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã hóa đơn này!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            } else {
                JOptionPane.showMessageDialog(this, "Tìm thấy hóa đơn!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            }
        }

    }//GEN-LAST:event_btnTimKiemHoaDonActionPerformed

    private void tbHoaDonChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonChiTietMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tbHoaDonChiTietMouseClicked

    private void btnHienThiAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiAllActionPerformed
        // TODO add your handling code here:
        fillToTable();
    }//GEN-LAST:event_btnHienThiAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThiAll;
    private javax.swing.JButton btnTimKiemHoaDon;
    private javax.swing.JScrollPane cpHoaDon;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbMaSP;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JPanel pnButton;
    private javax.swing.JTable tbHoaDonChiTiet;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tbHoaDonChiTiet.getModel();
        model.setRowCount(0);

        try {
            listCTHD.clear();
            Statement st = connectionSQL.ketnoi("QLIPHONE").createStatement();

            String sql = "SELECT * FROM CTHOADON";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maHD = rs.getString(1);
                String maSP = rs.getString(2);
                int soLuong = rs.getInt(3);
                double donGia = rs.getDouble(4);
                double thanhTien = rs.getDouble(5);

                ClassCTHoaDon cthd = new ClassCTHoaDon(maHD, maSP, soLuong, donGia, thanhTien);
                listCTHD.add(cthd);
            }

            for (int i = 0; i < listCTHD.size(); i++) {
                Object[] cthdObject = new Object[]{
                    listCTHD.get(i).getMaHD(),
                    listCTHD.get(i).getMaSP(),
                    listCTHD.get(i).getSoLuong(),
                    listCTHD.get(i).getDonGia(),
                    listCTHD.get(i).getThanhTien(),};
                model.addRow(cthdObject);
            }
        } catch (Exception e) {
        }
    }

    private void showDetail() {
        int selectRow = tbHoaDonChiTiet.getSelectedRow();
        ClassCTHoaDon cthd = listCTHD.get(selectRow);

        txtMaHD.setText(cthd.getMaHD());
        txtMaSP.setText(cthd.getMaSP());
        txtSoLuong.setText(Integer.toString(cthd.getSoLuong()));
    }
}
