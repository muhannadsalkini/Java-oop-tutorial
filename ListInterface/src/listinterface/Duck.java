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
public class Duck extends Animal implements Moveabe, Flyable, Swimable{
    
    public Duck(String name, int age){
        super(name, age);
    }
    
    @Override
    public void swim(){
        System.out.println("Duck swiming");
    }
    
    @Override
    public void fly(){
        System.out.println("Duck flying");
    }
    
    @Override
    public void move(){
        System.out.println("Duck moving");
    }
}
