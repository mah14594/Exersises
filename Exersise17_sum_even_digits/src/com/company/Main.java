package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int getEvenDigitSum(int x){

        int sum=0;
        int i=0;
        if (x<0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            while (x!=0){
                int reminder=x%10;
                if (reminder%2==0){
                    sum+=reminder;
                }
                x/=10;
            }
            return sum;
        }
    }
}
