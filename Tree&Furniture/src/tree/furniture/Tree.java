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
public class Tree {
    private String type;
    
    public Tree(){
        this.type = "pine";
    }
    
    public Tree(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}
