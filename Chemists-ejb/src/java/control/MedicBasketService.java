/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import model.Basket;
import model.MedicBasket;
import model.Medicament;

/**
 *
 */
@Stateless
@LocalBean
public class MedicBasketService extends Generic<MedicBasket> implements IMedicBasketService {
     @PersistenceContext(unitName = "Chemists")
    private EntityManager em;

    public MedicBasketService() {
        super(MedicBasket.class);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
        public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<MedicBasket> getByBasket(Basket bask) {
        return (List<MedicBasket>)em.createQuery("SELECT b FROM MedicBasket b WHERE b.basket = :bask").setParameter("bask", bask).getResultList();
    }

    @Override
    public List<MedicBasket> getByMedic(Medicament medic) {
        try{
        return (List<MedicBasket>)em.createQuery("SELECT b FROM MedicBasket b WHERE b.medic = :medic").setParameter("medic", medic).getResultList();
        }
        catch(NoResultException e){
            return null;
        }
    
        }
    
    
}
