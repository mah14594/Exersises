package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static double area(double radius){
        if (radius<0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            return Math.PI*Math.pow(radius,2);
        }
    }
    public static double area(double length,double width){
        if (length<0 || width<0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            return length*width;
        }
    }
}
