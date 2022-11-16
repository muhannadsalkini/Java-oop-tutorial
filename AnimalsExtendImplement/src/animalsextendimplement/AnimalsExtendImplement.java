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
public class AnimalsExtendImplement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal duck = new Duck("duffy duck");
        Animal cat = new Cat("thomas");
        Animal eagle = new Eagle("black eagle");
        
        Animal[] animals = {duck, cat, eagle};
        
        for (Animal a:animals){
            if(a instanceof Flyable){
                ((Flyable)a).fly();
            }
        }
        
        
        
        
    }
    
}
