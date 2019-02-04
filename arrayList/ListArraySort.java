package com.coderbd.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListArraySort {

    public static void main(String[] args) {

        //ArrayList use able method
        ArrayList<Integer> number1 = new ArrayList<>();

        number1.add(20);
        number1.add(10);
        number1.add(50);
        number1.add(25);
        number1.add(60);
        number1.add(30);
        number1.add(88);
        System.out.println("Before sorting : " + number1);

        Collections.sort(number1);
        System.out.println("After sorting ascending is : " + number1);

        Collections.sort(number1, Collections.reverseOrder());
        System.out.println("After sorting dscending number is : " + number1);
    }

}
