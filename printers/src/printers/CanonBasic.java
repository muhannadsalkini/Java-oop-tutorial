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
public class CanonBasic extends Printer implements Scannable{
    @Override
    public void print(){
        System.out.println("Canon Basic print");
    }
    
    @Override
    public void scan(){
        System.out.println("Canon Basic scan");
    }
}
