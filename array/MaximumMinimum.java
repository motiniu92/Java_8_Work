package com.coderbd.array;

import static java.lang.Math.min;
import static java.lang.Math.min;
import java.util.Scanner;

public class MaximumMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[6];
        double sum = 0;
        System.out.print("Please enter numbers : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        double avg = sum / number.length;
        System.out.println("The sum is : " + sum);

        System.out.println("The average is : " + avg);
        
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 6; i++) {
            if(max<number[i]){
                max = number[i];
            }
            if(min>number[i]){
            min = number[i];
            }
            
        }
        System.out.println("Maximum = " +max);
        System.out.println("Minimum = " +min);
    }
}
