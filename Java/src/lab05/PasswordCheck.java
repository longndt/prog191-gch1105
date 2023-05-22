package lab05;

import java.util.Scanner;

/*
  Password length: 8
  first 3 letters: digit (0-9)
  next 2 letters: case-insensitive alphabet (a-z A-Z)
  next letter: @ or _
  next letter: vowel (lower case)
  last letter: not digit
 */
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        String password = null;
        String pattern = "[0-9][0-9][0-9][a-zA-Z][a-zA-Z](@|_)[aeiou][^0-9]";
        while (check == false) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            if (password.matches(pattern)) {
                check = true;
            }
        }
        System.out.println("Your password is: " + password);
      scanner.close();
    }
}
