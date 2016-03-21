/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.sql.Connection;
import junit.framework.TestCase;
import logic.Flight;

/**
 *
 * @author 802249
 */
public class FlightServiceTest extends TestCase {
    
    public FlightServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of add_flight method, of class FlightService.
     */
    public void testAdd_flight() {
        System.out.println("add_flight");
        Connection conn = null;
        Flight fl = null;
        FlightService instance = new FlightService();
//        instance.add_flight(conn, fl);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of get_new_flight_id method, of class FlightService.
     */
    public void testGet_new_flight_id() {
        System.out.println("get_new_flight_id");
        Connection conn = null;
        FlightService instance = new FlightService();
        int expResult = 0;
//        int result = instance.get_new_flight_id(conn);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of set_flight_id method, of class FlightService.
     */
    public void testSet_flight_id() {
        System.out.println("set_flight_id");
        Flight fl = null;
        int i = 0;
        FlightService instance = new FlightService();
        Flight expResult = null;
//        Flight result = instance.set_flight_id(fl, i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
