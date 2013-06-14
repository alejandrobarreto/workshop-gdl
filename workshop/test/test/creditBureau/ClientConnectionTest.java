/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditBureau;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejandro
 */
public class ClientConnectionTest {
    
    public ClientConnectionTest() {
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
     * Test of establishConnection method, of class ClientConnection.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        ClientConnection instance = new ClientConnection();
        instance.establishConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
