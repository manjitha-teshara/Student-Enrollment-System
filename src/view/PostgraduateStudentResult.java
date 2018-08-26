/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.PostgraduateStudentResultController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.PostgraduateStudentResultModel;

/**
 *
 * @author manji
 */
public class PostgraduateStudentResult extends javax.swing.JFrame {

 
    public PostgraduateStudentResult() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        attempttxt = new javax.swing.JTextField();
        subjectCodetxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        indexNotxt = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        datetebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        markstxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gradetxt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 181, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(141, 199, 63));

        jPanel7.setBackground(new java.awt.Color(141, 199, 63));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Postgraduate Student Result ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(25, 88, 157))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Attempt");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subject.setText("Subject Code");
        jPanel7.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Year");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        attempttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attempttxtActionPerformed(evt);
            }
        });
        jPanel7.add(attempttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 100, -1));

        subjectCodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectCodetxtActionPerformed(evt);
            }
        });
        jPanel7.add(subjectCodetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, -1));
        jPanel7.add(yeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, -1));

        submitbtn.setBackground(new java.awt.Color(49, 144, 176));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel7.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, -1));

        backbtn.setBackground(new java.awt.Color(49, 144, 176));
        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel7.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Index No");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel7.add(indexNotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, -1));

        cancelbtn.setBackground(new java.awt.Color(49, 144, 176));
        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel7.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 100, -1));

        editbtn.setBackground(new java.awt.Color(49, 144, 176));
        editbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel7.add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 100, -1));

        searchbtn.setBackground(new java.awt.Color(49, 144, 176));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel7.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 100, -1));

        datetebtn.setBackground(new java.awt.Color(49, 144, 176));
        datetebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        datetebtn.setText("Delete");
        datetebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetebtnActionPerformed(evt);
            }
        });
        jPanel7.add(datetebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Marks");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        jPanel7.add(markstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Grade");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel7.add(gradetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 100, -1));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
            this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    public JTextField getAttempttxt() {
        return attempttxt;
    }

    public void setAttempttxt(JTextField attempttxt) {
        this.attempttxt = attempttxt;
    }

    public JTextField getGradetxt() {
        return gradetxt;
    }

    public void setGradetxt(JTextField gradetxt) {
        this.gradetxt = gradetxt;
    }

    public JTextField getIndexNotxt() {
        return indexNotxt;
    }

    public void setIndexNotxt(JTextField indexNotxt) {
        this.indexNotxt = indexNotxt;
    }

    public JTextField getMarkstxt() {
        return markstxt;
    }

    public void setMarkstxt(JTextField markstxt) {
        this.markstxt = markstxt;
    }

    public JTextField getSubjectCodetxt() {
        return subjectCodetxt;
    }

    public void setSubjectCodetxt(JTextField subjectCodetxt) {
        this.subjectCodetxt = subjectCodetxt;
    }

    public JTextField getYeartxt() {
        return yeartxt;
    }

    public void setYeartxt(JTextField yeartxt) {
        this.yeartxt = yeartxt;
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 Dashborad dashborad=new Dashborad();
            dashborad.setVisible(true);
            this.dispose();      }//GEN-LAST:event_jLabel1MouseClicked

    private void attempttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attempttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attempttxtActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed

        try {
            
            String subjectCode=subjectCodetxt.getText();
            String attempt=attempttxt.getText();
            String year=yeartxt.getText();
            String indexNo=indexNotxt.getText();
            int marks=Integer.parseInt(markstxt.getText());
            String grade=gradetxt.getText();
            //int numberOfCredit=Integer.parseInt(numberOfcreadittxt.getText());
            
            String  attemptYearIndexNo=attempt+year+indexNo;
            PostgraduateStudentResultModel postgraduateStudentResultModel=new PostgraduateStudentResultModel(subjectCode, attempt, year, indexNo, marks, grade, attemptYearIndexNo);
            //System.out.println(courseName.length());
            int res = PostgraduateStudentResultController.addResult(postgraduateStudentResultModel);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Added Success");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_submitbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void subjectCodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectCodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectCodetxtActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        
        String subjectCode=subjectCodetxt.getText();
        String attempt=attempttxt.getText();
        String year = yeartxt.getText();
        String indexNo=indexNotxt.getText();
        int marks=Integer.parseInt(markstxt.getText());
        String grade=gradetxt.getText();
        String  attemptYearIndexNo=attempt+year+indexNo;
      
        PostgraduateStudentResultModel postgraduateStudentResultModel=new PostgraduateStudentResultModel(subjectCode, attempt, year, indexNo, marks, grade, attemptYearIndexNo);
       
       
        try {
            int res=PostgraduateStudentResultController.editResult(postgraduateStudentResultModel);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Update Success");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_editbtnActionPerformed

   
    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
       String attempt=attempttxt.getText();
        String year=yeartxt.getText();
        String indexNo=indexNotxt.getText();
        
        String id=attempt+year+indexNo;
        System.out.print(id);
        
         PostgraduateStudentResultModel postgraduateStudentResultModel;
        try {
            postgraduateStudentResultModel = PostgraduateStudentResultController.searchResult(id);
        
            if (postgraduateStudentResultModel != null) {
                subjectCodetxt.setText(postgraduateStudentResultModel.getSubjectCode());
            attempttxt.setText(postgraduateStudentResultModel.getAttempt());
            yeartxt.setText(postgraduateStudentResultModel.getYear());
            indexNotxt.setText(postgraduateStudentResultModel.getIndexNo());
            markstxt.setText(Integer.toString(postgraduateStudentResultModel.getMarks()));
            //gradetxt.setText(postgraduateStudentResultModel.getGrade());
            gradetxt.setText(postgraduateStudentResultModel.getGrade());
               
            } else {
                JOptionPane.showMessageDialog(this, "No Such Course ");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        PostgraduateStudentResultModel postgraduateStudentResultModel = null;
        try {
            postgraduateStudentResultModel = PostgraduateStudentResultController.searchResult(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (postgraduateStudentResultModel != null) {
            subjectCodetxt.setText(postgraduateStudentResultModel.getSubjectCode());
            attempttxt.setText(postgraduateStudentResultModel.getAttempt());
            yeartxt.setText(postgraduateStudentResultModel.getYear());
            indexNotxt.setText(postgraduateStudentResultModel.getIndexNo());
            markstxt.setText(Integer.toString(postgraduateStudentResultModel.getMarks()));
            gradetxt.setText(postgraduateStudentResultModel.getGrade());
            
        } else {
            JOptionPane.showMessageDialog(this, "No Such Result record ");
        }*/
     
    }//GEN-LAST:event_searchbtnActionPerformed

    private void datetebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetebtnActionPerformed
        
        String attempt=attempttxt.getText();
        String year=yeartxt.getText();
        String indexNo=indexNotxt.getText();
        
        String id=attempt+year+indexNo;
        
        int res = 0;
        try {
            res = PostgraduateStudentResultController.deleteResult(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateStudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (res > 0) {
            JOptionPane.showMessageDialog(this, "Delete Success ");
        } else {
            JOptionPane.showMessageDialog(this, "Delete Fail ");
        }
     
        
    }//GEN-LAST:event_datetebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateStudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attempttxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton datetebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField gradetxt;
    private javax.swing.JTextField indexNotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField markstxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JLabel subject;
    private javax.swing.JTextField subjectCodetxt;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables

}