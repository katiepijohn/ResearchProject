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
public class CustomerDetails extends javax.swing.JFrame {
    int customerDetails = 0;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() {
        initComponents();
        refreshData();
    }
    public void refreshData(){
        try{
           customers.clear();
           
           String sqlGetCustomers = "SELECT * FROM tblCustomers";
            
            Connection conn = DBConnection.Connect();
            
            PreparedStatement psGetCustomers = conn.prepareStatement(sqlGetCustomers);
            
            ResultSet rs = psGetCustomers.executeQuery();
            
            while(rs.next()){
                Customer c = new Customer(rs.getInt("id"), rs.getString("customerName"), rs.getInt("DOB"), rs.getString("address"));
                customers.add(c);
            }
    
            this.txtCustomerName.setText(customers.get(customerDetails).getCustomerName());
            this.txtDOB.setText(String.valueOf(customers.get(customerDetails).getDOB()));
            this.txtAddress.setText(customers.get(customerDetails).getAddress());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get customers!n\nError" + e);
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

        jLabel6 = new javax.swing.JLabel();
        lblCustomerDetails = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnInvoices = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNewCustomer = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        lblCustomerDetails.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCustomerDetails.setText("Customer Details");

        lblCustomerName.setText("Customer Name:");

        lblDOB.setText("DOB:");

        lblAddress.setText("Address:");

        txtCustomerName.setBackground(new java.awt.Color(235, 152, 235));

        txtDOB.setBackground(new java.awt.Color(235, 152, 235));

        txtAddress.setBackground(new java.awt.Color(235, 152, 235));

        btnSave.setBackground(new java.awt.Color(235, 197, 246));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(235, 197, 246));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

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

        btnInvoices.setBackground(new java.awt.Color(235, 197, 246));
        btnInvoices.setText("Customer Invoices");
        btnInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(235, 197, 246));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNewCustomer.setBackground(new java.awt.Color(235, 197, 246));
        btnNewCustomer.setText("New Customer");
        btnNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCustomerActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(235, 197, 246));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(235, 197, 246));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInvoices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addComponent(lblCustomerDetails)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrevious)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext)
                                .addGap(18, 18, 18)
                                .addComponent(btnLast))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblDOB)
                                    .addComponent(lblCustomerName)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnNewCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnInvoices))
                .addGap(35, 35, 35)
                .addComponent(lblCustomerDetails)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(btnNewCustomer)
                .addGap(0, 161, Short.MAX_VALUE))
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                try{
            Connection conn = DBConnection.Connect();
            
            String sqlUpdate = "UPDATE tblCustomers SET customerName=?, DOB=?, address=?,WHERE id=?";
            PreparedStatement pStatement = conn.prepareStatement(sqlUpdate);
            pStatement.setString(1, txtCustomerName.getText());
            pStatement.setString(2, txtDOB.getText());
            pStatement.setString(3, txtAddress.getText());
            
            pStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully.");
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot save customer details\n\nError "+ e);
           
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        AdminMenu am = new AdminMenu();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
       if(customerDetails !=0){
            customerDetails--;  
            
       }
            this.txtCustomerName.setText(customers.get(customerDetails).getCustomerName());
            this.txtDOB.setText(String.valueOf(customers.get(customerDetails).getDOB()));
            this.txtAddress.setText(customers.get(customerDetails).getAddress());
       
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
            if(customerDetails !=customers.size()-1){
            customerDetails++;  
            
       }
            this.txtCustomerName.setText(customers.get(customerDetails).getCustomerName());
            this.txtDOB.setText(String.valueOf(customers.get(customerDetails).getDOB()));
            this.txtAddress.setText(customers.get(customerDetails).getAddress());
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesActionPerformed
        Invoices am = new Invoices();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInvoicesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this customer from the system?\n\nThis cannot be undone", "Warning!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            try{
                Connection conn = DBConnection.Connect();
                
                String sqlDelete = "DELETE FROM tblCustomers WHERE id=?";
                PreparedStatement pStatement = conn.prepareStatement(sqlDelete);
                pStatement.setString(1, String.valueOf(customers.get(customerDetails).getId()));
                
                pStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer details have been deleted successfuly!");
                
                conn.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot delete customer\n\nError"+ e);
            }
                    customerDetails =0;
                    this.refreshData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Customer has not been deleted!");
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
            if(customerDetails !=customers.size()-1){
            customerDetails= customers.size()-1 ;  
            
       }
            this.txtCustomerName.setText(customers.get(customerDetails).getCustomerName());
            this.txtDOB.setText(String.valueOf(customers.get(customerDetails).getDOB()));
            this.txtAddress.setText(customers.get(customerDetails).getAddress());
       
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
            if(customerDetails !=0){
            customerDetails=0;  
            
       }
            this.txtCustomerName.setText(customers.get(customerDetails).getCustomerName());
            this.txtDOB.setText(String.valueOf(customers.get(customerDetails).getDOB()));
            this.txtAddress.setText(customers.get(customerDetails).getAddress());
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCustomerActionPerformed
          NewCustomer nc = new NewCustomer();
          nc.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnNewCustomerActionPerformed
    
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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInvoices;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewCustomer;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDOB;
    // End of variables declaration//GEN-END:variables
}
