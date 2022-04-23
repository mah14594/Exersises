package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalcuator calcuator=new SimpleCalcuator();
    calcuator.setFirstNumebr(4.2);
    calcuator.setSecondNumber(3.22);
        System.out.println("Add="+calcuator.getAdditionResult());
        System.out.println("Subtract="+calcuator.getSubtractionResult());
    }
}
