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
public class PlaneTest extends TestCase {
    
    public PlaneTest(String testName) {
        super(testName);
    }

    /**
     * Test of get_planeid method, of class Plane.
     */
    public void testGet_planeid() {
        System.out.println("get_planeid");
        Plane instance = new Plane(1,"qwerty",100);
        int expResult = 1;
        int result = instance.get_planeid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_planemodel method, of class Plane.
     */
    public void testGet_planemodel() {
        System.out.println("get_planemodel");
        Plane instance = new Plane(1,"qwerty",100);
        String expResult = "qwerty";
        String result = instance.get_planemodel();
        assertEquals(expResult, result);
        instance = new Plane(2,"qwerty1",101);
        expResult = "qwerty1";
        result = instance.get_planemodel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_tanklvolume method, of class Plane.
     */
    public void testGet_tanklvolume() {
        System.out.println("get_tanklvolume");
        Plane instance = new Plane(1,"qwerty",100);
        int expResult = 100;
        int result = instance.get_tanklvolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
