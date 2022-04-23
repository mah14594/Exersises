package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        double count=0;
        double sum=0;
        Scanner readinputs=new Scanner(System.in);

        // System.out.println("enter the numbers");
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
        double Av=Math.ceil(sum/count);
        int Avg=(int)(Av);
        System.out.println("SUM = "+(int)(sum) +" AVG = "+Avg);
    }
}
