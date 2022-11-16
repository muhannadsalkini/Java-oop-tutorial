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
public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personallinfo; // relationship comosition aggregation
    private Department dept; // relationship comosition aggregation
    
    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept){
        this.id = id;
        this.salary = salary;
        personallinfo = new PersonalInformation(firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.dept = dept;
    }
    
    public Employee(int id, float salary){
        
    }
}
