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
public class MedicamentTest {
    
    public MedicamentTest() {
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
     * Test of Medicament method, of class Medicament.
     */
    @Test
    public void testMedicament() {
        System.out.println("Medicament");
        Medicament instance = new Medicament();
        instance.Medicament();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInformation method, of class Medicament.
     */
    @Test
    public void testGetInformation() {
        System.out.println("getInformation");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getInformation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInformation method, of class Medicament.
     */
    @Test
    public void testSetInformation() {
        System.out.println("setInformation");
        String information = "";
        Medicament instance = new Medicament();
        instance.setInformation(information);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaker method, of class Medicament.
     */
    @Test
    public void testGetMaker() {
        System.out.println("getMaker");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getMaker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaker method, of class Medicament.
     */
    @Test
    public void testSetMaker() {
        System.out.println("setMaker");
        String maker = "";
        Medicament instance = new Medicament();
        instance.setMaker(maker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Medicament.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Medicament.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Medicament instance = new Medicament();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPresence method, of class Medicament.
     */
    @Test
    public void testGetPresence() {
        System.out.println("getPresence");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getPresence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPresence method, of class Medicament.
     */
    @Test
    public void testSetPresence() {
        System.out.println("setPresence");
        String presence = "";
        Medicament instance = new Medicament();
        instance.setPresence(presence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Medicament.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Medicament instance = new Medicament();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Medicament.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Medicament instance = new Medicament();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Medicament.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Medicament.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Medicament instance = new Medicament();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Medicament.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Medicament instance = new Medicament();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Medicament.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Medicament instance = new Medicament();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Medicament.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
