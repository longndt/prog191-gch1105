package lab05;

import java.util.Scanner;

public class PasswordCheck1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        int score = 0;
        //check password is null => re-enter password
        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
        } while (password.length() == 0);
        if (password.length() >= 6) {
            score+=2;
        }
        if (password.contains("ABC") || password.contains("abc")) {
            score++;
        }
        if (password.contains("123") || password.contains("789")) {
            score++;
        }
        System.out.println("Password score: " + score);
    }
}
