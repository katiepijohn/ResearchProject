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
public class CompleteTasks extends javax.swing.JFrame {
    int currentTasks = 0;
    ArrayList<Task> tasks = new ArrayList<Task>();
    DefaultComboBoxModel assignedResearcherModel = new DefaultComboBoxModel();
    /**
     * Creates new form CompleteTasks
     */
    public CompleteTasks() {
        initComponents();
        refreshData();
    }
    public void refreshData(){
        try{
            tasks.clear();
            
            String sqlGetProjectTasks = "SELECT * FROM tblCompleteTasks";
            String sqlGetAssignedResearcher = "SELECT id, assignedResearcher FROM tblCompleteTasks";
            
            Connection conn = DBConnection.Connect();
            
            PreparedStatement psGetProjectTasks = conn.prepareStatement(sqlGetProjectTasks);
            PreparedStatement psGetAssignedResearcher = conn.prepareStatement(sqlGetAssignedResearcher);
            
            ResultSet rs = psGetProjectTasks.executeQuery();
            
            while(rs.next()){
                Task t = new Task(rs.getInt("id"), rs.getString("task"), rs.getInt("taskcost"), rs.getInt("projectID"), rs.getInt("assignedResearcher"));
                tasks.add(t);
            }
            
            rs = psGetAssignedResearcher.executeQuery();
            
            this.cmbxAssignedResearcher.removeAllItems();
            
            while(rs.next()){
                assignedResearcherModel.addElement(new ComboBoxItem(rs.getInt("id"), rs.getString("assignedResearcher")));
                
                
            }
            for (int i = 0; i < assignedResearcherModel.getSize(); i++){
                ComboBoxItem o = (ComboBoxItem)assignedResearcherModel.getElementAt(i);
                if(o.getId() == tasks.get(currentTasks).getId()){
                    assignedResearcherModel.setSelectedItem(o);
                }
                
            
        }
            this.cmbxAssignedResearcher.setModel(assignedResearcherModel);
            this.lblId.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
              
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Cannot get Tasks!\n\nError"+e);
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

        lblReviewTask = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPleaseReview = new javax.swing.JLabel();
        lblTaskName = new javax.swing.JLabel();
        lblTaskCost = new javax.swing.JLabel();
        lblProjectID = new javax.swing.JLabel();
        lblAssignedResearcher = new javax.swing.JLabel();
        cmbxAssignedResearcher = new javax.swing.JComboBox<>();
        txtTaskCost = new javax.swing.JTextField();
        txtTaskName = new javax.swing.JTextField();
        txtProjectID = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSignOff = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        lblReviewTask.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblReviewTask.setText("Tasks Ready for Review");

        btnBack.setBackground(new java.awt.Color(235, 197, 246));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPleaseReview.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblPleaseReview.setText("Please review these tasks to be closed.");

        lblTaskName.setText("Task Name:");

        lblTaskCost.setText("Task Cost:");

        lblProjectID.setText("Project ID:");

        lblAssignedResearcher.setText("Assigned Researcher:");

        cmbxAssignedResearcher.setBackground(new java.awt.Color(235, 197, 246));
        cmbxAssignedResearcher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTaskCost.setBackground(new java.awt.Color(235, 152, 235));

        txtTaskName.setBackground(new java.awt.Color(235, 152, 235));

        txtProjectID.setBackground(new java.awt.Color(235, 152, 235));

        lblId.setText("ID:");

        btnSignOff.setBackground(new java.awt.Color(235, 197, 246));
        btnSignOff.setText("Sign Off");
        btnSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOffActionPerformed(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblReviewTask)
                            .addGap(115, 115, 115))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPleaseReview))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTaskName)
                                    .addComponent(lblProjectID)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAssignedResearcher)
                                            .addComponent(lblTaskCost))
                                        .addGap(1, 1, 1)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbxAssignedResearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtProjectID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(txtTaskName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTaskCost, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(91, 91, 91))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious)
                        .addGap(26, 26, 26)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSignOff, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblId))
                .addGap(47, 47, 47)
                .addComponent(lblReviewTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPleaseReview)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectID)
                    .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskName)
                    .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskCost)
                    .addComponent(txtTaskCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignedResearcher)
                    .addComponent(cmbxAssignedResearcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSignOff)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HeadResearcher hr = new HeadResearcher();
        hr.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if(currentTasks !=0){
            currentTasks--;
            
            this.lblId.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
            }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
            if(currentTasks !=tasks.size()-1){
            currentTasks++;
            
            this.lblId.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
            }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
            if(currentTasks !=tasks.size()-1){
            currentTasks = tasks.size()-1;

            this.lblId.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
                   
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
            if(currentTasks !=0){
            currentTasks=0;
            
            this.lblId.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
           }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOffActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign off this task?\n\nThis cannot be undone and will be deleted.", "Warning!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            try{
                Connection conn = DBConnection.Connect();
                
                String sqlDelete = "DELETE FROM tblCompleteTasks WHERE id=?";
                PreparedStatement pStatement = conn.prepareStatement(sqlDelete);
                pStatement.setString(1, String.valueOf(tasks.get(currentTasks).getId()));
                
                pStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Task has been signed off successfully!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot sign off task\n\nError"+ e);
            }
                    currentTasks =0;
                    this.refreshData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Task has not been signed off!");
            
        }
    }//GEN-LAST:event_btnSignOffActionPerformed

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
            java.util.logging.Logger.getLogger(CompleteTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompleteTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompleteTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompleteTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompleteTasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSignOff;
    private javax.swing.JComboBox<String> cmbxAssignedResearcher;
    private javax.swing.JLabel lblAssignedResearcher;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPleaseReview;
    private javax.swing.JLabel lblProjectID;
    private javax.swing.JLabel lblReviewTask;
    private javax.swing.JLabel lblTaskCost;
    private javax.swing.JLabel lblTaskName;
    private javax.swing.JTextField txtProjectID;
    private javax.swing.JTextField txtTaskCost;
    private javax.swing.JTextField txtTaskName;
    // End of variables declaration//GEN-END:variables
}
