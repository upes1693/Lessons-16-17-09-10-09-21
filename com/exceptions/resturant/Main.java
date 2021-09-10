package com.exceptions.resturant;

public class Main {
    public static void main(String[] args) {
//        Waiter waiter=new Waiter();
//        Customer customer=new Customer("Mark");
//        try {
//            waiter.recieveOrder(customer,"Pizza");
//        } catch (ItemOutOfStockException e) {
//            e.printStackTrace();
//            System.out.println(e.getCustomer());
//        }
        divide(10,0);
    }

    public static void divide(int a,int b){
        if(b==0){
            throw new DivisionByZeroException();
        }
    }
}
