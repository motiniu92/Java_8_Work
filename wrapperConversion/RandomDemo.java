package com.coderbd.wrapperConversion;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+ 50;
        System.out.println("random number : " + randomNumber);
    }
}
