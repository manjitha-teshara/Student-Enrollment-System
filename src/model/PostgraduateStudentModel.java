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
public class PostgraduateStudentModel {
    
    String nameWithIntials;
    String userName;
    String regNo;
    String indexNo;
    String admission;
    String email;
    String mobile;
    String nic;
    String address;
    String insitute;
    String qualificationType;
    String qualification;
    String facultyId;
    String courseId;
    String password;

    public PostgraduateStudentModel(String nameWithIntials, String userName, String regNo, String indexNo, String admission, String email, String mobile, String nic, String address, String insitute, String qualificationType, String qualification, String facultyId, String courseId, String password) {
        this.nameWithIntials = nameWithIntials;
        this.userName = userName;
        this.regNo = regNo;
        this.indexNo = indexNo;
        this.admission = admission;
        this.email = email;
        this.mobile = mobile;
        this.nic = nic;
        this.address = address;
        this.insitute = insitute;
        this.qualificationType = qualificationType;
        this.qualification = qualification;
        this.facultyId = facultyId;
        this.courseId = courseId;
        this.password = password;
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

    public String getAdmission() {
        return admission;
    }

    public void setAdmission(String admission) {
        this.admission = admission;
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

    public String getInsitute() {
        return insitute;
    }

    public void setInsitute(String insitute) {
        this.insitute = insitute;
    }

    public String getQualificationType() {
        return qualificationType;
    }

    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
    
    
}
