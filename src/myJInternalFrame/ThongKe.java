/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

import connectionSQL.connectionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author markhyun
 */
public class ThongKe extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyKhachHnag
     */
    Connection cnn;
    DefaultTableModel model;

    public ThongKe() {
        connectionSQL kn = new connectionSQL();
        cnn = kn.ketnoi(title);
        initComponents();
        this.chon();
    }

    //chọn kiểu thống kê 
    public void chon() {
        String chonK = (String) cbxBoLoc.getSelectedItem();
        if (chonK.equalsIgnoreCase("Mã sản phẩm theo tháng")) {
            this.thongKe1();
        }
        if (chonK.trim().equalsIgnoreCase("Doanh thu tất cả sản phẩm theo tháng")) {
            this.thongKe2();
        }
        if (chonK.trim().equalsIgnoreCase("Doanh thu tất cả sản phẩm theo năm")) {
            this.thongke3();
        }

    }

    //thỐng kê
    public void thongKe1() {
        String header[] = {"Stt", "Mã sản phẩm", "Tên sản phẩm", "Thời gian( tháng/năm)", "Tổng doanh thu"};
        String data[][] = null;
        model = new DefaultTableModel(data, header);
        tbThongKe.setModel(model);
        //model = (DefaultTableModel) tbThongKe.getModel();
        model.setRowCount(0);
        String sql = "select CTHOADON.MASP, TENSP, CAUHINH, TRANGTHAI, RIGHT(CONVERT(varchar(20),NGAYBAN,105),7), SUM(THANHTIEN) AS DOANHTHU\n"
                + "FROM SANPHAM JOIN CTHOADON ON SANPHAM.MASP = CTHOADON.MASP\n"
                + "JOIN HOADON ON HOADON.MAHD = CTHOADON.MAHD\n"
                + "GROUP BY CTHOADON.MASP, TENSP, CAUHINH, TRANGTHAI, RIGHT(CONVERT(varchar(20),NGAYBAN,105),7)";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int index = 0;
            while (rs.next()) {
                index++;
                Vector v = new Vector();
                v.add(index);
                v.add(rs.getString(1));
                v.add(rs.getString(2) + rs.getString(3) + rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));

                model.addRow(v);
            }
            stm.close();
            rs.close();

        } catch (Exception e) {
        }
    }

    //thống kê theo tháng
    public void thongKe2() {
        String header[] = {"Stt", "Tháng/năm", "Tổng doanh thu"};
        String data[][] = null;
        model = new DefaultTableModel(data, header);
        tbThongKe.setModel(model);
        //model = (DefaultTableModel) tbThongKe.getModel();
        model.setRowCount(0);
        String sql = "select RIGHT(CONVERT(varchar(20),NGAYBAN,105),7), SUM(THANHTIEN) AS DOANHTHU\n"
                + "FROM SANPHAM JOIN CTHOADON ON SANPHAM.MASP = CTHOADON.MASP\n"
                + "JOIN HOADON ON HOADON.MAHD = CTHOADON.MAHD\n"
                + "GROUP BY RIGHT(CONVERT(varchar(20),NGAYBAN,105),7)";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int index = 0;
            while (rs.next()) {
                index++;
                Vector v = new Vector();
                v.add(index);
                v.add(rs.getString(1));
                v.add(rs.getString(2));

                model.addRow(v);
            }
            stm.close();
            rs.close();

        } catch (Exception e) {
        }
    }

    //thống kê theo năm
    public void thongke3() {
        String header[] = {"Stt", "Năm", "Tổng doanh thu"};
        String data[][] = null;
        model = new DefaultTableModel(data, header);
        tbThongKe.setModel(model);
        //model = (DefaultTableModel) tbThongKe.getModel();
        model.setRowCount(0);
        String sql = "select RIGHT(CONVERT(varchar(20),NGAYBAN,105),4), SUM(THANHTIEN) AS DOANHTHU\n"
                + "FROM SANPHAM JOIN CTHOADON ON SANPHAM.MASP = CTHOADON.MASP\n"
                + "JOIN HOADON ON HOADON.MAHD = CTHOADON.MAHD\n"
                + "GROUP BY RIGHT(CONVERT(varchar(20),NGAYBAN,105),4)";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int index = 0;
            while (rs.next()) {
                index++;
                Vector v = new Vector();
                v.add(index);
                v.add(rs.getString(1));
                v.add(rs.getString(2));

                model.addRow(v);
            }
            stm.close();
            rs.close();

        } catch (Exception e) {
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

        kGradientPanel4 = new keeptoo.KGradientPanel();
        cpThongKe = new javax.swing.JScrollPane();
        tbThongKe = new javax.swing.JTable();
        cbxBoLoc = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));
        kGradientPanel4.setPreferredSize(new java.awt.Dimension(1033, 750));

        tbThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "THỜI GIAN( THÁNG / NĂM)", "TỔNG  DOANH THU"
            }
        ));
        tbThongKe.setFillsViewportHeight(true);
        tbThongKe.setRowHeight(30);
        cpThongKe.setViewportView(tbThongKe);

        cbxBoLoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxBoLoc.setForeground(new java.awt.Color(153, 153, 255));
        cbxBoLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm theo tháng", "Doanh thu tất cả sản phẩm theo tháng", "Doanh thu tất cả sản phẩm theo năm" }));
        cbxBoLoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBoLocItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxBoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxBoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cpThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxBoLocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBoLocItemStateChanged
        // TODO add your handling code here:
        this.chon();
    }//GEN-LAST:event_cbxBoLocItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxBoLoc;
    private javax.swing.JScrollPane cpThongKe;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTable tbThongKe;
    // End of variables declaration//GEN-END:variables
}
