/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsextendimplement;

/**
 *
 * @author mohan
 */
public class Eagle extends Animal implements Flyable{
    
    public Eagle(String name){
        super(name);
    }
    
    @Override
    public void fly(){
        System.out.println("Eagle flying");
    }
}
