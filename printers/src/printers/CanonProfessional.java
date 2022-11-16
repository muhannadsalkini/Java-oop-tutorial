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
public class CanonProfessional extends Printer implements ColorPrintable, Fax, Scannable{
    @Override
    public void print(){
        System.out.println("Canon Professional print");
    }
    
    @Override
    public void colerPrint(){
        System.out.println("Canon Professional color print");
    }
    
    @Override
    public void fax(){
        System.out.println("Canon Professional fax");
    }
    
    @Override
    public void scan(){
        System.out.println("Canon Professional scan");
    }
}
