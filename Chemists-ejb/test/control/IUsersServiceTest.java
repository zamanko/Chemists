/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
public class IUsersServiceTest {
    
    public IUsersServiceTest() {
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
     * Test of login method, of class IUsersService.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String login = "";
        String passwd = "";
        IUsersService instance = new IUsersServiceImpl();
        boolean expResult = false;
        boolean result = instance.login(login, passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByLogin method, of class IUsersService.
     */
    @Test
    public void testGetByLogin() {
        System.out.println("getByLogin");
        String login = "";
        IUsersService instance = new IUsersServiceImpl();
        Users expResult = null;
        Users result = instance.getByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registration method, of class IUsersService.
     */
    @Test
    public void testRegistration() {
        System.out.println("registration");
        Users user = null;
        IUsersService instance = new IUsersServiceImpl();
        boolean expResult = false;
        boolean result = instance.registration(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IUsersServiceImpl implements IUsersService {

        public boolean login(String login, String passwd) {
            return false;
        }

        public Users getByLogin(String login) {
            return null;
        }

        public boolean registration(Users user) {
            return false;
        }
    }
}
