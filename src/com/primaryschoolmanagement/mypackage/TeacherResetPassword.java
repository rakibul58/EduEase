/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primaryschoolmanagement.mypackage;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class TeacherResetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ResetPassword
     */
    public TeacherResetPassword() {
        initComponents();
        clearTxt();
        connect();
        jPanel1.setBackground(new Color(0,0,0,120)); 
    }
    
    Connection con ;
    PreparedStatement update ;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PrimarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherResetPassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherResetPassword.class.getName()).log(Level.SEVERE, null, ex);
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

        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RetPass = new javax.swing.JPasswordField();
        NewPass = new javax.swing.JPasswordField();
        CntPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(148, 155, 165));
        backBtn.setIcon(new javax.swing.ImageIcon("/home/rakibul/Documents/LibraryManagement/backIcon.png")); // NOI18N
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 45, 31));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reset Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Z003", 1, 24), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RetPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(RetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 133, -1));

        NewPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 133, -1));

        CntPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(CntPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 133, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 251, 251));
        jLabel2.setText("Current Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Add New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        resetBtn.setBackground(new java.awt.Color(84, 94, 110));
        resetBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resetBtn.setText("Reset Password");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetBtnMouseEntered(evt);
            }
        });
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setText("Retype Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 350, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/rakibul/Pictures/resetpass_580x400.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        setSize(new java.awt.Dimension(579, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        clearTxt();
        new TeacherUserInterface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    String cntTxt , newTxt , retTxt ;
    
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        try {
            // TODO add your handling code here:
            retTxt = RetPass.getText();
            newTxt = NewPass.getText();
            cntTxt = CntPass.getText();
            
            if(!cntTxt.equals(TeacherLogin.getPass())){
                JOptionPane.showMessageDialog(this, "Wrong Password Entered");
                clearTxt();
            }
            
            else if(!newTxt.equals(retTxt)){
                JOptionPane.showMessageDialog(this, "Password Confirmation Failed");
                clearTxt();
            }
            else{  
                update = (PreparedStatement) con.prepareStatement("UPDATE TeacherList SET password=? WHERE email=? and password = ?");
                update.setString(1,newTxt);
                update.setString(2,TeacherLogin.getEmail());
                update.setString(3,cntTxt);
                int k = update.executeUpdate();
                if(k==1){
                JOptionPane.showMessageDialog(this, "Your Password have been Changed");
                clearTxt();
                new TeacherUserInterface().setVisible(true);
                this.setVisible(false);
                }
                else
                {
                   JOptionPane.showMessageDialog(this, "Password is Incorrect");
                   clearTxt();
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherResetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        // TODO add your handling code here:
       // backBtn.setBackground(Color.getColor("#064190"));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        // TODO add your handling code here:
       // backBtn.setBackground(Color.getColor("#2a6cc4"));
    }//GEN-LAST:event_backBtnMouseExited

    private void resetBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseEntered
        // TODO add your handling code here:
        resetBtn.setForeground(Color.white);
    }//GEN-LAST:event_resetBtnMouseEntered

    private void resetBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseExited
        // TODO add your handling code here:
        resetBtn.setForeground(Color.black);
    }//GEN-LAST:event_resetBtnMouseExited

    public void clearTxt()
    {
        RetPass.setText("");
        NewPass.setText("");
        CntPass.setText("");
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
            java.util.logging.Logger.getLogger(TeacherResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CntPass;
    private javax.swing.JPasswordField NewPass;
    private javax.swing.JPasswordField RetPass;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
