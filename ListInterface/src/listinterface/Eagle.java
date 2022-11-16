/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinterface;

/**
 *
 * @author mohan
 */
public class Eagle extends Animal implements Flyable{
    
    public Eagle(String name, int age){
        super(name, age);
    }
    
    @Override
    public void fly(){
        System.out.println("Eagle flying");
    }
    
    public void screch(){
        System.out.println("Eagle screaching");
    }
}
