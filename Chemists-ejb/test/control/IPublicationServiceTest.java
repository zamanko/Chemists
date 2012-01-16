/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
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
public class IPublicationServiceTest {
    
    public IPublicationServiceTest() {
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
     * Test of findByText method, of class IPublicationService.
     */
    @Test
    public void testFindByText() {
        System.out.println("findByText");
        String substr = "";
        IPublicationService instance = new IPublicationServiceImpl();
        List expResult = null;
        List result = instance.findByText(substr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByTitle method, of class IPublicationService.
     */
    @Test
    public void testGetByTitle() {
        System.out.println("getByTitle");
        String title = "";
        IPublicationService instance = new IPublicationServiceImpl();
        List expResult = null;
        List result = instance.getByTitle(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByOrderDate method, of class IPublicationService.
     */
    @Test
    public void testGetByOrderDate() {
        System.out.println("getByOrderDate");
        String type = "";
        IPublicationService instance = new IPublicationServiceImpl();
        List expResult = null;
        List result = instance.getByOrderDate(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByAvtor method, of class IPublicationService.
     */
    @Test
    public void testGetByAvtor() {
        System.out.println("getByAvtor");
        Users usr = null;
        IPublicationService instance = new IPublicationServiceImpl();
        List expResult = null;
        List result = instance.getByAvtor(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByTypeDate method, of class IPublicationService.
     */
    @Test
    public void testGetByTypeDate() {
        System.out.println("getByTypeDate");
        String type = "";
        IPublicationService instance = new IPublicationServiceImpl();
        List expResult = null;
        List result = instance.getByTypeDate(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPublicationServiceImpl implements IPublicationService {

        public List<Publication> findByText(String substr) {
            return null;
        }

        public List<Publication> getByTitle(String title) {
            return null;
        }

        public List<Publication> getByOrderDate(String type) {
            return null;
        }

        public List<Publication> getByAvtor(Users usr) {
            return null;
        }

        public List<Publication> getByTypeDate(String type) {
            return null;
        }
    }
}
