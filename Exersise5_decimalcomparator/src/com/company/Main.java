package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.231,1.231));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x,double y){
       boolean output=false;
       int X=(int)(x);
       int Y=(int)(y);
       int XX=(int)(x-X);
       double YY=y-Y;
        System.out.println(X);
        System.out.println(Y);
        System.out.println(XX);
        System.out.println(YY);
       if (x==y){
           output=true;
       }
       return output;
    }
}
