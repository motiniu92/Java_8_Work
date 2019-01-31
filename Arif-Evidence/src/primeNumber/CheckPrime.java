/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeNumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CheckPrime {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int number,count = 0;
        System.out.println("Enter a positive integer :");
        number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if(number%i==0){
            count++;
            break;
            }
            
        }
        if(count==0){
            System.out.println("Is a prime number!!!");
        } else {
            System.out.println("Is not prime number!!!");
        
        }
    }
}
