package lab06;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total people: ");
        int total = scanner.nextInt();
        scanner.nextLine();
        Person people[] = new Person[total];

        //method 1
//        for (int i=0; i<total; i++) {
//            System.out.println("Enter information for person " + (i+1));
//            people[i] = new Person();
//            System.out.print("Name: ");
//            people[i].setName(scanner.nextLine());
//            System.out.print("Age: ");
//            people[i].setAge(scanner.nextInt());
//            scanner.nextLine();
//            System.out.print("Address: ");
//            people[i].setAddress(scanner.nextLine());
//        }

        //method 2
        for (int i=0; i<total; i++) {
            System.out.println("Enter information for person " + (i+1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            people[i] = new Person(name, age, address);
        }


        for (Person p: people) {
            p.showPersonInfo();
            System.out.println("----------------");
        }
        scanner.close();
    }
}
