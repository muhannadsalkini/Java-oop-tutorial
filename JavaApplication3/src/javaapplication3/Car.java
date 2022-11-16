package javaapplication3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohan
 */



public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;
    
    
    public void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    
    
    public void setModel(int m){
        if(m >= 2015)
            model = m;
        else
            System.out.println("Sorry, we dont accept that model");    
                    
    }     
    public int getModel(){
        return model;
    }        
}
