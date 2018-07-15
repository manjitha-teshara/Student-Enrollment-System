/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author manji
 */
@Entity
@Table(name = "course", catalog = "nsbmsystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Course_1.findAll", query = "SELECT c FROM Course_1 c")
    , @NamedQuery(name = "Course_1.findByCourseId", query = "SELECT c FROM Course_1 c WHERE c.courseId = :courseId")
    , @NamedQuery(name = "Course_1.findByCourseName", query = "SELECT c FROM Course_1 c WHERE c.courseName = :courseName")
    , @NamedQuery(name = "Course_1.findByCourseCodinater", query = "SELECT c FROM Course_1 c WHERE c.courseCodinater = :courseCodinater")
    , @NamedQuery(name = "Course_1.findBySemesterFees", query = "SELECT c FROM Course_1 c WHERE c.semesterFees = :semesterFees")})
public class Course_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "courseId")
    private String courseId;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseCodinater")
    private String courseCodinater;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "semesterFees")
    private BigDecimal semesterFees;

    public Course_1() {
    }

    public Course_1(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        String oldCourseName = this.courseName;
        this.courseName = courseName;
        changeSupport.firePropertyChange("courseName", oldCourseName, courseName);
    }

    public String getCourseCodinater() {
        return courseCodinater;
    }

    public void setCourseCodinater(String courseCodinater) {
        String oldCourseCodinater = this.courseCodinater;
        this.courseCodinater = courseCodinater;
        changeSupport.firePropertyChange("courseCodinater", oldCourseCodinater, courseCodinater);
    }

    public BigDecimal getSemesterFees() {
        return semesterFees;
    }

    public void setSemesterFees(BigDecimal semesterFees) {
        BigDecimal oldSemesterFees = this.semesterFees;
        this.semesterFees = semesterFees;
        changeSupport.firePropertyChange("semesterFees", oldSemesterFees, semesterFees);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course_1)) {
            return false;
        }
        Course_1 other = (Course_1) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Course_1[ courseId=" + courseId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
