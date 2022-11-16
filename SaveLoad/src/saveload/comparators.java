/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveload;

import java.util.Comparator;

/**
 *
 * @author mohan
 */
class NameComparator implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.name.compareTo(w2.name);
    }
    
}

class AgeComparator implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.age - w2.age;
    }
    
}

class WieghtComparator implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.weight - w2.weight;
    }
    
}
