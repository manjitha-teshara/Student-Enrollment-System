/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UndergraduateStudentController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.UndergraduateStudentModel;
import other.IDGenerator;

/**
 *
 * @author manji
 */
public class UndergraduateStudent extends javax.swing.JFrame {

    /**
     * Creates new form studentReg
     */
    public UndergraduateStudent() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameWithInitialstxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        userNametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        regNotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        indexNotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mobiletxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        admissionDatetxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstxt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        subGrade3txt = new javax.swing.JTextField();
        subName2txt = new javax.swing.JTextField();
        zScoretxt = new javax.swing.JTextField();
        engGradetxt = new javax.swing.JTextField();
        islandRanktxt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        subName1txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        subName3txt = new javax.swing.JTextField();
        subGrade2txt = new javax.swing.JTextField();
        subGrade1txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        submitbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        datetebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nictxt1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        courseIdtxt = new javax.swing.JTextField();
        facultyIdtxt = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 181, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(141, 199, 63));

        jPanel7.setBackground(new java.awt.Color(141, 199, 63));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(25, 88, 157))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name with Initials");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 47, -1, 30));
        jPanel1.add(nameWithInitialstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("User Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanel1.add(userNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reg No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        regNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNotxtActionPerformed(evt);
            }
        });
        jPanel1.add(regNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Index No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPanel1.add(indexNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mobile");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        jPanel1.add(mobiletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        jPanel1.add(admissionDatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Admission Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        addresstxt.setColumns(20);
        addresstxt.setRows(5);
        jScrollPane1.setViewportView(addresstxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 170, 80));

        jButton1.setBackground(new java.awt.Color(49, 144, 176));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(49, 144, 176));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Subject Grade");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 30));
        jPanel1.add(subGrade3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 100, -1));
        jPanel1.add(subName2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 100, -1));
        jPanel1.add(zScoretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 100, -1));
        jPanel1.add(engGradetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 100, -1));
        jPanel1.add(islandRanktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 100, -1));

        jButton5.setText("Submit");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, -1, -1));
        jPanel1.add(subName1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 100, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Subject Name");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, 30));
        jPanel1.add(subName3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 100, -1));
        jPanel1.add(subGrade2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 100, -1));
        jPanel1.add(subGrade1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 100, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Iland Rank");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Password");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 22, 30, 310));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Subject3");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("General English");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Subject1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Subject2");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        submitbtn.setBackground(new java.awt.Color(49, 144, 176));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(49, 144, 176));
        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        datetebtn.setText("Delete");
        datetebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetebtnActionPerformed(evt);
            }
        });
        jPanel1.add(datetebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel1.add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        backbtn.setBackground(new java.awt.Color(49, 144, 176));
        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        jPanel1.add(nictxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Z-Score");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, 30));
        jPanel1.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 100, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Faculty Id");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Course Id");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 30));
        jPanel1.add(courseIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 100, -1));

        facultyIdtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(facultyIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 100, -1));

        jTabbedPane1.addTab("Undergaduate", jPanel1);

        jPanel7.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, 420));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 840, 440));

        jPanel5.setBackground(new java.awt.Color(25, 88, 157));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo_for_dash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 840, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNotxtActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Dashborad dashborad=new Dashborad();
            dashborad.setVisible(true);
            this.dispose();  
    }//GEN-LAST:event_jLabel1MouseClicked

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed

        String nameWithIntials=nameWithInitialstxt.getText();
        String userName=userNametxt.getText();
        String regNo=regNotxt.getText();
        String indexNo=indexNotxt.getText();
        String admission=admissionDatetxt.getText();
        String email=emailtxt.getText();
        String mobile=mobiletxt.getText();
        String nic=admissionDatetxt.getText();
        String address=addresstxt.getText();
        String subName1=subName1txt.getText();
        String subGrade1=subGrade1txt.getText();
        String subName2=subName2txt.getText();
        String subName3=subGrade3txt.getText();
        String engGrade=engGradetxt.getText();
        String isislandRank=islandRanktxt.getText();
        String zScore=zScoretxt.getText();
        String facultyId=facultyIdtxt.getSelectedItem().toString();
        String courseId=courseIdtxt.getText();
        String password=passwordtxt.getText();
        UndergraduateStudentModel undergraduateStudentModel=new UndergraduateStudentModel(nameWithIntials, userName, regNo, indexNo, admission, email, mobile, nic, address, subName1, subGrade1, subName2, subGrade1, subName3, subGrade1, engGrade, ABORT, Double.NaN, facultyId, courseId, password);

                int res;
        try {
            res = UndergraduateStudentController.addUnderStudent(undergraduateStudentModel);
            if (res > 0) {
            JOptionPane.showMessageDialog(this, "Added Success");
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void datetebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetebtnActionPerformed
        String id=regNotxt.getText();
        try {
            int res = UndergraduateStudentController.deleteUnderStudent(id);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Delete Success ");
            } else {
                JOptionPane.showMessageDialog(this, "Delete Fail ");
            }
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No Driver found");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_datetebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        String nameWithIntials=nameWithInitialstxt.getText();
        String userName=userNametxt.getText();
        String regNo=regNotxt.getText();
        String indexNo=indexNotxt.getText();
        String admission=admissionDatetxt.getText();
        String email=emailtxt.getText();
        String mobile=mobiletxt.getText();
        String nic=admissionDatetxt.getText();
        String address=addresstxt.getText();
        String subName1=subName1txt.getText();
        String subGrade1=subGrade1txt.getText();
        String subName2=subName2txt.getText();
        String subName3=subGrade3txt.getText();
        String engGrade=engGradetxt.getText();
        String isislandRank=islandRanktxt.getText();
        String zScore=zScoretxt.getText();
        String facultyId=facultyIdtxt.getSelectedItem().toString();
        String courseId=courseIdtxt.getText();
        String password=passwordtxt.getText();

        UndergraduateStudentModel undergraduateStudentModel=new UndergraduateStudentModel(nameWithIntials, userName, regNo, indexNo, admission, email, mobile, nic, address, subName1, subGrade1, subName2, subGrade1, subName3, subGrade1, engGrade, ABORT, Double.NaN, facultyId, courseId, password);

        System.out.println("IN course edit");
        try {
            int res=UndergraduateStudentController.editUnderStudent(undergraduateStudentModel);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Update Success");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_editbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed

        String regNo=regNotxt.getText();

        try{
            UndergraduateStudentModel undergraduateStudentModel = UndergraduateStudentController.searchUnderStudent(regNo);
            if (undergraduateStudentModel != null) {
                /*courseNametxt.setText(courseModel.getCourseName());
                courseCodinatertxt.setText(courseModel.getCourseCodinater());
                semesterFeestxt.setText(Double.toString(courseModel.getSemesterFees()));*/
                nameWithInitialstxt.setText(undergraduateStudentModel.getNameWithIntials());
                userNametxt.setText(undergraduateStudentModel.getUserName());
                regNotxt.setText(undergraduateStudentModel.getRegNo());
                indexNotxt.setText(undergraduateStudentModel.getIndexNo());
                admissionDatetxt.setText(undergraduateStudentModel.getAdmission());
                emailtxt.setText(undergraduateStudentModel.getEmail());
                mobiletxt.setText(undergraduateStudentModel.getMobile());
                admissionDatetxt.setText(undergraduateStudentModel.getNic());
                addresstxt.setText(undergraduateStudentModel.getAddress());
                subName1txt.setText(undergraduateStudentModel.getSubName1());
                subGrade1txt.setText(undergraduateStudentModel.getSubGrade1());
                subName2txt.setText(undergraduateStudentModel.getSubName2());
                subGrade2txt.setText(undergraduateStudentModel.getSubGrade2());
                subName3txt.setText(undergraduateStudentModel.getSubName3());
                subGrade3txt.setText(undergraduateStudentModel.getSubGrade3());
                engGradetxt.setText(undergraduateStudentModel.getEngGrade());
                islandRanktxt.setText(Integer.toString(undergraduateStudentModel.getIslandRank()));
                zScoretxt.setText(Double.toString(undergraduateStudentModel.getzScore()));
                facultyIdtxt.setSelectedItem(undergraduateStudentModel.getFacultyId());
                courseIdtxt.setText(undergraduateStudentModel.getCourseId());

            } else {
                JOptionPane.showMessageDialog(this, "No Such Course ");
            }        }
            catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No Driver found");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());

            }
    }//GEN-LAST:event_searchbtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UndergraduateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UndergraduateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UndergraduateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UndergraduateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UndergraduateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JTextField admissionDatetxt;
    private javax.swing.JButton backbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField courseIdtxt;
    private javax.swing.JButton datetebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField engGradetxt;
    private javax.swing.JComboBox<String> facultyIdtxt;
    private javax.swing.JTextField indexNotxt;
    private javax.swing.JTextField islandRanktxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JTextField nameWithInitialstxt;
    private javax.swing.JTextField nictxt1;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField regNotxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField subGrade1txt;
    private javax.swing.JTextField subGrade2txt;
    private javax.swing.JTextField subGrade3txt;
    private javax.swing.JTextField subName1txt;
    private javax.swing.JTextField subName2txt;
    private javax.swing.JTextField subName3txt;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField userNametxt;
    private javax.swing.JTextField zScoretxt;
    // End of variables declaration//GEN-END:variables

    public Object getAddmissionDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /* private void newS_id(){
        String newS_id=IDGenerator.getNewId(tableName, columnName, prefix)
    }*/

    public Object getcourseName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getcourseId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}