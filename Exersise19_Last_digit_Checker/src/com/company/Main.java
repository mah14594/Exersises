package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSameLastDigit(int x , int y , int z){
        boolean output=false;
        if (isValid(x)&& isValid(y) && isValid(z)){
            int x1=x%10;
            int y1=y%10;
            int z1=z%10;
            output =(x1==y1)||(x1==z1)||(y1==z1);
        }

        return output;
    }
    public static boolean isValid(int u){
        return (u>=10 && u<=1000);
    }
}
