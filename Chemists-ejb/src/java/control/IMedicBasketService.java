/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Basket;
import model.MedicBasket;
import model.Medicament;

/**
 *
 */
public interface IMedicBasketService {
    
    public List<MedicBasket> getByBasket (Basket bask);
    
    public List<MedicBasket> getByMedic (Medicament medic);
    
}
