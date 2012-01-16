/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@Entity
@Table(name = "medicament", catalog = "chemists", schema = "")
@XmlRootElement
public class Medicament extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column(name = "Type", nullable = false, length = 1)
    private String type;
    @Column(name = "Name", nullable = false, length = 200)
    private String name;
    @Column(name = "Maker", nullable = false, length = 200)
    private String maker;
    @Column(name = "Price", nullable = false)
    private int price;
    @Column(name = "Presence", nullable = true, length = 1)
    private String presence;
    @Column(name = "Information", nullable = true, length = 1000)
    private String information;
    

    public void Medicament (){
        
    }
      
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof Medicament)) {
            return false;
        }
        Medicament other = (Medicament) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Medicament[ id=" + id + " ]";
    }
    
}
