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
public class Duck extends Animal implements Swimable, Flyable{
    @Override
    public void swim(){
        System.out.println("Suck swimming");
    }
    @Override
    public void fly(){
        System.out.println("Suck flying");
    }
    @Override
    public void move(){
        System.out.println("Suck moving");
    }
}
