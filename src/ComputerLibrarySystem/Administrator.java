package ComputerLibrarySystem;
import javax.swing.*;
import java.sql.*;
import java.text.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Administrator extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    final String dbUrl ="jdbc:mysql://localhost:3306/computerLabManagementSystem";
    final String dbUsername = "root";
    final String dbPassword = "password1234";            
    
    int q, i, id, deleteItem;
            
            
    public Administrator() {
        initComponents();
        updateDb();
    }
    
    //     Update database
public void updateDb() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        pst = con.prepareStatement("SELECT * FROM StaffRecord");

        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();

        q = stData.getColumnCount();

        DefaultTableModel recordTable = (DefaultTableModel) jTable1.getModel();
        recordTable.setRowCount(0);

        while (rs.next()) {
            Vector columnData = new Vector();
            for (i = 1; i <= q; i++) {
                columnData.add(rs.getString(i));
            }
            recordTable.addRow(columnData);
        }

    // After populating the model, set it back to the jTable1
        jTable1.setModel(recordTable);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timeTakenTxt = new javax.swing.JTextField();
        compUsageTxt2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fullNameTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addNewBtn = new javax.swing.JToggleButton();
        updateBtn = new javax.swing.JToggleButton();
        deleteBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1256, 900));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrator's Section");

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(0, 51, 51));
        logoutBtn.setText("Logout here");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Time taken");

        timeTakenTxt.setBackground(new java.awt.Color(204, 204, 255));
        timeTakenTxt.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        timeTakenTxt.setForeground(new java.awt.Color(0, 0, 0));
        timeTakenTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timeTakenTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTakenTxtActionPerformed(evt);
            }
        });

        compUsageTxt2.setBackground(new java.awt.Color(204, 204, 255));
        compUsageTxt2.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        compUsageTxt2.setForeground(new java.awt.Color(0, 0, 0));
        compUsageTxt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        compUsageTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compUsageTxt2ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Add, Update  or Delete data entered by the staff...");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Computer Usage");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Computer Usage", "Time taken"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        fullNameTxt.setBackground(new java.awt.Color(204, 204, 255));
        fullNameTxt.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N
        fullNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        fullNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fullNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTxtActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Fullname");

        addNewBtn.setBackground(new java.awt.Color(0, 51, 51));
        addNewBtn.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        addNewBtn.setForeground(new java.awt.Color(255, 255, 255));
        addNewBtn.setText("Add New");
        addNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(102, 102, 102)
                                        .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(36, 36, 36)
                                        .addComponent(compUsageTxt2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeTakenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(238, 238, 238)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addNewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compUsageTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeTakenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        HomeLogin loginPage = new HomeLogin();
        loginPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBtnActionPerformed
        // TODO add your handling code here:
        try{
            //Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            pst = con.prepareStatement("INSERT INTO StaffRecord(fullName, computerUsage, timeTaken) VALUES(?,?,?)");      
            
            pst.setString(1, fullNameTxt.getText());
            pst.setString(2, compUsageTxt2.getText());
            pst.setString(3, timeTakenTxt.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record added");
            updateDb();
            
            
        } catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_addNewBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
 try {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex != -1) {
            String fullName = fullNameTxt.getText();
            String compUsage = compUsageTxt2.getText();
            String timeTaken = timeTakenTxt.getText();
            
            // Update data in the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            String updateQuery = "UPDATE StaffRecord SET fullName=?, computerUsage=?, timeTaken=? WHERE fullName=?";
            pst = con.prepareStatement(updateQuery);
            pst.setString(1, fullName);
            pst.setString(2, compUsage);
            pst.setString(3, timeTaken);
            pst.setString(4, (String) tableModel.getValueAt(selectedRowIndex, 0)); // Assuming fullName is unique
            pst.executeUpdate();
            
            // Update data in the JTable
            tableModel.setValueAt(fullName, selectedRowIndex, 0);
            tableModel.setValueAt(compUsage, selectedRowIndex, 1);
            tableModel.setValueAt(timeTaken, selectedRowIndex, 2);
            
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred while updating record: " + ex.getMessage());
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //set data to the textField
        DefaultTableModel tbleMdl = (DefaultTableModel) jTable1.getModel();
        
        //set data to textfield when row selected
        String table_fullName = tbleMdl.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String table_compUsage = tbleMdl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String table_timeTaken = tbleMdl.getValueAt(jTable1.getSelectedRow(), 2).toString();
        
        // set to textfield 
        fullNameTxt.setText(table_fullName);
        compUsageTxt2.setText(table_compUsage);
        timeTakenTxt.setText(table_timeTaken);
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    // Get JTable MODEL
    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    
    //delete row
    if(jTable1.getSelectedRowCount() == 1){
        // Get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        
        // Get the unique identifier of the selected row
        String fullNameToDelete = tblModel.getValueAt(selectedRowIndex, 0).toString(); // Assuming fullName is unique
        
        try {
            // Delete the corresponding record from the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            String deleteQuery = "DELETE FROM StaffRecord WHERE fullName=?";
            pst = con.prepareStatement(deleteQuery);
            pst.setString(1, fullNameToDelete);
            pst.executeUpdate();
            
            // Remove the selected row from the JTable
            tblModel.removeRow(selectedRowIndex);
            
            JOptionPane.showMessageDialog(this, "Record deleted successfully.");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while deleting record: " + ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else if(jTable1.getSelectedRowCount() == 0){
        //if no row selected
        JOptionPane.showMessageDialog(this, "Table is empty");
    } else{
        //if table is not empty but row is not selected or multiple rows selected
        JOptionPane.showMessageDialog(this, "Select one row to delete");
    }
    }//GEN-LAST:event_deleteBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addNewBtn;
    private javax.swing.JTextField compUsageTxt2;
    private javax.swing.JToggleButton deleteBtn;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField timeTakenTxt;
    private javax.swing.JToggleButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
