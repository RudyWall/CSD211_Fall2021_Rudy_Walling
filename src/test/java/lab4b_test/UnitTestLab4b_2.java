/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4b_test;

import lab4b.Car;
import lab4b.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rudyw
 */
public class UnitTestLab4b_2 {

    public Car car1;
    public Car car2;
    public Car car3;
    public Car car4;

    
    private Car[] cars;
    private int currentIndex;

    public void makeCar(Car car) {

        cars[currentIndex] = car;
        currentIndex += 1;
    }

    public void deleteCar(int carnumber) {
        
        cars[carnumber] = null;
        currentIndex -= 1;
        for (int i = carnumber; i < cars.length; i++) {
            cars[i] = cars[i];
        }
    }
    @Before
    public void SetUp(){
        car1 = new Car("Dodge", "Charger", 1980, 1234);
        car2 = new Car("DMC", "Delorean", 1981, 5678);
        car3 = new Car("Ford", "Mustang", 2019, 1234);
        car4 = car1;
        cars = new Car[100];
        currentIndex = 0;
    }
    @After
    public void TearDown(){
        car1 = null;
        car2 = null;
        car3 = null;
        car4 = null;
        cars = null;                
    }
    @Test
    public void test_1(){
        for (int i=0;i<100;i++){
        assertNull("car lot is not empty", cars[i]); //testing that the lot is actually empty
        }
    }
    @Test
    public void test_2(){
        makeCar(car1);//making a car testing it shows in the lot
        assertEquals("Car did not successfully add to lot", car1, cars[0]); 
    }
    @Test
    public void test_3(){
        makeCar(car1);
        makeCar(car2);//testing that multiple cars show in the lot
        assertEquals("Multiple cars could not be added successfully", car2,cars[1]);
    }
    @Test
    public void test_4(){
        makeCar(car1);
        assertEquals("CurrentIndex for cars did not increase when a car was added", 1,currentIndex); // testing that currentIndex increases after adding a car
    }
    @Test
    public void test_5(){
        makeCar(car1);
        makeCar(car2);
        assertNotEquals("Cars are all the same",cars[0], cars[1]); // testing that two cars added are still different 
    }
    
    
    
    
    @Test
    public void test_6(){
        currentIndex = 1;
        deleteCar(0);
        for (int i=0;i<100;i++){ // testing that the lot is empty after deleting one car
        assertNull("currentIndex does not decrease when deleting a car", cars[i]);
        }
    }
    @Test
    public void test_7(){
        makeCar(car1);
        deleteCar(0);//testing that deleteCar() actually deletes a car
        assertNull("Car in array was not deleted", cars[0]);
    }
    @Test
    public void test_8(){
        makeCar(car1);
        makeCar(car2);
        makeCar(car3);
        deleteCar(2);
        for(int i=3;i<100;i++){
            assertNull("Not all cars[] after car3 are Null",cars[i]);//checking that all other spots are empty
        }
    }
    @Test
    public void test_9(){
        makeCar(car1);
        makeCar(car2);
        makeCar(car3);
        deleteCar(21);//deleting car2 between car1 and car3 to test if the spot gets filled with previous car
        assertNotNull("Upon deleting a car the empty spot between car1 and car3 did not move to the end of the cars[]", cars[1]);
    }
    @Test
    public void test_10(){
        makeCar(car1);
        makeCar(car2);
        makeCar(car3);
        deleteCar(0);
        deleteCar(1);
        deleteCar(2);//testing that multiple cars can be deleted successfully
        for (int i=0;i<100;i++){
        assertNull("Multiple cars could not be deleted successfully", cars[i]);
        }
    }
    
    
    
    
}
