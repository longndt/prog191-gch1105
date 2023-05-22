package lab05;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        String s = "Greenwich Vietnam";
        System.out.println("Original string: " + s);
        System.out.println("Change all vowels to # symbol");
        System.out.println("Converted string: " + s.replaceAll("[aeiou]","#"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        System.out.println(message.replaceAll("(bitch|fuk)","*"));
    }
}
