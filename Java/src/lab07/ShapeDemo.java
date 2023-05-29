package lab07;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 3) {
            System.out.println("Chọn 1 hình: ");
            System.out.println("1. Hình vuông");
            System.out.println("2. Hình chữ nhật");
            System.out.println("3. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Nhập cạnh: ");
                    double a = scanner.nextDouble();
                    //Shape square = new Square();
                    Square square = new Square();
                    System.out.println("Chu vi: " + square.ChuVi(a,a) + " cm(2)");
                    System.out.println("Diện tích: " + square.DienTich(a,a) + " cm(2)\n");
                    break;
                case 2:
                    System.out.print("Nhập chiều dài: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle();
                    System.out.println("Chu vi: " + rectangle.ChuVi(length, width) + " cm(2)");
                    System.out.println("Diện tích: " + rectangle.DienTich(length, width) + " cm(2)\n");
                    break;
                case 3:
                    System.out.println("Chào tạm biệt. Hẹn gặp lại");
                    break;
                default:
                    System.err.println("Sai lựa chọn. Yêu cầu nhập lại.");
                    break;
            }
        }



        scanner.close();
    }
}
