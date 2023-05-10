package lab02;

import java.util.Scanner;

//yêu cầu: tạo 1 chương trình cho phép nhập điểm của sinh viên
//và in ra toàn bộ điểm. Số lượng SV nhập theo yêu cầu
public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        do {
            System.out.print("Enter total student (3-50): ");
            total = scanner.nextInt();
        } while (total < 3 || total > 50);
        //tạo mảng với kích thước từ biến total
        double[] grades = new double[total];
        //chạy vòng lặp for để gán trị cho từng element (INPUT)
        for (int i=0; i<total; i++) {
            //dùng do...while để check input value có hợp lệ không
            do {
                System.out.print("Enter grade of student " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            } while (grades[i] < 0 || grades[i] > 10);
        }

        double max = grades[0], min = grades[0];
        double sum = 0, average = 0;

        //sử dụng for để in ra toàn bộ điểm của SV (OUTPUT)
        for (int i=0; i<total; i++) {
            if (grades[i] > max)
                max = grades[i];
            if (grades[i] < min)
                min = grades[i];
            sum += grades[i];

            System.out.println("Grade of student " + (i + 1) + " : " + grades[i]);
        }
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);
        average = sum / total;
        //System.out.println("Average grade : " + Math.round(average));
        System.out.println("Average grade: " + String.format("%,.2f", average));
    }
}
