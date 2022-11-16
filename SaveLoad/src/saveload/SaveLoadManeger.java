/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveload;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mohan
 */
public class SaveLoadManeger {
    
    // save
    public static void saveToFile(ArrayList<Worker> w, String fileName) throws Exception
    {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(w);
        objectOut.close();
        
    }
    
    
    //load
    public static ArrayList<Worker> loadFromFile(String fileName) throws Exception{
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        ArrayList<Worker> w = (ArrayList<Worker>)objectIn.readObject();
        objectIn.close();
        return w;
    }
}
