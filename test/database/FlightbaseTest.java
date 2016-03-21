/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import junit.framework.TestCase;
import logic.Flight;

/**
 *
 * @author 802249
 */
public class FlightbaseTest extends TestCase {
    
    public FlightbaseTest(String testName) {
        super(testName);
    }

    /**
     * Test of add_flight method, of class Flightbase.
     */
    public void testAdd_flight() throws Exception {
        System.out.println("add_flight");
        Connection conn = null;
        Flight fl = null;
        //Flightbase.add_flight(conn, fl);
        
    }

    /**
     * Test of get_flight method, of class Flightbase.
     */
    public void testGet_flight() throws Exception {
        System.out.println("get_flight");
        Connection conn = null;
        int id = 0;
        Flight expResult = null;
        //Flight result = Flightbase.get_flight(conn, id);
        //assertEquals(expResult, result);
       
    }

    /**
     * Test of remove_flight method, of class Flightbase.
     */
    public void testRemove_flight() throws Exception {
        System.out.println("remove_flight");
        Connection conn = null;
        int id = 0;
        //Flightbase.remove_flight(conn, id);
        
    }

    /**
     * Test of get_new_flight_id method, of class Flightbase.
     */
    public void testGet_new_flight_id() throws Exception {
        System.out.println("get_new_flight_id");
        Connection conn = null;
        int expResult = 0;
        //int result = Flightbase.get_new_flight_id(conn);
        //assertEquals(expResult, result);
        
    }
    
}
