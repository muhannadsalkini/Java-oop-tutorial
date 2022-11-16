/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author mohan
 */
public class SalariedEmployee extends Employee{ //is-a relationship SalariedEmployee is-a Employee
    float bouns;

    public SalariedEmployee(float bouns, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }
    
     public SalariedEmployee() {
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
    
    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    }
    
    @Override
    public void print(){
        System.out.println("Salaried Employee");
    }
    
}
