package lab05;

public class StringOperator {
    public static void main(String[] args) {
        String s1 = "Hanoi";
        String s2 = "Danang";
        String s3 = "Hanoi";
        if (s1.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (s1.compareTo(s2) == 0) {
            System.out.println("s1 = s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else {
            System.out.println("s1 > s2");
        }
        String s4 = "Today is Monday";
        System.out.println("Get the word Monday: " + s4.substring(9, s4.length()));
        /* Note: substring (i,j): get a substring from index
        i to j-1. i: beginIndex, j: endIndex
         */
        String s5 = "    Tomorrow is Tuesday       ";
        System.out.println(s5);
        System.out.println(s5.trim());
        System.out.println(String.valueOf(2023));
        System.out.println(String.valueOf(3.14));
        String s6 = "iPhone 13 Pro Max";
        System.out.println(s6.startsWith("iPhone"));
        System.out.println(s6.endsWith("Pro"));
    }
}
