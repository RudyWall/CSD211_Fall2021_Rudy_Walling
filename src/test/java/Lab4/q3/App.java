/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.q3;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author rudyw
 */
public class App {
    private final int numCars = 100;
    private Car[] cars = new Car[numCars];
    private Car[] sold = new Car[numCars];
    private int currentIndex = 0;
    private int soldCurrentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "1. Add Car\n"
            + "2. List Cars\n"
            + "3. Edit Car\n"
            + "4. Delete Car\n"
            + "5. Sell Car\n"
            + "6. Sold Cars\n"
            + "99. quit";
    private String soldCarsMenu = ""
            + "1. List Cars\n"
            + "99. quit";
    public void run(){
        for (int i=0;i < cars.length;i++){
            cars[i]=null;
        }
        for (int i=0;i < sold.length;i++){
            sold[i]=null;
        }
        boolean done = false;
        while(!done){
        System.out.println(menu);
        System.out.println("\nEnter option: ");
        String myinput = input.nextLine();
        switch(myinput){
            case "1":
                makeCar();
                break;
            case "2":
                listCar();
                break;
            case "3":
                editCar();
                break;
            case "4":
                deleteCar();
                break;
            case "5":
                sellCar();
                break;
            case "6":
                soldList();
                break;
            case "99":
                done=true;
                break;
            
            default: System.out.println("Thats not an option. \nPress ENTER to Continue.");
            input.nextLine();
            }
        }
    }
            
        
    public void makeCar(){
        System.out.println("Creating new car...\nEnter car make: ");
            String m= input.nextLine();
            System.out.println("Enter car model: ");
            String mo= input.nextLine();
            System.out.println("Enter car year: ");
            int y= Integer.parseInt(input.nextLine());
            System.out.println("Enter car owner First name: ");
            String fn= input.nextLine();
            System.out.println("Enter car owner last name: ");
            String ln= input.nextLine();
            System.out.println("Enter VIN");
            int v= Integer.parseInt(input.nextLine());
            Person p = new Person(fn, ln);
            System.out.println("creating car " + m + ", " + mo + ", " + y + " owned by " + fn + " VIN: " + v );
            cars[currentIndex]= new Car(m,mo,y,p,v);
            currentIndex+=1;
    }
    public void listCar(){
        System.out.println("List of all cars in lot:\n");
        for (int i = 0; i<cars.length;i++)
            if(cars[i] != null)
                System.out.println("Car number " + i + "\n" + cars[i]+ "\n");
            else
                break;
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }
    public void editCar(){
        System.out.println("Enter car number from Car List or input '00' to return to menu: ");
        int carnumber = Integer.parseInt(input.nextLine());
        if (carnumber == 00)
            return;
        else
            System.out.println("Re-enter car number " + carnumber);
            String m= input.nextLine();
            System.out.println("\n\nEnter car model: ");
            String mo= input.nextLine();
            System.out.println("Enter car year: ");
            int y= Integer.parseInt(input.nextLine());
            System.out.println("Enter car owner First name: ");
            String fn= input.nextLine();
            System.out.println("Enter car owner last name: ");
            String ln= input.nextLine();
            System.out.println("Enter VIN");
            int v= Integer.parseInt(input.nextLine());
            Person p = new Person(fn, ln);
            System.out.println("editing car to" + m + ", " + mo + ", " + y + " owned by " + fn + " VIN: " + v );
            cars[carnumber]= new Car(m,mo,y,p,v);
            }
    public void deleteCar(){
        System.out.println("Enter car number to delete: ");
        int carnumber = Integer.parseInt(input.nextLine());
        cars[carnumber]= null;
        currentIndex-=1;
        for (int i = carnumber+1; i < cars.length; i++){
            cars[i-1]=cars[i];
        }
        }
    public void sellCar(){
        System.out.println("Enter car number to sell: ");
        int carnumber = Integer.parseInt(input.nextLine());
        sold[soldCurrentIndex] = cars[carnumber];
        soldCurrentIndex+=1;
        cars[carnumber]= null;
        currentIndex-=1;
        for (int i = carnumber+1; i < cars.length; i++){
            cars[i-1]=cars[i];
    }
    }
    public void soldList(){
       System.out.println("List of all cars sold:\n");
        for (int i = 0; i<sold.length;i++)
            if(sold[i] != null)
                System.out.println("Car number " + i + "\n" + sold[i]+ "\n");
            else
                break;
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    } 
    }

        