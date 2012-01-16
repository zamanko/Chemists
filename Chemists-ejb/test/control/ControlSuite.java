/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author zaman
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({control.IMedicamentServiceTest.class, control.ICommentServiceTest.class, control.IPublicationServiceTest.class, control.IGenericTest.class, control.UserServiceTest.class, control.IUsersServiceTest.class, control.PublicationServiceTest.class, control.BasketServiceTest.class, control.MedicBasketServiceTest.class, control.IBasketServiceTest.class, control.GenericTest.class, control.MedicamentServiceTest.class, control.CommentServiceTest.class, control.IMedicBasketServiceTest.class})
public class ControlSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
