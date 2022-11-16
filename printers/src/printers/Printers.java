/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printers;

/**
 *
 * @author mohan
 */
public class Printers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer p1 = new CanonOffice();
        p1.print();
        ((Fax)p1).fax();
    }
    
}
