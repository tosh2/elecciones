/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose
 */
public class EleccionesTest {
    
    public EleccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getJson method, of class Elecciones.
     */
    @Test
    public void testGetJson() {
        System.out.println("getJson");
        String nombre = "";
        Elecciones instance = new Elecciones();
        Response expResult = null;
        Response result = instance.getJson(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCandidato method, of class Elecciones.
     */
    @Test
    public void testGetCandidato() {
        System.out.println("getCandidato");
        String nombre = "Jose";
        Elecciones instance = new Elecciones();
        String expResult = "{\"nombre\":\""+"Jose"+"\"}";
        String result = instance.getCandidato(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype...");
            
        }
    }

    /**
     * Test of putJson method, of class Elecciones.
     */
    @Test
    public void testPutJson() {
        System.out.println("putJson");
        String content = "";
        Elecciones instance = new Elecciones();
        instance.putJson(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
