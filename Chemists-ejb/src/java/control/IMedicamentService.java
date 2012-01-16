/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Medicament;

/**
 *
 */
public interface IMedicamentService {
    
    public List<Medicament> getMedicByType (String type);
    
    public List<Medicament> findByName (String text);
 
}
