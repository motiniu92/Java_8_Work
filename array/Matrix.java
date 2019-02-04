package com.coderbd.array;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][4];
        int[][] B = new int[3][4];

        // A matrix
        System.out.print("Enter element for A matrix value : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }

        }
        System.out.println("matrix A = ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t " + A[row][col]);
            }
            System.out.println();
        }

        // B matrix
        System.out.print("Enter element for B matrix value : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }

        }
        System.out.println("Matrix B = ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" \t " + B[row][col]);
            }
            System.out.println();
        }

        // adding A and B matrix
        System.out.println("A+B = ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("\t " + (A[row][col] + B[row][col]));

            }
            System.out.println();
        }
    }
}
