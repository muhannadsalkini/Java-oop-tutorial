/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumwithswitch;

/**
 *
 * @author mohan
 */
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
   }
 }
}
