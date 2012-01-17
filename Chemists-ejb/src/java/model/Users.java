/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 */
@Entity
@Table(name = "users", catalog = "chemists", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id"),
    @NamedQuery(name = "Users.findByLogin", query = "SELECT u FROM Users u WHERE u.login = :login"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    @NamedQuery(name = "Users.findBySecname", query = "SELECT u FROM Users u WHERE u.secname = :secname"),
    @NamedQuery(name = "Users.findByPatronymic", query = "SELECT u FROM Users u WHERE u.patronymic = :patronymic"),
    @NamedQuery(name = "Users.findByPhone", query = "SELECT u FROM Users u WHERE u.phone = :phone")
})
public class Users extends UserBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "Role_user", nullable = false, length = 15)
    private String roleuser;
    @OneToMany(mappedBy = "avtor")
    private List<Publication> publicationList;
    @OneToOne
    @JoinColumn(name = "basket", referencedColumnName = "id")
    private Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    
    public void addPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            publicationList.add(publ);
        } else {
            //  publicationList = new ArrayList<Publication>();
        }
    }

    public boolean delPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            return publicationList.remove(publ);
        } else {
            return false;
        }
    }

    public Users() {
    }

    public Users(Long id) {
        this.id = id;
    }

    public Users(String login, String name, String password, String secname, String roleuser) {
        // this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.secname = secname;
        this.roleuser = roleuser;
    }

    public String getRoleuser() {
        return roleuser;
    }

    public void setRoleuser(String roleuser) {
        this.roleuser = roleuser;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if (((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)))
                || ((this.login == null && other.login != null)
                || (this.login != null && !this.login.equals(other.login)))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Users[ id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + " ]";
    }
}
