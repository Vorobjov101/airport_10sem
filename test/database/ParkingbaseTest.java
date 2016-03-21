/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import junit.framework.TestCase;
import logic.Flight;
import logic.Parking;

/**
 *
 * @author 802249
 */
public class ParkingbaseTest extends TestCase {
    
    public ParkingbaseTest(String testName) {
        super(testName);
    }

    /**
     * Test of init_parking method, of class Parkingbase.
     */
    public void testInit_parking() throws Exception {
        System.out.println("init_parking");
        Connection conn = null;
        //Parkingbase.init_parking(conn);
        
    }

    /**
     * Test of read_all_parking method, of class Parkingbase.
     */
    public void testRead_all_parking() throws Exception {
        System.out.println("read_all_parking");
        Connection conn = null;
        Parking park = null;
        //Parkingbase.read_all_parking(conn, park);
        
    }

    /**
     * Test of add_on_parking method, of class Parkingbase.
     */
    public void testAdd_on_parking() throws Exception {
        System.out.println("add_on_parking");
        Connection conn = null;
        Flight fl = null;
        String place = "";
        //Parkingbase.add_on_parking(conn, fl, place);
        
    }

    /**
     * Test of fill_parkingbase method, of class Parkingbase.
     */
    public void testFill_parkingbase() throws Exception {
        System.out.println("fill_parkingbase");
        Connection conn = null;
        Parking park = null;
        //Parkingbase.fill_parkingbase(conn, park);
        
    }

    /**
     * Test of delete_from_parking method, of class Parkingbase.
     */
    public void testDelete_from_parking() throws Exception {
        System.out.println("delete_from_parking");
        Connection conn = null;
        String place = "";
        //Parkingbase.delete_from_parking(conn, place);
        
    }

    /**
     * Test of swap method, of class Parkingbase.
     */
    public void testSwap() throws Exception {
        System.out.println("swap");
        Connection conn = null;
        String place1 = "";
        String place2 = "";
        //Parkingbase.swap(conn, place1, place2);
        
    }
    
}
