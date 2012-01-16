/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import model.Basket;
import model.Users;

/**
 *
 */
@Stateless
@LocalBean
public class BasketService extends Generic<Basket> implements IBasketService {
    @PersistenceContext(unitName = "Chemists")
    private EntityManager em;

    public BasketService() {
        super(Basket.class);
    }
    
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
        public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Basket getBasketByUser(Users user) {
        try{
        return (Basket)em.createQuery("SELECT bs FROM Basket bs WHERE bs.owner = :user").setParameter("user", user).getSingleResult();
        }
        catch (NoResultException e){
            return null;
        }
        }
    
}
