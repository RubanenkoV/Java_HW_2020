package com.company;

public class Hour extends Minute{
    public int hour;
    public Hour(int hour, int minute){
        super(minute);
        this.hour = hour;
    }
    public Hour(int minute){
        super(minute);
        this.hour = 16;
    }
    public void time_of_day(Hour hour1){
        if((hour1.hour > 4 && hour1.hour <= 12) ){
            System.out.println("It's morning now!");
        }
        else if((hour1.hour > 12 && hour1.hour < 17)){
            System.out.println("It's daytime now!");
        }
        else if((hour1.hour >= 17 && hour1.hour <= 22)){
            System.out.println("It's evening now!");
        }
        else if((hour1.hour > 22 && hour1.hour < 25 || (hour1.hour < 4 && hour1.hour > 0))){
            System.out.println("Its nighttime now!");
        }
    }

}

