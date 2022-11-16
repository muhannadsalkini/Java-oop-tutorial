/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authorandbookclasses;

/**
 *
 * @author mohan
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    private static int books;
    
    public Book (String name, Author author, double price){
        this.name = name;
        this.author = author;
        setPrice(price);
        books++;
    }
    public Book (String name, Author author, double price, int qtyInStock){
        this(name, author, price);
        setQtyInStock(qtyInStock);
    }
    public int totoalBooks(){
        return books;
    }
    
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author " + author + ", price=" + price + ", qtyInStock=" + qtyInStock + '}';
    }
    
}
