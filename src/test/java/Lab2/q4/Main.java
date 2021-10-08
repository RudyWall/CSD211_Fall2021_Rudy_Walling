/**
 * Author: Rudy Walling
 * Date: October 4, 2021
 * Description: Computes the volume
 * of a cylinder inputted by the users
 * radius and length.
 */
package Lab2.q4;

import java.util.Scanner;
/**
 *
 * @author rudyw
 */
public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder: ");
		double radius = input.nextDouble();
                System.out.println("Now Enter the length of the cylinder");
		double length = input.nextDouble();
		double area = radius * radius * 3.141592659;
		double volume = area * length;
		System.out.println("The cylinder of radius " + radius + " and length of " + length + " has a volume of " + volume);
	}
}
