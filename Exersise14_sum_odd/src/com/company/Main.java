package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(2,10));
    }
    public static boolean isOdd(int number){
        return (number>0 && number%2!=0);
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if (start==0 || end==0 || end<=start){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            for (int i=start;i<=end;i++){
                if(isOdd(i)) {
                sum+=i;
                }
                }
            return sum;

        }
        }

    }
