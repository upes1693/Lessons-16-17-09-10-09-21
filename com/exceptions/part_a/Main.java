package com.exceptions.part_a;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        System.out.println(divide(5,5));
       //System.out.println(divide(5,0));

//        System.out.println(divideLBYL(10,0));
//        System.out.println(divideEAF(10,0));
        Calculator calculator=new Calculator();
//        try{
//            calculator=null;
        calculator.divide(10,0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Caught an arithmetic exception");
//        }
////        catch (NullPointerException e){
////            System.out.println("Caught an null pointer exception");
////        }
////        catch (RuntimeException e){
////            System.out.println("Caught an runtime exception");
////        }
//        catch (Exception e){
//            System.out.println("Caught an exception");
//        }
    }

    public static int divide(int a, int b){
        return a/b;
    }

    private static int divideLBYL(int x, int y){
        if(y!=0){
            return x/y;
        }
        else{
            return 0;
        }
    }

    private static int divideEAF(int x, int y){
        try{
            return x/y;
        }
        catch(ArithmeticException e){
            return 0;
        }
        finally {
            System.out.println("Finally has been invoked");
        }
    }
}
