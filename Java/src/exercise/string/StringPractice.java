package exercise.string;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Part A:");
        printUppercaseLetters(s);
        System.out.println("Part B:");
        everySecondLetter(s);
        System.out.println("Part C:");
        replaceVowelUnderscore(s);
        System.out.println("Part D, number of vowels is " + numVowels(s) + ".");
        System.out.println("Part E:");
        printVowelPositions(s);
    }

    private static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    private static boolean isUpper(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    private static void printUppercaseLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isUpper(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println(); // newline
    }

    private static void everySecondLetter(String s) {
        int n = 0;
        // everytime we see a letter, increase n by 1
        // only print out a letter when n is even
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))) {
                if (n % 2 == 0)
                    System.out.print(s.charAt(i));
                n++;
            }
        }
        System.out.println(); // newline
    }

    private static char toLowerCase(char c) {
        if (isUpper(c)) {
            return (char) (c + 32);
        } else {
            return c;
        }
    }

    private static boolean isVowel(char c) {
        char a = toLowerCase(c);
        return (a == 'a' || a == 'e' || a == 'i' ||
                a == 'o' || a == 'u' || a == 'y');
    }

    private static void replaceVowelUnderscore(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                System.out.print('_');
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println(); // newline
    }

    private static int numVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }
        return count;
    }

    private static void printVowelPositions(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // newline
    }
}
