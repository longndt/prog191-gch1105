package lab10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class PrintWriterDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //1. get data from keyboard's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();    //remove buffer's cache
        System.out.print("Enter mobile: ");
        String mobile = scanner.nextLine();

        //1A. calculate age
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        //2. save data to text file
        String fileName = "student.txt";
        PrintWriter writer = new PrintWriter(fileName);
        writer.println("Name: " + name);
        writer.println("Birth year: " + birthYear);
        writer.println("Age: " + age);
        writer.println("Mobile phone: " + mobile);
        System.out.println("Save student data to file " + fileName + " successfully !");

        //2A. close Scanner and PrintWriter
        scanner.close();
        writer.close();
    }
}
