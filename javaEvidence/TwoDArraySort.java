package javaEvidence;

import java.util.Arrays;

public class TwoDArraySort {

    public static void main(String[] args) {
        System.out.println("Tow D Array sorting");
        defaultSort();
    }

    public static void defaultSort() {
        int[][] num = {
            {4, 8, 2, 7}, {10, 87, 35, 0}, {45, 67, 9, 4}
        };
        for (int[] oneD : num) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " , ");
            }
            System.out.println();
        }
    }

}
