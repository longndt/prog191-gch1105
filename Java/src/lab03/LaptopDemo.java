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
        laptop.displayInfo();
    }
}
