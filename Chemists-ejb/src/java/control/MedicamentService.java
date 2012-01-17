/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Medicament;

/**
 *
 */
@Stateless
@LocalBean
public class MedicamentService extends Generic<Medicament> implements IMedicamentService {
      @PersistenceContext(unitName = "Chemists")
    private EntityManager em;

    public MedicamentService() {
        super(Medicament.class);
    }
      
    @Override
    public List<Medicament> getMedicByType (String type){
        return (List<Medicament>)em.createQuery("SELECT m FROM Medicament m WHERE m.type = :type").setParameter("type", type).getResultList();
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
        public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<Medicament> findByName(String text) {
       List<Medicament> lst_result = findAll();
       List<Medicament> lst_source = findAll(); 
        for (int i=0; i<=lst_source.size()-1; i++){
            if (lst_source.get(i).getName().toLowerCase().indexOf(text.toLowerCase())==-1){
                 lst_result.remove(lst_source.get(i));
           }
          
        }
        return lst_result;     
    }
    
}
