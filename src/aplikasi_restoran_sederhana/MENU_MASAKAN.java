/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_restoran_sederhana;


import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aditya
 */
public class MENU_MASAKAN extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    

    /**
     * Creates new form MENU_MASAKAN
     */
    public MENU_MASAKAN() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    class masakan extends MENU_MASAKAN{
        int id_masakan, harga;
        String nama_masakan, status;

        public masakan() {
            this.nama_masakan = Text_Nama_Masakan.getText();
            this.harga = Integer.parseInt(Text_Harga.getText());
            this.status = Combo_Status_Makanan.getSelectedItem().toString();
        }
        
        
        
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID Masakan");
        model.addColumn("Nama Masakan");
        model.addColumn("Harga");
        model.addColumn("Status Makanan");
        Table_Masakan.setModel(model);
        try {
            this.stat = k.getcon().prepareStatement("select * from masakan");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data={
                    rs.getInt("id_masakan"),
                    rs.getString("nama_masakan"),
                    rs.getInt("harga"),
                    rs.getString("status")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                    
        }
        Text_Id_Masakan.setText("");
        Text_Nama_Masakan.setText("");
        Text_Harga.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Id_Masakan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Text_Nama_Masakan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Text_Harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Combo_Status_Makanan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Masakan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Btn_Input = new javax.swing.JButton();
        Btn_Update = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        Btn_Registrasi = new javax.swing.JButton();
        Btn_Logout = new javax.swing.JButton();
        Btn_Transaksi = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU MASAKAN");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("ID Masakan");

        Text_Id_Masakan.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Text_Id_Masakan.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("Nama Masakan");

        Text_Nama_Masakan.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setText("Status Makanan");

        Text_Harga.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setText("Harga");

        Combo_Status_Makanan.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Combo_Status_Makanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));

        Table_Masakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Masakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_MasakanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Masakan);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Btn_Input.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Btn_Input.setText("INPUT");
        Btn_Input.setEnabled(false);
        Btn_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InputActionPerformed(evt);
            }
        });

        Btn_Update.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Btn_Update.setText("UPDATE");
        Btn_Update.setEnabled(false);
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateActionPerformed(evt);
            }
        });

        Btn_Delete.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Btn_Delete.setText("DELETE");
        Btn_Delete.setEnabled(false);
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });

        Btn_Registrasi.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Btn_Registrasi.setText("MENU REGISTRASI");
        Btn_Registrasi.setEnabled(false);
        Btn_Registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Registrasi)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Btn_Logout.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Btn_Logout.setText("LOGOUT");
        Btn_Logout.setEnabled(false);
        Btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogoutActionPerformed(evt);
            }
        });

        Btn_Transaksi.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Btn_Transaksi.setText("MENU TRANSAKSI");
        Btn_Transaksi.setEnabled(false);
        Btn_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Harga)
                            .addComponent(Text_Id_Masakan)
                            .addComponent(Text_Nama_Masakan)
                            .addComponent(Combo_Status_Makanan, 0, 370, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Id_Masakan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Nama_Masakan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Status_Makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InputActionPerformed
        // TODO add your handling code here:
        try {
    masakan m = new masakan();
    this.stat = k.getcon().prepareStatement("INSERT INTO masakan (nama_masakan, harga, status) VALUES (?, ?, ?)");
    stat.setString(1, m.nama_masakan);
    stat.setInt(2, m.harga);
    stat.setString(3, m.status);
    stat.executeUpdate();
    refreshTable();
    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_Btn_InputActionPerformed

    private void Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateActionPerformed
        // TODO add your handling code here:
       try {
    // Pastikan objek masakan tidak null
    masakan m = new masakan();
    
    // Pastikan ID tidak kosong sebelum parsing
    if (Text_Id_Masakan.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "ID Masakan tidak boleh kosong!");
        return; // Hentikan proses jika ID kosong
    }

    int idMasakan = Integer.parseInt(Text_Id_Masakan.getText().trim());

    // Query update
    this.stat = k.getcon().prepareStatement(
        "UPDATE masakan SET nama_masakan=?, harga=?, status=? WHERE id_masakan=?"
    );

    // Set parameter
    stat.setString(1, m.nama_masakan);
    stat.setInt(2, m.harga);
    stat.setString(3, m.status);
    stat.setInt(4, idMasakan);

    // Eksekusi query
    int rowsUpdated = stat.executeUpdate();
    
    // Cek apakah ada data yang terupdate
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Data masakan berhasil diperbarui!");
        refreshTable();
    } else {
        JOptionPane.showMessageDialog(null, "Data masakan tidak ditemukan atau tidak diperbarui.");
    }

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Format ID Masakan harus berupa angka!");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
}

    }//GEN-LAST:event_Btn_UpdateActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getcon().prepareStatement("delete from masakan where id_masakan=?");
            stat.setInt(1, Integer.parseInt(Text_Id_Masakan.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void Btn_RegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrasiActionPerformed
        // TODO add your handling code here:
        Menu_Registrasi reg = new Menu_Registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_RegistrasiActionPerformed

    private void Btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_LogoutActionPerformed

    private void Table_MasakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_MasakanMouseClicked
        // TODO add your handling code here:
        Text_Id_Masakan.setText(model.getValueAt(Table_Masakan.getSelectedRow(), 0).toString());
        Text_Nama_Masakan.setText(model.getValueAt(Table_Masakan.getSelectedRow(), 1).toString());
        Text_Harga.setText(model.getValueAt(Table_Masakan.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_Table_MasakanMouseClicked

    private void Btn_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TransaksiActionPerformed
        // TODO add your handling code here:
        Menu_Transaksi tran = new Menu_Transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_TransaksiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU_MASAKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_MASAKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_MASAKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_MASAKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_MASAKAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    public javax.swing.JButton Btn_Input;
    public javax.swing.JButton Btn_Logout;
    public javax.swing.JButton Btn_Registrasi;
    public javax.swing.JButton Btn_Transaksi;
    public javax.swing.JButton Btn_Update;
    private javax.swing.JComboBox<String> Combo_Status_Makanan;
    private javax.swing.JTable Table_Masakan;
    private javax.swing.JTextField Text_Harga;
    private javax.swing.JTextField Text_Id_Masakan;
    private javax.swing.JTextField Text_Nama_Masakan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
