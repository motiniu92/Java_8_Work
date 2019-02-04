package com.coderbd.array;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Abdul", "Motin", "Hanif", "Babu", "Kadir"};
        System.out.println("Size : " + names.length);
        for (String x : names) {
            System.out.println(x);
        }

        int[] num = {10, 25, 36, 89, 45, 65, 47};
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("sum is : " + sum);
    }
}
