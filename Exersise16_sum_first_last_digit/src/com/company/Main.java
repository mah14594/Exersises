package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(448139));
    }
    public static int sumFirstAndLastDigit(int x){
        if(x<0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            int lastDigit=x%10;
            int firstDigit=0;
            while(x!=0){
                if(x<10){
                    firstDigit=x;
                }
                x/=10;


            }
            return firstDigit+lastDigit;
        }

    }
}
