/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author mohan
 */
public class ListInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Animal a1 = new Cat("minos", 5);
        Animal a2 = new Eagle("nohut", 5);
        Animal a3 = new Duck("ponkis", 8);
        
        Flyable e = (Flyable)new Eagle("Eagle", 5);
        e.fly();
        
        a2.move(); // move method comes from Animal class
        ((Eagle)a2).screch(); // screch method comming from Eagle class & need downcasting cus a2 is an Animal
        
        Collection<Animal> c = new ArrayList<>();  // Just can contains objects in type Animal. can write like "Array<Animal>" too 
        //tyipe-safety
        
        c.add(a1); // add a1 to c array
        c.add(a2); // add a2 to c array
        c.add(a3); // add a3 to c array
        
        System.out.println("-----Print flyable animals-----");
        for(Animal a: c){
            if (a instanceof Flyable){ // if obj a implements Flyable interface
                System.out.println(a);
            }
        }
        
        Iterator iter = c.iterator(); // creat an iterator for c Array
        
        System.out.println("-----print animals------");
        while(iter.hasNext()){
            System.out.println(iter.next());
//            iter.remove(); // remove array elemnts
        }
        
        System.out.println("-----print names-----");
        for (Animal a: c){
            System.out.println(a.name);
        }
        
//        c.remove(a2); // remove a2 from c Array
//        
//        for (Animal a: c){
//            System.out.println(a.name);
//        }
        
        
        List<Animal> animalList = new LinkedList<Animal>();
        
        Animal b1 = new Cat("Tom", 12);
        Animal b2 = new Duck("buffy", 34);
        Animal b3 = new Eagle("Black eagle", 50);
        
        animalList.add(b1);
        animalList.add(b2);
        animalList.add(b3);
        
        //System.out.println(animalList);
        
        ListIterator liter = animalList.listIterator(animalList.size());
        
//        while (liter.hasNext()){
//            System.out.println(liter.next());
//        }
        System.out.println("-----revarsly print-----");
        while (liter.hasPrevious()){ // print the Array revarsly
            System.out.println(liter.previous());
        }
        
        
    }
    
}
