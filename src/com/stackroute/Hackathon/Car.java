package com.stackroute.Hackathon;

public class Car extends Vehicle{

    private boolean handSteering;
    private int handlingGear;


    public void setHandlingGear(int handlingGear) {
        this.handlingGear = handlingGear;
        System.out.println("handlingGear:"+handlingGear);
    }
    public void style(){
        System.out.println("extremly stylish");
    }



    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
        System.out.println("handSteering:"+handSteering);
    }


}
