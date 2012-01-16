/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Basket;
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
public class BasketServiceTest {
    
    public BasketServiceTest() {
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
     * Test of create method, of class BasketService.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Basket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class BasketService.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Basket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BasketService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Basket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BasketService.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        Basket expResult = null;
        Basket result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class BasketService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class BasketService.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class BasketService.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class BasketService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasketByUser method, of class BasketService.
     */
    @Test
    public void testGetBasketByUser() throws Exception {
        System.out.println("getBasketByUser");
        Users user = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BasketService instance = (BasketService)container.getContext().lookup("java:global/classes/BasketService");
        Basket expResult = null;
        Basket result = instance.getBasketByUser(user);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
