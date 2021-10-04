/**
 * Author: Rudy Walling
 * Date: October 4, 2021
 * Description: First the program declares and 
 * initialize the  9 primitive variables, print 
 * them, and then in the second part, prompts 
 * the user for new values and then print them 
 * to the console
 */


package Lab2.q1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rudyw
 */
public class Main {
    public static void main(String args[]){
        //declaring the 9 primitive data types
        float a= 3.14159265f;
        char b= 'A';
        int c = 7;
        boolean d = false;
        byte e = 100;
        short f= 10000; 
        long g = 186000;
        double h = 19.7;
        String i = "Fred is epic";
        
        System.out.println("float variable is " + a 
                + ", char variable is "  + b + ", \nstring variable is " + b +
                ", int variable is: " + c + ", \nboolean variable is " + d + 
                ", byte variable is " + e + ", \nshort variable is " + f +
                ", long variable is " + g + ", \ndouble variable is " + h +
                " and string variable is "+ i);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a new float: ");
        a=input.nextFloat();
        System.out.println("Enter a new character: ");
        b =input.next().charAt(0);
        System.out.println("Enter a new integer: ");
        c=input.nextInt();             
        System.out.println("Enter a new boolean: ");
        d=input.nextBoolean();
        System.out.println("Enter a new byte: ");
        e=input.nextByte();
        System.out.println("Enter a new short: ");
        f=input.nextShort();
        System.out.println("Enter a new long ");
        g=input.nextLong();
        System.out.println("Enter a new double");
        h=input.nextDouble();
        System.out.println("Enter a new string");
        i=input.next();
        System.out.println("float variable is " + a 
                + ", char variable is "  + b + ", \nstring variable is " + b +
                ", int variable is: " + c + ", \nboolean variable is " + d + 
                ", byte variable is " + e + ", \nshort variable is " + f +
                ", long variable is " + g + ", \ndouble variable is " + h +
                " and string variable is "+ i);
        
        
        
        
    }
}
