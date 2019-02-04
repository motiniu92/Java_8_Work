package com.coderbd.prime;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int num = 0;
        int count = 0;
        int totalPrime = 0;

       // System.out.print("Enter initial number : ");
       // m = input.nextInt();

        System.out.print("Enter any number : ");
        n = input.nextInt();

        for (int i = 2; i <= n; i++) {

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }

            count = 0;
          }
        System.out.println("Total prime number = " + totalPrime);

    }

}
