package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,32));
    }
    public static boolean isCatPlaying(boolean isSummer,int temperature){
        boolean output=false;
        int mintemp=25;
        int maxtemp=35;
        if (isSummer){
            maxtemp=45;
        }
        if (temperature>=mintemp && temperature<=maxtemp){
            output=true;
        }
        return output;
    }
}
