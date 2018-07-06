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

/**
 *
 * @author manji
 */
public class UndergraduateStudentController {
    
    public static int addUnderStudent(UndergraduateStudentModel undergraduateStudentModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into undergraduatestudent INSERT INTO postgraduatestudent(nameWithIntials,userName,regNo,indexNo,admission,email,mobile,nic,address,insitute,qualificationType,qualification,facultyId,courseId,password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, undergraduateStudentModel.getNameWithIntials());
        stm.setObject(2, undergraduateStudentModel.getUserName());
        stm.setObject(3, undergraduateStudentModel.getRegNo());
        stm.setObject(4, undergraduateStudentModel.getIndexNo());
        stm.setObject(5, undergraduateStudentModel.getAdmission());
        stm.setObject(6, undergraduateStudentModel.getEmail());
        stm.setObject(7, undergraduateStudentModel.getMobile());
        stm.setObject(8, undergraduateStudentModel.getNic());
        stm.setObject(9, undergraduateStudentModel.getAddress());
        stm.setObject(10, undergraduateStudentModel.getSubName1());
        stm.setObject(11, undergraduateStudentModel.getSubGrade1());
        stm.setObject(12, undergraduateStudentModel.getSubName2());
        stm.setObject(13, undergraduateStudentModel.getSubGrade2());
        stm.setObject(14, undergraduateStudentModel.getSubName3());
        stm.setObject(15, undergraduateStudentModel.getSubGrade3());
        stm.setObject(16, undergraduateStudentModel.getEngGrade());
        stm.setObject(11, undergraduateStudentModel.getIslandRank());
        stm.setObject(12, undergraduateStudentModel.getzScore());
        stm.setObject(13, undergraduateStudentModel.getFacultyId());
        stm.setObject(14, undergraduateStudentModel.getCourseId());
        stm.setObject(15, undergraduateStudentModel.getPassword());
        return  stm.executeUpdate();
        
    }
    
    public static int editUnderStudent(UndergraduateStudentModel undergraduateStudentModel) throws ClassNotFoundException,SQLException{
     String sql="UPDATE undergraduatestudent set nameWithIntials=?,userName=?,indexNo=?,admission=?,email=?,mobile=?,nic=?,address=?,insitute=?,qualificationType=?,qualification=?,password=? where regNo=?";
     //String sql="UPDATE postgraduatestudent set courseName=?,courseCodinater=?,semesterFees=? where courseId=?";
     Connection conn = DBConnection.getDBConnection().getConnection();
     PreparedStatement stm = conn.prepareStatement(sql);
    
        stm.setObject(1, undergraduateStudentModel.getNameWithIntials());
        stm.setObject(2, undergraduateStudentModel.getUserName());
        stm.setObject(3, undergraduateStudentModel.getRegNo());
        stm.setObject(4, undergraduateStudentModel.getIndexNo());
        stm.setObject(5, undergraduateStudentModel.getAdmission());
        stm.setObject(6, undergraduateStudentModel.getEmail());
        stm.setObject(7, undergraduateStudentModel.getMobile());
        stm.setObject(8, undergraduateStudentModel.getNic());
        stm.setObject(9, undergraduateStudentModel.getAddress());
        stm.setObject(10, undergraduateStudentModel.getSubName1());
        stm.setObject(11, undergraduateStudentModel.getSubGrade1());
        stm.setObject(12, undergraduateStudentModel.getSubName2());
        stm.setObject(13, undergraduateStudentModel.getSubGrade2());
        stm.setObject(14, undergraduateStudentModel.getSubName3());
        stm.setObject(15, undergraduateStudentModel.getSubGrade3());
        stm.setObject(16, undergraduateStudentModel.getEngGrade());
        stm.setObject(11, undergraduateStudentModel.getIslandRank());
        stm.setObject(12, undergraduateStudentModel.getzScore());
        stm.setObject(13, undergraduateStudentModel.getFacultyId());
        stm.setObject(14, undergraduateStudentModel.getCourseId());
        
        return  stm.executeUpdate();
     
     }
    
    public static UndergraduateStudentModel searchUnderStudent(String id) throws ClassNotFoundException,SQLException {
         String sql="SELECT * FROM undergraduatestudent where regNo=?";
          Connection conn = DBConnection.getDBConnection().getConnection();
          PreparedStatement stm = conn.prepareStatement(sql);
          stm.setObject(1, id);
          ResultSet rst=stm.executeQuery();
          if(rst.next()){
              UndergraduateStudentModel undergraduateStudentModel=new UndergraduateStudentModel(rst.getString("nameWithIntials"),rst.getString("userName"),rst.getString("regNo"),rst.getString("indexNo"),rst.getString("admission"),rst.getString("email"),rst.getString("mobile"),rst.getString("nic"),rst.getString("address"),rst.getString("subName1"),rst.getString("subGrade1"),rst.getString("subName2"),rst.getString("subGrade2"),rst.getString("subName3"),rst.getString("subGrade3"),rst.getString("engGrade"),rst.getInt("islandRank"),rst.getDouble("zScore"),rst.getString("facultyId"),rst.getString("courseId"),rst.getString("password"));
              return undergraduateStudentModel;
          }
          else{
         return null;
          }
         
     }
    
    public static int deleteUnderStudent(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From undergraduatestudent where regNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }

   
    
     
    
}
