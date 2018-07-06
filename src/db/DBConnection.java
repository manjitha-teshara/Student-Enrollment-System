/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author linux
 */
public class DBConnection {

    private static DBConnection dBConnection;
    private static Connection conn;

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
     /*public static Object getDBConnection(){
        throw new UnsupportedOperationException("Not support yet");
    }*/
    
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/nsbmsystem", "root", "1234");
    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    public Connection getConnection(){
        return conn;
    }
       
   
    
}
