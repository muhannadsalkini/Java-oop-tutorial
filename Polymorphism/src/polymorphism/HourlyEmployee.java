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
public class HourlyEmployee extends Employee{ //is-a relationship HourlyEmployee is-a Employee
    private float workOurPrice;
    private int hourlyRate;

    public HourlyEmployee(float workOurPrice, int hourlyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }
    
    public HourlyEmployee() {
    }

    public float getWorkOurPrice() {
        return workOurPrice;
    }

    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public float getSalary() {
        return workOurPrice*hourlyRate;  //ctrl+space
    }
    
    @Override
    public void print(){
        System.out.println("Hourly Employee");
    }
}
