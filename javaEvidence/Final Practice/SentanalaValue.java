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
public class SentanalaValue {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1;; i++) {
            System.out.println("Enter a positive integer ");
            int x = input.nextInt();
            if (x != -1) {
                sum = sum + x;

            } else {
                break;
            }
        }
        System.out.println("" + sum);
    }
}
