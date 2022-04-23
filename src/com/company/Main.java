package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int count=0;
        int sum=0;
        Scanner readinputs=new Scanner(System.in);

//        System.out.println("enter the numbers");
        while(true){

            boolean isInt=readinputs.hasNextInt();
            if (isInt){
                int num=readinputs.nextInt();
                readinputs.nextLine();
                count++;
                sum+=num;
            }
            else{
                break;
            }

        }
        double Avg=(int)(Math.ceil(sum/count));
        System.out.println("SUM= "+sum +" AVG= "+Avg);
    }
}
