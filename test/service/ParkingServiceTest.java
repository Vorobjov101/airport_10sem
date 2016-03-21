/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.sql.Connection;
import junit.framework.TestCase;
import logic.Flight;
import logic.Parking;

/**
 *
 * @author 802249
 */
public class ParkingServiceTest extends TestCase {
    
    public ParkingServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of read_all_parking method, of class ParkingService.
     */
    public void testRead_all_parking() {
        System.out.println("read_all_parking");
        Connection conn = null;
        Parking park = null;
//        ParkingService.read_all_parking(conn, park);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fill_parkingbase method, of class ParkingService.
     */
    public void testFill_parkingbase() {
        System.out.println("fill_parkingbase");
        Connection conn = null;
        Parking park = null;
//        ParkingService.fill_parkingbase(conn, park);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove_from_terminal method, of class ParkingService.
     */
    public void testRemove_from_terminal() {
        System.out.println("remove_from_terminal");
        Parking park = null;
        Flight fl = null;
//        ParkingService instance = new ParkingService();
//        instance.remove_from_terminal(park, fl);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of search_next_to_dep method, of class ParkingService.
     */
    public void testSearch_next_to_dep() {
        System.out.println("search_next_to_dep");
        Parking park = null;
        ParkingService instance = new ParkingService();
        Flight expResult = null;
//        Flight result = instance.search_next_to_dep(park);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of find_next_on_parking method, of class ParkingService.
     */
    public void testFind_next_on_parking() {
        System.out.println("find_next_on_parking");
        Parking park = null;
        ParkingService instance = new ParkingService();
        Flight expResult = null;
//        Flight result = instance.find_next_on_parking(park);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of nex_term method, of class ParkingService.
     */
    public void testNex_term() {
        System.out.println("nex_term");
        Parking park = null;
        ParkingService instance = new ParkingService();
        String expResult = "";
//        String result = instance.nex_term(park);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of from_park_to_term method, of class ParkingService.
     */
    public void testFrom_park_to_term() {
        System.out.println("from_park_to_term");
        Parking park = null;
        Flight fl = null;
//        ParkingService instance = new ParkingService();
//        instance.from_park_to_term(park, fl);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of find_empty method, of class ParkingService.
     */
    public void testFind_empty() {
        System.out.println("find_empty");
        Parking park = null;
        ParkingService instance = new ParkingService();
        String expResult = "";
//        String result = instance.find_empty(park);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add_flight method, of class ParkingService.
     */
    public void testAdd_flight() {
        System.out.println("add_flight");
        Parking park = null;
        String slot = "";
        Flight fl = null;
//        ParkingService instance = new ParkingService();
//        instance.add_flight(park, slot, fl);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
