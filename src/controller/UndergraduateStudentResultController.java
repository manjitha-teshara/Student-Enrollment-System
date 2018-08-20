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
import model.UndergraduateStudentModel;
import model.UndergraduateStudentResultModel;
import view.UndergraduateStudent;

/**
 *
 * @author manji
 */
public class UndergraduateStudentResultController {
    
    public static int addResult(UndergraduateStudentResultModel undergraduateStudentResultModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into uresult values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, undergraduateStudentResultModel.getSubjectCode());
        stm.setObject(2, undergraduateStudentResultModel.getAttempt());
        stm.setObject(3, undergraduateStudentResultModel.getYear());
        stm.setObject(4, undergraduateStudentResultModel.getIndexNo());
        stm.setObject(5, undergraduateStudentResultModel.getMarks());
        stm.setObject(6, undergraduateStudentResultModel.getGrade());
        stm.setObject(7, undergraduateStudentResultModel.getAttemptYearIndexNo());
        
        return  stm.executeUpdate();
        
    }

   

    public static int editResult(UndergraduateStudentResultModel undergraduateStudentResultModel) throws ClassNotFoundException, SQLException {
       
        
        String sql="UPDATE uresult set subjectCode=?,attempt=?,year=?,indexNo=?,marks=?,grade=? ,attemptYearIndexNo=? where subjectCode=? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, undergraduateStudentResultModel.getSubjectCode());
        stm.setObject(2, undergraduateStudentResultModel.getAttempt());
        stm.setObject(3, undergraduateStudentResultModel.getYear());
        stm.setObject(4, undergraduateStudentResultModel.getIndexNo());
        stm.setObject(5, undergraduateStudentResultModel.getMarks());
        stm.setObject(6, undergraduateStudentResultModel.getGrade());
        stm.setObject(7, undergraduateStudentResultModel.getSubjectCode());
        stm.setObject(8, undergraduateStudentResultModel.getSubjectCode());
                  return  stm.executeUpdate();
        
                
        
    }

    public static int deleteResult(String id) throws ClassNotFoundException, SQLException {
       
        
        String sql="DELETE FROM uresult WHERE attemptYearIndexNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    
    

    public static UndergraduateStudentResultModel searchResult(String id) throws ClassNotFoundException, SQLException {
       
       String sql="SELECT * FROM uresult WHERE attemptYearIndexNo=?";
      
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst=stm.executeQuery();
          if(rst.next()){
              UndergraduateStudentResultModel undergraduateStudentResultModel=new UndergraduateStudentResultModel(rst.getString("subjectCode"),rst.getString("attempt"),
                      rst.getString("year"),rst.getString("indexNo"),rst.getInt("marks"),rst.getString("grade"),rst.getString("attemptYearIndexNo"));
              return undergraduateStudentResultModel;
          }
          else{
         return null;
    }

    
}
}
