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
public class OddorEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for odd or even ");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println(" The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }

}
