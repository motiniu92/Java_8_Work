package javaEvidence;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the value : ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Is a prime");
        } else {
            System.out.println("Not a prime");
        }

    }
}
