/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primaryschoolmanagement.mypackage;



import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class TeacherUpdate extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianLogin
     */
    public TeacherUpdate() {
      
        initComponents(); 
        clearTxt();
        connect();
        tableLoad();
        
    }
    
    Connection con ;
    PreparedStatement login , pst , add , update , delete;
    String id;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PrimarySchool","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherUpdate.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        nameTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        PassTxt = new javax.swing.JTextField();
        positionTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        phoneTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        searchTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TeacherTable = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 197, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTxt.setBackground(new java.awt.Color(254, 254, 254));
        nameTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(70, 72, 235));
        nameTxt.setBorder(null);
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });
        nameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTxtMouseClicked(evt);
            }
        });
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 40));

        jSeparator2.setBackground(java.awt.Color.black);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 210, -1));

        jSeparator1.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 210, 10));

        jSeparator3.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, 10));

        cancelBtn.setBackground(new java.awt.Color(70, 72, 235));
        cancelBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(254, 254, 254));
        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
        });
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, 40));

        AddBtn.setBackground(new java.awt.Color(70, 72, 235));
        AddBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(254, 254, 254));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBtnMouseEntered(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, 40));

        deleteBtn.setBackground(new java.awt.Color(70, 72, 235));
        deleteBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(254, 254, 254));
        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 40));

        PassTxt.setBackground(new java.awt.Color(254, 254, 254));
        PassTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        PassTxt.setForeground(new java.awt.Color(70, 72, 235));
        PassTxt.setBorder(null);
        PassTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassTxtFocusLost(evt);
            }
        });
        PassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassTxtMouseClicked(evt);
            }
        });
        PassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTxtActionPerformed(evt);
            }
        });
        jPanel2.add(PassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 40));

        positionTxt.setBackground(new java.awt.Color(254, 254, 254));
        positionTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        positionTxt.setForeground(new java.awt.Color(70, 72, 235));
        positionTxt.setBorder(null);
        positionTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                positionTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                positionTxtFocusLost(evt);
            }
        });
        positionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                positionTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                positionTxtMouseClicked(evt);
            }
        });
        positionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTxtActionPerformed(evt);
            }
        });
        jPanel2.add(positionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 40));

        emailTxt.setBackground(new java.awt.Color(254, 254, 254));
        emailTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(70, 72, 235));
        emailTxt.setBorder(null);
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTxtMouseClicked(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        jPanel2.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 210, 40));

        jSeparator4.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 10));

        jSeparator5.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 10));

        phoneTxt.setBackground(new java.awt.Color(254, 254, 254));
        phoneTxt.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        phoneTxt.setForeground(new java.awt.Color(70, 72, 235));
        phoneTxt.setBorder(null);
        phoneTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTxtFocusLost(evt);
            }
        });
        phoneTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                phoneTxtMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTxtMouseClicked(evt);
            }
        });
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        jPanel2.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, 40));

        jSeparator6.setForeground(new java.awt.Color(2, 39, 241));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, 10));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 246, 246));
        jLabel6.setText("Position");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 40));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 246, 246));
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 246, 246));
        jLabel11.setText("E-Mail");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(251, 246, 246));
        jLabel12.setText("Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 40));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(251, 246, 246));
        jLabel13.setText("Contact");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 40));

        updateBtn.setBackground(new java.awt.Color(70, 72, 235));
        updateBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(254, 254, 254));
        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 360, 440));

        jPanel1.setBackground(new java.awt.Color(62, 199, 206));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Z003", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("MRSS Primary School");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 410, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 247, 247));
        jLabel3.setText("Education is for everyone");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("/home/rakibul/Pictures/newLogo_50.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 90));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 246, 246));
        jLabel9.setText("Since 2021");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        jPanel3.setBackground(new java.awt.Color(19, 173, 201));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 780, 10));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 246, 246));
        jLabel8.setText("Since 2021");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTxt.setBackground(new java.awt.Color(254, 254, 254));
        searchTxt.setBorder(null);
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });
        jPanel4.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 360, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/rakibul/Pictures/Search_30x30.jpg")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 30));

        TeacherTable.setBackground(new java.awt.Color(254, 254, 254));
        TeacherTable.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        TeacherTable.setForeground(new java.awt.Color(70, 72, 235));
        TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "Password", "Phone", "Position"
            }
        ));
        TeacherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TeacherTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, 300));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 360, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 440, 450));

        setSize(new java.awt.Dimension(779, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       public void tableLoad() {
        
        try {
            pst = con.prepareStatement("select * from TeacherList");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) TeacherTable.getModel();
            df.setRowCount(0);
            while (rs.next()) {   
                
                String id = String.valueOf(rs.getInt("id"));
                String nameString = rs.getString("name");
                String emailString = rs.getString("email");
                String passwordString = rs.getString("password");
                String phoneString = rs.getString("phone");
                String positionString = rs.getString("position");
                 
                String tbData[] = {id,nameString,emailString,passwordString,phoneString,positionString};
                df.addRow(tbData);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        // TODO add your handling code here:
        updateBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        // TODO add your handling code here:
         updateBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_updateBtnMouseExited

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            update = con.prepareStatement("UPDATE TeacherList SET name=?,email=?,password=?,phone=?,position=? WHERE id=?");
            update.setString(1, nameTxt.getText());
            update.setString(2, emailTxt.getText());
            update.setString(3, PassTxt.getText());
            update.setString(4, phoneTxt.getText());
            update.setString(5, positionTxt.getText());
            update.setString(6, id);
            int k = update.executeUpdate();
            if(k ==1){
            clearTxt();
            JOptionPane.showMessageDialog(this, "Record Updated");
            tableLoad();
            
            }
            else{
                clearTxt();
                JOptionPane.showMessageDialog(this, "Update Failed");
                tableLoad();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChangeSyllabus.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_updateBtnActionPerformed

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        // TODO add your handling code here:
       // if(nameTxt.getText().equals("Username"))
            // nameTxt.setText("");
    }//GEN-LAST:event_nameTxtFocusGained

    private void nameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTxtMouseClicked
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_nameTxtMouseClicked

    private void nameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTxtMousePressed
        // TODO add your handling code here:
        //user.setFocusable(true);
    }//GEN-LAST:event_nameTxtMousePressed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
       
    }//GEN-LAST:event_nameTxtActionPerformed

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
        // TODO add your handling code here:
         
        cancelBtn.setBackground(Color.decode("#4648eb"));
    }//GEN-LAST:event_cancelBtnMouseExited

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
        // TODO add your handling code here:
        cancelBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        new AdminUserInterface().setVisible(true);
        this.setVisible(false);
        clearTxt();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        // TODO add your handling code here:
       // if(nameTxt.getText().equals(""))
            // nameTxt.setText("Username");
    }//GEN-LAST:event_nameTxtFocusLost

    private void AddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseExited
        // TODO add your handling code here:
        AddBtn.setBackground(Color.decode("#4648eb"));
 
    }//GEN-LAST:event_AddBtnMouseExited

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered
        // TODO add your handling code here:
        AddBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_AddBtnMouseEntered

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            add  = (PreparedStatement) con.prepareStatement("insert into TeacherList (name,email,password,phone,position) Values (?,?,?,?,?)");
            add.setString(1, nameTxt.getText());
            add.setString(2, emailTxt.getText());
            add.setString(3, PassTxt.getText());
            add.setString(4, phoneTxt.getText());
            add.setString(5, positionTxt.getText());
            int k  = add.executeUpdate();
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Teacher Added");
                clearTxt();
                tableLoad();
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Error");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        // TODO add your handling code here:
        deleteBtn.setBackground(Color.decode("#4648eb"));

    }//GEN-LAST:event_deleteBtnMouseExited

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        // TODO add your handling code here:
        deleteBtn.setBackground(Color.decode("#1417f2"));
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
            try {
            // TODO add your handling code here:
            pst = (PreparedStatement) con.prepareStatement("delete from TeacherList where id=?");
            pst.setString(1, id);
            
            
            int k = pst.executeUpdate();
            if(k == 1){
                clearTxt();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                tableLoad();
            }
            else{
                clearTxt();
                JOptionPane.showMessageDialog(this, "Delete Failed");
                tableLoad();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminNoticeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void PassTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtFocusGained

    private void PassTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtFocusLost

    private void PassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtMousePressed

    private void PassTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtMouseClicked

    private void PassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTxtActionPerformed

    private void positionTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_positionTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtFocusGained

    private void positionTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_positionTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtFocusLost

    private void positionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_positionTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtMousePressed

    private void positionTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_positionTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtMouseClicked

    private void positionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtActionPerformed

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtFocusGained

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtFocusLost

    private void emailTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtMousePressed

    private void emailTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtMouseClicked

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void phoneTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtFocusGained

    private void phoneTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtFocusLost

    private void phoneTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtMousePressed

    private void phoneTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtMouseClicked

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        DefaultTableModel table = (DefaultTableModel) TeacherTable.getModel();
        String search = searchTxt.getText();
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(table);
        TeacherTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchTxtKeyReleased

    private void TeacherTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d=  (DefaultTableModel)TeacherTable.getModel();
        int selectedindex = TeacherTable.getSelectedRow();
        if(TeacherTable.getRowSorter()!= null){
            selectedindex = TeacherTable.getRowSorter().convertRowIndexToModel(selectedindex);

        }
        id = d.getValueAt(selectedindex, 0).toString();
        String name = d.getValueAt(selectedindex, 1).toString();
        String email = d.getValueAt(selectedindex, 2).toString();
        String password = d.getValueAt(selectedindex, 3).toString();
        String phone = d.getValueAt(selectedindex, 4).toString();
        String position = d.getValueAt(selectedindex, 5).toString();

        nameTxt.setText(name);
        emailTxt.setText(email);
        PassTxt.setText(password);
        phoneTxt.setText(phone);
        positionTxt.setText(position);
    }//GEN-LAST:event_TeacherTableMouseClicked
 
    
    
    
    public void clearTxt(){
        
        nameTxt.setText("");
        emailTxt.setText("");
        PassTxt.setText("");
        phoneTxt.setText("");
        positionTxt.setText("");
          
          
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
            java.util.logging.Logger.getLogger(TeacherUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JTable TeacherTable;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField positionTxt;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
