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
public class CourseModel {
        private String courseName;
        private String courseId;
        private String courseCodinater;
        private double semesterFees;

    public CourseModel(String courseName, String courseId, String courseCodinater, double semesterFees) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCodinater = courseCodinater;
        this.semesterFees = semesterFees;
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

    public String getCourseCodinater() {
        return courseCodinater;
    }

    public void setCourseCodinater(String courseCodinater) {
        this.courseCodinater = courseCodinater;
    }

    public double getSemesterFees() {
        return semesterFees;
    }

    public void setSemesterFees(double semesterFees) {
        this.semesterFees = semesterFees;
    }
        
        
}
