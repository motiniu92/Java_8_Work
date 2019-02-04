/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestNumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LargestNumber {
    public static void main(String[] args) {
        int x, y, z;
    System.out.println("Enter three integers");
    Scanner in = new Scanner(System.in);
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
    if (x > y && x > z)
      System.out.println("First number is largest.");
    else if (y > x && y > z)
      System.out.println("Second number is largest.");
    else if (z > x && z > y)
      System.out.println("Third number is largest.");
    else
      System.out.println("The numbers are not distinct.");
  }
    }

