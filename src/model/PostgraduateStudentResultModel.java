/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author manji
 */
public class PostgraduateStudentResultModel {
    
    String subjectCode;
    String subjectName;
    String regNo;
    String studentName;
    int result;
    String Grade;
    int numberOfCredit;

    public PostgraduateStudentResultModel(String subjectCode, String subjectName, String regNo, String studentName, int result, String Grade, int numberOfCredit) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.regNo = regNo;
        this.studentName = studentName;
        this.result = result;
        this.Grade = Grade;
        this.numberOfCredit = numberOfCredit;
    }
    
    public PostgraduateStudentResultModel(String subjectCode, String regNo, int result, String Grade, int numberOfCredit) {
        this.subjectCode = subjectCode;
        
        this.regNo = regNo;
       
        this.result = result;
        this.Grade = Grade;
        this.numberOfCredit = numberOfCredit;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }
    
    
    
    
}
