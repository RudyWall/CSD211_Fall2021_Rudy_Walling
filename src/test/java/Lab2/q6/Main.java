/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.q6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rudyw
 */
public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Radius: "));
                double length=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Length: "));
		double area = radius * radius * 3.141592659;
		double volume = area * length;
		System.out.println("The cylinder of radius " + radius + " and length of " + length + " has a volume of " + volume);
	}
}
