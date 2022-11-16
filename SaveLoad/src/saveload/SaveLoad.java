/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveload;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mohan
 */
public class SaveLoad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Worker w1 = new Worker("can",45,90);
        Worker w2 = new Worker("sinan",55,60);
        Worker w3 = new Worker("halim",40,70);
        Worker w4 = new Worker("Ahmet",46,71);
        
        ArrayList<Worker> List = new ArrayList<Worker>();
        List.add(w1);
        List.add(w2);
        List.add(w3);
        List.add(w4);
        
        try{
            SaveLoadManeger.saveToFile(List, "myworkerw1.txt");
            ArrayList<Worker> w = SaveLoadManeger.loadFromFile("myworkerw1.txt");
            System.out.println(w);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
