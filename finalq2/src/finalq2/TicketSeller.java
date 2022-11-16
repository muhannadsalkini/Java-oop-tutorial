/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq2;

import java.util.List;

/**
 *
 * @author mohan
 */
public class TicketSeller {
    List<Ticket> tickets;
    double incomes;

    public TicketSeller(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    void Sell(Ticket ticket){
        incomes = incomes + ticket.computePrice();
        tickets.remove(ticket);
    }
    
    public double getIncomes(){
        return incomes;
    }
}
