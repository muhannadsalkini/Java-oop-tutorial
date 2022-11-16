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
public class StandardTicket extends Ticket{
    double price= 10;

    public StandardTicket(int number, int seatNumber) {
        super(number, seatNumber);
    }
    
    @Override
    public void print(){
        System.out.println(seatNumber+" "+price+" "+number);
    }
    
    @Override
    public double computePrice(){
        return price;
        
    }

}
