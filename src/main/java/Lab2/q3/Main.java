/**
 * Author: Rudy Walling
 * Date: October 4, 2021
 * Description: Reads a Fahrenheit degree value 
 * from the keyboard, converts it to Celsius and 
 * displays the result to the console.

 */
package Lab2.q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the tempurture in fahrenheit: ");         
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9.0;
        System.out.println(fahrenheit + " degrees fahrenheit = " + celsius + " degrees celsius"); 
    }
}
