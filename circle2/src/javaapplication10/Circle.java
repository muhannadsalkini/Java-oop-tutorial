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
public class Circle {
    final static double pi = 3.1415;
    private double radius;
    
    Circle(double radius){
        this.radius=radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double ComputeArea(){
        return radius*pi;
//        return System.out.println(radius*pi);
    }
    
}
