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
public class ArraySumAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double [] number = new double[3];
        double sum = 0;
        System.out.println("Enter some number");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        double avg = sum / number.length;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }

}
