/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GradeSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your obtain number :");
        int x = input.nextInt();
        switch ((x / 10) * 10) {
            case 80:
                System.out.println("Grade is A+ ");
                break;
            case 70:
                System.out.println("Grade is A ");
                break;
            case 60:
                System.out.println("Grade is B ");
                break;
            case 50:
                System.out.println("Grade is C ");
                break;
            case 40:
                System.out.println("Grade is D ");
                break;
            default:
                System.out.println("Grade is  F ");

        }
    }
}
