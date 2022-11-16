/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogs;

/**
 *
 * @author mohan
 */
public class Bus {
    private int ogsNumber;
    private String ownerName;
    private String date;
    private int balance;
    private boolean ogs;

    public Bus(int ogsNumber, String ownerName, String date, int balance) {
        this.ogsNumber = ogsNumber;
        this.ownerName = ownerName;
        this.date = date;
        this.balance = balance;
        this.ogs=true;
    }

    public Bus(String ownerName, String date) {
        this.ownerName = ownerName;
        this.date = date;
        this.ogs=false;
    }

    public boolean isOgs() {
        return ogs;
    }

    public void fee(int balance) {
        this.balance = this.balance - balance;
    }
    
    @Override
    public String toString() {
        return "Bus{" + "ogsNumber=" + ogsNumber + ", ownerName=" + ownerName + ", date=" + date + ", balance=" + balance + '}';
    }
    
    

    
    
    
}
