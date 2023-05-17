package lab04;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        double grade1, grade2, grade3;
        do {
            System.out.print("Enter grade of Maths: ");
            grade1 = scanner.nextDouble();
        } while (grade1 < 0 || grade1 > 10);

        do {
            System.out.print("Enter grade of Physics: ");
            grade2 = scanner.nextDouble();
        } while (grade2 < 0 || grade2 > 10);

        do {
            System.out.print("Enter grade of English: ");
            grade3 = scanner.nextDouble();
        } while (grade3 < 0 || grade3 > 10);

        Student student = new Student(name, grade1, grade2, grade3);
        student.showStudyResult();

        scanner.close();
    }
}
