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
@Table(name = "subject", catalog = "nsbmsystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Subject_1.findAll", query = "SELECT s FROM Subject_1 s")
    , @NamedQuery(name = "Subject_1.findBySubjectCode", query = "SELECT s FROM Subject_1 s WHERE s.subjectCode = :subjectCode")
    , @NamedQuery(name = "Subject_1.findBySubjectName", query = "SELECT s FROM Subject_1 s WHERE s.subjectName = :subjectName")
    , @NamedQuery(name = "Subject_1.findBySuperviser", query = "SELECT s FROM Subject_1 s WHERE s.superviser = :superviser")
    , @NamedQuery(name = "Subject_1.findByInstroucter1", query = "SELECT s FROM Subject_1 s WHERE s.instroucter1 = :instroucter1")
    , @NamedQuery(name = "Subject_1.findByInstroucter2", query = "SELECT s FROM Subject_1 s WHERE s.instroucter2 = :instroucter2")
    , @NamedQuery(name = "Subject_1.findByNumberOfCredit", query = "SELECT s FROM Subject_1 s WHERE s.numberOfCredit = :numberOfCredit")
    , @NamedQuery(name = "Subject_1.findByNumberOfAssignment", query = "SELECT s FROM Subject_1 s WHERE s.numberOfAssignment = :numberOfAssignment")})
public class Subject_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "subjectCode")
    private String subjectCode;
    @Column(name = "subjectName")
    private String subjectName;
    @Column(name = "superviser")
    private String superviser;
    @Column(name = "instroucter1")
    private String instroucter1;
    @Column(name = "instroucter2")
    private String instroucter2;
    @Column(name = "numberOfCredit")
    private Integer numberOfCredit;
    @Column(name = "numberOfAssignment")
    private Integer numberOfAssignment;

    public Subject_1() {
    }

    public Subject_1(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        String oldSubjectCode = this.subjectCode;
        this.subjectCode = subjectCode;
        changeSupport.firePropertyChange("subjectCode", oldSubjectCode, subjectCode);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        String oldSubjectName = this.subjectName;
        this.subjectName = subjectName;
        changeSupport.firePropertyChange("subjectName", oldSubjectName, subjectName);
    }

    public String getSuperviser() {
        return superviser;
    }

    public void setSuperviser(String superviser) {
        String oldSuperviser = this.superviser;
        this.superviser = superviser;
        changeSupport.firePropertyChange("superviser", oldSuperviser, superviser);
    }

    public String getInstroucter1() {
        return instroucter1;
    }

    public void setInstroucter1(String instroucter1) {
        String oldInstroucter1 = this.instroucter1;
        this.instroucter1 = instroucter1;
        changeSupport.firePropertyChange("instroucter1", oldInstroucter1, instroucter1);
    }

    public String getInstroucter2() {
        return instroucter2;
    }

    public void setInstroucter2(String instroucter2) {
        String oldInstroucter2 = this.instroucter2;
        this.instroucter2 = instroucter2;
        changeSupport.firePropertyChange("instroucter2", oldInstroucter2, instroucter2);
    }

    public Integer getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(Integer numberOfCredit) {
        Integer oldNumberOfCredit = this.numberOfCredit;
        this.numberOfCredit = numberOfCredit;
        changeSupport.firePropertyChange("numberOfCredit", oldNumberOfCredit, numberOfCredit);
    }

    public Integer getNumberOfAssignment() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignment(Integer numberOfAssignment) {
        Integer oldNumberOfAssignment = this.numberOfAssignment;
        this.numberOfAssignment = numberOfAssignment;
        changeSupport.firePropertyChange("numberOfAssignment", oldNumberOfAssignment, numberOfAssignment);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subjectCode != null ? subjectCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject_1)) {
            return false;
        }
        Subject_1 other = (Subject_1) object;
        if ((this.subjectCode == null && other.subjectCode != null) || (this.subjectCode != null && !this.subjectCode.equals(other.subjectCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Subject_1[ subjectCode=" + subjectCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
