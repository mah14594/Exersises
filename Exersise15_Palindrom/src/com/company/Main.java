package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));

    }

    public static boolean isPalindrome(int x) {
        boolean output = false;
        int y=0;
        int i=0;
        int u=x;
        int d=x;
        while (x!=0){
            x/=10;
            i++;
        }
        while (u!=0){
            y+=(u%10)*(Math.pow(10,i-1));
            i--;
            u/=10;
        }
        if (y==d){output=true;}
        return output;

    }
}
