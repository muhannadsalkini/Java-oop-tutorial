/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author mohan
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User a1 = new User("Ahmet", "pass1", Memberships.PREMIUM);
        User a2 = new User("Ahmet", "pass2", Memberships.GOLD);
        User a3 = new User("Ahmet", "pass3", Memberships.SILVER);
        User a4 = new User("Ahmet", "pass4");
        
        
        User [] users ={a1,a2,a3,a4};
        Platform p = new Platform(users);
        p.printUsers();
        
        //a1.setPassword();
        
        Transaction a11 = new Transaction(a1);
        //a11.addBalance();
        a11.getDebt();
        System.out.println(a1.getMembership());
        System.out.println(a11.toString());
    }
    
}
