package exercise.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Map<String, Double> scores = new HashMap<>();
        scores.put("Dang Dinh Quan", 6.0);
        scores.put("Nguyen Dinh Tran Long", 9.0);
        scores.put("Nguyen Van Cong", 10.0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if (scores.containsKey(name)) {
            System.out.println("Your score is: " + scores.get(name));
        } else {
            System.out.println("Score not found!");
        }
    }
}
