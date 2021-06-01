/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author katie.pijohn
 */
public class StaffDetails extends javax.swing.JFrame {
    int staffDetails = 0;
    ArrayList<Staff> staff = new ArrayList<Staff>();

    /**
     * Creates new form StaffDetails
     */
    public StaffDetails() {
        initComponents();
        refreshData();
    }
    public void refreshData(){
        try{
           staff.clear(); 
            
        String sqlGetStaff = "SELECT * FROM tblUser";
            
            Connection conn = DBConnection.Connect();
            
            PreparedStatement psGetStaff = conn.prepareStatement(sqlGetStaff);
            
            ResultSet rs = psGetStaff.executeQuery();
    
         while(rs.next()){
                Staff s = new Staff(rs.getInt("id"), rs.getString("Username"), rs.getString("Password"), rs.getString("Role"));
                staff.add(s);
            }
    
            this.txtUsername.setText(staff.get(staffDetails).getUsername());
            this.txtPassword.setText(staff.get(staffDetails).getPassword());
            this.txtRole.setText(staff.get(staffDetails).getRole());
            
            conn.close();
    }
    
            catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get staff!n\nError" + e);
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

        lblStaffDetails = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNewStaff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));

        lblStaffDetails.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblStaffDetails.setText("Staff Details");

        lblUsername.setText("Username:");

        lblRole.setText("Role:");

        txtUsername.setBackground(new java.awt.Color(235, 152, 235));

        txtRole.setBackground(new java.awt.Color(235, 152, 235));

        btnPrevious.setBackground(new java.awt.Color(235, 197, 246));
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(235, 197, 246));
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(235, 197, 246));
        btnExit.setText("Back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(235, 197, 246));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(235, 197, 246));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        txtPassword.setBackground(new java.awt.Color(235, 152, 235));

        btnFirst.setBackground(new java.awt.Color(235, 197, 246));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(235, 197, 246));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNewStaff.setBackground(new java.awt.Color(235, 197, 246));
        btnNewStaff.setText("New Staff");
        btnNewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lblStaffDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUsername)
                                            .addComponent(lblRole))
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtPassword)
                                            .addComponent(txtRole)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPrevious)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnLast))
                                            .addComponent(btnNewStaff))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addGap(23, 23, 23)
                .addComponent(lblStaffDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnDelete))))
                .addGap(18, 18, 18)
                .addComponent(btnNewStaff)
                .addGap(0, 184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        SystemAdministrator am = new SystemAdministrator();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                        try{
            Connection conn = DBConnection.Connect();
            
            String sqlUpdate = "UPDATE tblUser SET Username=?, Password=?, Role=? WHERE id=?";
            PreparedStatement pStatement = conn.prepareStatement(sqlUpdate);
            pStatement.setString(1, txtUsername.getText());
            pStatement.setString(2, txtPassword.getText());
            pStatement.setString(3, txtRole.getText());

            
            pStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully.");
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot save staff details\n\nError "+ e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
            if(staffDetails !=0){
            staffDetails--;  
            
       }
            this.txtUsername.setText(staff.get(staffDetails).getUsername());
            this.txtPassword.setText(staff.get(staffDetails).getPassword());
            this.txtRole.setText(staff.get(staffDetails).getRole());
       
    
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
            if(staffDetails !=staff.size()-1){
            staffDetails++;
                    }
        
            this.txtUsername.setText(staff.get(staffDetails).getUsername());
            this.txtPassword.setText(staff.get(staffDetails).getPassword());
            this.txtRole.setText(staff.get(staffDetails).getRole());
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this staff from the system?\n\nThis cannot be undone", "Warning!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            try{
                Connection conn = DBConnection.Connect();
                
                String sqlDelete = "DELETE FROM tblUser WHERE id=?";
                PreparedStatement pStatement = conn.prepareStatement(sqlDelete);
                pStatement.setString(1, String.valueOf(staff.get(staffDetails).getId()));
                
                pStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Staff details have been deleted successfuly!");
                
                conn.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot delete staff\n\nError"+ e);
            }
                    staffDetails =0;
                    this.refreshData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Staff has not been deleted!");
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
            if(staffDetails !=0){
            staffDetails=0;  
            
       }  
            this.txtUsername.setText(staff.get(staffDetails).getUsername());
            this.txtPassword.setText(staff.get(staffDetails).getPassword());
            this.txtRole.setText(staff.get(staffDetails).getRole());
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        if(staffDetails !=staff.size()-1){
            staffDetails= staff.size()-1 ;  
        }
            this.txtUsername.setText(staff.get(staffDetails).getUsername());
            this.txtPassword.setText(staff.get(staffDetails).getPassword());
            this.txtRole.setText(staff.get(staffDetails).getRole());
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewStaffActionPerformed
          NewStaff ns = new NewStaff();
          ns.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnNewStaffActionPerformed

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
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewStaff;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStaffDetails;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
