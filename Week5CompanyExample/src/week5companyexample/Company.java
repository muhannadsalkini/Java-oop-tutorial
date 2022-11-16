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
enum CompanyName{
    APPLE, MICROSOFT, GOOGLE, IBM, AKINSOFT;
}

public class Company {
    private Employee employee;
    private CompanyName companyName;
    
    public Company(Employee employee, CompanyName companyName){
        this.employee = employee;
        this.companyName = companyName;
    }
    
    public Employee getEmployee(){
        return this.employee;
    }
    
    public CompanyName getCompanyName(){
        return this.companyName;
    }
}
