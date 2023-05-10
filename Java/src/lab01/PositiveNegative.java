package lab01;

import java.util.Scanner;

/*
Write a Java program to get a number from the user and print whether it is positive or negative
 */
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n >= 0) {
            System.out.println(n + " is positive");
        } else {
            System.out.println(n + " is negative");
        }
    }
}
