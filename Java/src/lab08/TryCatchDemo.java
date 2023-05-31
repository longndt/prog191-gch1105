package lab08;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        //min age = 1; max age = 120
        int minYear = currentYear - (1 + 120);
        int maxYear = currentYear - 1;
        int birthYear = 0;
        try {
            do {
                System.out.print("Input your year of birth: ");
                birthYear = scanner.nextInt();
            } while (birthYear < minYear || birthYear > maxYear);
        } catch (InputMismatchException e) {
            System.err.print("Invalid year of birth. Input again: ");
            scanner.nextLine();  //clear buffer cache
            birthYear = scanner.nextInt();
        }
        System.out.println("You was born in " + birthYear);
        int age = currentYear - birthYear;
        System.out.println("You are " + age + " year old now");
    }
}
