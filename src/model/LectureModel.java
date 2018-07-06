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
public class LectureModel {
    String nameWithIntials;
    String userName;
    String regNo;
    String indexNo;
    String email;
    String mobile;
    String nic;
    String address;
    String password;
    
    public LectureModel(String nameWithIntials,String userName,String regNo,String indexNo,String email,String mobile,String nic,String address,String password){
        this.nameWithIntials=nameWithIntials;
        this.userName=userName;
        this.regNo=regNo;
        this.indexNo=indexNo;
        this.email=email;
        this.mobile=mobile;
        this.nic=nic;
        this.address=address;
        this.password=password;
    }

    public String getNameWithIntials() {
        return nameWithIntials;
    }

    public void setNameWithIntials(String nameWithIntials) {
        this.nameWithIntials = nameWithIntials;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
