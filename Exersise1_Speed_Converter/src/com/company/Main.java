package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(-2.0);

    }
    public static long  toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour<0){
            return -1;
        }
        else {
            double milesPerHour=kilometersPerHour/1.609;
            long roundedMilesperHour=Math.round(milesPerHour);
            return roundedMilesperHour;
        }
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour=toMilesPerHour(kilometersPerHour);
        if (milesPerHour==-1){
            System.out.println(milesPerHour);
        }
        System.out.println(kilometersPerHour+" km/h"+"="+milesPerHour+" mi/h");
    }
}
