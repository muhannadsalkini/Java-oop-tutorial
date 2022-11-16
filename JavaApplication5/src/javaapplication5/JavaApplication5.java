/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author mohan
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println("c1 aria = " + c1.getArea()); 
        
        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println("c2 Circumference = " + c2.getCircumference());
        
    }
}
