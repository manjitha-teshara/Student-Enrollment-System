/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.PostgraduateStudentResultModel;
import view.PostgraduateStudentResult;

/**
 *
 * @author manji
 */
public class PostgraduateStudentResultController {
    
    public static int addResult(PostgraduateStudentResultModel postgraduateStudentResultModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into resultPost values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, postgraduateStudentResultModel.getSubjectCode());
        stm.setObject(2, postgraduateStudentResultModel.getRegNo());
        stm.setObject(3, postgraduateStudentResultModel.getResult());
        stm.setObject(4, postgraduateStudentResultModel.getGrade());
        stm.setObject(5, postgraduateStudentResultModel.getNumberOfCredit());
        
        return  stm.executeUpdate();
        
    }

    public static int addResult(PostgraduateStudentResult postgraduateStudentResult) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
