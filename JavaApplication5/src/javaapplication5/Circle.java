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
public class Circle {
    private double radius;
    private String color;
    
    
    public void setRadius(double radius){
        this.radius = radius; 
    }
    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return Math.PI * radius *radius;
    }
    
    public double getCircumference(){
        return Math.PI *2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
    
}
