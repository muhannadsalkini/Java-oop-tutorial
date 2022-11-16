/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq5;

/**
 *
 * @author mohan
 */
public class Book implements Comparable<Book>{
    String name;
    double price;
    
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public double totalPrice(){
        return price + 0.08*price;
    }

    @Override
    public int compareTo(Book b) {
        if(this.totalPrice() > b.totalPrice()) return 1;
        else if(this.totalPrice() == b.totalPrice()) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "name: " + name + ",  price: " + this.totalPrice();
    }
    
    
}
