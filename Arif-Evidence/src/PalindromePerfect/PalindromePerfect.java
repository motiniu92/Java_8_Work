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
         System.out.println("Enter a String or Number ");
         
         String s1 = input.nextLine();
         StringBuffer sb = new StringBuffer(s1);
         
         String s2 = sb.reverse().toString();
         if(s1.equals(s2)){
             System.out.println("Is a palandrome");
         } else {
             System.out.println("Is not a palindrome");
         }
    }
}
