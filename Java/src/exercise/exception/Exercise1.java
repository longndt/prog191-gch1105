package exercise.exception;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        do {
            try {
                System.out.print("Enter numerator: ");
                numerator = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter denominator: ");
                denominator = Integer.parseInt(scanner.nextLine());
                divideNumbers(numerator, denominator);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } while (true);
    }

    public static void divideNumbers(int numerator, int denominator) {
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
