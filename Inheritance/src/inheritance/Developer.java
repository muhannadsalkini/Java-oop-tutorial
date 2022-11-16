/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author mohan
 */
public class Developer extends Employee {
    String projectName;
    
    public Developer(){
        System.out.println("sub-class");
    }
    
    public Developer(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, String projectName){
        super(name, emailAddress, phone, department, address, yearOfBirth);
        this.projectName = projectName;
    }
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    
}
