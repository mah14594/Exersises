package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
    public static boolean isPerfect(int number){
        int num=1;
        int sum=0;
        boolean output=false;
        if (number>0){
            while (num<number){
                if (number%num==0){
                    sum+=num;
                }
                num++;
            }
            if (sum==number){
                output=true;
            }
        }
        return output;
    }
}
