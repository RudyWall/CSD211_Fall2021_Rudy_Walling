/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4b_test;

import lab4b.Car;
import lab4b.App;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rudyw
 */
public class UnitTestLab4b {

    Car car1 = new Car("Ford", "Mustang", 2019, 1234);
    Car car2 = new Car("Ford", "Mustang", 2019, 12345);
    Car car3 = new Car("Ford", "Mustang", 2019, 1234);
    Car car4 = car1;

    @Test
    public void test_1() {
        assertEquals("Car1 doesn't equal car4", false, car1 == car4);
    }

    @Test
    public void test_2() {
        assertEquals("Car1 does equal car2", true, car1 != car2);
    }

    @Test
    public void test_3() {
        assertEquals("car1 doesn't equal car3", false, car1 == car3);
    }

    @Test
    public void test_4() {
        assertEquals("car1 doesn't equals car3", true, car1.equals(car3));
    }
}
