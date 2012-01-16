/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
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
public class IGenericTest {
    
    public IGenericTest() {
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
     * Test of count method, of class IGeneric.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        IGeneric instance = new IGenericImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class IGeneric.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        IGeneric instance = new IGenericImpl();
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class IGeneric.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Object entity = null;
        IGeneric instance = new IGenericImpl();
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class IGeneric.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        IGeneric instance = new IGenericImpl();
        Object expResult = null;
        Object result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class IGeneric.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        IGeneric instance = new IGenericImpl();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class IGeneric.
     */
    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        IGeneric instance = new IGenericImpl();
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IGeneric.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object entity = null;
        IGeneric instance = new IGenericImpl();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IGenericImpl implements IGeneric {

        public int count() {
            return 0;
        }

        public void create(T entity) {
        }

        public void edit(T entity) {
        }

        public T find(Long id) {
            return null;
        }

        public List<T> findAll() {
            return null;
        }

        public List<T> findRange(int[] range) {
            return null;
        }

        public void remove(T entity) {
        }
    }
}
