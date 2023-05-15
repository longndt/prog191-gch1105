package lab03;

import java.util.Scanner;

public class LaptopDemo {
    public static void main(String[] args) {
        //get input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input laptop brand: ");
        String brand = scanner.nextLine();
        System.out.print("Input laptop model: ");
        String model = scanner.nextLine();
        System.out.print("Input laptop price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); //clear buffer cache
        System.out.print("Input laptop color: ");
        String color = scanner.nextLine();

        //create new Laptop object
        Laptop laptop = new Laptop(brand, model, price, color);
//        laptop.displayInfo();
//        String answer;
//        System.out.print("Do you want to update laptop price (Y/N) ? ");
//        answer = scanner.next();
//        if (answer.equalsIgnoreCase("y")) {
//            System.out.print("Enter new price: ");
//            double new_price = scanner.nextDouble();
//            laptop.setPrice(new_price);
//            System.out.println("New laptop price: " + laptop.getPrice() + "$");
//        } else {
//            System.out.println("Thank you. Good bye !");
//        }

        //show user's menu
        //switch: thực thi chức năng của hệ thống theo lựa chọn của người dùng
        //do...while hoặc while: lặp lại menu đến khi người dùng chọn exit program
        int choice = 0;
        while (choice != 4){
            System.out.println("1. Display laptop's information ");
            System.out.println("2. Change laptop's price");
            System.out.println("3. Change laptop's color");
            System.out.println("4. Exit program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    laptop.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter new price: ");
                    double new_price = scanner.nextDouble();
                    laptop.setPrice(new_price);
                    System.out.println("New price: " + laptop.getPrice() + "$");
                    break;
                case 3:
                    System.out.print("Enter new color: ");
                    laptop.setColor(scanner.nextLine());
                    System.out.println("New color: " + laptop.getColor());
                    break;
                case 4:
                    System.out.println("Good bye. See you next time !");
                    break;
                default:
                    System.out.println("Invalid choice !");
                    break;
            }
        }
    }
}
