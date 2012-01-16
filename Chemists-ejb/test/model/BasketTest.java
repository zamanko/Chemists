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
public class BasketTest {
    
    public BasketTest() {
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
     * Test of Basket method, of class Basket.
     */
    @Test
    public void testBasket() {
        System.out.println("Basket");
        Basket instance = new Basket();
        instance.Basket();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Basket.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Basket instance = new Basket();
        Users expResult = null;
        Users result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Basket.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        Users owner = null;
        Basket instance = new Basket();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSumma method, of class Basket.
     */
    @Test
    public void testGetSumma() {
        System.out.println("getSumma");
        Basket instance = new Basket();
        int expResult = 0;
        int result = instance.getSumma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSumma method, of class Basket.
     */
    @Test
    public void testSetSumma() {
        System.out.println("setSumma");
        int summa = 0;
        Basket instance = new Basket();
        instance.setSumma(summa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Basket.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Basket instance = new Basket();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Basket.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Basket instance = new Basket();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Basket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Basket instance = new Basket();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
