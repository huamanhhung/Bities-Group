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
public class QuanLySanPham extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyKhachHnag
     */
    public QuanLySanPham() {
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

        kGradientPanel4 = new keeptoo.KGradientPanel();
        txtTenSP = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lbSoLuongSP = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnTimkiemSP = new javax.swing.JButton();
        lbMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        cpQLSP = new javax.swing.JScrollPane();
        tbQLSP = new javax.swing.JTable();
        lbTenSP = new javax.swing.JLabel();
        cpCauHinh = new javax.swing.JScrollPane();
        taCauHinh = new javax.swing.JTextArea();
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnThemSP, gridBagConstraints);

        btnSuaSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnSuaSP.setForeground(new java.awt.Color(72, 61, 139));
        btnSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_32x32.png"))); // NOI18N
        btnSuaSP.setText("Sửa thông tin SP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnSuaSP, gridBagConstraints);

        btnXoaSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(72, 61, 139));
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete_32x32.png"))); // NOI18N
        btnXoaSP.setText("Xóa sản phẩm");
        btnXoaSP.setPreferredSize(new java.awt.Dimension(293, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnXoaSP, gridBagConstraints);

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

        txtMaSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        tbQLSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbQLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng sản phẩm", "Cấu hình", "Trạng thái"
            }
        ));
        tbQLSP.setFillsViewportHeight(true);
        cpQLSP.setViewportView(tbQLSP);

        lbTenSP.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTenSP.setForeground(new java.awt.Color(252, 244, 252));
        lbTenSP.setText("Tên sản phẩm:");

        taCauHinh.setColumns(20);
        taCauHinh.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        taCauHinh.setRows(5);
        cpCauHinh.setViewportView(taCauHinh);

        txtSoLuongSP.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbCauHinh.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbCauHinh.setForeground(new java.awt.Color(252, 244, 252));
        lbCauHinh.setText("    Cấu hình:");

        lbTrangThai.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(252, 244, 252));
        lbTrangThai.setText("  Trạng thái:");

        cbbTrangThai.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Máy mới - Nguyên hộp", "Máy cũ - 99%", "Mới - Chưa Active", "Mới - Đã Active" }));
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
                    .addComponent(cpCauHinh, javax.swing.GroupLayout.Alignment.LEADING)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTimkiemSP;
    private javax.swing.JButton btnXoaSP;
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
    private javax.swing.JTextArea taCauHinh;
    private javax.swing.JTable tbQLSP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuongSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
