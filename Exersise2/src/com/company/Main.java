package com.company;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            int MegaBytes=(kiloBytes/1024);
            int remainingKiloBytes=kiloBytes%1024;
            System.out.println(kiloBytes+" KB "+MegaBytes +" MB "+"and " +remainingKiloBytes+" KB ");
        }
    }
}
