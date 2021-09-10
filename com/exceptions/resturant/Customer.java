package com.exceptions.resturant;

public class Customer  extends Person{
    public Customer(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
