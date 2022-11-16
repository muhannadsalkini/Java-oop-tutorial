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
public class Week5CompanyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee(123, "name1");
        Company c1 = new Company(e1, CompanyName.AKINSOFT);
        
        System.out.println(c1.getCompanyName());
        System.out.println(c1.getEmployee());
    }
    
}
