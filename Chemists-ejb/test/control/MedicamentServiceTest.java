/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class MedicamentServiceTest {
    
    public MedicamentServiceTest() {
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
     * Test of create method, of class MedicamentService.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Medicament entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class MedicamentService.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Medicament entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MedicamentService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Medicament entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class MedicamentService.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        Medicament expResult = null;
        Medicament result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class MedicamentService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MedicamentService.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class MedicamentService.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicByType method, of class MedicamentService.
     */
    @Test
    public void testGetMedicByType() throws Exception {
        System.out.println("getMedicByType");
        String type = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        List expResult = null;
        List result = instance.getMedicByType(type);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class MedicamentService.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object object = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MedicamentService instance = (MedicamentService)container.getContext().lookup("java:global/classes/MedicamentService");
        instance.persist(object);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
