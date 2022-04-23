package com.company;

public class SimpleCalcuator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumebr(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber()*getSecondNumber();
    }
    public double getDivisionResult(){
        if (secondNumber==0){
            System.out.println("Invalid Value");
            return 0;

        }
        return getFirstNumber()/getSecondNumber();
    }
}
