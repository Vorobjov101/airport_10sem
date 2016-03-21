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
public class TimetableTest extends TestCase {
    
    public TimetableTest(String testName) {
        super(testName);
    }

    /**
     * Test of get_next method, of class Timetable.
     */
    public void testGet_next1() {
        System.out.println("get_next1");
        Timetable instance = new Timetable();
        String new_ = "Place1";
        instance.add_new(new_);
        String expResult = "Place1";
        String result = instance.get_next();
        assertEquals(expResult, result);
    }

    /**
     * Test of add_new method, of class Timetable.
     */
    public void testAdd_new1() {
        System.out.println("add_new1");
        String new_ = "Place1";
        Timetable instance = new Timetable();
        instance.add_new(new_);
        String result = instance.get_next();
        assertEquals(new_, result);
    }
    public void testAdd_new2() {
        System.out.println("add_new2");
        String new_ = "Place1";
        Timetable instance = new Timetable();
        instance.add_new(new_);
        String new_1 = "Place2";
        instance.add_new(new_1);
        String res1 = instance.get_next();
        assertEquals(new_,res1);
    }
}
