package lab06;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] n = new int[3];
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        //n[3] = 4; => Error
        System.out.println(n[0]);
        //System.out.println(n[3]);  => Error
        for (int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }

        double m[] = new double[2];
        m[1] = 9.2;
        m[0] = 7.6;
        m[1] = 4.2;  //override value
        for (double d: m) {
            System.out.println(d);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total student's name: ");
        int total = scanner.nextInt();
        scanner.nextLine();  //clear buffer's cache
        String[] names = new String[total];
        for (int i=0; i<total; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }
        System.out.print("List of student's name: ");
        for (String name: names) {
            System.out.print(name + " ");
        }
        System.out.println();

        int[] numbers = {1,15,23,56,76,90,123,354,3242};
        char[] chars = {'a', 'b', 'e', 'o', 'p'};
        for (int number: numbers) {
            System.out.println(number);
        }
        for (char c: chars) {
            System.out.println(c);
        }
    }
}
