/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import junit.framework.TestCase;

/**
 *
 * @author 802249
 */
public class RefuellerTest extends TestCase {
    
    public RefuellerTest(String testName) {
        super(testName);
    }

    /**
     * Test of refresh method, of class Refueller.
     */
    public void testRefresh() {
        System.out.println("refresh");
        Refueller instance = new Refueller();
        instance.refresh();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_fuel_amount method, of class Refueller.
     */
    public void testGet_fuel_amount() {
        System.out.println("get_fuel_amount");
        Refueller instance = new Refueller();
        int expResult = 0;
        int result = instance.get_fuel_amount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
