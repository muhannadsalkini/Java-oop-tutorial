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
public class QuizBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book b1 = new Book("book1",123,"Aouthor1",100);
        Book b2 = new Book("book2",456,"Aouthor2",200);
        
        Book[] books = {b1, b2};
        Library l1 = new Library(books,"Istanbul");
        l1.booksInfo();
        l1.TotalBooks();
    }
    
}
