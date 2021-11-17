/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.q1;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author rudyw
 */
public class MainQuestion1 {
    public static void main(String[] args) {
        System.out.println("Input account number from a 10 digit number: ");
        String Account=new Scanner(System.in).nextLine();
        int[] Accountarray= new int[Account.length()];
        int sum = 0;
        for (int i = 0; i < Account.length(); i++){
            Accountarray[i] = Account.charAt(i) - '0';
                }
        for (int i = 1; i<Account.length(); i++){
            if (i%2 == 1)
            {
            int num = Accountarray[i];
            num = num *2;
            if(num>9)
            {
                num = num%10 + num/10;
            }
            
            Accountarray[i]=num;
        }}
        for (int i= 0; i < Account.length(); i++){
            sum += Accountarray[i];
    }
        
        int Valid= 10 - sum % 10;
        System.out.println(Account + Valid);
        
    }
}
        
    

