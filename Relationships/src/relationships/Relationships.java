/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationships;

/**
 *
 * @author mohan
 */
public class Relationships {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department dept1 = new Department(123, "IT");
        Department dept2 = new Department(123, "WASH");
        
        Employee emp1 = new Employee(1, 2500.0f, "ALi", "Ahmad", "Bilal", "0-", "11223344", "Turkey", 1995, dept1);
        Employee emp2 = new Employee(2, 2500.0f, "Ahmad", "ALi", "Bilal", "0+", "11223344", "Syria", 1993, dept2);
    }
    
}
