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
import model.LectureModel;

/**
 *
 * @author manji
 */
public class lectureController {
   
    public static int addLecture(LectureModel lecture) throws ClassNotFoundException,SQLException{
        String sql="INSERT INTO lecture VALUES(?,?,?,?,?,?,?,?,password(?))";//PASSWORD('?')
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecture.getNameWithIntials());
        stm.setObject(2, lecture.getUserName());
        stm.setObject(3, lecture.getRegNo());
        stm.setObject(4, lecture.getIndexNo());
        stm.setObject(5, lecture.getEmail());
        stm.setObject(6, lecture.getMobile());
        stm.setObject(7, lecture.getNic());
        stm.setObject(8, lecture.getAddress());
        stm.setObject(9, lecture.getPassword());
        return stm.executeUpdate();
        //(String nameWithIntials,String userName,String regNo,String indexNo,String email,String mobile,String nic,String address,String password){
        
        
    }
    
    public static LectureModel searchLecture(String id) throws ClassNotFoundException,SQLException{
        String sql="SELECT * FROM lecture WHERE regNo=?";
        Connection conn=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=conn.prepareStatement(sql);
        
        stm.setObject(1, id);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            LectureModel lectureModel=new LectureModel(rst.getString("nameWithIntials"), rst.getString("userName"), rst.getString("regNo"), rst.getString("indexNo"), rst.getString("email"), rst.getString("mobile"), rst.getString("nic"), rst.getString("address"), rst.getString("PASSWORD"));
            return lectureModel;
        }
        else{
            return null;
        }
    }
    
    
    public static int editLecture(LectureModel lecture) throws CloneNotSupportedException,SQLException, ClassNotFoundException{
        String sql="UPDATE lecture SET nameWithIntials=?,userName=?,email=?,mobile=?,nic=?,address=?,PASSWORD=PASSWORD(?) WHERE regNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,lecture.getNameWithIntials());
        stm.setObject(2, lecture.getUserName());
        stm.setObject(3, lecture.getEmail());
        stm.setObject(4, lecture.getMobile());
        stm.setObject(5, lecture.getNic());
        stm.setObject(6, lecture.getAddress());
        stm.setObject(7, lecture.getPassword());
        stm.setObject(8, lecture.getRegNo());
        return stm.executeUpdate();
        
    }
    
    public static int deleteLecture(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From lecture where regNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
}
