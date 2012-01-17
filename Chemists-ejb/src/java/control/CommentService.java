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
import javax.validation.ConstraintViolationException;
import model.Comment;
import model.Publication;
import model.Users;

/**
 *
 */
@Stateless
@LocalBean
public class CommentService extends Generic<Comment> implements ICommentService {

    @PersistenceContext(unitName = "Chemists")
    private EntityManager em;

    public CommentService() {
        super(Comment.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public boolean add_Comment(Comment com, Publication pub, Users usr) {
        try {
            com.setAvtor(usr);
            com.setPublication(pub);
            create(com);
            pub.addComment(com);
           } catch (ConstraintViolationException e) {
            System.out.print(e.getConstraintViolations());
            return false;
        }
        System.out.println("Yes!");
        return true;

    }

    @Override
    public boolean remove_Comment(Comment com, Publication pub, Users usr) {
        try {
            pub.delComment(com);
            remove(com);

        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
/////////////////////////////

    @Override
    public List<Comment> getByPublication(Publication pub) {
        return (List<Comment>) em.createNamedQuery("Comment.findByPublic").setParameter("publication", pub).getResultList();
        //pub.getCommentList();
    }
}
