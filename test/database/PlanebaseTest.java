/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import junit.framework.TestCase;
import logic.Plane;

/**
 *
 * @author 802249
 */
public class PlanebaseTest extends TestCase {
    
    public PlanebaseTest(String testName) {
        super(testName);
    }

    /**
     * Test of add_plane method, of class Planebase.
     */
    public void testAdd_plane() throws Exception {
        System.out.println("add_plane");
        Connection conn = null;
        Plane pl = null;
        //Planebase.add_plane(conn, pl);
        
    }

    /**
     * Test of fill_planelist method, of class Planebase.
     */
    public void testFill_planelist() throws Exception {
        System.out.println("fill_planelist");
        Connection conn = null;
        //Planebase.fill_planelist(conn);
        
    }

    /**
     * Test of get_plane method, of class Planebase.
     */
    public void testGet_plane() throws Exception {
        System.out.println("get_plane");
        Connection conn = null;
        String model = "";
        Plane expResult = null;
        //Plane result = Planebase.get_plane(conn, model);
        //assertEquals(expResult, result);
       
    }

    /**
     * Test of get_plane_by_id method, of class Planebase.
     */
    public void testGet_plane_by_id() throws Exception {
        System.out.println("get_plane_by_id");
        Connection conn = null;
        int id = 0;
        Plane expResult = null;
        //Plane result = Planebase.get_plane_by_id(conn, id);
        //assertEquals(expResult, result);
       
    }

    /**
     * Test of clear_planes_table method, of class Planebase.
     */
    public void testClear_planes_table() throws Exception {
        System.out.println("clear_planes_table");
        Connection conn = null;
        //Planebase.clear_planes_table(conn);
        
    }
    
}
