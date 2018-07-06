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
import model.SemesterModel;

/**
 *
 * @author manji
 */
public class SemesterController {
    
    public static int addSemester(SemesterModel semesterModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into semester values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, semesterModel.getCourseName());
        stm.setObject(2, semesterModel.getCourseId());
        stm.setObject(3, semesterModel.getSemesterId());
        stm.setObject(4, semesterModel.getSemesterFees());
        stm.setObject(5, semesterModel.getStart());
        stm.setObject(6, semesterModel.getEnd());
        return  stm.executeUpdate();
        
    }
     
     public static int editSemester(SemesterModel semesterModel) throws ClassNotFoundException,SQLException{
     String sql="UPDATE semester set courseName=?,courseId=?,semesterFees=?,start=?,end=? where semesterId=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, semesterModel.getCourseName());
        stm.setObject(2, semesterModel.getCourseId());        
        stm.setObject(3, semesterModel.getSemesterFees());
        stm.setObject(4, semesterModel.getStart());
        stm.setObject(5, semesterModel.getEnd());
        stm.setObject(6, semesterModel.getSemesterId());
        return  stm.executeUpdate();
     
     }
    
     public static SemesterModel searchSemester(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM semester where semesterId=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              SemesterModel semesterModel=new SemesterModel(rst.getString("courseName"),rst.getString("courseId"), rst.getString("semesterId"),rst.getDouble("semesterFees") ,rst.getString("start"),rst.getString("end"));
              return semesterModel;
          }
          else{
         return null;
          }
         
     }
    
     public static int deleteSemester(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From semester where semesterId=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
