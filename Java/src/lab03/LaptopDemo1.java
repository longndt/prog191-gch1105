package lab03;

import java.util.Scanner;

public class LaptopDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total laptop: ");
        int total = scanner.nextInt();
        scanner.nextLine();
        //khai báo 1 array Laptop với số lượng người dùng chỉ định
        Laptop[] laptops = new Laptop[total];
        //INPUT: sử dụng vòng lặp for để tạo và set dữ liệu cho từng object Laptop
        for (int i=0; i<total; i++) {
            //nhập dữ liệu cho từng laptop
            System.out.println("Enter information of laptop " + (i+1));
            System.out.print("Input brand: ");
            String brand = scanner.nextLine();
            System.out.print("Input model: ");
            String model = scanner.nextLine();
            System.out.print("Input price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); //clear buffer cache
            System.out.print("Input color: ");
            String color = scanner.nextLine();
            System.out.println("---------------------------");
            //tạo object laptop tương ứng
            laptops[i] = new Laptop(brand, model, price, color);
        }
        //OUTPUT: sử dụng foreach để hiển thị dữ liệu của từng element trong array "laptops"
        int index = 0;
        for (Laptop laptop: laptops) {
            System.out.println("Information of laptop " + (index+1));
            laptop.displayInfo();
            System.out.println("---------------------------");
            index++;
        }

        //always close scanner at the end of program
        scanner.close();
    }
}
