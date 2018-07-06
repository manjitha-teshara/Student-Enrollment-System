/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SubjectController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.SubjectModel;

/**
 *
 * @author manji
 */
public class Subject_view extends javax.swing.JFrame {

    /**
     * Creates new form studentReg
     */
    public Subject_view() {
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
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numberOfCredittxt = new javax.swing.JTextField();
        subjectNametxt = new javax.swing.JTextField();
        subjectCodetxt = new javax.swing.JTextField();
        suoervisertxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        numberOfAssignmenttxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 181, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(141, 199, 63));

        jPanel7.setBackground(new java.awt.Color(141, 199, 63));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(25, 88, 157))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Subject Name");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 47, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Subject Code");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Superviser");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Number of Credit");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel7.add(numberOfCredittxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 100, -1));
        jPanel7.add(subjectNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));
        jPanel7.add(subjectCodetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, -1));
        jPanel7.add(suoervisertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        jButton2.setBackground(new java.awt.Color(49, 144, 176));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Number of Assignment");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel7.add(numberOfAssignmenttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, -1));

        jButton3.setText("Add Subject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel7.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 840, 440));

        jPanel5.setBackground(new java.awt.Color(25, 88, 157));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo_for_dash.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 840, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Dashborad dashborad=new Dashborad();
            dashborad.setVisible(true);
            this.dispose();  
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dashborad dashborad=new Dashborad();
            dashborad.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Subject subject=new Subject();
        subject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String subjectCode=subjectCodetxt.getText();
        try{
            SubjectModel subjectModel=SubjectController.searchSubject(subjectCode);
            if(subjectModel != null){
                subjectNametxt.setText(subjectModel.getSubjectName());
                suoervisertxt.setText(subjectModel.getSuperviser());
                numberOfCredittxt.setText(Integer.toString(subjectModel.getNumberOfCredit()));
                numberOfAssignmenttxt.setText(Integer.toString(subjectModel.getNumberOfAssignment()));
            }
            else {
                JOptionPane.showMessageDialog(this, "No Such Course ");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Subject_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Subject_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField numberOfAssignmenttxt;
    private javax.swing.JTextField numberOfCredittxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField subjectCodetxt;
    private javax.swing.JTextField subjectNametxt;
    private javax.swing.JTextField suoervisertxt;
    // End of variables declaration//GEN-END:variables
}
