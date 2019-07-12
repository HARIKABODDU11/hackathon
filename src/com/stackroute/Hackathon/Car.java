package com.stackroute.Hackathon;

public class Car extends Vehicle{

    public void getHandlingGear() {
        System.out.println("Handling gear is:"+handlingGear);
    }

    public void setHandlingGear(int handlingGear) {
        this.handlingGear = handlingGear;
        System.out.println("handlingGear:"+handlingGear);
    }

    private int handlingGear;

    public void getHandSteering() {
        System.out.println("Handling gear="+handSteering);
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
        System.out.println("handlingsteering"+handSteering);
    }

private boolean handSteering;

}
