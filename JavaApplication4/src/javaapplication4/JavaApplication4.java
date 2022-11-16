/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author mohan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account account1 = new Account("Muhannad Salkini", 100.00, 1234);
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter your password: ");
        int correctPass = (int) input.nextDouble();
        account1.pass(correctPass);
        
        if (account1.pass(correctPass)==1){
            System.out.printf("%s balance: $%.2f%n" ,account1.getName() ,account1.getBalance());
        
            System.out.println("Enter depost anount for account1: ");
            double depositAmount = input.nextDouble();
            account1.deposit(depositAmount);
        
            System.out.printf("%s balance: $%.2f%n" ,account1.getName() ,account1.getBalance());
        }
         
        
    }
    
}
