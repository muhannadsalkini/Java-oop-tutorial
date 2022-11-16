/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author mohan
 */
public class Time1 {
    private int hour;
    private int minute;
    private int secound;
    
    public Time1(int hour, int minute, int secound){
        setHour(hour);
        setMinute(minute);
        setSecound(secound);
    }

    public void setHour(int hour) {
        if (hour<0 || hour >23)
            throw new IllegalArgumentException("Wrong data type");
         this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute<0 || minute >59)
            throw new IllegalArgumentException("Wrong data type");
        this.minute = minute;
    }

    public void setSecound(int secound) {
        if (secound<0 || secound >59)
            throw new IllegalArgumentException("Wrong data type");
        this.secound = secound;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Time1{" + "hour=" + hour + ", minute=" + minute + ", secound=" + secound + '}';
    }
    
    
    public void toUniversalString(){
        
    }
}
