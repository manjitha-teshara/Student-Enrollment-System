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
@Table(name = "admin", catalog = "nsbmsystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByUserId", query = "SELECT a FROM Admin a WHERE a.userId = :userId")
    , @NamedQuery(name = "Admin.findByNameWithIntials", query = "SELECT a FROM Admin a WHERE a.nameWithIntials = :nameWithIntials")
    , @NamedQuery(name = "Admin.findByUserName", query = "SELECT a FROM Admin a WHERE a.userName = :userName")
    , @NamedQuery(name = "Admin.findByEmail", query = "SELECT a FROM Admin a WHERE a.email = :email")
    , @NamedQuery(name = "Admin.findByMobile", query = "SELECT a FROM Admin a WHERE a.mobile = :mobile")
    , @NamedQuery(name = "Admin.findByNic", query = "SELECT a FROM Admin a WHERE a.nic = :nic")
    , @NamedQuery(name = "Admin.findByAddress", query = "SELECT a FROM Admin a WHERE a.address = :address")
    , @NamedQuery(name = "Admin.findByPassword", query = "SELECT a FROM Admin a WHERE a.password = :password")})
public class Admin implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "userId")
    private String userId;
    @Column(name = "nameWithIntials")
    private String nameWithIntials;
    @Column(name = "userName")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "nic")
    private String nic;
    @Column(name = "address")
    private String address;
    @Column(name = "password")
    private String password;

    public Admin() {
    }

    public Admin(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        String oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    public String getNameWithIntials() {
        return nameWithIntials;
    }

    public void setNameWithIntials(String nameWithIntials) {
        String oldNameWithIntials = this.nameWithIntials;
        this.nameWithIntials = nameWithIntials;
        changeSupport.firePropertyChange("nameWithIntials", oldNameWithIntials, nameWithIntials);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String oldUserName = this.userName;
        this.userName = userName;
        changeSupport.firePropertyChange("userName", oldUserName, userName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Admin[ userId=" + userId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
