package com.company;

public class dot {
    static int X_limit = 50;
    static int Y_limit = 50;
    static float time_travelled;
    static float distance_travelled;

    public static void velocity_calc(float time_travelled, float distance_travelled) {
        if (distance_travelled < (X_limit * X_limit + Y_limit * Y_limit)) {
            System.out.println(distance_travelled);
            System.out.println("The velocity of the dot is " + distance_travelled / time_travelled);
        } else {
            System.out.println("An error has occured");
        }

    }

    public static void acceleration_calc(float time_travelled, float distance_travelled) {
        if (distance_travelled < (X_limit * X_limit + Y_limit * Y_limit)) {
            System.out.println("The acceleration of the dot is " + distance_travelled / (time_travelled * time_travelled));
        } else {
            System.out.println("An error has occured");
        }

    }

}