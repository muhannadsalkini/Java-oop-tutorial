/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm2019q2;

/**
 *
 * @author mohan
 */
public class Midterm2019q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            EncapsulatedStudent s1 = new EncapsulatedStudent(-5, 99);
            System.out.println(s1.getAverage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            EncapsulatedStudent s2 = new EncapsulatedStudent(5, 99);
            System.out.println(s2.getAverage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
