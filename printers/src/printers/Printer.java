/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printers;

/**
 *
 * @author mohan
 */
public abstract class Printer implements Printable{
    
    @Override
    public void print(){
        System.out.println("Printing..");
    }
}
