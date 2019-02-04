package com.coderbd.fibonacciSeries;

import java.util.Scanner;

public class Series2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, sum = 0;
        System.out.print("Enter last number : ");
        n = input.nextDouble();

        for (double i = 1.5; i <= n; i = i + 1) {
            System.out.print(i + "  ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("The sum is : " + sum);
    }
}
