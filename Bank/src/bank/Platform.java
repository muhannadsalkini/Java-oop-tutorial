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
public class Platform {
    private User[] users;
    
    public Platform(User[] users){
        this.users=users;
        
    }
    
    public void printUsers(){
        System.out.println("USERS INFORMATIONS");
        for(User a:users)
            System.out.println(a);
    }
}
