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
public class Author {
    private String name;
    private String email;
    private char gender;
    double m;
    double n = 3.5;
    
    public Author(String name, String email, char gender){
        this.name=name;
        setEmail(email);
        this.gender=gender;
    }
    public Author(double m){
        this.m = m;
    }
    double ariea(){
        return m*n;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "Name: " + name+", "+"Gender: " +gender +", "+ "Email: "+email;
    }
}
