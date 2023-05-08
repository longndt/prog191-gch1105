package lab01;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //khai báo Scanner để lấy dữ liệu nhập vào từ keyboard

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your grade: ");
        double grade = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        //optional but recommend: close Scanner sau khi sử dụng
        sc.close();
    }
}
