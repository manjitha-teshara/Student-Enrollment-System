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
import javax.swing.JOptionPane;
import model.PostgraduateStudentModel;
import view.PostgraduateStudent;

/**
 *
 * @author manji
 */
public class PostgraduateController {
    
    public static int addPostStudent(PostgraduateStudentModel postgraduateStudentModel) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO postgraduatestudent(nameWithIntials,userName,regNo,indexNo,admission,email,mobile,nic,address,insitute,qualificationType,qualification,facultyId,password,courseId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, postgraduateStudentModel.getNameWithIntials());
        stm.setObject(2, postgraduateStudentModel.getUserName());
        stm.setObject(3, postgraduateStudentModel.getRegNo());
        stm.setObject(4, postgraduateStudentModel.getIndexNo());
        stm.setObject(5, postgraduateStudentModel.getAdmission());
        stm.setObject(6, postgraduateStudentModel.getEmail());
        stm.setObject(7, postgraduateStudentModel.getMobile());
        stm.setObject(8, postgraduateStudentModel.getNic());
        stm.setObject(9, postgraduateStudentModel.getAddress());
        stm.setObject(10, postgraduateStudentModel.getInsitute());
        stm.setObject(11, postgraduateStudentModel.getQualificationType());
        stm.setObject(12, postgraduateStudentModel.getQualification());
        stm.setObject(13, postgraduateStudentModel.getFacultyId());
        stm.setObject(14, postgraduateStudentModel.getPassword());
        stm.setObject(15, postgraduateStudentModel.getCourseId());
        
        return  stm.executeUpdate();
        
    }
    
    public static int editPostStudent(PostgraduateStudentModel postgraduateStudentModel) throws ClassNotFoundException,SQLException{
     String sql="UPDATE postgraduatestudent set nameWithIntials=?,userName=?,indexNo=?,admission=?,email=?,mobile=?,nic=?,address=?,insitute=?,qualificationType=?,qualification=?,password=? where regNo=?";
     //String sql="UPDATE postgraduatestudent set courseName=?,courseCodinater=?,semesterFees=? where courseId=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
     
     stm.setObject(1, postgraduateStudentModel.getNameWithIntials());
     stm.setObject(2, postgraduateStudentModel.getUserName());
     stm.setObject(3, postgraduateStudentModel.getIndexNo());
     stm.setObject(4, postgraduateStudentModel.getAdmission());
     stm.setObject(5, postgraduateStudentModel.getEmail());
     stm.setObject(6, postgraduateStudentModel.getMobile());
     stm.setObject(7, postgraduateStudentModel.getNic());
     stm.setObject(8, postgraduateStudentModel.getAddress());
     stm.setObject(9, postgraduateStudentModel.getInsitute());
     stm.setObject(10, postgraduateStudentModel.getQualificationType());
     stm.setObject(11, postgraduateStudentModel.getQualification());
     stm.setObject(12, postgraduateStudentModel.getPassword());
     stm.setObject(13, postgraduateStudentModel.getRegNo());
        return  stm.executeUpdate();
     
     }
    
    public static PostgraduateStudentModel searchPostStudent(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM postgraduatestudent where regNo=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              PostgraduateStudentModel postgraduateStudentModel=new PostgraduateStudentModel(rst.getString("nameWithIntials"),rst.getString("userName"),rst.getString("regNo"),rst.getString("indexNo"),rst.getString("admission"),rst.getString("email"),rst.getString("mobile"),rst.getString("nic"),rst.getString("address"),rst.getString("insitute"),rst.getString("qualificationType"),rst.getString("qualification"),rst.getString("facultyId"),rst.getString("password"),rst.getString("courseId"));
              //System.out.print(postgraduateStudentModel.getFacultyId());
              return postgraduateStudentModel;
          }
          else{
         return null;
          }
         
     }
    
    public static int deletePostStudent(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From postgraduatestudent where regNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
     
    
}
