/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class MedicBasketTest {
    
    public MedicBasketTest() {
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
     * Test of getCount method, of class MedicBasket.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        MedicBasket instance = new MedicBasket();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class MedicBasket.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int count = 0;
        MedicBasket instance = new MedicBasket();
        instance.setCount(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasket method, of class MedicBasket.
     */
    @Test
    public void testGetBasket() {
        System.out.println("getBasket");
        MedicBasket instance = new MedicBasket();
        Basket expResult = null;
        Basket result = instance.getBasket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBasket method, of class MedicBasket.
     */
    @Test
    public void testSetBasket() {
        System.out.println("setBasket");
        Basket basket = null;
        MedicBasket instance = new MedicBasket();
        instance.setBasket(basket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedic method, of class MedicBasket.
     */
    @Test
    public void testGetMedic() {
        System.out.println("getMedic");
        MedicBasket instance = new MedicBasket();
        Medicament expResult = null;
        Medicament result = instance.getMedic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedic method, of class MedicBasket.
     */
    @Test
    public void testSetMedic() {
        System.out.println("setMedic");
        Medicament medic = null;
        MedicBasket instance = new MedicBasket();
        instance.setMedic(medic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MedicBasket.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MedicBasket instance = new MedicBasket();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MedicBasket.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        MedicBasket instance = new MedicBasket();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MedicBasket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MedicBasket instance = new MedicBasket();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
