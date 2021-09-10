package com.exceptions.part_b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SwimmingPool swimmingPool=new SwimmingPool();

        File file=new File("dasfsaf");
        FileInputStream stream=new FileInputStream(file);
    }
}
