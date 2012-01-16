/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@Entity
@Table(name = "MedicBasket", catalog = "chemists", schema = "")
@XmlRootElement
public class MedicBasket extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @ManyToOne
    @JoinColumn(name = "basket", referencedColumnName = "id")
    private Basket basket;
    @ManyToOne
    @JoinColumn(name = "medicament", referencedColumnName = "id")
    private Medicament medic;
    @Column (name="count", nullable=false)
    private int count;
     @Column (name="summa", nullable=false)
    private int summa;

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }
     
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Medicament getMedic() {
        return medic;
    }

    public void setMedic(Medicament medic) {
        this.medic = medic;
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
        if (!(object instanceof MedicBasket)) {
            return false;
        }
        MedicBasket other = (MedicBasket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MedicBasket[ id=" + id + " ]";
    }
    
}
