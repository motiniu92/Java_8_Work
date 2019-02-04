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
public class FibonacciPrint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" How many nuber");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            int fib = first + second;
            System.out.print(" " + fib);
            first = second;
            second = fib;
          

        }
  System.out.println(" ");
    }

}
