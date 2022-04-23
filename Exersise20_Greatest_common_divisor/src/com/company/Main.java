package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,10));
    }
    public static int getGreatestCommonDivisor(int first,int second){
        int GCD=0;
        if (first <10 || second<10){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            int x=Integer.min(first,second);
            int y=Integer.max(first,second);
            if (y%x==0){
                GCD=x;
            }
            else {
                while (x!=0){
                    if (first%x==0 && second%x==0){
                        GCD=x;
                        break;
                    }
                 x--;
                }
            }
            return GCD;
        }
    }
}
