package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public static int getDaysInMonth(int month,int year){
        int Days;
        boolean yearisLeap=isLeapYear(year);
        if (month>12 || month<1 || year<1 || year>9999){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            switch (month){
                case 4: case 6: case 9: case 11:
                    Days=30;
                    break;
                case 2:
                    if(yearisLeap){
                        Days=29;
                    }
                    else{
                        Days=30;
                    }
                    break;
                default:
                    Days=31;
                    break;
            }
            return Days;
        }
    }
    public static boolean isLeapYear(int year) {
            if (year>=1 && year<=9999){
                return (year%4==0 && year%100!=0)||(year%400==0);
            }
            else {
                return false;
            }


    }
}
