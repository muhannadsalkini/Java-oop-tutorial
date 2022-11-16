/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author mohan
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);
        
        System.out.println(circle1.ComputeArea());
        System.out.println(circle2.ComputeArea());
        System.out.println(circle3.ComputeArea());
        
        
    }
    
}
