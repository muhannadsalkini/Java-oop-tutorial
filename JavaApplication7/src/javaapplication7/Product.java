/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author mohan
 */
public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    
    public Product(){
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }
    
    public Product(String n, String d, float p, int q, float dis){
        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = q;
        this.discount = dis;
    }
    
    public void display(){
        System.out.println("Name = "+ name);
        System.out.println("description = "+ description);
        System.out.println("price = "+ price);
        System.out.println("quantity = "+ quantity);
        System.out.println("discount = "+ discount);
    }
    
}
