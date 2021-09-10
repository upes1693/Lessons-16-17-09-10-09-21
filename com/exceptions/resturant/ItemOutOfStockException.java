package com.exceptions.resturant;

public class ItemOutOfStockException extends Exception{
    private Customer customer;

    public Customer getCustomer(){
        return customer;
    }
    public ItemOutOfStockException() {
    }

    public ItemOutOfStockException(String message) {
        super(message);
    }

    public ItemOutOfStockException(String message,Customer customer) {
        super(message);
        this.customer=customer;
    }
}
