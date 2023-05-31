package lab08;

import java.util.Scanner;

public class NameInputValidation {
    private static boolean checkLength(int length) {
//        if (length >= 3 && length <= 20)
//            return true;
//        else
//            return false;
        return (length >= 3 && length <= 20);
    }

    private static boolean checkAlphabet(String name) {
        name = name.toLowerCase();  //convert name to lower case
        boolean check = true;
        for (int i=0; i<name.length(); i++) {
            char c = name.charAt(i);
            if (c < 'a' || c > 'z') {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Enter your name (alphabet only, 3-20 characters): ");
            try {
                name = scanner.nextLine();
                if (checkLength(name.length()) && checkAlphabet(name)) {
                    break; // valid input => stop the loop and continue
                } else {
                    System.out.println("Invalid name");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        } while (true);
        System.out.println("Hello. " + name + ". Have a nice day !");
    }
}
