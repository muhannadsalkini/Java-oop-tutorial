/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq2;

/**
 *
 * @author mohan
 */
public abstract class Ticket{
    public int number;
    int seatNumber;

    public Ticket(int number, int seatNumber) {
        this.number = number;
        this.seatNumber = seatNumber;
    }
    
    public void print(){
        
    }
    
    public double computePrice(){
        return 0;
        
    } 
}
