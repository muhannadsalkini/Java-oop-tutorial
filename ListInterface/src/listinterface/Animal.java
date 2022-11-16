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
public abstract class Animal {
    public String name;
    public int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void move(){
        System.out.println("Animal Moving");
    }
}
