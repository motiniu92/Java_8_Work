/*
 
 */
package practise02;

import java.util.Scanner;

/**
 *
 */
public class FindMaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (x > y && x > z) {
            System.out.println("The first number is large " + x);
        }
        if (y > x && y > z) {
            System.out.println("The second number is large " + y);
        }
        if (z > x && z > y) {
            System.out.println("The third number is large " + z);
        }
          if (x < y && x < z) {
            System.out.println("The first number is small " + x);
        }
        if (y < x && y < z) {
            System.out.println("The second number is small " + y);
        }
        if (z < x && z < y) {
            System.out.println("The third number is small " + z);
        }
    }
}
