
package com.coderbd.arrayList;

import java.util.ArrayList;


public class ListArray3 {
    public static void main(String[] args) {

        //ArrayList use able method
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
       

        number1.add(10);
        number1.add(1);
        number1.add(0);
        number1.add(-35);
        System.out.println("Number1 : " + number1);
        
        number2.add(-55);
        number2.add(90);
        number2.add(41);
        number2.add(74);
        System.out.println("Number2  : " + number2);
        
        number3.addAll(number1);
        System.out.println("Number3  : " + number3);
        
       boolean result = number1.equals(number2);
        System.out.println("Number1 == Number2 : " + result);
        
        System.out.println();
    }
}
