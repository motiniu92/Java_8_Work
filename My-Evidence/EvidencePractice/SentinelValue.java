package EvidencePractice;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0;; i++) {
            System.out.print("Enter Number : ");
            int x = scan.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
