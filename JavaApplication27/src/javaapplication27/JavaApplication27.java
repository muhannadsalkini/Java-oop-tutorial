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
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Animal("a1", AnimalTypes.BIRD);
        Animal a2 = new Animal("a2", AnimalTypes.FISH);
        Animal a3 = new Animal("a3", AnimalTypes.MAMMAL);
        Animal a4 = new Animal("a4", AnimalTypes.REPTILE);
        
        Animal[] animals = {a1,a2,a3,a4};
        Zoo z1 = new Zoo(animals);
        z1.printAnimals();
    }
    
}
