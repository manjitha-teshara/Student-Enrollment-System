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
import view.Course;

/**
 *
 * @author manji
 */
public class CourseController {
    
     public static int addCourse(CourseModel course) throws ClassNotFoundException, SQLException {
        String sql = "Insert into course values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, course.getCourseId());
        stm.setObject(2, course.getCourseName());
        stm.setObject(3, course.getCourseCodinater());
        stm.setObject(4, course.getSemesterFees());
        return  stm.executeUpdate();
        
    }
     
     public static int editCourse(CourseModel course) throws ClassNotFoundException,SQLException{
     String sql="UPDATE course set courseName=?,courseCodinater=?,semesterFees=? where courseId=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
     
     stm.setObject(1, course.getCourseName());
     stm.setObject(2, course.getCourseCodinater());
     stm.setObject(3, course.getSemesterFees());
     stm.setObject(4, course.getCourseId());
        return  stm.executeUpdate();
     
     }
     /*public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        String sql = "Select * From Customer where id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
            return customer;
        }else{
            return null;
        }
    }*/
     public static CourseModel searchCourse(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM course where courseId=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              CourseModel courseModel=new CourseModel(rst.getString("courseId"),rst.getString("courseName"),
                      rst.getString("courseCodinater"),rst.getDouble("semesterFees"));
              return courseModel;
          }
          else{
         return null;
          }
         
     }
     /*public static int deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        String sql = "Delete From Customer where id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
    } */
     public static int deleteCourse(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From course where courseId=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
