/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mohan
 */
public class Finalq2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ticket t1 = new StandardTicket(10, 1);
        Ticket t2 = new DiscountTicket(22, 2, 0.1);
        Ticket t3 = new DiscountTicket(12, 3, 0.2);
        Ticket t4 = new StandardTicket(35, 4);
        
        List<Ticket> tickets= new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);
        
        Comparator seatNo = new SeatNumberComparator();
        Collections.sort(tickets, seatNo);
        
        TicketSeller ts = new TicketSeller(tickets);
        ts.Sell(t1);
        ts.Sell(t2);
        ts.Sell(t3);
        ts.Sell(t4);
        
        System.out.println(ts.getIncomes());
        
        
    }
}
