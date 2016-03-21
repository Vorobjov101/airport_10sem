/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.io.InputStreamReader;
import java.sql.Connection;
import junit.framework.TestCase;
import logic.Flight;

/**
 *
 * @author 802249
 */
public class DispetcherServiceTest extends TestCase {
    
    public DispetcherServiceTest(String testName) {
        super(testName);
    }

    /**
     * Test of make_connection method, of class DispetcherService.
     */
    public void testMake_connection() {
        System.out.println("make_connection");
        DispetcherService instance = new DispetcherService();
        Connection expResult = null;
//        Connection result = instance.make_connection();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of connect_to_file method, of class DispetcherService.
     */
    public void testConnect_to_file() {
        System.out.println("connect_to_file");
        DispetcherService instance = new DispetcherService();
        InputStreamReader expResult = null;
//        InputStreamReader result = instance.connect_to_file();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of get_next_fl method, of class DispetcherService.
     */
    public void testGet_next_fl() {
        System.out.println("get_next_fl");
        InputStreamReader input = null;
        DispetcherService instance = new DispetcherService();
        Flight expResult = null;
//        Flight result = instance.get_next_fl(input);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
