package lab08;

import java.util.Scanner;

public class AgeInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            System.out.print("Enter your age (1-120): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 1 && age <= 120) {
                    break;
                } else {
                    System.out.println("Invalid age! Please enter a value between 1 and 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        } while (true);
        System.out.println("Your age is: " + age);
    }
}
