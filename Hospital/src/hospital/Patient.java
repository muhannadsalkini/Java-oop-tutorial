/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author mohan
 */
public class Patient {
    private static int patientId = 0;
    private String name;
    
    public Patient (String name){
        this.name = name;
        patientId++;
    }

    public static int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + '}';
    }
    
    
}
