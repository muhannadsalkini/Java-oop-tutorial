/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mohan
 */
public class Compareing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Worker w1 = new Worker("can",45,90);
        Worker w2 = new Worker("sinan",55,60);
        
        System.out.println(w1==w2);
        boolean res = w1.equals(w2);
        System.out.println(w1.equals(w2));
        System.out.println(w1.compareTo(w2));
        System.out.println("-----------");
        
        Worker w3 = new Worker("halim",40,70);
        Worker w4 = new Worker("Ahmet",46,71);
        
        List<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        
        for (Worker w: list){
            System.out.println(w);
        }
        
        System.out.println("-----------");
        Collections.sort(list);
        for (Worker w: list){
            System.out.println(w);
        }
        
        
        Comparator nameComp = new NameComparator();
        Comparator ageComp = new AgeComparator();
        Comparator weightComp = new WieghtComparator();
        
        System.out.println("-----Name-----");
        Collections.sort(list, nameComp);
        for (Worker w: list){
            System.out.println(w);
        }
        
        System.out.println("-----Age-----");
        Collections.sort(list, ageComp);
        for (Worker w: list){
            System.out.println(w);
        }
        
        System.out.println("-----Wieght-----");
        Collections.sort(list, weightComp);
        for (Worker w: list){
            System.out.println(w);
        }
    }
    
}
