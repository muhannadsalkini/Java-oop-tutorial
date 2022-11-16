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
public class Furniture {
    private String type;
    private Tree tree;
    
    public Furniture(){
        this.type = "home";
    }
    
    public Furniture(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void doTable(Tree tree){
        System.out.println("Table made from " +tree.getType()+" for "+this.getType());
    }
    
    public void doChair(Tree tree){
        System.out.println("Chair made from " +tree.getType()+" for "+this.getType());
    }
}
