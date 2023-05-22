package lab05;

import java.util.Scanner;

//Task: Đếm nguyên âm (a, e, i, o, u) trong 1 string bất kỳ (nhập từ bàn phím)
public class CountVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int count = 0; //no vowel at first
        int length = s.length();
        for (int i=0; i<length ; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
                    s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count++; //increase total vowel if match
            }
        }
        System.out.println(s);
        System.out.println("Total characters: " + length);
        System.out.println("Total vowels: " + count);  //print final result outside for loop
        System.out.println("Total consonants: " + (length - count));
        //close Scanner at the end of program
        scanner.close();
    }
}
