package lab08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean check = false;
        while (!check) {  // while (check == false)
            System.out.print("Input your age: ");
            do {
                age = scanner.nextInt();
                check = true;
            } while (age < 1 || age > 120);
        }
        System.out.println("You are " + age + " year old now");
    }
}
