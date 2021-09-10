package com.exceptions.resturant;

public class Manager  extends Person{
    private BigManager bigManager;

    public Manager( ) {
        this.bigManager = new BigManager();
    }

    public void checkFood(Customer customer,String order)  {


        bigManager.takeProfit();
    }
}
