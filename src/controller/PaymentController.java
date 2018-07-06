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
import model.PaymentModel;

/**
 *
 * @author manji
 */
public class PaymentController {
    
    /* public static int addCourse(CourseModel course) throws ClassNotFoundException, SQLException {
        String sql = "Insert into course values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, course.getCourseId());
        stm.setObject(2, course.getCourseName());
        stm.setObject(3, course.getCourseCodinater());
        stm.setObject(4, course.getSemesterFees());
        return  stm.executeUpdate();
        
    }*/
    
    public static int addPayemnt(PaymentModel paymentModel) throws ClassNotFoundException,SQLException{
        String sql="INSERT INTO payment VALUES(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, paymentModel.getResitNo());
        stm.setObject(2, paymentModel.getNameWithIntials());
        stm.setObject(3, paymentModel.getRegNo());
        stm.setObject(4, paymentModel.getIndexNo());
        stm.setObject(5, paymentModel.getValue());
        stm.setObject(6, paymentModel.getSemesterId());
        return  stm.executeUpdate();
    }
    
    public static int editPayment(PaymentModel paymentModel) throws ClassNotFoundException,SQLException{
     String sql="UPDATE payment set nameWithIntials=?,regNo=?,indexNo=?,value=?,semesterId=? where resitNo=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
     
     stm.setObject(1, paymentModel.getNameWithIntials());
     stm.setObject(2, paymentModel.getRegNo());
     stm.setObject(3, paymentModel.getIndexNo());
     stm.setObject(4, paymentModel.getValue());
     stm.setObject(5, paymentModel.getSemesterId());
     stm.setObject(6, paymentModel.getResitNo());
        return  stm.executeUpdate();
     
     }
    /*    public PaymentModel(String resitNo, String nameWithIntials, String regNo, String indexNo, Double value, String semesterId) {
*/
    public static PaymentModel searchPayment(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM payment where resitNo=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              PaymentModel paymentModel=new PaymentModel(rst.getString("resitNo"),rst.getString("nameWithIntials"),
                      rst.getString("regNo"),rst.getString("indexNo"),rst.getDouble("semesterFees"),rst.getString("semesterId"));
              return paymentModel;
          }
          else{
         return null;
          }
         
     }
    
     public static int deletePayment(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From payment where resitNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
