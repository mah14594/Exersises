package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasTeen(int age1,int age2,int age3){
        boolean output=isTeen(age1) || isTeen(age2) || isTeen(age3);
        return output;
    }
    public static boolean isTeen(int age){
        boolean ageisTeen=age>=13 && age<=19;
        return ageisTeen;
    }
}
