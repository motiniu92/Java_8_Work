
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Email {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter your Email");

        String email = s.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}
