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
public class Book {
    private String name;
    private int id;
    private String aoutorName;
    private int pages;
    
    public Book( String name, int id, String aoutorName, int pages){
        this.name = name;
        this.id = id;
        this.aoutorName = aoutorName;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "name=" + name + ", id=" + id + ", aoutorName=" + aoutorName + ", pages=" + pages;
    }
    
    
}
