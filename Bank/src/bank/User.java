/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

enum Memberships{PREMIUM, GOLD, SILVER;}

/**
 *
 * @author mohan
 */
public class User {
    private String name;
    private String password;
    private int id=0;
    private Memberships membership;
    private static int TotalUsers=0;
    
    Scanner scan = new Scanner(System.in);
    
    public User(String name, String password){
        this.name = name;
        this.password = password;
        setId();
        TotalUsers++;
    }
    
    public User(String name, String password, Memberships membership){
        this(name, password);
        this.membership=membership;
    }

    public void setName() {
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println("New Name Has Saved!");
    }

    public void setPassword() {
        System.out.print("Ender Yor Current Password: ");
        String password= scan.nextLine();
        if (password.equals(this.password)){
            System.out.print("Enter Your New Password: ");
            password= scan.nextLine();
            this.password=password;
            System.out.println("New password has saved!");
            return;
        }
        int i=3;
        while (password != this.password && i>0){
            System.out.print("wrong Password! You can try "+i+" More Times. Try agen:");
            password= scan.nextLine();
            if (password.equals(this.password)){
                System.out.print("Enter Your New Password: ");
                password= scan.nextLine();
                this.password=password;
                System.out.println("New password has saved!");
                return;
            }
            i--;
        }
    }
    
    public void setId() {
        this.id =  2021000 + this.TotalUsers;
    }

    public void setMembership(Memberships membership) {
        this.membership = membership;
    }
    
    public String getName(){
        return this.name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Memberships getMembership() {
        return membership;
    }
    
    public static int getTotalUsers() {
        return TotalUsers;
    }

    @Override
    public String toString() {
        return "name=" + name + ", password=" + password + ", id=" + id + ", membership=" + membership;
    }
    
    

}
