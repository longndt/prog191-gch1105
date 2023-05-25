package exercise.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngVieDictionary {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("hello", "Xin chào");
        dict.put("morning", "Buổi sáng");
        dict.put("school", "Trường học");
        dict.put("worker", "Công nhân");
        dict.put("hospital", "Bệnh viện");
        dict.put("river", "Dòng sông");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an English word: ");
            String engWord = sc.nextLine();
            if (dict.containsKey(engWord)) {
                System.out.println("Vietnamese mearning: " + dict.get(engWord));
            } else {
                System.out.println("Meaning not found!");
            }
            System.out.print("Do you want to continue? (1: yes, 2: no) ");
            int choice = sc.nextInt();
            if (choice != 1) {
                break; // terminate the program
            }
            sc.nextLine(); // clears newline character before calling nextLine()
        }
    }
}
