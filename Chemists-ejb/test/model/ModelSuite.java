/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
@Suite.SuiteClasses({model.PublicationTest.class, model.BasketTest.class, model.CommentTest.class, model.UserBaseTest.class, model.BaseEntityTest.class, model.UsersTest.class, model.MedicamentTest.class, model.MedicBasketTest.class})
public class ModelSuite {

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
