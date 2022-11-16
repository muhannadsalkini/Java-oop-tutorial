/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalq2;

import java.util.Comparator;

/**
 *
 * @author mohan
 */
public class SeatNumberComparator implements Comparator<Ticket>{
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t1.seatNumber - t2.seatNumber;
    }
}
