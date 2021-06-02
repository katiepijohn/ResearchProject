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
import java.util.ArrayList;

/**
 *
 * @author katie.pijohn
 */
public class HeadResearcher extends javax.swing.JFrame {
    int currentProjects = 0;
    int currentTasks = 0;
    int quoteOfTheDay= 0;
    ArrayList<Quotes> quotes = new ArrayList<Quotes>();
    ArrayList<Project> projects = new ArrayList<Project>();
    ArrayList<Task> tasks = new ArrayList<Task>();
    Staff staff;
    DefaultComboBoxModel assignedResearcherModel = new DefaultComboBoxModel();
    
            
    /**
     * Creates new form HeadResearcher
     */
    public HeadResearcher() {
        
        initComponents();
        refreshData();
    }
    public HeadResearcher(Staff inStaff){
        this.staff = inStaff;
        initComponents();
        refreshData();
    }
   
    public void refreshData(){
        try{
                
        String sqlGetProjectsById = "SELECT * FROM tblProjects WHERE assignedResearcher =?";
        String sqlGetTasksById = "SELECT * FROM tblProjectTasks WHERE assignedResearcher =?";
        String sqlGetQuotes = "SELECT * FROM tblQuotes WHERE id=?";
            
        
        Connection conn = DBConnection.Connect();
        
        PreparedStatement psGetProjectsById = conn.prepareStatement(sqlGetProjectsById);
        PreparedStatement psGetTasksById = conn.prepareStatement(sqlGetTasksById);
        PreparedStatement psGetQuotes = conn.prepareStatement(sqlGetQuotes);
        
        psGetProjectsById.setString(1, String.valueOf(staff.getId()));
        psGetTasksById.setString(2, String.valueOf(staff.getId()));
       
   
        ResultSet rs = psGetProjectsById.executeQuery();
        
        
        while(rs.next()){
                Project p = new Project(rs.getInt("id"), rs.getString("name"), rs.getInt("totalcost"), rs.getString("notes"), rs.getString("assignedResearcher"));
                projects.add(p);
            }
            
            rs = psGetTasksById.executeQuery();
            
            while(rs.next()){
                Task t = new Task(rs.getInt("id"), rs.getString("task"), rs.getInt("taskcost"), rs.getInt("projectID"), rs.getInt("assignedResearcher"));
                tasks.add(t);
                
                
    
            }
            rs = psGetQuotes.executeQuery();
                        
            while(rs.next()){
                Quotes q = new Quotes(rs.getInt("id"), rs.getString("quoteOfTheDay"));
                quotes.add(q);
                
                
    
            }
            this.txtQuote.setText(quotes.get(quoteOfTheDay).getQuoteOfTheDay());
            this.txtProjectsAssigned.setText(projects.get(currentProjects).getAssignedResearcher());
            this.txtTasksAssigned.setText(String.valueOf(tasks.get(currentTasks).getAssignedResearcher()));
            
            conn.close();

    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot get Head Researcher details!\n\nError" + e);
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

        lblHead = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnManageProject = new javax.swing.JButton();
        lblWelcomeBack = new javax.swing.JLabel();
        lblQuoteOfTheDay = new javax.swing.JLabel();
        txtQuote = new javax.swing.JTextField();
        lblProjectsAssigned = new javax.swing.JLabel();
        btnCompleteProjects = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProjectsAssigned = new javax.swing.JTextArea();
        lblTasksAllocated = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTasksAssigned = new javax.swing.JTextArea();
        btnReviewTasks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(142, 90, 196));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        lblHead.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblHead.setText("Head Researcher Menu");

        btnExit.setBackground(new java.awt.Color(235, 197, 246));
        btnExit.setText("Logout");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnManageProject.setBackground(new java.awt.Color(235, 197, 246));
        btnManageProject.setText("Manage Projects");
        btnManageProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProjectActionPerformed(evt);
            }
        });

        lblWelcomeBack.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblWelcomeBack.setText("Welcome Back!");

        lblQuoteOfTheDay.setText("Quote of the day...");

        txtQuote.setBackground(new java.awt.Color(235, 152, 235));
        txtQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuoteActionPerformed(evt);
            }
        });

        lblProjectsAssigned.setText("Projects Assigned:");

        btnCompleteProjects.setBackground(new java.awt.Color(235, 197, 246));
        btnCompleteProjects.setText("View Complete Projects");
        btnCompleteProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteProjectsActionPerformed(evt);
            }
        });

        txtProjectsAssigned.setBackground(new java.awt.Color(235, 152, 235));
        txtProjectsAssigned.setColumns(20);
        txtProjectsAssigned.setRows(5);
        jScrollPane1.setViewportView(txtProjectsAssigned);

        lblTasksAllocated.setText("Tasks Allocated:");

        txtTasksAssigned.setBackground(new java.awt.Color(235, 152, 235));
        txtTasksAssigned.setColumns(20);
        txtTasksAssigned.setRows(5);
        jScrollPane2.setViewportView(txtTasksAssigned);

        btnReviewTasks.setBackground(new java.awt.Color(235, 197, 246));
        btnReviewTasks.setText("Review Complete Tasks");
        btnReviewTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewTasksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(lblHead))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(lblWelcomeBack))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(lblQuoteOfTheDay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 57, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProjectsAssigned))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTasksAllocated))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnManageProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReviewTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnCompleteProjects)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addGap(35, 35, 35)
                .addComponent(lblWelcomeBack)
                .addGap(18, 18, 18)
                .addComponent(lblHead)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuoteOfTheDay))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectsAssigned)
                    .addComponent(lblTasksAllocated))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageProject)
                    .addComponent(btnReviewTasks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCompleteProjects)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProjectActionPerformed
        NewProject np = new NewProject();
        np.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageProjectActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login am = new Login();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuoteActionPerformed
            try{
            
                
            String sqlGetQuotes = "SELECT * FROM tblQuotes WHERE quoteOfTheDay=?";
            
            
            Connection conn = DBConnection.Connect();
            
            PreparedStatement psGetQuotes = conn.prepareStatement(sqlGetQuotes);
            
            ResultSet rs = psGetQuotes.executeQuery();
            
            while(rs.next()){
                Quotes q = new Quotes(rs.getInt("id"), rs.getString("quoteOfTheDay"));
                quotes.add(q);
            
            }
            this.txtQuote.setText(quotes.get(quoteOfTheDay).getQuoteOfTheDay());
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Cannot get quote\n\nError"+ e);
            }
    }//GEN-LAST:event_txtQuoteActionPerformed

    private void btnCompleteProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteProjectsActionPerformed
        ClosedProjects cp = new ClosedProjects();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCompleteProjectsActionPerformed

    private void btnReviewTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewTasksActionPerformed
        CompleteTasks ct = new CompleteTasks();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReviewTasksActionPerformed

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
            java.util.logging.Logger.getLogger(HeadResearcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeadResearcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeadResearcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeadResearcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeadResearcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleteProjects;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageProject;
    private javax.swing.JButton btnReviewTasks;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblProjectsAssigned;
    private javax.swing.JLabel lblQuoteOfTheDay;
    private javax.swing.JLabel lblTasksAllocated;
    private javax.swing.JLabel lblWelcomeBack;
    private javax.swing.JTextArea txtProjectsAssigned;
    private javax.swing.JTextField txtQuote;
    private javax.swing.JTextArea txtTasksAssigned;
    // End of variables declaration//GEN-END:variables
}
