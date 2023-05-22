package lab05;

public class StringDemo {
    public static void main(String[] args) {
        //char c1 = "k"; => Error: double quote
        //char c2 = 'ab'; => Error: many characters
        char c3 = 'u'; // Correct: 1 character + single quote
        String s1 = "University of Greenwich"; //String: array of characters
        String s2 = "o"; //String can contain only 1 character
        String s3 = "2023"; //String can contain numbers
        String s4 = "!@#$#$#%^$)(*)*DKAHDKSAJLSA@8638738212";
        //String can contain alphabet (a-z, A-Z), digit (0-9), specical characters (%,&,*,#)
        //String s5 = 'Vietnam'; => Error: single quote
        String s6 = "Hanoi is the capital of Vietnam";
        System.out.println(s6);
        System.out.println("5th letter: " + s6.charAt(6)); //get 5th letter (index = 6) in String s6
        System.out.println("String length: " + s6.length()); //print string length (array size)
        System.out.println("First letter: " + (s6.charAt(0)));
        System.out.println("Last index: " + (s6.length()-1));
        System.out.println("Last character: " + (s6.charAt(s6.length()-1)));
        /* Note: 1st index in String is always 0
                 last index in String is String length - 1
         */
        String mobile = "0912345678"; //save mobile phone as string format instead of integer due to 1st digit is 0
        String email = "longndt@fpt.edu.vn";
        System.out.println(email);
        //Method 1: print String with for loop
        for (int i=0; i<email.length();i++) {
            System.out.print(email.charAt(i) + " ");
        }
        //Note: can not print String with foreach loop
    }
}
