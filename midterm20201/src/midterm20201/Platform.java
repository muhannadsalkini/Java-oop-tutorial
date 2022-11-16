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
public class Platform {
    private String name;
    public EncapsulatedUser[] users;
    
    public Platform(String name, EncapsulatedUser[] users){
        this.name = name;
        this.users = users;
    }
    
    void PrintUsers(){
        System.out.println("Users Informations");
        for(EncapsulatedUser a: users)
            System.out.println(a);
    }
}
