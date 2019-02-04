package javaEvidence;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i >= -1; i++) {
            System.out.print("Enter the value : ");
            int x = input.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
            System.out.println(sum);
        }

    }
}
