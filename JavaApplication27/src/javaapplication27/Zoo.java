/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author mohan
 */
public class Zoo {
    public Animal[] animals;
    
    public Zoo(Animal[] animals){
        this.animals=animals;
    }
    
    void printAnimals(){
        for(Animal a:animals)
            System.out.println(a);
    }
}
