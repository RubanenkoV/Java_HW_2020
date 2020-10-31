package com.company;

public class Train {
    public static String destination;
    public static int number;
    public static double time;
    public static int number_of_seats;
    public static int comp_seats;
    public static int cheap_seats;
    public static int lux_seats;

    Train(String newDestination, int newnumber, double newtime, int newnumber_of_seats, int newcomp_seats, int newcheap_seats, int newlux_seats){
        destination = newDestination;
        number = newnumber;
        time = newtime;
        number_of_seats = newnumber_of_seats;
        comp_seats = newcomp_seats;
        cheap_seats = newcheap_seats;
        lux_seats = newlux_seats;
    }

    public static void setDestination(String newDestination){
        destination = newDestination;
    }

    public static void setTime(double newTime){
        time = newTime;
    }

    public static void setNumber(int newNumber){
        number = newNumber;
    }

    public static void setNumber_of_seats(int newSeatTotal){
        number_of_seats = newSeatTotal;
    }

    public static void setComp_seats(int newCompSeats){
        comp_seats = newCompSeats;
    }

    public static void setCheap_seats(int newCheapSeats){
        cheap_seats = newCheapSeats;
    }

    public static void setLux_seats(int newLuxSeats){
        lux_seats = newLuxSeats;
    }

    public String getDestination(){
         return destination;
    }

    public double getTime(){
        return time;
    }

    public int getNumber(){
        return number;
    }

    public int getNumber_of_seats(){
       return  number_of_seats;
    }

    public int getComp_seats(){
        return comp_seats;
    }

    public int getCheap_seats(){
        return cheap_seats;
    }

    public int getLux_seats(){
        return lux_seats;
    }
}

