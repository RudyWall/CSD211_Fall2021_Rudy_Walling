/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST3_UNITTEST;

import TEST3.*;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rudyw
 */
public class UnitTests {
    public Course course1;
    public Course course2;
    public Course course3;
    
    @Before
    public void SetUp(){
        course1 = new Course("Java", "csd211", "September 21, 2021", 9, 10);
        course2 = new Course("Java", "csd211", "September 21, 2021", 9, 10);
        course3 = new Course("Mobile apps", "csd203", "September 19, 2021", 8, 11);
    }
    @After
    public void TearDown(){
        course1 = null;
        course2 = null;
        course3 = null;
    }
    @Test
    public void test_1(){
        
        assertEquals("Course doesn't match", course1, course2);
    }
    @Test
    public void test_2(){
        assertNotEquals("Courses are the same", course2, course3);
    }
}
