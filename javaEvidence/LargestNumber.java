package javaEvidence;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  value : ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " is big");
        } else if (y > x && y > z) {
            System.out.println(y + " is big ");
        } else if (z > x && z > y) {
            System.out.println(z + " is big");
        } else {
            System.out.println(x + " " + y + " " + z + "all are equals");
        }

        System.out.println();
        if (x < y && x < z) {
            System.out.println(x + " is small");
        } else if (y < x && y < z) {
            System.out.println(y + " is small");
        } else if (z < x && z < y) {
            System.out.println(z + " is small");
        } else {
            System.out.println(x + " " + y + " " + z + " all are equals");
        }

    }
}
