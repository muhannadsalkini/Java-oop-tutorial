/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author mohan
 */
interface A {
    double pi = 3.14193653652;
    void a();
}

interface B {
    void b();
}

interface C extends A{  // C interface have method a extended
    void c();
}

class D implements B, C{
    @Override
    public void a(){
        System.out.println("This is A");
    }

    @Override
    public void b() {
        System.out.println("This is B");
    }

    @Override
    public void c() {
        System.out.println("This is C");
    }
    
    
    
}