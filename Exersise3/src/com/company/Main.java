package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        boolean shouldWakeupHours=(hourOfDay<8 || hourOfDay>22) && (hourOfDay>0) &&(hourOfDay<=23);

        if (barking && shouldWakeupHours){
            return true;
        }
        else {
            return false;
        }
    }
}
