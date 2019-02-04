package com.coderbd.fibonacciSeries;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter last number : ");
        n = input.nextInt();

        for (int j = 2; j <= n; j = j + 2) {
            System.out.print(j + " ");
            sum = sum + j;
        }
        System.out.println("");

        
        
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("The sum is : " + sum);
    }
}
