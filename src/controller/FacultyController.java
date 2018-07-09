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
import model.FacultyModel;
import view.Course;

/**
 *
 * @author manji
 */
public class FacultyController {
    
     public static int addFaculty(FacultyModel facultyModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into faculty values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, facultyModel.getFacultyId());
        stm.setObject(2, facultyModel.getFacultyName());
        stm.setObject(3, facultyModel.getFacultyHead());
        
        return  stm.executeUpdate();
        
    }
     
     public static int editFaculty(FacultyModel facultyModel) throws ClassNotFoundException,SQLException{
     String sql="UPDATE faculty set facultyName=?,facultyHead=? where facultyId=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
     
     stm.setObject(1, facultyModel.getFacultyName());
     stm.setObject(2, facultyModel.getFacultyHead());
     stm.setObject(3, facultyModel.getFacultyId());
     
        return  stm.executeUpdate();
     
     }
    
     public static FacultyModel searchFaculty(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM faculty where facultyId=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              FacultyModel facultyModel=new FacultyModel(rst.getString("facultyId"),rst.getString("facultyName"),
                      rst.getString("facultyHead"));
              return facultyModel;
          }
          else{
         return null;
          }
         
     }
    
     public static int deleteFaculty(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From faculty where facultyId=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
