/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Basket;
import model.Users;

/**
 *
 */
public interface IBasketService {
    
    public Basket getBasketByUser (Users user);
}
