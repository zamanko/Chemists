/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class PublicationServiceTest {
    
    public PublicationServiceTest() {
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
     * Test of create method, of class PublicationService.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Publication entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class PublicationService.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Publication entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PublicationService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Publication entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class PublicationService.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        Publication expResult = null;
        Publication result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class PublicationService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class PublicationService.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class PublicationService.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByTypeDate method, of class PublicationService.
     */
    @Test
    public void testGetByTypeDate() throws Exception {
        System.out.println("getByTypeDate");
        String type = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.getByTypeDate(type);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByText method, of class PublicationService.
     */
    @Test
    public void testFindByText() throws Exception {
        System.out.println("findByText");
        String substr = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.findByText(substr);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByTitle method, of class PublicationService.
     */
    @Test
    public void testGetByTitle() throws Exception {
        System.out.println("getByTitle");
        String title = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.getByTitle(title);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByOrderDate method, of class PublicationService.
     */
    @Test
    public void testGetByOrderDate() throws Exception {
        System.out.println("getByOrderDate");
        String type = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.getByOrderDate(type);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByAvtor method, of class PublicationService.
     */
    @Test
    public void testGetByAvtor() throws Exception {
        System.out.println("getByAvtor");
        Users usr = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        List expResult = null;
        List result = instance.getByAvtor(usr);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class PublicationService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PublicationService instance = (PublicationService)container.getContext().lookup("java:global/classes/PublicationService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
