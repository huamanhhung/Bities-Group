/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

/**
 *
 * @author markhyun
 */
public class HoaDon extends javax.swing.JInternalFrame {

    /**
     * Creates new form HoaDon
     */
    public HoaDon() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        kGradientPanel3 = new keeptoo.KGradientPanel();
        txtMaHD = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtNgayMua = new javax.swing.JTextField();
        lbMaHD = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        lbNgayMua = new javax.swing.JLabel();
        cpHoaDon = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        lbMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lbTongTien = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnXoaHoaDon = new javax.swing.JButton();
        btnTimKiemHoaDon = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel3.setBackground(new java.awt.Color(252, 244, 252));
        kGradientPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel3.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel3.setkGradientFocus(1000);
        kGradientPanel3.setkStartColor(new java.awt.Color(168, 168, 233));

        txtMaHD.setEditable(false);
        txtMaHD.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtNgayMua.setEditable(false);
        txtNgayMua.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbMaHD.setBackground(new java.awt.Color(252, 244, 252));
        lbMaHD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaHD.setForeground(new java.awt.Color(252, 244, 252));
        lbMaHD.setText("Mã hóa đơn:");

        lbMaNV.setBackground(new java.awt.Color(252, 244, 252));
        lbMaNV.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(252, 244, 252));
        lbMaNV.setText("Mã nhân viên:");

        lbNgayMua.setBackground(new java.awt.Color(252, 244, 252));
        lbNgayMua.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbNgayMua.setForeground(new java.awt.Color(252, 244, 252));
        lbNgayMua.setText("Ngày bán:");

        tbHoaDon.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã nhân viên", "Ngày bán", "Mã khách hàng", "Tổng tiền"
            }
        ));
        tbHoaDon.setFillsViewportHeight(true);
        tbHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        cpHoaDon.setViewportView(tbHoaDon);

        lbMaKH.setBackground(new java.awt.Color(252, 244, 252));
        lbMaKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaKH.setForeground(new java.awt.Color(252, 244, 252));
        lbMaKH.setText("Mã Khách hàng:");

        txtMaKH.setEditable(false);
        txtMaKH.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbTongTien.setBackground(new java.awt.Color(252, 244, 252));
        lbTongTien.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTongTien.setForeground(new java.awt.Color(252, 244, 252));
        lbTongTien.setText("Tổng tiền:");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {1};
        jPanel1Layout.columnWeights = new double[] {1.0};
        jPanel1.setLayout(jPanel1Layout);

        btnXoaHoaDon.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnXoaHoaDon.setForeground(new java.awt.Color(72, 61, 139));
        btnXoaHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete_32x32.png"))); // NOI18N
        btnXoaHoaDon.setText("Xóa hóa đơn");
        btnXoaHoaDon.setInheritsPopupMenu(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(btnXoaHoaDon, gridBagConstraints);

        btnTimKiemHoaDon.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnTimKiemHoaDon.setForeground(new java.awt.Color(72, 61, 139));
        btnTimKiemHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_Icon_32.png"))); // NOI18N
        btnTimKiemHoaDon.setText("Tìm hóa đơn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel1.add(btnTimKiemHoaDon, gridBagConstraints);

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(cpHoaDon)
                        .addContainerGap())
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNgayMua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaHD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaNV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaKH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTongTien, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 221, Short.MAX_VALUE)))
                        .addGap(101, 101, 101)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHD)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaNV)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgayMua)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaKH)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTien)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(cpHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiemHoaDon;
    private javax.swing.JButton btnXoaHoaDon;
    private javax.swing.JScrollPane cpHoaDon;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lbMaHD;
    private javax.swing.JLabel lbMaKH;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgayMua;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
