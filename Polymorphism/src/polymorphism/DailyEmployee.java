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
public class DailyEmployee extends Employee{ //is-a relationship DailyEmployee is-a Employee
    private float workDayPrice;
    private int dailyRate;

    public DailyEmployee(float workDayPrice, int dailyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }
    
    public DailyEmployee() {
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    
    @Override
    public float getSalary() {
        return workDayPrice*dailyRate;  //ctrl+space
    }
    
    @Override
    public void print(){
        System.out.println("Daily Employee");
    }
}
