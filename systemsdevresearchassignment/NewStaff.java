/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author katie.pijohn
 */
public class NewStaff extends javax.swing.JFrame {

    /**
     * Creates new form NewStaff
     */
    public NewStaff() {
    initComponents();
    refreshData();
    }
    public void refreshData(){
        try{
        String sqlGetStaff = "SELECT * FROM tblUser";
        
        Connection conn = DBConnection.Connect();
        
        PreparedStatement psGetStaff = conn.prepareStatement(sqlGetStaff);

         
        ResultSet rs = psGetStaff.executeQuery();
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get staff\n\nError" + e);
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

        lblStaff = new javax.swing.JLabel();
        btnStaffDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));

        lblStaff.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblStaff.setText("Create Staff");

        btnStaffDetails.setBackground(new java.awt.Color(235, 197, 246));
        btnStaffDetails.setText("Staff Details");
        btnStaffDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffDetailsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(235, 197, 246));
        btnBack.setText("Back to Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblRole.setText("Role:");

        txtUsername.setBackground(new java.awt.Color(235, 152, 235));

        txtPassword.setBackground(new java.awt.Color(235, 152, 235));

        txtRole.setBackground(new java.awt.Color(235, 152, 235));

        btnCreate.setBackground(new java.awt.Color(235, 197, 246));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnStaffDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(lblStaff))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRole)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUsername))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(txtRole, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStaffDetails)
                    .addComponent(btnBack))
                .addGap(46, 46, 46)
                .addComponent(lblStaff)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole))
                .addGap(106, 106, 106)
                .addComponent(btnCreate)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      try{
      
      Connection conn = DBConnection.Connect();
      
      String sqlInsert = "INSERT INTO tblUser(Username, Password, Role) VALUES (?,?,?)";
    
      PreparedStatement pStatement = conn.prepareStatement(sqlInsert);
      pStatement.setString(1, this.txtUsername.getText());
      pStatement.setString(2, this.txtPassword.getText());
      pStatement.setString(3, this.txtRole.getText());
     
      
      pStatement.executeUpdate();
      JOptionPane.showMessageDialog(null, "Create Successful!\n\nReturning to Staff Details screen.");
  }
  catch(Exception e){
      JOptionPane.showMessageDialog(null, "Cannot save staff details\n\nError" + e);
  }
   this.refreshData();   
      
  StaffDetails sd = new StaffDetails();
  sd.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnStaffDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffDetailsActionPerformed
          StaffDetails sd = new StaffDetails();
          sd.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnStaffDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          SystemAdministrator sa = new SystemAdministrator();
          sa.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(NewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnStaffDetails;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStaff;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
