/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm20201;

import java.util.Scanner;

/**
 *
 * @author mohan
 */
public class EncapsulatedUser {
    private String name;
    private String password;
    private String location;
    private static int TotalUsers =0;
    
    Scanner scan = new Scanner(System.in);
    
    public EncapsulatedUser(String name, String password){
        this.name = name;
        this.password=password;
        TotalUsers++;
    }
    
    public EncapsulatedUser(String name, String password, String location){
        this(name, password);
        setLocation(location);
    }

    public void setName() {
        String name;
        System.out.print("Enter Your Name: ");
        name = scan.nextLine();
        this.name = name;
        System.out.println("The name has saved!");
    }

    public void setPassword() {
        System.out.print("Enter The currrent password: ");
        String pass = scan.nextLine();
        
        if (pass.equals(this.password)){
            System.out.print("Enter The new password: ");
            pass = scan.nextLine();
            this.password=pass;
            System.out.println("Password has saved!");
            return;
        }
        else{
            int i=10;
            while (pass != this.password && i>0){
            System.out.print("Wrong password! you can try " +i+ " Times more. Try agen: ");
            pass = scan.nextLine();
        
            if (pass.equals(this.password)){
                System.out.print("Enter The new password: ");
                pass = scan.nextLine();
                this.password=pass;
                System.out.println("Password has saved!");
                return;
            }
            i--;
            } 
        }
    }

    public static int getTotalUsers() {
        return TotalUsers;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", password=" + password + ", location=" + location ;
    }
    
    
    
    
}
