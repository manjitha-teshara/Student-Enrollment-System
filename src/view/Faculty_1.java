/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "faculty", catalog = "nsbmsystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Faculty_1.findAll", query = "SELECT f FROM Faculty_1 f")
    , @NamedQuery(name = "Faculty_1.findByFacultyId", query = "SELECT f FROM Faculty_1 f WHERE f.facultyId = :facultyId")
    , @NamedQuery(name = "Faculty_1.findByFacultyName", query = "SELECT f FROM Faculty_1 f WHERE f.facultyName = :facultyName")
    , @NamedQuery(name = "Faculty_1.findByFacultyHead", query = "SELECT f FROM Faculty_1 f WHERE f.facultyHead = :facultyHead")})
public class Faculty_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "facultyId")
    private String facultyId;
    @Column(name = "facultyName")
    private String facultyName;
    @Column(name = "facultyHead")
    private String facultyHead;

    public Faculty_1() {
    }

    public Faculty_1(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        String oldFacultyId = this.facultyId;
        this.facultyId = facultyId;
        changeSupport.firePropertyChange("facultyId", oldFacultyId, facultyId);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        String oldFacultyName = this.facultyName;
        this.facultyName = facultyName;
        changeSupport.firePropertyChange("facultyName", oldFacultyName, facultyName);
    }

    public String getFacultyHead() {
        return facultyHead;
    }

    public void setFacultyHead(String facultyHead) {
        String oldFacultyHead = this.facultyHead;
        this.facultyHead = facultyHead;
        changeSupport.firePropertyChange("facultyHead", oldFacultyHead, facultyHead);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultyId != null ? facultyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty_1)) {
            return false;
        }
        Faculty_1 other = (Faculty_1) object;
        if ((this.facultyId == null && other.facultyId != null) || (this.facultyId != null && !this.facultyId.equals(other.facultyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Faculty_1[ facultyId=" + facultyId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
