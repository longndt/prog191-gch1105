package exercise.exception;

import java.util.Scanner;

//outer class
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        do {
            try {
                System.out.print("Input a text: ");
                text = scanner.nextLine();
                checkInput(text);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (true);
    }

    public static void checkInput (String input) throws InvalidInputException {
            if (input.isEmpty()) {
                throw new InvalidInputException("Input string cannot be empty.");
            } else {
                System.out.println("Text: " + input);
            }
        }
    }

    //inner class: class inside another class
    class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
