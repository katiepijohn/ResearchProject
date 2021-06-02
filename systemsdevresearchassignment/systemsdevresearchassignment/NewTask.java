/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author katie.pijohn
 */
public class NewTask extends javax.swing.JFrame {
    int currentTasks = 0;
    ArrayList<Task> tasks = new ArrayList<Task>();
    DefaultComboBoxModel assignedResearcherModel = new DefaultComboBoxModel();

    /**
     * Creates new form NewTask
     */
    public NewTask() {
        initComponents();
        refreshData();
    }
    public void refreshData(){
                 try{
            
            tasks.clear();
            
         String sqlGetTasks = "SELECT * FROM tblProjectTasks";
         String sqlGetAssignedResearcher = "SELECT id, assignedResearcher FROM tblProjectTasks";
         
         Connection conn = DBConnection.Connect();
         
         PreparedStatement psGetTasks = conn.prepareStatement(sqlGetTasks);
         PreparedStatement psGetAssignedResearcher = conn.prepareStatement(sqlGetAssignedResearcher);
         
                     
            ResultSet rs = psGetTasks.executeQuery();
            
            while(rs.next()){
                Task t = new Task(rs.getInt("id"), rs.getString("task"), rs.getInt("taskcost"), rs.getInt("projectID"), rs.getInt("assignedResearcher"));
                tasks.add(t);
            }
            
         rs = psGetAssignedResearcher.executeQuery();
         
         this.cmbxAssignedResearcher.removeAllItems();
         
         while(rs.next()){
             assignedResearcherModel.addElement(new ComboBoxItem(rs.getInt("id"), rs.getString("assignedResearcher")));
             
         }
         this.cmbxAssignedResearcher.setModel(assignedResearcherModel);
         
         conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get tasks\n\nError" + e);
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

        lblCreateTasks = new javax.swing.JLabel();
        lblProjectID = new javax.swing.JLabel();
        btnViewTasks = new javax.swing.JButton();
        txtProjectID = new javax.swing.JTextField();
        txtTaskName = new javax.swing.JTextField();
        lblTaskName = new javax.swing.JLabel();
        lblTaskCost = new javax.swing.JLabel();
        txtTaskCost = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblAssignedResearcher = new javax.swing.JLabel();
        cmbxAssignedResearcher = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        lblCreateTasks.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCreateTasks.setText("Create Task");

        lblProjectID.setText("Project ID:");

        btnViewTasks.setBackground(new java.awt.Color(235, 197, 246));
        btnViewTasks.setText("View Tasks");
        btnViewTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTasksActionPerformed(evt);
            }
        });

        txtProjectID.setBackground(new java.awt.Color(235, 152, 235));

        txtTaskName.setBackground(new java.awt.Color(235, 152, 235));

        lblTaskName.setText("Task Name:");

        lblTaskCost.setText("Task Cost:");

        txtTaskCost.setBackground(new java.awt.Color(235, 152, 235));

        btnCreate.setBackground(new java.awt.Color(235, 197, 246));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblAssignedResearcher.setText("Assigned Researcher:");

        cmbxAssignedResearcher.setBackground(new java.awt.Color(235, 197, 246));
        cmbxAssignedResearcher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCreateTasks)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewTasks)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaskName)
                            .addComponent(lblProjectID)
                            .addComponent(lblTaskCost)
                            .addComponent(lblAssignedResearcher))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTaskName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtTaskCost, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxAssignedResearcher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewTasks)
                .addGap(41, 41, 41)
                .addComponent(lblCreateTasks)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectID)
                    .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaskName))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskCost)
                    .addComponent(txtTaskCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignedResearcher)
                    .addComponent(cmbxAssignedResearcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnCreate)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTasksActionPerformed
        Tasks t = new Tasks();
        t.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnViewTasksActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       try{
      ComboBoxItem assignedResearcher = (ComboBoxItem)assignedResearcherModel.getSelectedItem();
      
      
      Connection conn = DBConnection.Connect();
      
      String sqlInsert = "INSERT INTO tblProjectTasks (task, taskcost, projectID, assignedResearcher) VALUES (?,?,?,?)";
    
      PreparedStatement pStatement = conn.prepareStatement(sqlInsert);
      pStatement.setString(1, this.txtTaskName.getText());
      pStatement.setString(2, this.txtTaskCost.getText());
      pStatement.setString(3, this.txtProjectID.getText());
      pStatement.setString(4, String.valueOf(assignedResearcher.getId()));
     
      
      pStatement.executeUpdate();
      JOptionPane.showMessageDialog(null, "Create Successful!\n\nReturning to View Tasks screen.");
      
      conn.close();
  }
  catch(Exception e){
      JOptionPane.showMessageDialog(null, "Cannot save task\n\nError" + e);
  }
  Tasks t = new Tasks();
  t.setVisible(true);
  this.dispose();
        
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnViewTasks;
    private javax.swing.JComboBox<String> cmbxAssignedResearcher;
    private javax.swing.JLabel lblAssignedResearcher;
    private javax.swing.JLabel lblCreateTasks;
    private javax.swing.JLabel lblProjectID;
    private javax.swing.JLabel lblTaskCost;
    private javax.swing.JLabel lblTaskName;
    private javax.swing.JTextField txtProjectID;
    private javax.swing.JTextField txtTaskCost;
    private javax.swing.JTextField txtTaskName;
    // End of variables declaration//GEN-END:variables
}