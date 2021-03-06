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
public class Invoices extends javax.swing.JFrame {
    int customerInvoices = 0;
    ArrayList<Invoice> invoices = new ArrayList<Invoice>();

    /**
     * Creates new form Invoices
     */
    public Invoices() {
        initComponents();
        refreshData();
    }
    public void refreshData(){
        try{
           invoices.clear();
           
           String sqlGetInvoices = "SELECT * FROM tblInvoices";
            
            Connection conn = DBConnection.Connect();
            
            PreparedStatement psGetInvoices = conn.prepareStatement(sqlGetInvoices);
            
            ResultSet rs = psGetInvoices.executeQuery();
            
            while(rs.next()){
                Invoice i = new Invoice(rs.getInt("id"), rs.getInt("totalcost"), rs.getInt("amountPaid"), rs.getInt("amountOwed"), rs.getInt("projectID"));
                invoices.add(i);
            }
           this.lblProjectID.setText(String.valueOf(invoices.get(customerInvoices).getId()));
            this.txtTotalCost.setText(String.valueOf(invoices.get(customerInvoices).getTotalcost()));
            this.txtAmountPaid.setText(String.valueOf(invoices.get(customerInvoices).getAmountPaid()));
            this.txtAmountOwed.setText(String.valueOf(invoices.get(customerInvoices).getAmountOwed()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get invoices!n\nError" + e);
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

        lblInvoices = new javax.swing.JLabel();
        lblAmountPaid = new javax.swing.JLabel();
        txtAmountPaid = new javax.swing.JTextField();
        btnPayNow = new javax.swing.JButton();
        lblProjectID = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblAmountOwed = new javax.swing.JLabel();
        txtAmountOwed = new javax.swing.JTextField();
        lblTotalCost = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        lblInvoices.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblInvoices.setText("Invoices");

        lblAmountPaid.setText("Amount Paid:");

        txtAmountPaid.setBackground(new java.awt.Color(235, 152, 235));
        txtAmountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountPaidActionPerformed(evt);
            }
        });

        btnPayNow.setBackground(new java.awt.Color(235, 197, 246));
        btnPayNow.setText("Pay Now");
        btnPayNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayNowActionPerformed(evt);
            }
        });

        lblProjectID.setText("Project ID:");

        btnExit.setBackground(new java.awt.Color(235, 197, 246));
        btnExit.setText("Back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAmountOwed.setText("Amount Owed:");

        txtAmountOwed.setBackground(new java.awt.Color(235, 152, 235));

        lblTotalCost.setText("Total Cost:");

        txtTotalCost.setBackground(new java.awt.Color(235, 152, 235));

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
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
                        .addComponent(lblProjectID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(lblInvoices))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmountOwed)
                                    .addComponent(lblAmountPaid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTotalCost, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAmountPaid, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtAmountOwed)
                                    .addComponent(txtTotalCost)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnPrevious)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(btnPayNow)))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectID)
                    .addComponent(btnExit))
                .addGap(33, 33, 33)
                .addComponent(lblInvoices)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCost)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmountPaid)
                    .addComponent(txtAmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmountOwed)
                    .addComponent(txtAmountOwed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPayNow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountPaidActionPerformed

    private void btnPayNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayNowActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you wish to pay the outstanding amount?\n\nThis cannot be undone", "Warning!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            try{
                Connection conn = DBConnection.Connect();
                
                String sqlDelete = "DELETE FROM tblInvoices WHERE id=?";
                PreparedStatement pStatement = conn.prepareStatement(sqlDelete);
                pStatement.setString(1, String.valueOf(invoices.get(customerInvoices).getId()));
                
                pStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Outstanding amount has been paid successfully!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot proceed with payment\n\nError"+ e);
            }
                    customerInvoices =0;
                    this.refreshData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Payment has not been processed!");
            
        }
                                               
    }//GEN-LAST:event_btnPayNowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        AdminMenu am = new AdminMenu();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
            if(customerInvoices !=0){
            customerInvoices--;  
            
       }
            this.lblProjectID.setText(String.valueOf(invoices.get(customerInvoices).getId()));
            this.txtTotalCost.setText(String.valueOf(invoices.get(customerInvoices).getTotalcost()));
            this.txtAmountPaid.setText(String.valueOf(invoices.get(customerInvoices).getAmountPaid()));
            this.txtAmountOwed.setText(String.valueOf(invoices.get(customerInvoices).getAmountOwed()));
            
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
            if(customerInvoices !=invoices.size()-1){
            customerInvoices++; 
            }
            this.lblProjectID.setText(String.valueOf(invoices.get(customerInvoices).getId()));
            this.txtTotalCost.setText(String.valueOf(invoices.get(customerInvoices).getTotalcost()));
            this.txtAmountPaid.setText(String.valueOf(invoices.get(customerInvoices).getAmountPaid()));
            this.txtAmountOwed.setText(String.valueOf(invoices.get(customerInvoices).getAmountOwed()));
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPayNow;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel lblAmountOwed;
    private javax.swing.JLabel lblAmountPaid;
    private javax.swing.JLabel lblInvoices;
    private javax.swing.JLabel lblProjectID;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JTextField txtAmountOwed;
    private javax.swing.JTextField txtAmountPaid;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
}
