/*
 
 */
package practise02;

import java.util.Arrays;

/**
 *
 */
public class ArraySort {

    public static void main(String[] args) {
        int[][] element = {{20, 30, 50},
        {45, 16, 34},
        {10, 60, 11}};
        System.out.println("Display element");
        for (int[] depo : element) {
            Arrays.sort(depo);
            for (int main : depo) {
                System.out.print(main + " ");
            }
            System.out.println();
        }

    }

}
