package com.stackroute.Hackathon;

public class Main {
    public static void main(String[]args){
        Honda honda=new Honda();
        honda.setModel("Honda Car model");
        honda.setLicensePlateNo("AP10024432");
        honda.setSpeed(100);
        honda.setNoOfSeats(4);
        honda.setHandlingGear(6);
        honda.setHandSteering(true);
        honda.style();
    }
}
