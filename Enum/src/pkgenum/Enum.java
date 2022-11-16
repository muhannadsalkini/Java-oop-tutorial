/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;



/**
 *
 * @author mohan
 */
enum Level{
    HIGH(300, "dangerous"),
    MEDIUM(200, "okay"),
    LOW(100, "too easy");
    
    private int heigh;
    private String desc;
    
    private Level(int heigh, String desc){
        this.heigh = heigh;
        this.desc = desc;
        
    }
    
    public String getDesc(){
        return desc;
    }
}

public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Level[] levels = Level.values();
        
        for (Level a : levels)
            System.out.println(a + ":" + a.getDesc());
    }
    
}
