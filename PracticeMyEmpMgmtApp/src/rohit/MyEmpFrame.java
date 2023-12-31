package rohit;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rohit
 */
public class MyEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyEmpFrame
     */
    Connection connection;
    private PreparedStatement ps;
    public MyEmpFrame()
    {
        initComponents();
        connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpSal = new javax.swing.JTextField();
        btnAddRec = new javax.swing.JButton();
        btnShowRec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowAll = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Emp Management App");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Employee Number");

        txtEmpNo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Employee Name");

        txtEmpName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Employee Salary");

        txtEmpSal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        btnAddRec.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAddRec.setText("Add Record");
        btnAddRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecActionPerformed(evt);
            }
        });

        btnShowRec.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnShowRec.setText("Show Records");
        btnShowRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecActionPerformed(evt);
            }
        });

        txtShowAll.setEditable(false);
        txtShowAll.setColumns(20);
        txtShowAll.setRows(5);
        jScrollPane1.setViewportView(txtShowAll);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(btnAddRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmpNo)
                                .addComponent(txtEmpName)
                                .addComponent(txtEmpSal, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addComponent(btnShowRec))
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRec)
                    .addComponent(btnShowRec))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecActionPerformed
        // TODO add your handling code here:
        boolean result = validateInputs();
        if (!result)
        {
            JOptionPane.showMessageDialog(null, "Please Input all the values");
            return ;
        }
        try
        {
            int eNo = Integer.parseInt(txtEmpNo.getText());
            String empName = txtEmpName.getText();
            double sal = Double.parseDouble(txtEmpSal.getText());
            
            ps.setInt(1, eNo);
            ps.setString(2, empName);
            ps.setDouble(3, sal);
            
            int ans = ps.executeUpdate();
            
            if (ans == 1)
            {
                JOptionPane.showMessageDialog(null, "Recorded successfully to the db.");
                txtEmpNo.setText("");
                txtEmpName.setText("");
                txtEmpSal.setText("");
                
                txtEmpNo.requestFocus();
            }
            else
                JOptionPane.showMessageDialog(null, "Record not added! Try later");
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Please Input digits");
            ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Database Error");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddRecActionPerformed

    private void btnShowRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecActionPerformed
        // TODO add your handling code here:
        try
        {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from Employees order by empno");
            StringBuffer sb = new StringBuffer();
            while(rs.next())
            {
                int eno = rs.getInt(1);
                String ename = rs.getString(2);
                double sal = rs.getDouble(3);
                sb.append(eno + "\t" + ename + "\t" + sal + "\n");
                
            }
            txtShowAll.setText(sb.toString());
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Database Error");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowRecActionPerformed

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
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRec;
    private javax.swing.JButton btnShowRec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpSal;
    private javax.swing.JTextArea txtShowAll;
    // End of variables declaration//GEN-END:variables
    private void connectDB() 
    {
        String url = "jdbc:mariadb://localhost:3306/try29_12";
        String user = "root";
        String password = "12345699";

        try {
            // Register the JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(url, user, password);
//            String insertQuery = "INSERT INTO your_table (empNo, empName, empSal) VALUES (?, ?, ?)";
            ps = connection.prepareStatement("insert into Employees values (?,?,?)");
            JOptionPane.showMessageDialog(null, "Connect successfully to db.");
            // Do something with the connection...

            // Close the connection when done
//            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in db." + ex);
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        if (txtEmpNo.getText().isBlank() || txtEmpName.getText().isEmpty() 
                || txtEmpSal.getText().isEmpty())
            return (false);
        return (true);
    }
    
}
