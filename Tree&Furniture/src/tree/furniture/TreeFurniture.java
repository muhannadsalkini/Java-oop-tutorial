/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.furniture;

/**
 *
 * @author mohan
 */
public class TreeFurniture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree t1 = new Tree();
        Tree t2 = new Tree("chestnut");
        Furniture f1 = new Furniture();
        Furniture f2 = new Furniture("office");
        
        f1.doTable(t1);
        f2.doTable(t2);
        f1.doChair(t1);
        f1.doTable(t2);
    }
    
}
