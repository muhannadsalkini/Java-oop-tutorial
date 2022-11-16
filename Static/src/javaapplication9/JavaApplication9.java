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
public class JavaApplication9 {
    static int x=10;
    int noneStaticx = 5;
    
    static{
            x=5;
            System.out.println("static block");
    }
    
        static{
            x=15;
            System.out.println("static block 2");
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(noneStaticx);  ->> cant use none static element in static class
        System.out.println("x= "+x);
        
        Student student1 = new Student("Ali","123");
        Student student2 = new Student("Ammar","253");
        
        System.out.println(student1);
        System.out.println(student2);
        
        OuterClass.InnerClas obj = new OuterClass.InnerClas();
        obj.Print();
    }
    
}
