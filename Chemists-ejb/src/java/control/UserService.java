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
import model.Users;

/**
 *
 */
@Stateless
@LocalBean
public class UserService extends Generic<Users> implements IUsersService {

    @PersistenceContext(unitName = "Chemists")
    private EntityManager em;
 //   private Users usr; 
//    private int test = 0;
//
//    public Users getUsr() {
//        test++;
//        System.out.println(test);
//        return usr;
//    }
//
//    public void setUsr(Users usr) {
//        this.usr = usr;
//    }
    

    public UserService() {
        super(Users.class);
        System.out.println("create");
    }

    @Override
    public boolean login(String login, String passwd) {
        //Users us = getByLogin(login);
        if (null != getByLogin(login)) {
            if (getByLogin(login).getPassword().equals(passwd)) {
                return true;
            }
        }
        return false;
    }
    ///////////////////////////// 

    @Override
    public boolean registration(Users user) {

        return false;
    }
    //////////////////////////

    public String getUserRole (String login){
        Users u = (Users)em.createNamedQuery("Users.findByLogin").setParameter("login", login).getSingleResult();
        return u.getRoleuser();
    } 
    
    @Override
    public Users getByLogin(String login) {
        try {
            return (Users) em.createNamedQuery("Users.findByLogin").setParameter("login", login).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
