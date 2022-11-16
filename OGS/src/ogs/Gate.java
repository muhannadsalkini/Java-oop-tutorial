/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogs;
enum VehicleType{CAR,MINUBUS,BUS}
/**
 *
 * @author mohan
 */
public class Gate {
    private Car car;
    private MiniBus minibus;
    private Bus bus;
    private VehicleType type;
    private static int gain;
    
    private Car[] cars;
    private static int totalCars=0;
    private MiniBus[] minibuses;
    private static int totalMiniBuses=0;
    private Bus[] buses;
    private static int totalBuses=0;
    
    public Gate(Car car){
        this.car=car;
        type = type.CAR;
        payment();
        cars[totalCars] = car;
        totalCars++;
    }
    public Gate(MiniBus minibus){
        this.minibus=minibus;
        type = type.MINUBUS;
        payment();
        minibuses[totalMiniBuses] = minibus;
        totalMiniBuses++;
    }
    public Gate(Bus bus){
        this.bus=bus;
        type = type.BUS;
        payment();
        buses[totalBuses] = bus;
        totalBuses++;
    }
    
    public void payment(){
        
        if (type.equals(type.CAR)&&car.isOgs()){
            int carFee = 10;
            car.fee(carFee);
            gain = gain +10;
        }
        else if(type.equals(type.MINUBUS)&&minibus.isOgs()){
            int minibusFee = 11;
            minibus.fee(minibusFee);
            gain = gain +11;
        }
        else if(type.equals(type.BUS)&&bus.isOgs()){
            int busFee = 13;
            minibus.fee(busFee);
            gain = gain +13;
        }
        else{
            System.out.println("Vicle dont have an OGS system");
        }
    }

    public static void totalGain() {
        System.out.println("Total gain: "+gain);
    }
    
    
}
