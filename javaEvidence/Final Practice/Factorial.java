/*

 */
package practise02;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer ");
        int x = input.nextInt();
        for (int i = x; i >=1; i--) {
            f = f * i;
            
        }
        System.out.println("The result is :"+f);
        
    }
   
}
