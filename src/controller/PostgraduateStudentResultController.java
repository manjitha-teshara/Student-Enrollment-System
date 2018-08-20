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
import model.CourseModel;
import model.PostgraduateStudentResultModel;
import view.PostgraduateStudentResult;

/**
 *
 * @author manji
 */
public class PostgraduateStudentResultController {
    
    public static int addResult(PostgraduateStudentResultModel postgraduateStudentResultModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into result values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, postgraduateStudentResultModel.getSubjectCode());
        stm.setObject(2, postgraduateStudentResultModel.getAttempt());
        stm.setObject(3, postgraduateStudentResultModel.getYear());
        stm.setObject(4, postgraduateStudentResultModel.getIndexNo());
        stm.setObject(5, postgraduateStudentResultModel.getMarks());
        stm.setObject(6, postgraduateStudentResultModel.getGrade());
        stm.setObject(7, postgraduateStudentResultModel.getAttemptYearIndexNo());
        
        return  stm.executeUpdate();
        
    }

   

    public static int editResult(PostgraduateStudentResultModel postgraduateStudentResultModel) throws ClassNotFoundException, SQLException {
       
        
        String sql="UPDATE result set subjectCode=?,attempt=?,year=?,indexNo=?,marks=?,grade=? ,attemptYearIndexNo=? where subjectCode=? ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, postgraduateStudentResultModel.getSubjectCode());
        stm.setObject(2, postgraduateStudentResultModel.getAttempt());
        stm.setObject(3, postgraduateStudentResultModel.getYear());
        stm.setObject(4, postgraduateStudentResultModel.getIndexNo());
        stm.setObject(5, postgraduateStudentResultModel.getMarks());
        stm.setObject(6, postgraduateStudentResultModel.getGrade());
        stm.setObject(7, postgraduateStudentResultModel.getSubjectCode());
        stm.setObject(8, postgraduateStudentResultModel.getSubjectCode());
       // stm.setObject(8, course.getCourseId());
            return  stm.executeUpdate();
        
                
        
    }

    public static int deleteResult(String id) throws ClassNotFoundException, SQLException {
       
        
        String sql="DELETE FROM result WHERE attemptYearIndexNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    
    

    public static PostgraduateStudentResultModel searchResult(String id) throws ClassNotFoundException, SQLException {
       
       String sql="SELECT * FROM result WHERE attemptYearIndexNo=?";
      
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst=stm.executeQuery();
          if(rst.next()){
              PostgraduateStudentResultModel postgraduateStudentResultModel=new PostgraduateStudentResultModel(rst.getString("subjectCode"),rst.getString("attempt"),
                      rst.getString("year"),rst.getString("indexNo"),rst.getInt("marks"),rst.getString("grade"),rst.getString("attemptYearIndexNo"));
              return postgraduateStudentResultModel;
          }
          else{
         return null;
    }

    
}
}
