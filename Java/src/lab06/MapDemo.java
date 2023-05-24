package lab06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //implement Map with TreeMap
        Map dictionary = new TreeMap<String, String>();
        dictionary.put("hello", "xin chao");
        dictionary.put("goodbye", "tam biet");
        dictionary.put("laptop", "may tinh xach tay");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an English word: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            System.out.println(word+ " : " + dictionary.get(word));
        } else {
            System.out.println("Word not found in dictionary");
        }
        System.out.print("Enter a Vietnamese word: ");
        word = scanner.nextLine();
        if (dictionary.containsValue(word)) {
            System.out.println("Word is found in dictionary");
        } else {
            System.out.println("Word not found in dictionary");
        }

        //implement Map with HashMap
        Map<Integer, String> course = new HashMap<>();
        course.put(1644, "Cloud Computing");
        course.put(1633, "Web Design & Development");
        course.put(191, "Java Programming");
        course.forEach((k, v) -> {
            System.out.println(k + " : " +  v);  //k: key, v: value
        });
        System.out.println("Map size: " + course.size());
        course.clear();
        System.out.println("Map size: " + course.size());
    }
}
