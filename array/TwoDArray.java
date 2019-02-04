package com.coderbd.array;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] number = new int[2][3];

        number[0][0] = 90;
        number[0][1] = 80;
        number[0][2] = 30;
        
        number[1][0] = 70;
        number[1][1] = 60;
        number[1][2] = 50;

       // System.out.println(number[0][0]);
        //System.out.println(number[1][01]);

        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + number[row][col]);
            }
            System.out.println();
        }

    }
}
