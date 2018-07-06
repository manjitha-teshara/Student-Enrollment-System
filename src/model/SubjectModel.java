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
public class SubjectModel {
   
   
    private String subjectName;
    private String subjectCode;
    private String superviser;
    private String instroucters1;
    private String instroucters2;
    private int numberOfCredit;
    private int numberOfAssignment;
    
    public SubjectModel(String subjectName,String subjectCode,String superviser,String instroucters1,String instroucters2,int numberOfCredit,int numberOfAssignment ){
        this.subjectName=subjectName;
        this.subjectCode=subjectCode;
        this.superviser=superviser;
        this.instroucters1=instroucters1;
        this.instroucters2=instroucters2;
        this.numberOfCredit=numberOfCredit;
        this.numberOfAssignment=numberOfAssignment;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSuperviser() {
        return superviser;
    }

    public void setSuperviser(String superviser) {
        this.superviser = superviser;
    }

    public String getInstroucters1() {
        return instroucters1;
    }

    public void setInstroucters1(String instroucters1) {
        this.instroucters1 = instroucters1;
    }

    public String getInstroucters2() {
        return instroucters2;
    }

    public void setInstroucters2(String instroucters2) {
        this.instroucters2 = instroucters2;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

    public int getNumberOfAssignment() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignment(int numberOfAssignment) {
        this.numberOfAssignment = numberOfAssignment;
    }
}
