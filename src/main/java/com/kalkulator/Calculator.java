package com.kalkulator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.subtract(8,5));
    }
}
