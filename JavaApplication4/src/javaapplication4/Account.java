/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author mohan
 */
public class Account {
    
    private double balance;
    private String name;
    private int password;
    
    
    public Account(String name, double balance, int password){
        this.name = name;
        
        if (balance > 0.0)
            this.balance = balance;
        
        this.password = password;
    }

   
    public int pass(double correctPass){
        
        if(correctPass == password)
            return 1;
        else
            return 0;
    }
   
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            this.balance = this.balance + depositAmount;
    }
   
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}
