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
public class AuthorAndBookClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);   // call toString()
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
        
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        System.out.println(aBook);
    }
    
}
