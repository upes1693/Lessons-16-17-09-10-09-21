package com.exceptions.resturant;

public class DivisionByZeroException extends ArithmeticException{

    public DivisionByZeroException() {
        this("division by zero");
    }

    public DivisionByZeroException(String s) {
        super(s);
    }
}
