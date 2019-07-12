package com.stackroute.Hackathon;

public class Vehicle {
    private int speed;
    private int noOfGears;

    public int getSpeed() {
        System.out.println("getSpeed:"+speed);
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("setSpeed:"+speed);
    }

    public int getNoOfGears() {
        System.out.println("noofgears"+noOfGears);
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {

        this.noOfGears = noOfGears;
        System.out.println("setofgears"+noOfGears);
    }



}

