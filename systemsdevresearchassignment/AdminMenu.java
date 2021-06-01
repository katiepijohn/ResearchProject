/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

/**
 *
 * @author katie.pijohn
 */
public class AdminMenu extends javax.swing.JFrame {
Staff staff;
    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
    }
      public AdminMenu(Staff inStaff){
        this.staff = inStaff;
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

        lblOffice = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnViewProjects = new javax.swing.JButton();
        btnViewCustomers = new javax.swing.JButton();
        btnViewInvoices = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnViewTasks = new javax.swing.JButton();
        btnManageProjects = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        lblOffice.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblOffice.setText("Office Admin Menu");

        btnExit.setBackground(new java.awt.Color(235, 197, 246));
        btnExit.setText("Logout");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnViewProjects.setBackground(new java.awt.Color(235, 197, 246));
        btnViewProjects.setText("View Projects");
        btnViewProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProjectsActionPerformed(evt);
            }
        });

        btnViewCustomers.setBackground(new java.awt.Color(235, 197, 246));
        btnViewCustomers.setText("View Customers");
        btnViewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomersActionPerformed(evt);
            }
        });

        btnViewInvoices.setBackground(new java.awt.Color(235, 197, 246));
        btnViewInvoices.setText("View Invoices");
        btnViewInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInvoicesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Welcome Back!");

        jLabel2.setText("Quote of the day...");

        jTextField1.setBackground(new java.awt.Color(235, 152, 235));

        btnViewTasks.setBackground(new java.awt.Color(235, 197, 246));
        btnViewTasks.setText("View Tasks");
        btnViewTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTasksActionPerformed(evt);
            }
        });

        btnManageProjects.setBackground(new java.awt.Color(235, 197, 246));
        btnManageProjects.setText("Manage Projects");
        btnManageProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProjectsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(417, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblOffice)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnViewProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewInvoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnManageProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblOffice)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnManageProjects)
                .addGap(18, 18, 18)
                .addComponent(btnViewProjects)
                .addGap(18, 18, 18)
                .addComponent(btnViewTasks)
                .addGap(18, 18, 18)
                .addComponent(btnViewCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnViewInvoices)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Login am = new Login();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProjectsActionPerformed
        ManageProject am = new ManageProject();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewProjectsActionPerformed

    private void btnViewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomersActionPerformed
        CustomerDetails am = new CustomerDetails();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewCustomersActionPerformed

    private void btnViewInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInvoicesActionPerformed
        Invoices am = new Invoices();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewInvoicesActionPerformed

    private void btnManageProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProjectsActionPerformed
        NewProject am = new NewProject();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageProjectsActionPerformed

    private void btnViewTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTasksActionPerformed
        Tasks am = new Tasks();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewTasksActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageProjects;
    private javax.swing.JButton btnViewCustomers;
    private javax.swing.JButton btnViewInvoices;
    private javax.swing.JButton btnViewProjects;
    private javax.swing.JButton btnViewTasks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblOffice;
    // End of variables declaration//GEN-END:variables
}
