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
public class PaymentModel {
    
    String resitNo;
    String nameWithIntials;
    String regNo;
    String indexNo;
    Double value;
    String semesterId;

    public PaymentModel(String resitNo, String nameWithIntials, String regNo, String indexNo, Double value, String semesterId) {
        this.resitNo = resitNo;
        this.nameWithIntials = nameWithIntials;
        this.regNo = regNo;
        this.indexNo = indexNo;
        this.value = value;
        this.semesterId = semesterId;
    }

    public String getResitNo() {
        return resitNo;
    }

    public void setResitNo(String resitNo) {
        this.resitNo = resitNo;
    }

    public String getNameWithIntials() {
        return nameWithIntials;
    }

    public void setNameWithIntials(String nameWithIntials) {
        this.nameWithIntials = nameWithIntials;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }
    
    
    
}
