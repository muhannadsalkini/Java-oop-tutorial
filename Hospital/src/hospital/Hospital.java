/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author mohan
 */
public class Hospital {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Patient patient1 = new Patient("Ahmet");
        Patient patient2 = new Patient("Muhammet");
        Patient patient3 = new Patient("Isa");
        Patient patient4 = new Patient("Ibrahim");
        
        System.out.println(patient1.toString());
        System.out.println(patient2.toString());
        System.out.println(patient3.toString());
        System.out.println(patient4.toString());
    }
    
}
