package lab05;

import java.util.Scanner;

public class StringRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex1 = "G[CB]H[0-9][0-9][0-9][0-9][0-9][0-9]";
        String regex2 = "G(C|B)H[0-9][0-9][0-9][0-9][0-9][0-9]";
        String regex3 = "G[B-C]H[0-9][0-9][0-9][0-9][0-9][0-9]";
        String id;
        do {
            System.out.print("Enter Greenwich student ID: (GCH|GBHxxxxxx): ");
            id = scanner.nextLine();
        } while (!id.matches(regex3));
        System.out.println("Greenwich ID: " + id);
        scanner.close();
    }
}
