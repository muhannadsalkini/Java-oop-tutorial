/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq5;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mohan
 */
public class Finalq5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book b1 = new Book("yuzuklern efendisi", 50);
        Book b2 = new Book("Learn python", 30);
        Book b3 = new Book("How to be a programmer", 40);
        Book b4 = new Book("Harry poter", 35);
        
        List<Book> books = new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        
        Collections.sort(books);
        
        Iterator iter = books.iterator();
        
        while( iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
}
