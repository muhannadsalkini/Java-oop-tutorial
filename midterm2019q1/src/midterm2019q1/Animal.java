/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm2019q1;

/**
 *
 * @author mohan
 */

enum AnimalTypes{
    MAMMAL, BIRD, REPTILE, FISH;
}

public class Animal {
    private String name;
    private AnimalTypes type;
    
    public Animal (String name, AnimalTypes type){
        this.name = name;
        this.type = type;
    }
    
    public String toString(){
        return name +" "+ type;
    }
}
