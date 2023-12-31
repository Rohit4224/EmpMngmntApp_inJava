/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empmgmt.gui;

import empmgmt.dbutil.DBconnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rohit
 */
public class OptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionsFrame
     */
    public OptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructSor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtnAddEmp = new javax.swing.JRadioButton();
        rbtnSearchEmp = new javax.swing.JRadioButton();
        rbtnShowEmp = new javax.swing.JRadioButton();
        rbtnQuit = new javax.swing.JRadioButton();
        btnProceed = new javax.swing.JButton();
        rbtnUpdate = new javax.swing.JRadioButton();
        rbtnDelete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search An Option");

        buttonGroup1.add(rbtnAddEmp);
        rbtnAddEmp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAddEmp.setText("Add Employee");
        rbtnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAddEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnSearchEmp);
        rbtnSearchEmp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSearchEmp.setText("Search Employee");

        buttonGroup1.add(rbtnShowEmp);
        rbtnShowEmp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnShowEmp.setForeground(new java.awt.Color(255, 255, 255));
        rbtnShowEmp.setText("Show All Employee");

        buttonGroup1.add(rbtnQuit);
        rbtnQuit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnQuit.setForeground(new java.awt.Color(255, 255, 255));
        rbtnQuit.setText("Quit");

        btnProceed.setBackground(new java.awt.Color(51, 51, 51));
        btnProceed.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnUpdate);
        rbtnUpdate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        rbtnUpdate.setText("Update Employee");

        buttonGroup1.add(rbtnDelete);
        rbtnDelete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        rbtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDelete.setText("Delete Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnSearchEmp)
                                    .addComponent(rbtnAddEmp))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnShowEmp)
                                    .addComponent(rbtnUpdate)
                                    .addComponent(rbtnDelete)
                                    .addComponent(rbtnQuit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(btnProceed)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(rbtnAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnSearchEmp)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnProceed))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnShowEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnQuit)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAddEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAddEmpActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        if (validateInput() == false)
        {    
            JOptionPane.showMessageDialog(null, "Please make a selection first", "No selection!", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        JFrame userChoiceFrame = null;
        if (rbtnAddEmp.isSelected())
        {
            userChoiceFrame = new AddEmployeeFrame();
        }
        else if (rbtnSearchEmp.isSelected())
        {
            userChoiceFrame = new SearchEmployeeFrame();
        }
        else if (rbtnShowEmp.isSelected())
        {
            userChoiceFrame = new ViewAllEmployeeFrame();
        }
        else if (rbtnUpdate.isSelected())
        {
            userChoiceFrame = new UpdateEmployeeFrame();
        }
        else if (rbtnDelete.isSelected())
        {
            userChoiceFrame = new DeleteEmployeeForm();
        }
        else if (rbtnQuit.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Thank you for using the App", "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            DBconnection.closeConnection();
            System.exit(0);
        }
        userChoiceFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProceedActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnAddEmp;
    private javax.swing.JRadioButton rbtnDelete;
    private javax.swing.JRadioButton rbtnQuit;
    private javax.swing.JRadioButton rbtnSearchEmp;
    private javax.swing.JRadioButton rbtnShowEmp;
    private javax.swing.JRadioButton rbtnUpdate;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput()
    {
        if (rbtnAddEmp.isSelected() == false 
                && rbtnQuit.isSelected() == false
                && rbtnSearchEmp.isSelected() == false
                && rbtnShowEmp.isSelected() == false
                && rbtnDelete.isSelected() == false
                && rbtnUpdate.isSelected() == false)
            return (false);
        else
            return (true);
    }
}
