package lab05;

import java.util.Scanner;

/*
   Password length >= 6: +2 score
   Password contains digit: +1 score
   Password contains lowercase alphabet: +1 score
   Password contains uppercase alphabet: +1 score
   Password contains symbol: +1 score
   1 <= score <= 2: weak password
   3 <= score <= 4: medium password
   score = 5      : strong password
   score = 6      : very strong password
 */
public class PasswordScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        int score = 0, length = 0, digit = 0, lower = 0, upper = 0, symbol = 0;
        //check password is null => re-enter password
        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
        } while (password.length() == 0);
        if (password.length() >= 6) {
            length = 2;
        }
        for (int i=0; i<password.length();i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                digit = 1;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                lower = 1;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                upper = 1;
            } else {   //symbol (special characters)
                symbol = 1;
            }
        }
        score = length + digit + lower + upper + symbol;
        System.out.println("Password score: " + score);
        if (score == 1 || score == 2) {
            System.out.println("Weak password");
        } else if (score == 3 || score == 4) {
            System.out.println("Medium password");
        } else if (score == 5) {
            System.out.println("Strong password");
        } else {  //score = 6
            System.out.println("Very strong password");
        }
        scanner.close();
    }
}
