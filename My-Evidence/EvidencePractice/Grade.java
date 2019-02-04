package EvidencePractice;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Result : ");

        String res = s.next();
        res = res.toUpperCase();

        if (res.equals("A")) {
            System.out.println("Excellent");
        } else if (res.equals("B")) {
            System.out.println("Good");
        } else if (res.equals("C")) {
            System.out.println("Average");
        } else if (res.equals("D")) {
            System.out.println("Poor");
        } else {
            System.out.println("Fail");
        }

    }
}
