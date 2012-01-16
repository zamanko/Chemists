/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
public class IBasketServiceTest {
    
    public IBasketServiceTest() {
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
     * Test of getBasketByUser method, of class IBasketService.
     */
    @Test
    public void testGetBasketByUser() {
        System.out.println("getBasketByUser");
        Users user = null;
        IBasketService instance = new IBasketServiceImpl();
        Basket expResult = null;
        Basket result = instance.getBasketByUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IBasketServiceImpl implements IBasketService {

        public Basket getBasketByUser(Users user) {
            return null;
        }
    }
}
