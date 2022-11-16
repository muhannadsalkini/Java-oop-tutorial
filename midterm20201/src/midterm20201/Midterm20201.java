/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm20201;

/**
 *
 * @author mohan
 */
public class Midterm20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapsulatedUser a1 = new EncapsulatedUser("Name1","pass1");
        EncapsulatedUser a2 = new EncapsulatedUser("Name2","pass2");
        EncapsulatedUser a3 = new EncapsulatedUser("Name3","pass3","Newyork");
        EncapsulatedUser a4 = new EncapsulatedUser("Name4","pass4","Istanbul");
        
        a1.setName();
        a1.setPassword();
        EncapsulatedUser[] users = {a1, a2, a3, a4};
        
        Platform p1 = new Platform("p1",users);
        p1.PrintUsers();
    }
    
}
