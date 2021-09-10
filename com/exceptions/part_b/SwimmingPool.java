package com.exceptions.part_b;

public class SwimmingPool implements Cloneable {
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {

        }

        return new Object();
    }

//    public void method() throws CloneNotSupportedException,Exception{
//        throw new Exception();
//    }
}
