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
public class UndergraduateStudentResultModel {
    
    String subjectCode;
    String attempt;
    String year;
    String indexNo;
    int marks;
    String grade;
    String  attemptYearIndexNo;

    public UndergraduateStudentResultModel(String subjectCode, String attempt, String year, String indexNo, int marks, String grade, String attemptYearIndexNo) {
        this.subjectCode = subjectCode;
        this.attempt = attempt;
        this.year = year;
        this.indexNo = indexNo;
        this.marks = marks;
        this.grade = grade;
        this.attemptYearIndexNo = attemptYearIndexNo;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getAttempt() {
        return attempt;
    }

    public void setAttempt(String attempt) {
        this.attempt = attempt;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAttemptYearIndexNo() {
        return attemptYearIndexNo;
    }

    public void setAttemptYearIndexNo(String attemptYearIndexNo) {
        this.attemptYearIndexNo = attemptYearIndexNo;
    }
    
    

}