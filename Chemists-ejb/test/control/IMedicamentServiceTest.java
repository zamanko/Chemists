/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Medicament;
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
public class IMedicamentServiceTest {
    
    public IMedicamentServiceTest() {
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
     * Test of getMedicByType method, of class IMedicamentService.
     */
    @Test
    public void testGetMedicByType() {
        System.out.println("getMedicByType");
        String type = "";
        IMedicamentService instance = new IMedicamentServiceImpl();
        List expResult = null;
        List result = instance.getMedicByType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IMedicamentServiceImpl implements IMedicamentService {

        public List<Medicament> getMedicByType(String type) {
            return null;
        }
    }
}
