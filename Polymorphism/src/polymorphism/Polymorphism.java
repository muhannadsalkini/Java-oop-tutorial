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
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    
    static void p(Employee x){
            x.print();
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee e1 = new Employee("Ahmad", "Istanbul", "IT", "A@gmail.com", 1000);
        SalariedEmployee e2 = new SalariedEmployee(20.0f, "Muhammad", "Istanbul", "IT", "M@gmail.com", 1200);
        DailyEmployee e3 = new DailyEmployee(20, 15, "Ali", "Irbid", "IT", "Af@gmail.com", 0);
        HourlyEmployee e4 = new HourlyEmployee(10, 60, "Malek", "Maras", "IT", "Mf@gmail.com", 0);
        
        System.out.println("e1 Salary = " + e1.getSalary()); //1000
        System.out.println("e2 Salary = " + e2.getSalary()); //1220
        System.out.println("e3 Salary = " + e3.getSalary()); //300
        System.out.println("e4 Salary = " + e4.getSalary()); //600
        
        e1 = new SalariedEmployee(20.0f, "Ahmad", "Istanbul", "IT", "A@gmail.com", 1000); // For overridied methods
        System.out.println("-------------");
        System.out.println("e1 Salary = " + e1.getSalary()); //1020
        // e1.getBouns(); // -> wrong
        // e2.getBouns(); // -> true
        
        // static method camnot override
        System.out.println("-------------");
        
        Employee e5 = new SalariedEmployee();
        e5.print();
        
        
        System.out.println("------Static-------");
        p(new Employee());
        p(new SalariedEmployee());
        
        System.out.println("------Array-------");
        Employee [] refArray = new Employee[]{new Employee(), new SalariedEmployee(), new DailyEmployee(), new HourlyEmployee()};
        for (Employee c : refArray){
            c.print();
        }
    }
    
}
