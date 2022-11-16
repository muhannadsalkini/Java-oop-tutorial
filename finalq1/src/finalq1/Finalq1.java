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
public class Finalq1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Fish();
        Animal a2 = new Duck();
        
        a1.move();
        ((Swimable)a1).swim();
        ((Fish)a1).swim();
        
    }
    
}
