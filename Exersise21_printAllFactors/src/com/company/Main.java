package com.company;

public class Main {

    public static void main(String[] args) {
	printFactors(10);
    }
    public static void printFactors(int number){
        int num=1;
        String output=" ";
        if (number<1){
            System.out.println("Invalid Value");
        }
        while (num<=number){
            if (number%num==0){
                output+=" "+num;
            }
            num++;
        }
        System.out.println(output);

    }
}
