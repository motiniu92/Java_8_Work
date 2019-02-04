package javaEvidence;

public class TwoDArraySum {

    public static void main(String[] args) {
        int[][] num = {
            {6, 3, 7, 5}, {8, 3, 1, 7}, {0, 5, 4, 2}
        };
        int sum = 0;
        for (int[] oneD : num) {
            for (int i : oneD) {
                System.out.print("  " + i + " ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println("Sum is : " + sum);
    }
}
