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
public class ParkingTest extends TestCase {
    
    public ParkingTest(String testName) {
        super(testName);
    }

    /**
     * Test of add_to_terminal method, of class Parking.
     */
    public void testAdd_to_terminal() {
        System.out.println("add_to_terminal");
        String place = "TERMINAL1";
        String pilot = "qwerty";
        
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        
        Flight fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot);
        Parking instance = new Parking();
        instance.add_to_terminal(place, fl);
        
        String res = instance.get_flight("TERMINAL1").get_pilot();
        
        assertEquals(res,pilot);
        
    }

    /**
     * Test of add_to_parking method, of class Parking.
     */
    public void testAdd_to_parking() {
        System.out.println("add_to_parking");
        String place = "PARKING1";
        String pilot = "qwerty";
        
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        
        Flight fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot);
        Parking instance = new Parking();
        instance.add_to_parking(place, fl);
        
        String res = instance.get_flight("PARKING1").get_pilot();
        
        assertEquals(res,pilot);
    }

    /**
     * Test of remove_from_parking method, of class Parking.
     */
    public void testRemove_from_parking() {
        System.out.println("remove_from_parking");
        String place = "";
        Flight fl = null;
        Parking instance = new Parking();
        instance.remove_from_parking(place, fl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove_from_terminal method, of class Parking.
     */
    public void testRemove_from_terminal_String_Flight() {
        System.out.println("remove_from_terminal");
        String place = "";
        Flight fl = null;
        Parking instance = new Parking();
        instance.remove_from_terminal(place, fl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove_from_terminal method, of class Parking.
     */
    public void testRemove_from_terminal_Flight() {
        System.out.println("remove_from_terminal");
        Flight fl = null;
        Parking instance = new Parking();
        instance.remove_from_terminal(fl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of from_parking_to_terminal method, of class Parking.
     */
    public void testFrom_parking_to_terminal() {
        System.out.println("from_parking_to_terminal");
        String place = "";
        Flight fl = null;
        String new_place = "";
        Parking instance = new Parking();
        instance.from_parking_to_terminal(place, fl, new_place);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of next_terminal method, of class Parking.
     */
    public void testNext_terminal() {
        System.out.println("next_terminal");
        
        String place = "T1";
        String pilot = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        
        Flight fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot);
        Parking instance = new Parking();
        instance.add_to_terminal(place, fl);
        
        String expResult = "TERMINAL2";
        
        String result = instance.next_terminal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of next_parking method, of class Parking.
     */
    public void testNext_parking() {
        System.out.println("next_parking");
        
        String place = "P1";
        String pilot = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        
        Flight fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot);
        Parking instance = new Parking();
        instance.add_to_parking(place, fl);
        
        String expResult = "PARKING9";
        
        String result = instance.next_parking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search_next_to_dep method, of class Parking.
     */
    public void testSearch_next_to_dep() {
        System.out.println("search_next_to_dep");
        String place = "T1";
        String pilot = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        Flight fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot);
        Parking instance = new Parking();
        instance.add_to_terminal(place, fl);
        
        place = "T2";
        pilot = "qwerty";
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 16, 00);
        fl = new Flight( 2 , arr, dep, new Plane(), 3, pilot);
        instance.add_to_terminal(place, fl);
        
        
        int expResult = 1;
        
        int result = instance.search_next_to_dep().get_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tass_places method, of class Parking.
     */
    public void testTass_places() {
        System.out.println("tass_places");
        Parking instance = new Parking();
        instance.tass_places();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of find_flight method, of class Parking.
     */
    public void testFind_flight() {
        System.out.println("find_flight");
        Flight fl = null;
        Parking instance = new Parking();
        String expResult = "PARKING9";
        String result = instance.find_flight(fl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_flight method, of class Parking.
     */
    public void testGet_flight() {
        System.out.println("get_flight");
        String place = "";
        Parking instance = new Parking();
        Flight expResult = null;
        Flight result = instance.get_flight(place);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
    
}
