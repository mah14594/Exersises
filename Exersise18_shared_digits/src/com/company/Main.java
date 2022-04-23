package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int x,int y){
        boolean output=false;
        if(x>=10 && x<=99 && y>=10 && y<=99 ){
           int x1=x%10;
           int x2=x/10;
           int y1=y%10;
           int y2=y/10;
           output=(x1==y1)||(x2==y1)||(x1==y2)||(x2==y2);
            /* while (x!=0){
                while(y!=0){
                    if(x%10==y%10){
                        output=true;
                    }
                    y/=10;
                    x/=10;

                }
            }*/
        }
        return output;
    }
}
