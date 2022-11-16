/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm2019q2;

/**
 *
 * @author mohan
 */
public class EncapsulatedStudent {
    private int midTerm;
    private int finalExam;
    
    public EncapsulatedStudent(int midTerm, int finalExam) {
        setMidTerm(midTerm);
        setFinalExam(finalExam);
    }
    
    public void setMidTerm(int midTerm) {
    if (midTerm >= 0 && midTerm <=100)
        this.midTerm = midTerm;
    else
        throw new IllegalArgumentException("midterm cannot be less than 0 or greater than 100");
    }
    
    public void setFinalExam(int finalExam) {
        if (finalExam >=0 && finalExam <= 100)
            this.finalExam = finalExam;
        else
            throw new IllegalArgumentException("finalexam cannot be less than 0 or greater than 100");
    }
    
    public int getMidTerm() {
        return midTerm;
    }
    
    public int getFinalExam() {
        return finalExam;
    }
    
    public double getAverage(){
        return midTerm*0.4 + finalExam*0.6;
    }
}
