/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manji
 */
public class AdminController {
    public static boolean Cheak_name(String userName,String password) throws SQLException, ClassNotFoundException{
        
        String sql="select * from admin where password=password('"+password+"') and userName='"+userName+"'";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement statement=connection.prepareStatement(sql);
        ResultSet set=statement.executeQuery(sql);
        return set.next();
      
    }
}
