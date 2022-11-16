/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm2019q1;

/**
 *
 * @author mohan
 */
public class Midterm2019q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal("animal1", AnimalTypes.BIRD);
        Animal a2 = new Animal("animal2", AnimalTypes.FISH);
        Animal a3 = new Animal("animal3", AnimalTypes.MAMMAL);
        Animal a4 = new Animal("animal4", AnimalTypes.REPTILE);
        
        Animal[] animals = {a1, a2, a3, a4};
        Zoo zoo = new Zoo(animals);
        zoo.printAnimals();
        
    }
    
}
