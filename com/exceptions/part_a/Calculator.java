package com.exceptions.part_a;

public class Calculator {

    public void divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by zero!!!");
        }
    }
}
