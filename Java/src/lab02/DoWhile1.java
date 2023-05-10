package lab02;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DoWhile1 {

    public static void main(String[] args) {
        //khai báo scanner để lấy input value
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0 || age > 150);
        System.out.println("Your age: " + age);
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        int birth_year = current_year - age;
        System.out.println("Your birth year: " + birth_year);

        //nhớ close scanner sau khi sử dụng
        scanner.close();
    }
}
