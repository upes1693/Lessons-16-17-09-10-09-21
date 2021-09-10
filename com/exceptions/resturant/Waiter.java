package com.exceptions.resturant;

public class Waiter  extends Person{
     private Chef chef;

    public Waiter() {
        this.chef = new Chef();
    }

    public void recieveOrder(Customer customer, String order) throws ItemOutOfStockException {

        if (order == "Pizza") {
            throw new ItemOutOfStockException("Out of pizza's today.",customer);
        }
            chef.prepareFood(customer,order);


//        if (order=="Pizza"){
//            throw new Exception("Out of pizza's today.");
//        }
    }
}
