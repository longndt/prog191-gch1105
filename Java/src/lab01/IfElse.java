package lab01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

//        if (grade >= 5.0) {
//            System.out.println("Pass");
//            System.out.println("Congratulation !");
//        } else   //grade < 5.0
//            System.out.println("Fail");
        /* grading criteria
          Refer: 0-4.5
          Pass: 5-6.5
          Merit: 7-8.5
          Distinction: 9-10
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = scanner.nextDouble();
        //using nested if: if inside another if
//        if (grade >= 5.0) {
//            if (grade >= 5.0 && grade <= 6.5) {
//                System.out.println("Pass");
//            } else if (grade >= 7.0 && grade <= 8.5) {
//                System.out.println("Merit");
//            } else { //9.0 - 10.0
//                System.out.println("Distinction");
//            }
//        } else {
//            System.out.println("Refer");
//            System.out.println("Good luck next time !");
//        }
          if (grade >= 9.0 && grade <= 10.0) {
              System.out.println("Distinction");
          } else if (grade >= 7.0 && grade <= 8.5) {
              System.out.println("Merit");
          } else if (grade >= 5.0 && grade <= 6.5) {
              System.out.println("Pass");
          } else if (grade >= 0 && grade <= 5.0) {
              System.out.println("Refer");
          } else {
              System.out.println("Invalid grade !");
          }
          //1 trường hợp: chỉ sử dụng if
          //2 trường hơp: sử dụng if + else
          //từ 2 trường hợp: sử dụng if (first) + else if + else (last)
    }
}
