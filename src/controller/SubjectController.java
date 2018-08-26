/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.SubjectModel;
import view.Subject;

/**
 *
 * @author manji
 */
public class SubjectController {
    
    public static int addSubject(SubjectModel subject)  throws ClassNotFoundException, SQLException {
        String sql = "Insert into subject values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        //subjectName, subjectCode, superviser, instroucters1, instroucters2, numberOfCredit, numberOfAssignment);
        stm.setObject(1, subject.getSubjectCode());
        stm.setObject(2,subject.getSubjectName());
        stm.setObject(3,subject.getSuperviser());
        stm.setObject(4,subject.getInstroucters1());
        stm.setObject(5,subject.getInstroucters2());
        stm.setObject(6,subject.getNumberOfCredit());
        stm.setObject(7,subject.getNumberOfAssignment());
        return  stm.executeUpdate();
        
    }
    /*String sql = "Update Customer set name=?,address=?,salary=? where id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(4, customer.getId());
        stm.setObject(1, customer.getName());
        stm.setObject(2, customer.getAddress());
        stm.setObject(3, customer.getSalary());
        return  stm.executeUpdate();*/
    
    public static int editSubject(SubjectModel subject) throws ClassNotFoundException,SQLException{
    String sql="UPDATE subject set subjectName=?, superviser=?,instroucter1=?,instroucter2=?,numberOfCredit=?,numberOfAssignment=? where subjectCode=?";
    Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        //subjectName, subjectCode, superviser, instroucters1, instroucters2, numberOfCredit, numberOfAssignment);
        
        stm.setObject(1,subject.getSubjectName());
        stm.setObject(2,subject.getSuperviser());
        stm.setObject(3,subject.getInstroucters1());
        stm.setObject(4,subject.getInstroucters2());
        stm.setObject(5,subject.getNumberOfCredit());
        stm.setObject(6,subject.getNumberOfAssignment());
        stm.setObject(7, subject.getSubjectCode());
        return  stm.executeUpdate();
    }
    
    
    public static SubjectModel searchSubject(String id) throws ClassNotFoundException,SQLException{
        String sql="SELECT * FROM subject WHERE subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              SubjectModel subjectModel=new SubjectModel(rst.getString("subjectName"),rst.getString("subjectCode"),
                      rst.getString("superviser"),rst.getString("instroucter1"),rst.getString("instroucter2"),rst.getInt("numberOfCredit"),rst.getInt("numberOfAssignment"));
              return subjectModel;
          }
          else{
         return null;
          }
         
     
    }
    
    public static int deleteSubject(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From subject where subjectCode=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
