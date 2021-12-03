/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5q2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author rudyw
 */
public class SaveCars {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Car> cars = new ArrayList<Car>();
        File file = new File("saveFile.txt");
        cars.add(new Car("Dodge", "Charger", 1980, 1234));
        cars.add(new Car("DMC", "Delorean", 1981, 5678));
        cars.add(new Car("Ford", "Mustang", 2019, 1234));
        
        
        FileOutputStream oFile = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(oFile);

        for (Car car : cars) {
            output.writeObject(cars);
        }
        output.close();
        oFile.close();

        
        
        
        FileInputStream iFile = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(iFile);
        ArrayList<Car> cars2 = new ArrayList<Car>();
        try {
            while (true) {
                cars2 = (ArrayList<Car>)input.readObject();
            }
        } catch (EOFException ex) {
        }
        System.out.println("Data to be added to file: ");
        for (Car c: cars){
            System.out.println(c);
        }
        System.out.println("-----------------------------------");
        System.out.println("File with data inputted: ");
        for (Car c: cars2){
            System.out.println(c);
        }
    }
}
