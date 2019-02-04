package javaEvidence;

import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        int length = input.nextInt();

        int a[] = new int[length];
        int max = 0;
        int min = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value :");
            a[i] = input.nextInt();
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            } else {
                continue;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
