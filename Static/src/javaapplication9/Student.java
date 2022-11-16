/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author mohan
 */
public class Student {
    private int no;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count = 1;
    private static String college = "IT";
    
    Student(String name, String password){
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }
    
    public boolean logIn(int enteredNo, String enteredPassword){
        if (enteredNo == no && enteredPassword.equals(password)){
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }
    

    @Override
    public String toString() {
        return "Student{" + "no=" + no + ", count=" + count + ", name=" + name + '}';
    }
    
    
    
}
