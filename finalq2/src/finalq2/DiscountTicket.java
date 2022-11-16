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
public class DiscountTicket extends StandardTicket{
    double discount;
    
    public DiscountTicket(int number, int seatNumber, double discount) {
        super(number, seatNumber);
        this.discount = discount;
    }
    
    @Override
    public void print(){
        System.out.println(seatNumber+" "+price+" "+number+" "+discount);
    }
    
    @Override
    public double computePrice(){
        return 10 - 10*discount;
        
    }
}
