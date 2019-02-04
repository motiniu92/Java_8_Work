/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise02;

/**
 *
 * @author User
 */
public class OddSum {
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if( i % 2 == 1){
            sum = sum + i;
            System.out.println(" " + i);
        }
        }
        System.out.println("The sum is : " + sum);
    }
}
