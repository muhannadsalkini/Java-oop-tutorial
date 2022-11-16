/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author mohan
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        B b = new D();  // new ile interface olusturulmaz. interface soyuttur
        b.b();
        ((D)b).c();
    }
    
}
