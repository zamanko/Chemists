/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
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
public class IMedicBasketServiceTest {
    
    public IMedicBasketServiceTest() {
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
     * Test of getByBasket method, of class IMedicBasketService.
     */
    @Test
    public void testGetByBasket() {
        System.out.println("getByBasket");
        Basket bask = null;
        IMedicBasketService instance = new IMedicBasketServiceImpl();
        List expResult = null;
        List result = instance.getByBasket(bask);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IMedicBasketServiceImpl implements IMedicBasketService {

        public List<MedicBasket> getByBasket(Basket bask) {
            return null;
        }
    }
}
