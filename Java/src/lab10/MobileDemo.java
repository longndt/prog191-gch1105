package lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MobileDemo {
    //global variable
    static File file = new File("mobile.bin");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        input();
        output();
    }

    private static void input() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total mobile: ");
        int total = scanner.nextInt();
        ArrayList<Mobile> mobiles = new ArrayList<>();
        for (int i=0; i< total; i++) {
            System.out.println("Enter information of mobile " + (i+1));
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            Mobile mobile = new Mobile(name, brand, year, price);
            mobiles.add(mobile);
        }

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(mobiles);
        fos.close();
        oos.close();
        System.out.println("Save data to file succeed !");
    }

    private static void output() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Mobile> mobiles = (ArrayList<Mobile>) ois.readObject();
        System.out.println("Reading data from file ....");
        for (Mobile m : mobiles) {
            System.out.println(m.toString());
        }
        fis.close();
        ois.close();
    }
}
