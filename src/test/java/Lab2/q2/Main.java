/**
 * Author: Rudy Walling
 * Date: October 4, 2021
 * Description: Reads a Fahrenheit degree value 
 * from the keyboard, converts it to Celcius and 
 * displays the result to the console.

 */
package Lab2.q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the tempurture in Celsius: ");         
        double celsius = input.nextDouble();
        double fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit"); 
    }
}

