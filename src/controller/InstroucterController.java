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
import model.InstroucterModel;
import model.LectureModel;

/**
 *
 * @author manji
 */
public class InstroucterController {
    
     public static int addInstroucter(InstroucterModel instroucterModel) throws ClassNotFoundException,SQLException{
        String sql="INSERT INTO instroucter VALUES(?,?,?,?,?,?,?,?,password(?))";//PASSWORD('?')
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instroucterModel.getNameWithIntials());
        stm.setObject(2, instroucterModel.getUserName());
        stm.setObject(3, instroucterModel.getRegNo());
        stm.setObject(4, instroucterModel.getIndexNo());
        stm.setObject(5, instroucterModel.getEmail());
        stm.setObject(6, instroucterModel.getMobile());
        stm.setObject(7, instroucterModel.getNic());
        stm.setObject(8, instroucterModel.getAddress());
        stm.setObject(9, instroucterModel.getPassword());
        return stm.executeUpdate();
        //(String nameWithIntials,String userName,String regNo,String indexNo,String email,String mobile,String nic,String address,String password){
        
        
    }
     
     public static InstroucterModel searchInstroucter(String id) throws ClassNotFoundException,SQLException{
        String sql="SELECT * FROM instroucter WHERE regNo=?";
        Connection conn=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=conn.prepareStatement(sql);
        
        stm.setObject(1, id);
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            InstroucterModel instroucterModel=new InstroucterModel(rst.getString("nameWithIntials"), rst.getString("userName"), rst.getString("regNo"), rst.getString("indexNo"), rst.getString("email"), rst.getString("mobile"), rst.getString("nic"), rst.getString("address"), rst.getString("PASSWORD"));
            return instroucterModel;
        }
        else{
            return null;
        }
    }
     
     public static int editInstroucter(InstroucterModel instroucterModel) throws CloneNotSupportedException,SQLException, ClassNotFoundException{
        String sql="UPDATE instroucter SET nameWithIntials=?,userName=?,email=?,mobile=?,nic=?,address=?,PASSWORD=PASSWORD(?) WHERE regNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,instroucterModel.getNameWithIntials());
        stm.setObject(2, instroucterModel.getUserName());
        stm.setObject(3, instroucterModel.getEmail());
        stm.setObject(4, instroucterModel.getMobile());
        stm.setObject(5, instroucterModel.getNic());
        stm.setObject(6, instroucterModel.getAddress());
        stm.setObject(7, instroucterModel.getPassword());
        stm.setObject(8, instroucterModel.getRegNo());
        return stm.executeUpdate();
        
    }
     
     public static int deleteInstroucter(String id) throws ClassNotFoundException,SQLException{
         String sql="Delete From instroucter where regNo=?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return  stm.executeUpdate();
         
     }
    
}
