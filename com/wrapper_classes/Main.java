package com.wrapper_classes;

public class Main {
    public static void main(String[] args) {
        //Autoboxing
        int a = 50;
        Integer i=Integer.valueOf(50);
        Integer j=a;

        //Unboxing
        Integer in=new Integer(100);
        int integer=in.intValue();
        int interger2=in;
    }
}
