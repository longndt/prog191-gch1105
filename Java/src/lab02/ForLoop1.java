package lab02;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total asterisk: ");
        int n = sc.nextInt();

        //nested for: for loop inside another for loop
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
