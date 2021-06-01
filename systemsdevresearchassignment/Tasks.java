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
public class Tasks extends javax.swing.JFrame {
    int currentTasks = 0;
    ArrayList<Task> tasks = new ArrayList<Task>();
    DefaultComboBoxModel assignedResearcherModel = new DefaultComboBoxModel();

    /**
     * Creates new form Tasks
     */
    public Tasks() {
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
            for (int i = 0; i < assignedResearcherModel.getSize(); i++){
                ComboBoxItem o = (ComboBoxItem)assignedResearcherModel.getElementAt(i);
                if(o.getId() == tasks.get(currentTasks).getId()){
                    assignedResearcherModel.setSelectedItem(o);
                }
                
            
        }
            this.cmbxAssignedResearcher.setModel(assignedResearcherModel);

            this.lblID.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
            
            conn.close();
              
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Cannot get Task!\n\nError"+e);
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

        lblTasks = new javax.swing.JLabel();
        lblTaskName = new javax.swing.JLabel();
        lblTaskCost = new javax.swing.JLabel();
        txtTaskName = new javax.swing.JTextField();
        txtTaskCost = new javax.swing.JTextField();
        lblProjectID = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        ckbxTaskComplete = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnNewTask = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        txtProjectID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        cmbxAssignedResearcher = new javax.swing.JComboBox<>();
        lblAssignedResearcher = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));

        lblTasks.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTasks.setText("Tasks");

        lblTaskName.setText("Task Name:");

        lblTaskCost.setText("Task Cost:");

        txtTaskName.setBackground(new java.awt.Color(235, 152, 235));

        txtTaskCost.setBackground(new java.awt.Color(235, 152, 235));

        lblProjectID.setText("Project ID:");

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

        btnBack.setBackground(new java.awt.Color(235, 197, 246));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ckbxTaskComplete.setText("Task Complete");
        ckbxTaskComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxTaskCompleteActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(235, 197, 246));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNewTask.setBackground(new java.awt.Color(235, 197, 246));
        btnNewTask.setText("New Task");
        btnNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskActionPerformed(evt);
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

        txtProjectID.setBackground(new java.awt.Color(235, 152, 235));

        lblID.setText("ID:");

        cmbxAssignedResearcher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAssignedResearcher.setText("Assigned Researcher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTasks)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAssignedResearcher)
                                            .addComponent(lblTaskCost))
                                        .addComponent(lblTaskName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProjectID)
                                        .addGap(50, 50, 50)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbxTaskComplete)
                                    .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(txtTaskCost)
                                            .addGap(51, 51, 51)))
                                    .addComponent(cmbxAssignedResearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPrevious)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNext)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblID))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTasks)
                            .addComponent(ckbxTaskComplete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjectID)
                            .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaskName)
                            .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaskCost)
                            .addComponent(txtTaskCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(cmbxAssignedResearcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAssignedResearcher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(31, 31, 31)
                .addComponent(btnNewTask)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
            if(currentTasks !=0){
            currentTasks--;
            
            this.lblID.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
            }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageProject am = new ManageProject();
        am.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
            if(currentTasks !=tasks.size()-1){
            currentTasks++;
            
            this.lblID.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
            }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            try{
            Connection conn = DBConnection.Connect();
            
            String sqlUpdate = "UPDATE tblProjectTasks SET task=?, taskcost=?, projectID=? WHERE id=?";
            PreparedStatement pStatement = conn.prepareStatement(sqlUpdate);
            pStatement.setString(1, txtProjectID.getText());
            pStatement.setString(2, txtTaskName.getText());
            pStatement.setString(3, txtTaskCost.getText());
            
            pStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot save task\n\nError "+ e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskActionPerformed
        NewTask nt = new NewTask();
        nt.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnNewTaskActionPerformed

    private void ckbxTaskCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxTaskCompleteActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Do you want to mark this task as complete?\n\nThis can not be undone.", "Warning!", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            try{
                Connection conn = DBConnection.Connect();
                
                ComboBoxItem assignedResearcher = (ComboBoxItem)assignedResearcherModel.getSelectedItem();
                
            String sqlInsert = "INSERT INTO tblCompleteTasks (task, taskcost, projectID, assignedResearcher) VALUES (?,?,?,?)";
    
         PreparedStatement pStatement = conn.prepareStatement(sqlInsert);
         pStatement.setString(1, this.txtTaskName.getText());
         pStatement.setString(2, this.txtTaskCost.getText());
         pStatement.setString(3, this.txtProjectID.getText());
         pStatement.setString(4, String.valueOf(assignedResearcher.getId()));
                

                JOptionPane.showMessageDialog(null, "Task has been marked as complete and sent to the Head Researcher for review!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot mark task as complete\n\nError"+ e);
            }
                    currentTasks =0;
                    this.refreshData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Task has not been marked as complete!");
            
        } 
    }//GEN-LAST:event_ckbxTaskCompleteActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
           if(currentTasks !=0){
            currentTasks=0;
            
            this.lblID.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
           }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
            if(currentTasks !=tasks.size()-1){
            currentTasks = tasks.size()-1;

            this.lblID.setText(String.valueOf(tasks.get(currentTasks).getId()));
            this.txtProjectID.setText(String.valueOf(tasks.get(currentTasks).getProjectID()));
            this.txtTaskName.setText(tasks.get(currentTasks).getTask());
            this.txtTaskCost.setText(String.valueOf(tasks.get(currentTasks).getTaskcost()));
                   
        }
    }//GEN-LAST:event_btnLastActionPerformed

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
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox ckbxTaskComplete;
    private javax.swing.JComboBox<String> cmbxAssignedResearcher;
    private javax.swing.JLabel lblAssignedResearcher;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblProjectID;
    private javax.swing.JLabel lblTaskCost;
    private javax.swing.JLabel lblTaskName;
    private javax.swing.JLabel lblTasks;
    private javax.swing.JTextField txtProjectID;
    private javax.swing.JTextField txtTaskCost;
    private javax.swing.JTextField txtTaskName;
    // End of variables declaration//GEN-END:variables
}
