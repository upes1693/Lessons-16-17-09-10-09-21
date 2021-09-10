package com.exceptions.resturant;

public class Chef extends Person {
    public Chef() {
        this.manager = new Manager();
    }

    private Manager manager;

    public void prepareFood(Customer customer,String order)  {

        manager.checkFood(customer,order);
    }
}
