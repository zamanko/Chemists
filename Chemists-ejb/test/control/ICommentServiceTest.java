/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Comment;
import model.Publication;
import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaman
 */
public class ICommentServiceTest {
    
    public ICommentServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getByPublication method, of class ICommentService.
     */
    @Test
    public void testGetByPublication() {
        System.out.println("getByPublication");
        Publication pub = null;
        ICommentService instance = new ICommentServiceImpl();
        List expResult = null;
        List result = instance.getByPublication(pub);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_Comment method, of class ICommentService.
     */
    @Test
    public void testAdd_Comment() {
        System.out.println("add_Comment");
        Comment com = null;
        Publication pub = null;
        Users usr = null;
        ICommentService instance = new ICommentServiceImpl();
        boolean expResult = false;
        boolean result = instance.add_Comment(com, pub, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove_Comment method, of class ICommentService.
     */
    @Test
    public void testRemove_Comment() {
        System.out.println("remove_Comment");
        Comment com = null;
        Publication pub = null;
        Users usr = null;
        ICommentService instance = new ICommentServiceImpl();
        boolean expResult = false;
        boolean result = instance.remove_Comment(com, pub, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICommentServiceImpl implements ICommentService {

        public List<Comment> getByPublication(Publication pub) {
            return null;
        }

        public boolean add_Comment(Comment com, Publication pub, Users usr) {
            return false;
        }

        public boolean remove_Comment(Comment com, Publication pub, Users usr) {
            return false;
        }
    }
}
