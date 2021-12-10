/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.q2;

import Lab5q2.*;
import Lab5.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rudyw
 */
public class App {

    
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
    
    
    private static String USERNAME = "root";
    private static String IP = "localhost";
    private static String PASSWORD = "password1234";
    private static String dbNameArg = "csd211_Rudy_Walling_lab6";
    private static Connection con = null;
    private static String table = "car";
    
    
    public void run() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        
        
        
        try {
            // get connection.  This connection may or may not be connected to a database
            // Depends on if one exists or not
            // If it doesn't exist we get a connection with which we can create a database.
            try {
                con = getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(0);
            }

            // create the database if it doesn't exist
            Statement s = con.createStatement();
            String newDatabaseString = "CREATE DATABASE IF NOT EXISTS " + dbNameArg;
            // String newDatabaseString = "CREATE DATABASE " + dbName;
            try {
                s.executeUpdate(newDatabaseString);
                s.executeUpdate("use "+dbNameArg);
            } catch (Exception e) {
                System.out.println("Error Creating database " + e.getMessage());
                System.exit(0);
            }
            System.out.println("Created database " + dbNameArg);
            
            //dropTable(); deletes cars

            //createTable(); adds cars

            //viewTable(); views cars

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        boolean done = false;
        while (!done) {
            System.out.println(menu);
            System.out.println("\nEnter option: ");
            String myinput = input.nextLine();
            switch (myinput) {
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
                    done = true;
                    break;

                default:
                    System.out.println("Thats not an option. \nPress ENTER to Continue.");
                    input.nextLine();
            }

        }
        
    }

    public void makeCar() throws SQLException {
        System.out.println("Creating new car...\nEnter car make: ");
        String m = input.nextLine();
        System.out.println("Enter car model: ");
        String mo = input.nextLine();
        System.out.println("Enter ID");
        String carId = input.nextLine();
        System.out.println("creating car id number " + carId + ": " + m + ", " + mo);
        Statement stmt = null;
        String query = "insert into " + table +"(id, make, model, sold) " + "Values("       
                + carId + ", '" + m + "', '" + mo + "', " + 0 + ")";
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        }finally{
            stmt.close();
        }
        
    }
    public void listCar() throws SQLException {
        Statement stmt = null;
        String query = "SELECT * FROM " + dbNameArg + "." + table + " WHERE " + table + ".sold = 0;";
        try{
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("List of all cars in lot:\n");
            while(rs.next()){
                int carId = rs.getInt("id");
                String carMake = rs.getString("make");
                String carModel = rs.getString("model");
                System.out.println("Car id number " + carId + ": " + carMake + " " + carModel + "\n");
            }
        }finally {
            stmt.close();
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }

    public void editCar() throws SQLException {
        System.out.println("Enter car id number from Car List or input '99' to return to menu: ");
        int carnumber = Integer.parseInt(input.nextLine());
        if (carnumber == 99) {
            return;
        } else {
            System.out.println("Enter car make: " );
        }
        String m = input.nextLine();
        System.out.println("Enter car model: ");
        String mo = input.nextLine();
        System.out.println("car id number " + carnumber + " is now: " + m + ", " + mo);
        Statement stmt = null;
        String query = "Update " + table + " SET make='" + m + "', model='"+ mo +"' WHERE id=" + carnumber;
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        }finally{
            stmt.close();
        }
        
        
    }

    public void deleteCar() throws SQLException {
        Statement stmt = null;
        System.out.println("Enter car id number to delete: ");
        int carnumber = Integer.parseInt(input.nextLine());
        String query = "DELETE FROM " + table + " WHERE id =" + carnumber;
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        }finally{
            stmt.close();
        }
        
        

    }
    
    public void sellCar() throws SQLException {
        System.out.println("Enter car id number to sell: ");
        int carnumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter car owner first name: ");
        String fn = input.nextLine();
        System.out.println("Enter car owner last name: ");
        String ln = input.nextLine();
        Statement stmt = null;
        String query = "Update " + table + " SET sold=1, firstname='" + fn + "', lastname='" + ln + "' WHERE id =" + carnumber;
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        }finally{
            stmt.close();
        }

    }

    public void soldList() throws SQLException {
        Statement stmt = null;
        String query = "SELECT * FROM " + dbNameArg + "." + table + " WHERE " + table + ".sold = 1;";
        try{
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("List of all cars soldt:\n");
            while(rs.next()){
                int carId = rs.getInt("id");
                String carMake = rs.getString("make");
                String carModel = rs.getString("model");
                String carownerf = rs.getString("firstname");
                String carownerl = rs.getString("lastname");
                System.out.println("Car number " + carId + ": " + carMake + " " + carModel + "\n Owner: "+ carownerf + " " + carownerl);
            }
        }finally {
            stmt.close();
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }
    
    
    
    
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", USERNAME);
        connectionProps.put("password", PASSWORD);

        try {
            conn = DriverManager.getConnection(""
                    + "jdbc:mysql://" + // protocol for mysql
                    "" + IP + // ip of database server
                    ":3306" + // mysql port number
                    "/" + dbNameArg
                    + "", connectionProps);
        } catch (SQLException e) {
            if (e.getMessage().contains("Unknown database")) {
                conn = DriverManager.getConnection(""
                        + "jdbc:mysql://" + // protocol for mysql
                        "" + IP + // ip of database server
                        ":3306" + // mysql port number
                        //                        "/" + dbNameArg +// we could specify an  existing database here but we dont need to because our app creates a database
                        "", connectionProps);
            } else {
                System.out.println("ERROR-------------------------------------------------");
                System.out.println(e.getMessage());
                System.out.println("------------------------------------------------------");
                System.exit(0);
            }
        }
        System.out.println("Connected to database");
        return conn;
    }
}
