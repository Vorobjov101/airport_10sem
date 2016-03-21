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
public class TimetablebaseTest extends TestCase {
    
    public TimetablebaseTest(String testName) {
        super(testName);
    }

    /**
     * Test of init_timetable method, of class Timetablebase.
     */
    public void testInit_timetable_Connection() throws Exception {
        System.out.println("init_timetable");
        Connection conn = null;
        //Timetablebase.init_timetable(conn);
        
    }

    /**
     * Test of add_on_timetable method, of class Timetablebase.
     */
    public void testAdd_on_timetable() throws Exception {
        System.out.println("add_on_timetable");
        Connection conn = null;
        Flight fl = null;
        String place = "";
        //Timetablebase.add_on_timetable(conn, fl, place);
        
    }

    /**
     * Test of delete_from_timetable method, of class Timetablebase.
     */
    public void testDelete_from_timetable() throws Exception {
        System.out.println("delete_from_timetable");
        Connection conn = null;
        String place = "";
        //Timetablebase.delete_from_timetable(conn, place);
        
    }

    /**
     * Test of swap method, of class Timetablebase.
     */
    public void testSwap() throws Exception {
        System.out.println("swap");
        Connection conn = null;
        String place1 = "";
        String place2 = "";
        //Timetablebase.swap(conn, place1, place2);
        
    }

    /**
     * Test of init_timetable method, of class Timetablebase.
     */
    public void testInit_timetable_0args() {
        System.out.println("init_timetable");
        //Timetablebase.init_timetable();
        
    }
    
}
