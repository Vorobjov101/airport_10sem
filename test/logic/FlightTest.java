/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.util.Calendar;
import junit.framework.TestCase;

/**
 *
 * @author 802249
 */
public class FlightTest extends TestCase {
    
    public FlightTest(String testName) {
        super(testName);
    }

    /**
     * Test of get_id method, of class Flight.
     */
    public void testGet_id() {
        System.out.println("get_id");
        Flight instance = new Flight();
        int expResult = 0;
        int result = instance.get_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_arrival method, of class Flight.
     */
    public void testGet_arrival() {
        System.out.println("get_arrival");
        Flight instance = new Flight();
        Calendar expResult = null;
        Calendar result = instance.get_arrival();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_depature method, of class Flight.
     */
    public void testGet_depature() {
        System.out.println("get_depature");
        Flight instance = new Flight();
        Calendar expResult = null;
        Calendar result = instance.get_depature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_plane method, of class Flight.
     */
    public void testGet_plane_info() {
        System.out.println("get_plane");
        Flight instance = new Flight();
        int expResult = 0;
        int result = instance.get_plane().get_planeid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_tts method, of class Flight.
     */
    public void testGet_tts() {
        System.out.println("get_tts");
        Flight instance = new Flight();
        int expResult = 0;
        int result = instance.get_tts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_pilot method, of class Flight.
     */
    public void testGet_pilot() {
        System.out.println("get_pilot");
        Flight instance = new Flight();
        String expResult = "";
        String result = instance.get_pilot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_status method, of class Flight.
     */
    public void testGet_status() {
        System.out.println("get_status");
        Flight instance = new Flight();
        String expResult = "none";
        String result = instance.get_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set_status method, of class Flight.
     */
    public void testSet_status() {
        System.out.println("set_status");
        String status_ = "";
        Flight instance = new Flight();
        instance.set_status(status_);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
