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
public class FacultyModel {
        private String facultyId;
        private String facultyName;
        private String facultyHead;
       
public FacultyModel(String facultyId,String facultyName,String facultyHead){

    this.facultyId=facultyId;
    this.facultyName=facultyName;
    this.facultyHead=facultyHead;
}

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyHead() {
        return facultyHead;
    }

    public void setFacultyHead(String facultyHead) {
        this.facultyHead = facultyHead;
    }


}