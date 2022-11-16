/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq1;

/**
 *
 * @author mohan
 */
public class Fish extends Animal implements Swimable{
    
    @Override
    public void swim(){
        System.out.println("Fish swimming");
    }
    
    @Override
    public void move(){
        System.out.println("Fish moving");
    }
}
