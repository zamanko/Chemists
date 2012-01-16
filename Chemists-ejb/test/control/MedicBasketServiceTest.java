/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Basket;
import model.MedicBasket;
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
public class MedicBasketServiceTest {
    
    public MedicBasketServiceTest() {
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
     * Test of create method, of class MedicBasketService.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        MedicBasket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class MedicBasketService.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        MedicBasket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MedicBasketService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        MedicBasket entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class MedicBasketService.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        MedicBasket expResult = null;
        MedicBasket result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class MedicBasketService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MedicBasketService.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class MedicBasketService.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class MedicBasketService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByBasket method, of class MedicBasketService.
     */
    @Test
    public void testGetByBasket() throws Exception {
        System.out.println("getByBasket");
        Basket bask = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicBasketService instance = (MedicBasketService)container.getContext().lookup("java:global/classes/MedicBasketService");
        List expResult = null;
        List result = instance.getByBasket(bask);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
