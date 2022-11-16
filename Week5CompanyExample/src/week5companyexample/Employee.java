/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5companyexample;

/**
 *
 * @author mohan
 */
public class Employee{
    private int id;
    private String name;
        
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
