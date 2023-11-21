package com.uts;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {
     Connection conn;
     
    public Form() {
        initComponents();
        
        judul.requestFocus();
        
        Statement stmt;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uts_22090139_A", "root", "");
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * from tabel_22090139_A");
            
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { model.addColumn(rs.getMetaData().getColumnName(i)); }
            
            while (rs.next()) {
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { rowData[i - 1] = rs.getObject(i); }
                model.addRow(rowData);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception e) { System.out.println(e.getMessage());}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tahun_pendirian = new javax.swing.JTextField();
        bidang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form UMKM");
        setMinimumSize(new java.awt.Dimension(700, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA UMKM", "BIDANG", "TAHUN PENDIRIAN", "KATEGORI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        judul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("FORM TAMBAH DATA");
        jPanel1.add(judul);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("1. NAMA UMKM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("2. BIDANG");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("3. TAHUN PENDIRIAN");

        bidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===> Pilih Bidang <===", "Kuliner", "Fashion", "Agrobisnis", "Otomotif" }));
        bidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("4. KATEGORI");

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "===> Pilih Kategori<===", "Usaha Mikro", "Usaha Kecil", "Usaha Menengah" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SIMPAN DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(nama)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tahun_pendirian)
                    .addComponent(bidang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(kategori, 0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahun_pendirian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Statement stmt;
        ResultSet rs;
    
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO tabel_22090139_A (nama_umkm, bidang, tahun_pendirian, kategori) VALUES ('" + nama.getText() + "','" + bidang.getSelectedItem() + "'," + tahun_pendirian.getText() + ",'" + kategori.getSelectedItem() + "')");
            
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * from tabel_22090139_A");
            
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { model.addColumn(rs.getMetaData().getColumnName(i)); }
            
            while (rs.next()) {
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { rowData[i - 1] = rs.getObject(i); }
                model.addRow(rowData);
            }
           
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * from tabel_22090398_A");
            
            DefaultTableModel models = new DefaultTableModel();
            jTable1.setModel(models);
            
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { models.addColumn(rs.getMetaData().getColumnName(i)); }
            
            while (rs.next()) {
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { rowData[i - 1] = rs.getObject(i); }
                models.addRow(rowData);
            }
            
            rs.close();
            stmt.close();
            
            nama.setText("");
            tahun_pendirian.setText("");
        } catch (Exception e) { System.out.println(e.getMessage());}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidangActionPerformed

    public static void main(String args[]) {
        FlatArcIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bidang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel judul;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField tahun_pendirian;
    // End of variables declaration//GEN-END:variables
}
