/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialSolve;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FactorialSolve {
    public static void main(String[] args) {
         int num, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        num =input.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact*i;
        }
        System.out.println("The factorial "+num+" = "+fact);
    }
}
