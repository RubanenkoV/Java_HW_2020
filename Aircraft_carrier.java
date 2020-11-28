package com.company;

public class Aircraft_carrier extends WarShip {

    public String Aircraft_carrier;

    public Aircraft_carrier(String Aircarft_carrier, Boolean operational, String beautiful) {
        super(beautiful);
        this.Aircraft_carrier = Aircarft_carrier;
        this.operational = operational;
    }

    @Override
    public void print() {
        System.out.println("Model: "+ Aircraft_carrier + ", Opeational: " + operational + ", Beautiful : "+ beautiful);
    }
}
