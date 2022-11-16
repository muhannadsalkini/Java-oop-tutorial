/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizbook;

/**
 *
 * @author mohan
 */
public class Library {
    private String location;
    private Book[] books;
    private int totalBooks = 0;
    
    public Library (Book[] books, String location){
        this.books = books;
        this.location = location;
    }
    
    public void booksInfo(){
        System.out.println("BOOKS");
        for (Book a:books)
            System.out.println(a);
    }
    
    public void TotalBooks(){
        for (Book a:books)
            this.totalBooks++;
        System.out.println("Number of books: "+this.totalBooks);
    }
}
