
package com.coderbd.array;


public class ArrayIntroduction {
    public static void main(String[] args) {
        int [] number = new int[5];
        number [0] = 10;
        number [1] = 15;
        number [2] = 20;
        number [3] = 25;
        number [4] = 30;
        
        int leng = number.length;
        System.out.println(number[3]);
        System.out.println("Array size : " + leng);
        
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Sum = " + sum);
                
    }
}
