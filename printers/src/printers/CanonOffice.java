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
public class CanonOffice extends Printer implements Fax, Scannable{
    @Override
    public void print(){
        System.out.println("Canon Office print");
    }
    
    @Override
    public void fax(){
        System.out.println("Canon Office fax");
    }
    
    @Override
    public void scan(){
        System.out.println("Canon Office scan");
    }
}
