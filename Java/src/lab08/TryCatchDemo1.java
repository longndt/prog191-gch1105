package lab08;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean check = false;
        while (!check) {  // while (check == false)
            try {
                System.out.print("Input your age: ");
                do {
                    age = scanner.nextInt();
                    check = true;
                } while (age < 1 || age > 120);
            } catch ( InputMismatchException e) {
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        System.out.println("You are " + age + " year old now");
    }
}
