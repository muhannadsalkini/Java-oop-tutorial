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
public class OuterClass {
    static int x=11;
    
    public static class InnerClas{
        public void Print(){
            System.out.println("x= "+ x);
        }
    }
    
    
}
