/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        System.out.println("Enter three number");
        for (int i = 0; i < 3; i++) {
            number[i] = input.nextInt();
        }
        int max = number[0];
        int min = number[0];

        for (int i = 1; i < 3; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("max is = " + max);
        System.out.println("min is = " + min);
    }

}
