package com.stackroute.Hackathon;

public class Vehicle {
     int speed;
    int noOfSeats;
    String model;
    String licensePlateNo;

    public void setModel(String model) {
        this.model = model;
        System.out.println("vehicle model:"+model);
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
        System.out.println("vehicle license plateno:"+licensePlateNo);
    }


    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("setSpeed:"+speed);
    }


    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
        System.out.println("no of seats:"+noOfSeats);
    }

}

