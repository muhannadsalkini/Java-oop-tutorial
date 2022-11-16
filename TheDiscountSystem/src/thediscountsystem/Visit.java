/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thediscountsystem;

/**
 *
 * @author mohan
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date){
        
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    
    public double getTotalExpense(){
        
    }

    @Override
    public String toString() {
        return "Visit{" + "customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + '}';
    }
    
    
}
