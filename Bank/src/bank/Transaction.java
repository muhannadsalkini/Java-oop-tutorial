/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author mohan
 */
public class Transaction {
    private User user;
    private double balance;
    private double dept;
    
    Scanner scan = new Scanner(System.in);
    
    public Transaction(User user){
        this.user = user;
    }
    private boolean acsesAccount(){
        System.out.print("Enter Your Password: ");
        String password = scan.nextLine();
        if (password.equals(user.getPassword()))
            return true;
        int i=3;
        while (password != user.getPassword() && i>0){
            System.out.print("wrong Password! You can try "+i+" More Times. Try agen:");
            password= scan.nextLine();
            if (password.equals(user.getPassword())){
                return true;
            }
            i--;
        }
        System.out.println("Wrong Password!");
        return false;
            
    }
    
    public void addBalance(){
        System.out.println(user.getName()+" Add balance");
        acsesAccount();
        if (acsesAccount() == true){
            System.out.println("Enter Amount You Want To Add: ");
            double balance = scan.nextDouble();
            if (balance>0.0)
                this.balance = this.balance + balance;
        }
    }
    
    public void getDebt(){
        System.out.println(user.getName()+" Get Dept");
        double dept = 0.0;
        if(user.getMembership().equals(Memberships.PREMIUM)){
            System.out.println("You can have a dept up to 10000.00$");
            System.out.print("Enter the amount you want to get:");
            dept = scan.nextDouble();
            if (dept<=10000.00){
                this.dept = dept;
                this.balance = this.balance + dept;
            }
            else
                System.out.println("Wrong amount");
        }
        else if(user.getMembership().equals(Memberships.GOLD)){
            System.out.println("You can have a dept up to 1000.00$");
            System.out.print("Enter the amount you want to get:");
            dept = scan.nextDouble();
            if (dept<=1000.00){
                this.dept = dept;
                this.balance = this.balance + dept;
            }
            else
                System.out.println("Wrong amount");
        }
        else if(user.getMembership().equals(Memberships.SILVER)){
            System.out.println("You can have a dept up to 100.00$");
            System.out.print("Enter the amount you want to get:");
            dept = scan.nextDouble();
            if (dept<=100.00){
                this.dept = dept;
                this.balance = this.balance + dept;
            }
            else
                System.out.println("Wrong amount");
        }
        else{
            System.out.println(user.getName()+" cannot have a dept");
        }
    }

    @Override
    public String toString() {
        return "Transaction{" + "user=" + user.getName() + ", balance=" + balance + ", dept=" + dept + '}';
    }
    
    
}


