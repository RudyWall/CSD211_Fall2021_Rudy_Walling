/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.q1;

/**
 *
 * @author rudyw
 */
public class App {

    public void run() {
        //Question 1
        System.out.println("\n\n\nQUESTION 1 RESULTS:\n");
        // Joe Student is 23 years old and male.
        Person p1 = new Person("Joe", "Student", 23, 'M');
//Person p1=new Person("George", "Student", 24, 188.2, 60.0, 'M');

// George Student is a 24 year old male, is 182.88 cm tall and weighs 60kg.
        Person p2 = new Person("George", "Student", 24, 188.2, 60.0, 'M');

// Mary Teacher is female, 43 years old, is 170.00 cm tall and weighs 48.2 kg.
        Person p3 = new Person("Mary", "Teacher", 43, 170, 48.2, 'F');
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        if (p1.equals(p2)) {
            System.out.println("p1 matches p2");
        } else {
            System.out.println("p1 doesn't match p2");
        }

// Question 2
        System.out.println("\n\n\nQUESTION 2 RESULTS:\n");
        Person shane = new Person("Shane", "Mollari");
        //Car ford=new Car("Ford", "Mustang", 2012);
        Car ford = new Car("Ford", "Focus", 2013, 1234);
        Car chev = new Car("Chevrolet", "Camaro", 2012, shane);
        Car ford2 = new Car("Ford", "Focus", 2013, 1234);
        System.out.println(ford);
        System.out.println(chev);
        System.out.println(ford2);
        if (ford.equals(ford2)) {
            System.out.println("The two cars match");
        } else {
            System.out.println("The two cars don't match");
        }

//Where 1234 == the VIN of the car
    }
}
