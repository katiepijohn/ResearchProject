/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author katie.pijohn
 */
public class HeadResearcher extends javax.swing.JFrame {
    ArrayList<Project> projects = new ArrayList<Project>();
    ArrayList<Task> tasks = new ArrayList<Task>();
    ArrayList<Quote> quotes = new ArrayList<Quote>();
    Staff staff;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageProject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtQuote;
    private javax.swing.JLabel lblHead;
    private javax.swing.JTextArea txtProjectsAssigned;
    private javax.swing.JTextArea txtTasksAssigned;
    /**
     * Creates new form HeadResearcher
     */
    public HeadResearcher() {
        initComponents();
        refreshData();
    }
    public HeadResearcher(Staff inStaff) {
        this.staff = inStaff;
        initComponents();
        refreshData();
    }

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

    public void refreshData() {
        try {


            String sqlGetProjectsByResearcher = "SELECT * FROM tblProjects WHERE assignedResearcher =?";
            String sqlGetTasksByProject = "SELECT * FROM tblProjectTasks WHERE assignedResearcher =?";
            String sqlGetQuotes = "SELECT * FROM tblQuotes";

            try(Connection conn = DBConnection.Connect()) {
                try(PreparedStatement psGetProjectsById = conn.prepareStatement(sqlGetProjectsByResearcher)) {
                    psGetProjectsById.setString(1, String.valueOf(staff.getId()));
                    try(ResultSet rs = psGetProjectsById.executeQuery()) {
                        while (rs.next()) {
                            Project project = new Project(rs.getInt("id"), rs.getString("name"),
                                    rs.getInt("totalcost"), rs.getString("notes"), rs.getString("assignedResearcher"));
                            projects.add(project);
                        }
                    }
                }

                try(PreparedStatement psGetTasksByProject = conn.prepareStatement(sqlGetTasksByProject)) {
                    psGetTasksByProject.setString(1, String.valueOf(staff.getId()));
                    try(ResultSet rsTasks = psGetTasksByProject.executeQuery()) {
                        while (rsTasks.next()) {
                            Task task = new Task(rsTasks.getInt("id"), rsTasks.getString("task"),
                                    rsTasks.getInt("taskcost"), rsTasks.getInt("projectID"), rsTasks.getInt("assignedResearcher"));
                            tasks.add(task);
                        }
                    }
                }

                try(Statement psGetQuotes = conn.createStatement()) {
                    try(ResultSet rsQuotes = psGetQuotes.executeQuery(sqlGetQuotes)) {
                        while (rsQuotes.next()) {
                            Quote quote = new Quote(rsQuotes.getInt("id"), rsQuotes.getString("quoteOfTheDay"));
                            quotes.add(quote);
                        }
                    }
                }

                if (projects.size() > 0) {
                    int projectIndex = 0;
                    for (Project project: projects) {
                        projectIndex++;
                        this.txtProjectsAssigned.append(project.getName());
                        this.txtProjectsAssigned.append("\n");
//                                insert(projectt.getName(), projectIndex);
                    }
                }

                if (tasks.size() > 0) {
                    int taskIndex = 0;
                    for (Task task: tasks) {
                        taskIndex++;
                        this.txtTasksAssigned.append(task.getTask());
                        this.txtTasksAssigned.append("\n");
                                //.insert(task.getTask(), taskIndex);
                    }
                }

                if(quotes.size() > 0){
                    int quoteIndex = (int)(Math.random() * ((quotes.size() - 1) + 1)) + 1;
                    this.txtQuote.setText(quotes.get(quoteIndex).getQuoteOfTheDay());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot get projects assigned!\n\nError" + e);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQuote = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProjectsAssigned = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTasksAssigned = new javax.swing.JTextArea();

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

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Welcome Back!");

        jLabel2.setText("Quote of the day...");

        txtQuote.setBackground(new java.awt.Color(235, 152, 235));

        jLabel3.setText("Projects Assigned:");

        jButton1.setBackground(new java.awt.Color(235, 197, 246));
        jButton1.setText("View Complete Projects");

        txtProjectsAssigned.setBackground(new java.awt.Color(235, 152, 235));
        txtProjectsAssigned.setColumns(20);
        txtProjectsAssigned.setRows(5);
        jScrollPane1.setViewportView(txtProjectsAssigned);

        jLabel4.setText("Tasks Allocated:");

        txtTasksAssigned.setBackground(new java.awt.Color(235, 152, 235));
        txtTasksAssigned.setColumns(20);
        txtTasksAssigned.setRows(5);
        jScrollPane2.setViewportView(txtTasksAssigned);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(140, 140, 140)
                                                                .addComponent(lblHead))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(151, 151, 151)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGap(113, 113, 113)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel2)
                                                                                        .addGap(44, 44, 44)
                                                                                        .addComponent(txtQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(btnManageProject)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jButton1))))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGap(38, 38, 38)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 23, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnExit)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblHead)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtQuote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnManageProject)
                                        .addComponent(jButton1))
                                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProjectActionPerformed
        NewProject am = new NewProject();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageProjectActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login am = new Login();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed
    // End of variables declaration//GEN-END:variables
}
