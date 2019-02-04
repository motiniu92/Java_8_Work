/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromePerfect;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PalindromePerfect {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.print(" Enter a String or number :");
        s1 = input.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("yes! Is a palindrome");
        } else {
            System.out.println("Sorry ...Is not a palindrome");
        }
        System.out.println("\n\n");
        System.out.println("Thank U Arif!!!"); 
    }
}
