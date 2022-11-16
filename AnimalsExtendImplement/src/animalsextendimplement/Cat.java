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
public class Cat extends Animal implements Swimable{
    
    public Cat(String name){
        super(name);
    }
    
    @Override
    public void swim(){
        System.out.println("Cat swimming");
    }
}
