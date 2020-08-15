/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

import connectionSQL.connectionSQL;
import java.sql.Connection;

/**
 *
 * @author markhyun
 */
public class XuatHoaDon extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyKhachHnag
     */
    public XuatHoaDon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new keeptoo.KGradientPanel();
        lbMaHD = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        lbMaNV = new javax.swing.JLabel();
        lbNgayMua = new javax.swing.JLabel();
        txtNgayMua = new javax.swing.JTextField();
        cpInHoaDon = new javax.swing.JScrollPane();
        tbInHoaDon = new javax.swing.JTable();
        lbTongTien = new javax.swing.JLabel();
        btnInHoaDon = new javax.swing.JButton();
        lbNgayMua1 = new javax.swing.JLabel();
        txtNgayMua1 = new javax.swing.JTextField();
        lbNgayMua2 = new javax.swing.JLabel();
        txtNgayMua2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));

        lbMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(252, 244, 252));
        lbMaHD.setText("Mã hóa đơn:");

        txtMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtMaHD.setEnabled(false);

        txtMaNV.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtMaNV.setEnabled(false);

        lbMaNV.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(252, 244, 252));
        lbMaNV.setText("Mã nhân viên:");

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
        tbInHoaDon.setSelectionBackground(new java.awt.Color(255, 255, 255));
        cpInHoaDon.setViewportView(tbInHoaDon);

        lbTongTien.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTongTien.setForeground(new java.awt.Color(252, 244, 252));
        lbTongTien.setText("Tổng tiền:...............");

        btnInHoaDon.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnInHoaDon.setForeground(new java.awt.Color(72, 61, 139));
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Print_Icon_32.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");

        lbNgayMua1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua1.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua1.setText("Mã KH:");

        txtNgayMua1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNgayMua1.setEnabled(false);

        lbNgayMua2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua2.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua2.setText("Tên KH:");

        txtNgayMua2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNgayMua2.setEnabled(false);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(cpInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNgayMua1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNgayMua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaNV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaHD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(73, 73, 73)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(txtMaNV)
                            .addComponent(txtMaHD)
                            .addComponent(txtNgayMua1))
                        .addGap(132, 132, 132)
                        .addComponent(lbNgayMua2)
                        .addGap(73, 73, 73)
                        .addComponent(txtNgayMua2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addGap(99, 99, 99))))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHD)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayMua)
                    .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayMua1)
                    .addComponent(txtNgayMua1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayMua2)
                    .addComponent(txtNgayMua2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cpInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInHoaDon)
                    .addComponent(lbTongTien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JScrollPane cpInHoaDon;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgayMua;
    private javax.swing.JLabel lbNgayMua1;
    private javax.swing.JLabel lbNgayMua2;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTable tbInHoaDon;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtNgayMua1;
    private javax.swing.JTextField txtNgayMua2;
    // End of variables declaration//GEN-END:variables
    
}