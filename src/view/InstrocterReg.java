/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.InstroucterController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.InstroucterModel;

/**
 *
 * @author manji
 */
public class InstrocterReg extends javax.swing.JFrame {

    /**
     * Creates new form studentReg
     */
    public InstrocterReg() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        nictxt = new javax.swing.JTextField();
        userNametxt = new javax.swing.JTextField();
        regNotxt = new javax.swing.JTextField();
        indexNotxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        mobiletxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstxt = new javax.swing.JTextArea();
        cancelbtn = new javax.swing.JButton();
        searchbtn1 = new javax.swing.JButton();
        deletebtn1 = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        submitbtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        passwordlbl1 = new javax.swing.JLabel();
        nameWithInitialstxt1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 181, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(141, 199, 63));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instroucters Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(25, 88, 157))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name with Initials");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reg No");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Index No");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mobile");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("NIC");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userName.setText("User Name");
        jPanel4.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        jPanel4.add(nictxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 100, -1));
        jPanel4.add(userNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, -1));

        regNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNotxtActionPerformed(evt);
            }
        });
        jPanel4.add(regNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 100, -1));
        jPanel4.add(indexNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, -1));
        jPanel4.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, -1));
        jPanel4.add(mobiletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, -1));

        addresstxt.setColumns(20);
        addresstxt.setRows(5);
        jScrollPane1.setViewportView(addresstxt);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, -1));

        cancelbtn.setBackground(new java.awt.Color(49, 144, 176));
        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel4.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        searchbtn1.setBackground(new java.awt.Color(49, 144, 176));
        searchbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn1.setText("Search");
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });
        jPanel4.add(searchbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        deletebtn1.setBackground(new java.awt.Color(49, 144, 176));
        deletebtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebtn1.setText("Delete");
        deletebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn1ActionPerformed(evt);
            }
        });
        jPanel4.add(deletebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        editbtn.setBackground(new java.awt.Color(49, 144, 176));
        editbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel4.add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        submitbtn1.setText("Submit");
        submitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtn1ActionPerformed(evt);
            }
        });
        jPanel4.add(submitbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
        jPanel4.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, -1));

        passwordlbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordlbl1.setText("Password");
        jPanel4.add(passwordlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));
        jPanel4.add(nameWithInitialstxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, -1));

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
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 216, 148));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 840, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
            this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Dashborad dashborad=new Dashborad();
        dashborad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
        String regNo=regNotxt.getText();
        try{
            InstroucterModel instroucterModel=InstroucterController.searchInstroucter(regNo);
            if(instroucterModel !=null){
                nameWithInitialstxt1.setText(instroucterModel.getNameWithIntials());
                userNametxt.setText(instroucterModel.getUserName());
                regNotxt.setText(instroucterModel.getRegNo());
                indexNotxt.setText(instroucterModel.getIndexNo());
                emailtxt.setText(instroucterModel.getEmail());
                mobiletxt.setText(instroucterModel.getMobile());
                nictxt.setText(instroucterModel.getNic());
                addresstxt.setText(instroucterModel.getAddress());

                //(String nameWithIntials,String userName,String regNo,String indexNo,String email,String mobile,String nic,String address,String password){

                }
                else {
                    JOptionPane.showMessageDialog(this, "No Such Course ");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LectureReg.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LectureReg.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_searchbtn1ActionPerformed

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed
        String id=regNotxt.getText();
        try {
            int res = InstroucterController.deleteInstroucter(id);
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
    }//GEN-LAST:event_deletebtn1ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        String nameWithIntials=nameWithInitialstxt1.getText();
        String userName=userNametxt.getText();
        String regNo=regNotxt.getText();
        String indexNo=indexNotxt.getText();
        String email=emailtxt.getText();
        String mobile=mobiletxt.getText();
        String nic=nictxt.getText();
        String address=addresstxt.getText();
        String password=passwordtxt.getText();
        InstroucterModel instroucterModel=new InstroucterModel(nameWithIntials,userName,regNo,indexNo,email,mobile,nic,address,password);
        System.out.println(nameWithIntials+userName+regNo+indexNo+email+mobile+nic+address+password);
        try{
            int res=InstroucterController.editInstroucter(instroucterModel);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Added Success");
            }
            else{
                JOptionPane.showMessageDialog(this, "Can;t add data");

            }
        } catch (ClassNotFoundException | SQLException | CloneNotSupportedException ex) {
            Logger.getLogger(LectureReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void submitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtn1ActionPerformed
        String nameWithIntials=nameWithInitialstxt1.getText();
        String userName=userNametxt.getText();
        String regNo=regNotxt.getText();
        String indexNo=indexNotxt.getText();
        String email=emailtxt.getText();
        String mobile=mobiletxt.getText();
        String nic=nictxt.getText();
        String address=addresstxt.getText();
        String password=passwordtxt.getText();
        InstroucterModel instroucterModel=new InstroucterModel(nameWithIntials,userName,regNo,indexNo,email,mobile,nic,address,password);

        try{
            InstroucterModel instroucterModel1;
            int res = InstroucterController.addInstroucter(instroucterModel);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Added Success");
            }
            else{
                JOptionPane.showMessageDialog(this, "Can't edit");
            }} catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LectureReg.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_submitbtn1ActionPerformed

    private void regNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNotxtActionPerformed

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
            java.util.logging.Logger.getLogger(InstrocterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstrocterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstrocterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstrocterReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new InstrocterReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField indexNotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JTextField nameWithInitialstxt1;
    private javax.swing.JTextField nictxt;
    private javax.swing.JLabel passwordlbl1;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField regNotxt;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JButton submitbtn1;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userNametxt;
    // End of variables declaration//GEN-END:variables
}
