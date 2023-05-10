package lab02;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = scanner.nextDouble();
        //sử dụng while để check điều kiện nhập vào
        //nếu người dùng nhập sai => cần nhập lại cho đến khi nhập đúng
        //nếu người dùng nhập đúng => hiển thị ra kết quả & kết thúc program
        while (grade < 0 || grade > 10) {
            System.out.println("Invalid grade !");
            System.out.print("Enter your grade: ");
            grade = scanner.nextDouble();
        }
        System.out.println("Your grade is: " + grade);
    }
}
