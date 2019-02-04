package com.coderbd.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArray2 {

    public static void main(String[] args) {

        //ArrayList use able method
        ArrayList<Integer> number1 = new ArrayList<>();
        System.out.println("size = " + number1.size());

        number1.add(10);
        number1.add(1);
        number1.add(0);
        number1.add(-35);
        number1.add(-40);
        number1.add(40);
        number1.add(4);

        System.out.print("For each : ");
        for (int x : number1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        
        
        System.out.print("Iterator : ");
        Iterator itr = number1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        
        System.out.println();
        System.out.println("Number1:" + number1);
        
        
        //removing elements
        number1.remove(2);
        System.out.println("After removing elements :" + number1);
        
        boolean check = number1.isEmpty();
        System.out.println("ArrayList empty : " + check);
        
       int position = number1.indexOf(40);
        System.out.println("The index of is : " + position);
        
        number1.set(4, 80);
        System.out.println("After seting :" +number1);
        
        int x = number1.get(0);
        System.out.println("Get after  0 : " + x);
    }
    
}
