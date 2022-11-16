/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingobjectstomethods;

/**
 *
 * @author mohan
 */
public class PassingObjectsToMethods {
    static void fun(Test n){
        n.number++;
    }
    
    static int add(int n1,int n2){
        int n3 = n1+n2;
        return n3;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test obj = new Test();
        obj.number = 1;
        fun(obj);
        System.out.println("Number = "+obj.number);
        int res = add(2,5);
        System.out.println("res = "+res);
        
       Math n1 = new Math(2); 
       Math n2 = new Math(5);
       
       Math n3 = Math.add(n1,n2); 
       
       System.out.println("n3 = "+n3.val);
       
        
    }
    
}
