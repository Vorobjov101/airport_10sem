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
public class DispetcherTest extends TestCase {
    
    public DispetcherTest(String testName) {
        super(testName);
    }

    /**
     * Test of create_timetable method, of class Dispetcher.
     */
    public void testCreate_timetable() {
        System.out.println("create_timetable");
        Dispetcher instance = new Dispetcher();
        instance.create_timetable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of arrive_plane method, of class Dispetcher.
     */
    public void testArrive_plane() {
        System.out.println("arrive_plane");
        Plane pl = new Plane(1,"qwerty",100);
        
        String place1 = "T1";
        String pilot1 = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        Flight fl = new Flight( 1 , arr, dep, pl, 3, pilot1);
        
        Dispetcher instance = new Dispetcher();
        instance.arrive_plane(fl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of check_planes method, of class Dispetcher.
     */
    public void testCheck_planes() {
        System.out.println("check_planes");
        Dispetcher instance = new Dispetcher();
        instance.check_planes();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move_refueller method, of class Dispetcher.
     */
    public void testMove_refueller() {
        System.out.println("move_refueller");
        Dispetcher instance = new Dispetcher();
        //instance.move_refueller();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
