package javaEvidence;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = input.nextInt();
        int fact = 1;
        for (int i = x; i > 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
