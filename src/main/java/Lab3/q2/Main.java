/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.q2;

import java.util.Scanner;

/**
 *
 * @author rudyw
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("How many accounts are being checked?: ");
        int total= new Scanner(System.in).nextInt();
        String[] Accounts=new String[total];
        int accountinputnumber = 1;
        for (int i = 0; i < total; i++){
            System.out.println("Input account number " + accountinputnumber + " to validate:");
            Accounts[i] = new Scanner(System.in).nextLine();
            accountinputnumber +=1;
        }        
        int[] Accountarray= new int[11];
        int sum = 0;
        int accountnumber = 0;
        while (accountnumber < total){
            
        String Account= Accounts[accountnumber];
            accountnumber += 1;
            
        for (int i = 0; i < 11; i++){
            
            Accountarray[i] = Account.charAt(i) - '0';
                }
        for (int i = 0; i<10; i++){
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
        sum =0;
        for (int i= 0; i < 10; i++){
            sum += Accountarray[i];
    }
        int digit = 10 - sum % 10;
        if(digit == Accountarray[Accountarray.length -1]){
            System.out.println(Account + " Is valid");
        }
        else{
            System.out.println(Account + " is invalid");
        }
        }
    }
}
