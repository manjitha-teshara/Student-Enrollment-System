/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author manji
 */
public class SemesterModel {
    
    String courseName;
    String courseId;
    String semesterId;
    double semesterFees;
    String start;
    String end;

    public SemesterModel(String courseName, String courseId, String semesterId, double semesterFees, String start, String end) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.semesterId = semesterId;
        this.semesterFees = semesterFees;
        this.start = start;
        this.end = end;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public double getSemesterFees() {
        return semesterFees;
    }

    public void setSemesterFees(double semesterFees) {
        this.semesterFees = semesterFees;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    
    
    
}
